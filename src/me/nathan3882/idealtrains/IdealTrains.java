package me.nathan3882.idealtrains;

import com.thalesgroup.rtti._2007_10_10.ldb.commontypes.FilterType;
import com.thalesgroup.rtti._2017_10_01.ldbsv.GetBoardByCRSParams;
import com.thalesgroup.rtti._2017_10_01.ldbsv.ObjectFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.soap.SOAPException;
import me.nathan3882.idealtrains.Service.ServiceType;
import org.json.JSONArray;
import org.json.JSONObject;

@WebService
public class IdealTrains {

    public static final String STAFF_WEBSERVICE_URL = "https://lite.realtime.nationalrail.co.uk/OpenLDBSVWS/wsdl.aspx?ver=2017-10-01";
    public static final String STAFF_WEBSERVICE_ENDPOINT = "https://lite.realtime.nationalrail.co.uk/OpenLDBSVWS/ldbsv12.asmx";
    public static final String AUTHENTICATION_TOKEN = "";

    public static final String CRS_CODE_BROCKENHURST = "BCU";

    //VAR validRID
    //FOREACH departure time of bournemouth trains AS 'bmouthTrain':
    //  VAR bmouthTrainRID
    //  FOREACH arrival times at station X AS 'arrTime':
    //    VAR xTrainRID
    //    VAR xTrainArrivalTime
    //    IF xTrainArrivalTime gives enough time to get to lesson:
    //      IF (bmouthTrainRID == xTrainRID):
    //        validRID.add(bmouthTrainRID)
    /**
     *
     * @param startCrs where the users home station is
     * @param toCrs to this college / work station
     * @param fromWhen current time of request
     * @param walkTimeSeconds if fifteen, get services that arrive 15 mins
     * before lesson time
     * @param lessonTime when your lesson time is
     * @return valid services
     * @
     */
    public static void main(String args[]) {

        Calendar cal = Calendar.getInstance();
        Date datereal = cal.getTime();
        Date date = new Date(datereal.getTime() + TimeUnit.DAYS.toMillis(1)); //One hr time
        Date lessonTime = new Date(date.getTime() + TimeUnit.HOURS.toMillis(1)); //One hr time
        List<Service> services = new ArrayList<>();
        try {
            services = getHomeToLessonServices(
                    "BMH", CRS_CODE_BROCKENHURST, date, 8 * 60, lessonTime, 60);
        } catch (SOAPException ex) {
            Logger.getLogger(IdealTrains.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (services.isEmpty()) {
            //No services
        }
    }

    public static LinkedList<Service> getHomeToLessonServices(String startCrs, String toCrs, Date fromWhen, int walkTimeSeconds, Date lessonTime, int capMinutes) throws SOAPException {
        if (startCrs.equals(toCrs)) {
            throw new UnsupportedOperationException("Can't see arrival time from Brock to Brock... come on..");
        }
        LinkedList<Service> validMixedServices = new LinkedList<>();

        ObjectFactory factory = new com.thalesgroup.rtti._2017_10_01.ldbsv.ObjectFactory();
        GetBoardByCRSParams params = createBoardByCRSParams(factory, startCrs, fromWhen);

        Action action = new Action(factory, "GetDepartureBoardByCRS", ServiceType.DEPARTING_FROM_HOME);

        JAXBElement<GetBoardByCRSParams> fromInitialCrsRequest
                = (JAXBElement<GetBoardByCRSParams>) action.doParams(params);
        SoapRequest departureRequest = new SoapRequest(action, SoapRequest.generateDoc(fromInitialCrsRequest));
        SoapResponse departureResponse = departureRequest.sendRequestForResponse();
        departureResponse.setAction(departureRequest.getActionString());

        Object jsonFromStartServices = departureResponse.getTrainServices();

        if (jsonFromStartServices == null) {
            return validMixedServices; //empty
        }
        List<Service> departuresFromStartCrs = new ArrayList<>();
        if (jsonFromStartServices instanceof JSONArray) { //multiple trains
            ((JSONArray) jsonFromStartServices)
                    .toList().forEach(aJSONObjectService -> {
                        Service service = Service.fromJSONObject(aJSONObjectService, action.getServiceType(), startCrs, "departure");
                        departuresFromStartCrs.add(service);
                    });
        } else { //singular train service.
            departuresFromStartCrs.add(Service.fromJSONObject((JSONObject) jsonFromStartServices, action.getServiceType(), startCrs, "departure"));
        }

        ///////ARRIVALS///////
        params.setCrs(toCrs); //Parameters for brock
        action.setAction("GetArrivalBoardByCRS"); //Arrival board for brock
        action.setServiceType(ServiceType.ARRIVING_TO_END);

        JAXBElement<GetBoardByCRSParams> arrivalToBrockRequest
                = (JAXBElement<GetBoardByCRSParams>) action.doParams(params);
        SoapRequest arrivalRequest = new SoapRequest(action, SoapRequest.generateDoc(arrivalToBrockRequest));
        SoapResponse arrivalResponse = arrivalRequest.sendRequestForResponse();

        arrivalResponse.setAction(arrivalRequest.getActionString());
        Object arrivalsToBrockServices = arrivalResponse.getTrainServices();

        List<Service> allArrivalsToBrock = new ArrayList<>();
        if (arrivalsToBrockServices instanceof JSONArray) { //multiple train services
            ((JSONArray) arrivalsToBrockServices).toList().forEach(aJSONObjectService -> {
                Service service = Service.fromJSONObject(aJSONObjectService, action.getServiceType(), "arrival", toCrs);
                allArrivalsToBrock.add(service);
            });
        } else { //singular train service.
            allArrivalsToBrock.add(Service.fromJSONObject((JSONObject) arrivalsToBrockServices, action.getServiceType(), "arrival", toCrs));
        }
        ///////ARRIVALS///////

        ///////Getting valid services///////
        Calendar calendar = GregorianCalendar.getInstance();
        for (Service departureService : departuresFromStartCrs) {
            long departureServiceRID = departureService.getRid();
            for (Service arrivalService : allArrivalsToBrock) {
                long arrivalServiceRID = arrivalService.getRid();
                if (departureServiceRID == arrivalServiceRID) {
                    //Service came from initial CRS and arrives at brock
                    XMLGregorianCalendar xmlEta = arrivalService.getEta();
                    XMLGregorianCalendar xmlSta = arrivalService.getSta();
                    XMLGregorianCalendar xmlEtd = arrivalService.getEtd();
                    XMLGregorianCalendar xmlSdt = arrivalService.getSdt();
                    Date arrivalDate = null;
                    if (xmlEta != null) {
                        arrivalDate = xmlEta.toGregorianCalendar().getTime();
                    } else if (xmlSta != null) {
                        arrivalDate = xmlSta.toGregorianCalendar().getTime();
                    }
                    if (xmlEtd != null) {
                        arrivalDate = xmlEtd.toGregorianCalendar().getTime();
                    } else if (xmlSdt != null) {
                        arrivalDate = xmlSdt.toGregorianCalendar().getTime();
                    }
                    if (arrivalDate == null) {
                        continue;
                    } //Sometimes is null? cant really do much?
                    calendar.setTime(arrivalDate);
                    int hod = calendar.get(Calendar.HOUR_OF_DAY);
                    if (hod > 16 || hod < 8) {
                        continue;
                    }
                    long arrivalTimeMillis = arrivalDate.getTime();

                    long lessonTimeMillis = lessonTime.getTime();
                    long toSpareMinutes = TimeUnit.MILLISECONDS.toMinutes(lessonTimeMillis - arrivalTimeMillis);
                    long walkTimeMinutes = TimeUnit.SECONDS.toMinutes(walkTimeSeconds);

                    if (toSpareMinutes >= walkTimeMinutes && toSpareMinutes <= walkTimeMinutes + capMinutes) { //arrives within 15-(15 + 60) minutes before lesson
                        Service arrivalDuplicate = arrivalService;
                        arrivalDuplicate.setToSpareMinutes(toSpareMinutes);
                        arrivalDuplicate.setServiceType(ServiceType.HALF_AND_HALF);
                        arrivalDuplicate.setFromCrs(departureService.getFromCrs());
                        arrivalDuplicate.setSdt(departureService.getSdt());
                        arrivalDuplicate.setEtd(departureService.getEtd());
                        validMixedServices.add(arrivalDuplicate);
                        System.out.println(toSpareMinutes + " >= " + walkTimeMinutes + " && " + toSpareMinutes + " <= " + (walkTimeMinutes + 60));
//A service from POO 
//departs at 2019-01-15T13:37:00.000Z
//will arrive at BCU at 2019-01-15T13:04:00.000Z
//in order to get to brock 65 minutes before your lesson at Tue Jan 15 14:10:00 GMT 2019
                    } else {
                        //System.out.println(" ");
                        //System.out.println("to spare millis to minutes (" + lessonTimeMillis + " - " + arrivalTimeMillis + " not bigger than walk time minutes = " + walkTimeMinutes);
//                        System.out.println("eta to brock = " + arrivalDate);
//                        System.out.println(" ");
                    }
                }
            }
        }
        return validMixedServices;
    }

    /*
    From http://javaclockwork.com/en/java-convert-date-to-xmlgregoriancalendar/
     */
    public static XMLGregorianCalendar dateToXMLGregorianCalendar(Date date) {
        XMLGregorianCalendar xmlGregorianCalendar = null;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        try {
            DatatypeFactory dataTypeFactory = DatatypeFactory.newInstance();
            xmlGregorianCalendar = dataTypeFactory.newXMLGregorianCalendar(gregorianCalendar);
        } catch (Exception e) {
            System.out.println("Exception in conversion of Date to XMLGregorianCalendar" + e);
        }

        return xmlGregorianCalendar;
    }

    private static GetBoardByCRSParams createBoardByCRSParams(ObjectFactory factory, String startCrs, Date fromWhen) {
        GetBoardByCRSParams params = factory.createGetBoardByCRSParams();
        XMLGregorianCalendar xmlCalendar = dateToXMLGregorianCalendar(fromWhen);
        params.setTime(xmlCalendar);
        params.setCrs(startCrs);//Will assure all trains are listed for the users starting station
        params.setNumRows(499); //as many as possible to manipulate them all
        params.setFilterType(FilterType.TO);
        params.setGetNonPassengerServices(false);
        params.setServices("P");
        params.setTimeWindow(1440);
        return params;
    }
}
