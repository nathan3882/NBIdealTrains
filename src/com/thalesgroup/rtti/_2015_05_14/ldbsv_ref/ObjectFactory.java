
package com.thalesgroup.rtti._2015_05_14.ldbsv_ref;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.thalesgroup.rtti._2015_05_14.ldbsv_ref package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetStationListRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", "GetStationListRequest");
    private final static QName _GetSourceInstanceNamesResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", "GetSourceInstanceNamesResponse");
    private final static QName _GetReasonCodeListResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", "GetReasonCodeListResponse");
    private final static QName _GetSourceInstanceNamesRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", "GetSourceInstanceNamesRequest");
    private final static QName _GetTOCListRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", "GetTOCListRequest");
    private final static QName _GetReasonCodeResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", "GetReasonCodeResponse");
    private final static QName _GetReasonCodeListRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", "GetReasonCodeListRequest");
    private final static QName _GetReasonCodeRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", "GetReasonCodeRequest");
    private final static QName _GetStationListResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", "GetStationListResponse");
    private final static QName _GetTOCListResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", "GetTOCListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.thalesgroup.rtti._2015_05_14.ldbsv_ref
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VoidParams }
     * 
     */
    public VoidParams createVoidParams() {
        return new VoidParams();
    }

    /**
     * Create an instance of {@link GetReasonCodeListResponseType }
     * 
     */
    public GetReasonCodeListResponseType createGetReasonCodeListResponseType() {
        return new GetReasonCodeListResponseType();
    }

    /**
     * Create an instance of {@link GetVersionedRefDataRequestParams }
     * 
     */
    public GetVersionedRefDataRequestParams createGetVersionedRefDataRequestParams() {
        return new GetVersionedRefDataRequestParams();
    }

    /**
     * Create an instance of {@link GetReasonCodeResponseType }
     * 
     */
    public GetReasonCodeResponseType createGetReasonCodeResponseType() {
        return new GetReasonCodeResponseType();
    }

    /**
     * Create an instance of {@link GetTOCListResponseType }
     * 
     */
    public GetTOCListResponseType createGetTOCListResponseType() {
        return new GetTOCListResponseType();
    }

    /**
     * Create an instance of {@link GetReasonCodeRequestParams }
     * 
     */
    public GetReasonCodeRequestParams createGetReasonCodeRequestParams() {
        return new GetReasonCodeRequestParams();
    }

    /**
     * Create an instance of {@link GetStationListResponseType }
     * 
     */
    public GetStationListResponseType createGetStationListResponseType() {
        return new GetStationListResponseType();
    }

    /**
     * Create an instance of {@link GetSourceInstanceNamesResponseType }
     * 
     */
    public GetSourceInstanceNamesResponseType createGetSourceInstanceNamesResponseType() {
        return new GetSourceInstanceNamesResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionedRefDataRequestParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", name = "GetStationListRequest")
    public JAXBElement<GetVersionedRefDataRequestParams> createGetStationListRequest(GetVersionedRefDataRequestParams value) {
        return new JAXBElement<GetVersionedRefDataRequestParams>(_GetStationListRequest_QNAME, GetVersionedRefDataRequestParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSourceInstanceNamesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", name = "GetSourceInstanceNamesResponse")
    public JAXBElement<GetSourceInstanceNamesResponseType> createGetSourceInstanceNamesResponse(GetSourceInstanceNamesResponseType value) {
        return new JAXBElement<GetSourceInstanceNamesResponseType>(_GetSourceInstanceNamesResponse_QNAME, GetSourceInstanceNamesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReasonCodeListResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", name = "GetReasonCodeListResponse")
    public JAXBElement<GetReasonCodeListResponseType> createGetReasonCodeListResponse(GetReasonCodeListResponseType value) {
        return new JAXBElement<GetReasonCodeListResponseType>(_GetReasonCodeListResponse_QNAME, GetReasonCodeListResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoidParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", name = "GetSourceInstanceNamesRequest")
    public JAXBElement<VoidParams> createGetSourceInstanceNamesRequest(VoidParams value) {
        return new JAXBElement<VoidParams>(_GetSourceInstanceNamesRequest_QNAME, VoidParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionedRefDataRequestParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", name = "GetTOCListRequest")
    public JAXBElement<GetVersionedRefDataRequestParams> createGetTOCListRequest(GetVersionedRefDataRequestParams value) {
        return new JAXBElement<GetVersionedRefDataRequestParams>(_GetTOCListRequest_QNAME, GetVersionedRefDataRequestParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReasonCodeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", name = "GetReasonCodeResponse")
    public JAXBElement<GetReasonCodeResponseType> createGetReasonCodeResponse(GetReasonCodeResponseType value) {
        return new JAXBElement<GetReasonCodeResponseType>(_GetReasonCodeResponse_QNAME, GetReasonCodeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoidParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", name = "GetReasonCodeListRequest")
    public JAXBElement<VoidParams> createGetReasonCodeListRequest(VoidParams value) {
        return new JAXBElement<VoidParams>(_GetReasonCodeListRequest_QNAME, VoidParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReasonCodeRequestParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", name = "GetReasonCodeRequest")
    public JAXBElement<GetReasonCodeRequestParams> createGetReasonCodeRequest(GetReasonCodeRequestParams value) {
        return new JAXBElement<GetReasonCodeRequestParams>(_GetReasonCodeRequest_QNAME, GetReasonCodeRequestParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStationListResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", name = "GetStationListResponse")
    public JAXBElement<GetStationListResponseType> createGetStationListResponse(GetStationListResponseType value) {
        return new JAXBElement<GetStationListResponseType>(_GetStationListResponse_QNAME, GetStationListResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTOCListResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", name = "GetTOCListResponse")
    public JAXBElement<GetTOCListResponseType> createGetTOCListResponse(GetTOCListResponseType value) {
        return new JAXBElement<GetTOCListResponseType>(_GetTOCListResponse_QNAME, GetTOCListResponseType.class, null, value);
    }

}
