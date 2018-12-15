package me.nathan3882.idealtrains;

import com.thalesgroup.rtti._2007_10_10.ldb.commontypes.FilterType;
import com.thalesgroup.rtti._2017_10_01.ldbsv.GetBoardByCRSParams;
import com.thalesgroup.rtti._2017_10_01.ldbsv.ObjectFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;

@WebService
public class IdealTrains {

    public static final String STAFF_WEBSERVICE_URL = "https://lite.realtime.nationalrail.co.uk/OpenLDBSVWS/wsdl.aspx?ver=2017-10-01";
    public static final String STAFF_WEBSERVICE_ENDPOINT = "https://lite.realtime.nationalrail.co.uk/OpenLDBSVWS/ldbsv12.asmx";
    public static final String AUTHENTICATION_TOKEN = "tkn";

    public static final String CRS_CODE_BOURNEMOUTH = "BMH";
    public static final String CRS_CODE_POOLE = "POO";
    public static final String CRS_CODE_BROCKENHURST = "BCU";

    public static List<String> crsCodes = new ArrayList<>(Arrays.asList(CRS_CODE_BOURNEMOUTH, CRS_CODE_BROCKENHURST));

    public static void main(String args[]) throws SOAPException, IOException, DatatypeConfigurationException, JAXBException, Exception {

        ObjectFactory fac = new com.thalesgroup.rtti._2017_10_01.ldbsv.ObjectFactory();

        GetBoardByCRSParams params = fac.createGetBoardByCRSParams();

        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        XMLGregorianCalendar xmlCalendar = dateToXMLGregorianCalendar(date);
        params.setTime(xmlCalendar);
        params.setCrs("BMH");
        params.setNumRows(499); //as many as possible to manipulate them all
        params.setFilterType(FilterType.TO);
        params.setGetNonPassengerServices(false);
        params.setServices("P");
        params.setTimeWindow(140);

        
        
        JAXBElement<GetBoardByCRSParams> element = fac.createGetDepartureBoardByCRSRequest(params);
        JAXBContext jaxbContext = JAXBContext.newInstance(GetBoardByCRSParams.class);
        Document generatedRequest = getMarshalledDocument(element, jaxbContext);
        
        if (generatedRequest == null) {
            System.out.println("Could not marshall, terminating...");
            return;
        }
        
        SOAPMessage request = createSoapRequest("GetDepartureBoardByCRS", generatedRequest);
        
        SOAPMessage response = getSoapResponseFromRequest(request, STAFF_WEBSERVICE_ENDPOINT);
        
        System.out.println(formatSoapMessage(response.getSOAPPart()));
    }

    public static String formatSoapMessage(final SOAPPart part) throws Exception {
        final TransformerFactory transformerFactory = TransformerFactory.newInstance();
        final Transformer transformer = transformerFactory.newTransformer();

        // Format it
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

        final Source soapContent = part.getContent();

        final ByteArrayOutputStream streamOut = new ByteArrayOutputStream();
        final StreamResult result = new StreamResult(streamOut);
        transformer.transform(soapContent, result);

        return streamOut.toString();
    }

    private static SOAPMessage getSoapResponseFromRequest(SOAPMessage soapRequest, String soapEndpointUrl) {
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send SOAP Message to SOAP Server
            SOAPMessage soapResponse = soapConnection.call(soapRequest, soapEndpointUrl);
            soapConnection.close();
            return soapResponse;
        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
            e.printStackTrace();
            return null;
        }

    }

    private static String getTokenValue() {
        return AUTHENTICATION_TOKEN;

    }

    private static String createSoapAction(String action, boolean appendRequest) {
        return action + (appendRequest ? "Request" : "");
    }

    private static Document getEmptyDoc() {
        Document document = null;
        try {
            document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(IdealTrains.class.getName()).log(Level.SEVERE, null, ex);
        }
        return document;
    }

    private static Document getMarshalledDocument(JAXBElement<GetBoardByCRSParams> element, JAXBContext jaxbContext) {
        Document document = getEmptyDoc();
        try {
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(element, document);
        } catch (JAXBException e) {
            Logger.getLogger(IdealTrains.class.getName()).log(Level.SEVERE, null, e);
            document = null;
        }
        return document;
    }

    private static SOAPMessage createSoapRequest(String action, Document generatedRequestAsDoc) throws SOAPException {
        MessageFactory messageFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("ldb", "http://thalesgroup.com/RTTI/2017-10-01/ldb/");
        envelope.addNamespaceDeclaration("typ", "http://thalesgroup.com/RTTI/2013-11-28/Token/types");

        envelope.getHeader().
                addHeaderElement(new QName("http://thalesgroup.com/RTTI/2013-11-28/Token/types", "AccessToken")).
                addChildElement("typ:TokenValue").
                addTextNode(getTokenValue());
        soapMessage.getMimeHeaders().addHeader("Content-type", "application/soap+xml;charset=UTF-8;action=" + createSoapAction(action, false));
        soapMessage.getMimeHeaders().addHeader("Accept-encoding", "gzip, x-gzip, deflate, x-bzip2");

        soapMessage.getMimeHeaders().addHeader("SOAPAction", "http://thalesgroup.com/RTTI/2017-10-01/ldb/ " + createSoapAction(action, true));

        soapMessage.getSOAPBody().addDocument(generatedRequestAsDoc); //adding the generated request by jax client to the body

        soapMessage.saveChanges();
        return soapMessage;
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
}
