/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.nathan3882.idealtrains;

import com.thalesgroup.rtti._2007_10_10.ldb.commontypes.FilterType;
import com.thalesgroup.rtti._2017_10_01.ldbsv.GetBoardByCRSParams;
import com.thalesgroup.rtti._2017_10_01.ldbsv.types.ArrayOfCoaches;
import java.io.IOException;
import java.io.Writer;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;
import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

/**
 *
 * @author natha
 */
@WebService
public class IdealTrains {

    public static final String STAFF_WEBSERVICE_URL = "https://lite.realtime.nationalrail.co.uk/OpenLDBSVWS/wsdl.aspx?ver=2017-10-01";
    public static final String STAFF_WEBSERVICE_ENDPOINT = "https://lite.realtime.nationalrail.co.uk/OpenLDBSVWS/ldbsv12.asmx";
    public static final String AUTHENTICATION_TOKEN = "ed126cc4-bfec-4a9e-9686-0d41823c6399";

    public static final String CRS_CODE_BOURNEMOUTH = "BMH";
    public static final String CRS_CODE_POOLE = "POO";
    public static final String CRS_CODE_BROCKENHURST = "BCU";

    public static List<String> crsCodes;

    public static void main(String args[]) throws SOAPException, IOException, DatatypeConfigurationException, JAXBException {
        crsCodes = new ArrayList<>(Arrays.asList(CRS_CODE_BOURNEMOUTH, CRS_CODE_BROCKENHURST));

        com.thalesgroup.rtti._2017_10_01.ldbsv.ObjectFactory fac = new com.thalesgroup.rtti._2017_10_01.ldbsv.ObjectFactory();
        GetBoardByCRSParams params = fac.createGetBoardByCRSParams();

        GregorianCalendar c = new GregorianCalendar();
        Date date = new Date(Calendar.YEAR, Calendar.MONTH, Calendar.DATE);
        c.setTime(date);
        XMLGregorianCalendar xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        params.setTime(xmlCalendar);
        params.setCrs("BMH");
        params.setNumRows(499); //as many as possible to manipulate them all
        params.setFilterType(FilterType.TO);
        params.setGetNonPassengerServices(false);
        params.setServices("P");
        params.setTimeWindow(140);
        JAXBElement<GetBoardByCRSParams> element = fac.createGetDepartureBoardByCRSRequest(params);

        System.out.println("Element QName = " + element.getName());
        System.out.println("Element declared type " + element.getDeclaredType());
        System.out.println("Element value = " + element.getValue());
        System.out.println("Element scope = " + element.getScope());

        JAXBContext jaxbContext = JAXBContext.newInstance(GetBoardByCRSParams.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(element, System.out);

        /*try {
            SOAPMessage soapMessage = null;

            SOAPEnvelope sen = soapMessage.getSOAPPart().getEnvelope();

            sen.addNamespaceDeclaration("ns2", "http://thalesgroup.com/RTTI/2013-11-28/Token/types");
            SOAPHeader sh = sen.getHeader();
            if (sh == null) {
                sh = sen.addHeader();
            }

            SOAPHeaderElement she = sh.addHeaderElement(
                    new QName("http://thalesgroup.com/RTTI/2013-11-28/Token/types", "AccessToken", "ns2"));

            SOAPElement se = she.addChildElement(new QName("http://thalesgroup.com/RTTI/2013-11-28/Token/types", "TokenValue", "ns2"));

            se.addTextNode(getTokenValue());
            soapMessage.saveChanges();
            soapMessage.writeTo(System.out);

        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

    private static String getTokenValue() {
        return AUTHENTICATION_TOKEN;

    }
}
