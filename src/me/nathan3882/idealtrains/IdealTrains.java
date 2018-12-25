package me.nathan3882.idealtrains;

import com.thalesgroup.rtti._2007_10_10.ldb.commontypes.FilterType;
import com.thalesgroup.rtti._2017_10_01.ldbsv.GetBoardByCRSParams;
import com.thalesgroup.rtti._2017_10_01.ldbsv.ObjectFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.soap.SOAPException;
import org.json.JSONArray;
import org.json.JSONObject;

@WebService
public class IdealTrains {

    public static final String STAFF_WEBSERVICE_URL = "https://lite.realtime.nationalrail.co.uk/OpenLDBSVWS/wsdl.aspx?ver=2017-10-01";
    public static final String STAFF_WEBSERVICE_ENDPOINT = "https://lite.realtime.nationalrail.co.uk/OpenLDBSVWS/ldbsv12.asmx";
    public static final String AUTHENTICATION_TOKEN = "ed126cc4-bfec-4a9e-9686-0d41823c6399";

    public static final String CRS_CODE_BOURNEMOUTH = "BMH";
    public static final String CRS_CODE_POOLE = "POO";
    public static final String CRS_CODE_BROCKENHURST = "BCU";

    public static List<String> crsCodes = new ArrayList<>(Arrays.asList(CRS_CODE_BOURNEMOUTH, CRS_CODE_BROCKENHURST));

    public static void main(String args[]) {

        Calendar cal = Calendar.getInstance();
        Date datereal = cal.getTime();
        Date date = new Date(datereal.getTime() + TimeUnit.DAYS.toMillis(2)); //One hr time
        Date lessonTime = new Date(date.getTime() + TimeUnit.HOURS.toMillis(1)); //One hr time
        List<Service> services = new ArrayList<>();
        try {
            services = getValidServices(
                    CRS_CODE_BOURNEMOUTH, date, 15, lessonTime);
        } catch (SOAPException ex) {
            Logger.getLogger(IdealTrains.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (services.isEmpty()) {
            //No services
        }
    }

    //VAR validRID
    //FOREACH departure time of bournemouth trains AS 'bmouthTrain':
    //  VAR bmouthTrainRID
    //  FOREACH arrival times at station X AS 'arrTime':
    //    VAR xTrainRID
    //    VAR xTrainArrivalTime
    //    IF xTrainArrivalTime gives enough time to have a coffee:
    //      IF (bmouthTrainRID == xTrainRID):
    //        validRID.add(bmouthTrainRID)
    public static List<Service> getValidServices(String startCrs, Date fromWhen, int secondsToSpare, Date lessonTime) throws SOAPException {
        if (startCrs.equals(CRS_CODE_BROCKENHURST)) {
            throw new UnsupportedOperationException("Can't see arrival time from Brock to Brock... come on..");
        }
        List<Service> validServices = new ArrayList<>();

        ObjectFactory factory = new com.thalesgroup.rtti._2017_10_01.ldbsv.ObjectFactory();

        GetBoardByCRSParams params = createBoardByCRSParams(factory, CRS_CODE_BOURNEMOUTH, fromWhen);

        Action action = new Action(factory, "GetDepartureBoardByCRS");

        JAXBElement<GetBoardByCRSParams> fromInitialCrsRequest
                = (JAXBElement<GetBoardByCRSParams>) action.doParams(params);
        SoapRequest departureRequest = new SoapRequest(action, SoapRequest.generateDoc(fromInitialCrsRequest));
        SoapResponse departureResponse = departureRequest.sendRequestForResponse();
        departureResponse.setAction(departureRequest.getActionString());
        Object departureFromBmouthServices = departureResponse.getTrainServices();

        if (departureFromBmouthServices == null) {
            return validServices; //empty
        }
        List<Service> departuresFromCrs = new ArrayList<>();
        if (departureFromBmouthServices instanceof JSONArray) {
            ((JSONArray) departureFromBmouthServices).toList().forEach(aJSONObjectService -> {
                Service service = Service.fromJSONObject(aJSONObjectService);
                departuresFromCrs.add(service);
            });
        } else {
            departuresFromCrs.add(Service.fromJSONObject((JSONObject) departureFromBmouthServices));
        }

        ///////ARRIVALS///////
        params.setCrs(CRS_CODE_BROCKENHURST); //Parameters for brock

        action.setAction("GetArrivalBoardByCRS"); //Arrival board for brock

        JAXBElement<GetBoardByCRSParams> arrivalToBrockRequest
                = (JAXBElement<GetBoardByCRSParams>) action.doParams(params);
        SoapRequest arrivalRequest = new SoapRequest(action, SoapRequest.generateDoc(arrivalToBrockRequest));
        SoapResponse arrivalResponse = arrivalRequest.sendRequestForResponse();

        arrivalResponse.setAction(arrivalRequest.getActionString());
        Object arrivalsToBrockServices = arrivalResponse.getTrainServices();
        List<Service> allArrivalsToBrock = new ArrayList<>();
        if (arrivalsToBrockServices instanceof JSONArray) {
            ((JSONArray) arrivalsToBrockServices).toList().forEach(aJSONObjectService -> {
                Service service = Service.fromJSONObject(aJSONObjectService);
                allArrivalsToBrock.add(service);
            });
        } else {
            allArrivalsToBrock.add(Service.fromJSONObject((JSONObject) arrivalsToBrockServices));
        }
        ///////ARRIVALS///////

        ///////Getting valid services///////
        for (Service departureService : departuresFromCrs) {
            long departureServiceRID = departureService.getRid();
            for (Service arrivalService : allArrivalsToBrock) {
                long arrivalServiceRID = arrivalService.getRid();
                if (departureServiceRID == arrivalServiceRID) {
                    //Service came from initial CRS and arrives at brock
                    Date eta = arrivalService.getEta().toGregorianCalendar().getTime();
                    long lessonTakeLeeway = lessonTime.getTime() - TimeUnit.SECONDS.toMillis(secondsToSpare);
                    if (eta.getTime() <= lessonTakeLeeway) { //arrives at valid time
                        validServices.add(arrivalService);
                    }
                }
            }
        }
        return validServices;
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
