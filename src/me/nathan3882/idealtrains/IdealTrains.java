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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import org.w3c.dom.Document;

/**
 *
 * @author natha
 */
@WebService
public class IdealTrains {

    public static final String STAFF_WEBSERVICE_URL = "https://lite.realtime.nationalrail.co.uk/OpenLDBSVWS/wsdl.aspx?ver=2017-10-01";
    public static final String STAFF_WEBSERVICE_ENDPOINT = "https://lite.realtime.nationalrail.co.uk/OpenLDBSVWS/ldbsv12.asmx";
    public static final String AUTHENTICATION_TOKEN = "";

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

        JAXBContext jaxbContext = JAXBContext.newInstance(GetBoardByCRSParams.class);

        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        Document document = null;
        try {
            document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(IdealTrains.class.getName()).log(Level.SEVERE, null, ex);
        }
        jaxbMarshaller.marshal(element, document);

        try {
            MessageFactory messageFactory = MessageFactory.newInstance();
            SOAPMessage soapMessage = messageFactory.createMessage();

            SOAPEnvelope sen = soapMessage.getSOAPPart().getEnvelope();
            sen.addNamespaceDeclaration("ns2", "http://thalesgroup.com/RTTI/2013-11-28/Token/types");
            SOAPHeader sh = sen.getHeader();
            if (sh == null) {
                sh = sen.addHeader();
            }
            SOAPHeaderElement tokenParentElement = sh.addHeaderElement(
                    new QName("http://thalesgroup.com/RTTI/2013-11-28/Token/types", "AccessToken", "ns2"));

            SOAPElement tokenChildElement = tokenParentElement.addChildElement(
                    new QName("http://thalesgroup.com/RTTI/2013-11-28/Token/types", "TokenValue", "ns2"));

            tokenChildElement.addTextNode(getTokenValue());

            soapMessage.getSOAPBody().addDocument(document); //adding the generated request by jax client to the body

            soapMessage.saveChanges();
          /*<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ns2="http://thalesgroup.com/RTTI/2013-11-28/Token/types">
              <SOAP-ENV:Header>
               <ns2:AccessToken>
                <ns2:TokenValue>XXXXX</ns2:TokenValue>
               </ns2:AccessToken>
              </SOAP-ENV:Header>
               <SOAP-ENV:Body>
                <GetDepartureBoardByCRSRequest xmlns="http://thalesgroup.com/RTTI/2017-10-01/ldbsv/" xmlns:ns2="http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types" xmlns:ns3="http://thalesgroup.com/RTTI/2016-02-16/ldbsv/types" xmlns:ns4="http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types" xmlns:ns5="http://thalesgroup.com/RTTI/2017-10-01/ldbsv/types" xmlns:ns6="http://thalesgroup.com/RTTI/2015-11-27/ldbsv/types">
                     <numRows>499</numRows>
                     <crs>BMH</crs>
                     <time>1901-03-05T00:00:00.000Z</time>
                     <timeWindow>1440</timeWindow>
                     <filterType>to</filterType>
                     <services>P</services>
                     <getNonPassengerServices>false</getNonPassengerServices>
                    </GetDepartureBoardByCRSRequest>
               </SOAP-ENV:Body>
            </SOAP-ENV:Envelope> */
            String endPoint = "https://lite.realtime.nationalrail.co.uk/OpenLDBSVWS/ldbsv12.asmx";
         
            soapMessage.writeTo(System.out);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getTokenValue() {
        return AUTHENTICATION_TOKEN;

    }
}
