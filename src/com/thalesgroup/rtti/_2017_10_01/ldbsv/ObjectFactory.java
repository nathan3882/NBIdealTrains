
package com.thalesgroup.rtti._2017_10_01.ldbsv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.thalesgroup.rtti._2007_10_10.ldb.commontypes.FilterType;
import com.thalesgroup.rtti._2015_11_27.ldbsv.commontypes.DepBoardDateType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.thalesgroup.rtti._2017_10_01.ldbsv package. 
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

    private final static QName _GetReasonCodeListRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetReasonCodeListRequest");
    private final static QName _GetHistoricDepartureBoardRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetHistoricDepartureBoardRequest");
    private final static QName _GetArrivalBoardByCRSRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetArrivalBoardByCRSRequest");
    private final static QName _GetDepartureBoardByCRSResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetDepartureBoardByCRSResponse");
    private final static QName _GetReasonCodeResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetReasonCodeResponse");
    private final static QName _GetHistoricTimeLineResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetHistoricTimeLineResponse");
    private final static QName _GetArrivalDepartureBoardByCRSRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetArrivalDepartureBoardByCRSRequest");
    private final static QName _GetFastestDeparturesWithDetailsRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetFastestDeparturesWithDetailsRequest");
    private final static QName _GetArrivalDepartureBoardByTIPLOCResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetArrivalDepartureBoardByTIPLOCResponse");
    private final static QName _GetDepartureBoardByTIPLOCRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetDepartureBoardByTIPLOCRequest");
    private final static QName _QueryServicesRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "QueryServicesRequest");
    private final static QName _GetFastestDeparturesRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetFastestDeparturesRequest");
    private final static QName _QueryServicesResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "QueryServicesResponse");
    private final static QName _GetFastestDeparturesWithDetailsResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetFastestDeparturesWithDetailsResponse");
    private final static QName _GetDisruptionListRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetDisruptionListRequest");
    private final static QName _GetReasonCodeListResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetReasonCodeListResponse");
    private final static QName _GetArrivalBoardByTIPLOCRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetArrivalBoardByTIPLOCRequest");
    private final static QName _GetArrBoardWithDetailsResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetArrBoardWithDetailsResponse");
    private final static QName _GetSourceInstanceNamesResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetSourceInstanceNamesResponse");
    private final static QName _GetSourceInstanceNamesRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetSourceInstanceNamesRequest");
    private final static QName _GetNextDeparturesResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetNextDeparturesResponse");
    private final static QName _GetArrDepBoardWithDetailsRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetArrDepBoardWithDetailsRequest");
    private final static QName _GetNextDeparturesWithDetailsResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetNextDeparturesWithDetailsResponse");
    private final static QName _GetArrivalDepartureBoardByCRSResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetArrivalDepartureBoardByCRSResponse");
    private final static QName _GetArrivalBoardByCRSResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetArrivalBoardByCRSResponse");
    private final static QName _GetHistoricServiceDetailsRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetHistoricServiceDetailsRequest");
    private final static QName _GetHistoricDepartureBoardResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetHistoricDepartureBoardResponse");
    private final static QName _GetArrDepBoardWithDetailsResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetArrDepBoardWithDetailsResponse");
    private final static QName _GetDepBoardWithDetailsResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetDepBoardWithDetailsResponse");
    private final static QName _GetArrivalDepartureBoardByTIPLOCRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetArrivalDepartureBoardByTIPLOCRequest");
    private final static QName _GetArrivalBoardByTIPLOCResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetArrivalBoardByTIPLOCResponse");
    private final static QName _GetDisruptionListResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetDisruptionListResponse");
    private final static QName _GetServiceDetailsByRIDRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetServiceDetailsByRIDRequest");
    private final static QName _GetDepBoardWithDetailsRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetDepBoardWithDetailsRequest");
    private final static QName _GetNextDeparturesWithDetailsRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetNextDeparturesWithDetailsRequest");
    private final static QName _QueryHistoricServicesResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "QueryHistoricServicesResponse");
    private final static QName _GetNextDeparturesRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetNextDeparturesRequest");
    private final static QName _GetReasonCodeRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetReasonCodeRequest");
    private final static QName _GetArrBoardWithDetailsRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetArrBoardWithDetailsRequest");
    private final static QName _GetHistoricServiceDetailsResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetHistoricServiceDetailsResponse");
    private final static QName _GetHistoricTimeLineRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetHistoricTimeLineRequest");
    private final static QName _QueryHistoricServicesRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "QueryHistoricServicesRequest");
    private final static QName _GetServiceDetailsByRIDResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetServiceDetailsByRIDResponse");
    private final static QName _GetDepartureBoardByCRSRequest_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetDepartureBoardByCRSRequest");
    private final static QName _GetFastestDeparturesResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetFastestDeparturesResponse");
    private final static QName _GetDepartureBoardByTIPLOCResponse_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "GetDepartureBoardByTIPLOCResponse");
    private final static QName _GetHistoricServiceDetailsRequestParamsHistoricDateTime_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "historicDateTime");
    private final static QName _GetHistoricServiceDetailsRequestParamsScheduleStartDate_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "scheduleStartDate");
    private final static QName _QueryHistoricServicesRequestParamsRouteCRSFilter_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "routeCRSFilter");
    private final static QName _QueryHistoricServicesRequestParamsTocFilter_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "tocFilter");
    private final static QName _QueryHistoricServicesRequestParamsTimeFilter_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "timeFilter");
    private final static QName _GetHistoricDepartureBoardRequestParamsDepBoardTime_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "depBoardTime");
    private final static QName _GetHistoricDepartureBoardRequestParamsFilterCRSType_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "filterCRSType");
    private final static QName _GetHistoricDepartureBoardRequestParamsFilterTOC_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "filterTOC");
    private final static QName _GetHistoricDepartureBoardRequestParamsDepBoardDate_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "depBoardDate");
    private final static QName _GetHistoricDepartureBoardRequestParamsFilterCRS_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "filterCRS");
    private final static QName _GetBoardByCRSParamsFiltercrs_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "filtercrs");
    private final static QName _QueryServicesRequestParamsFilterTime_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "filterTime");
    private final static QName _GetBoardByTIPLOCParamsFilterTiploc_QNAME = new QName("http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", "filterTiploc");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.thalesgroup.rtti._2017_10_01.ldbsv
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDeparturesParams }
     * 
     */
    public GetDeparturesParams createGetDeparturesParams() {
        return new GetDeparturesParams();
    }

    /**
     * Create an instance of {@link GetDisruptionListRequestParams }
     * 
     */
    public GetDisruptionListRequestParams createGetDisruptionListRequestParams() {
        return new GetDisruptionListRequestParams();
    }

    /**
     * Create an instance of {@link GetReasonCodeListResponseType }
     * 
     */
    public GetReasonCodeListResponseType createGetReasonCodeListResponseType() {
        return new GetReasonCodeListResponseType();
    }

    /**
     * Create an instance of {@link GetBoardByTIPLOCParams }
     * 
     */
    public GetBoardByTIPLOCParams createGetBoardByTIPLOCParams() {
        return new GetBoardByTIPLOCParams();
    }

    /**
     * Create an instance of {@link GetReasonCodeRequestParams }
     * 
     */
    public GetReasonCodeRequestParams createGetReasonCodeRequestParams() {
        return new GetReasonCodeRequestParams();
    }

    /**
     * Create an instance of {@link GetBoardByCRSParams }
     * 
     */
    public GetBoardByCRSParams createGetBoardByCRSParams() {
        return new GetBoardByCRSParams();
    }

    /**
     * Create an instance of {@link GetSourceInstanceNamesResponseType }
     * 
     */
    public GetSourceInstanceNamesResponseType createGetSourceInstanceNamesResponseType() {
        return new GetSourceInstanceNamesResponseType();
    }

    /**
     * Create an instance of {@link GetStationBoardWithDetailsResponseType }
     * 
     */
    public GetStationBoardWithDetailsResponseType createGetStationBoardWithDetailsResponseType() {
        return new GetStationBoardWithDetailsResponseType();
    }

    /**
     * Create an instance of {@link VoidParams }
     * 
     */
    public VoidParams createVoidParams() {
        return new VoidParams();
    }

    /**
     * Create an instance of {@link GetHistoricServiceDetailsResponseType }
     * 
     */
    public GetHistoricServiceDetailsResponseType createGetHistoricServiceDetailsResponseType() {
        return new GetHistoricServiceDetailsResponseType();
    }

    /**
     * Create an instance of {@link GetHistoricTimeLineRequestParams }
     * 
     */
    public GetHistoricTimeLineRequestParams createGetHistoricTimeLineRequestParams() {
        return new GetHistoricTimeLineRequestParams();
    }

    /**
     * Create an instance of {@link QueryHistoricServicesRequestParams }
     * 
     */
    public QueryHistoricServicesRequestParams createQueryHistoricServicesRequestParams() {
        return new QueryHistoricServicesRequestParams();
    }

    /**
     * Create an instance of {@link GetServiceDetailsResponseType }
     * 
     */
    public GetServiceDetailsResponseType createGetServiceDetailsResponseType() {
        return new GetServiceDetailsResponseType();
    }

    /**
     * Create an instance of {@link DeparturesBoardResponseType }
     * 
     */
    public DeparturesBoardResponseType createDeparturesBoardResponseType() {
        return new DeparturesBoardResponseType();
    }

    /**
     * Create an instance of {@link GetBoardResponseType }
     * 
     */
    public GetBoardResponseType createGetBoardResponseType() {
        return new GetBoardResponseType();
    }

    /**
     * Create an instance of {@link GetHistoricDepartureBoardRequestParams }
     * 
     */
    public GetHistoricDepartureBoardRequestParams createGetHistoricDepartureBoardRequestParams() {
        return new GetHistoricDepartureBoardRequestParams();
    }

    /**
     * Create an instance of {@link DeparturesBoardWithDetailsResponseType }
     * 
     */
    public DeparturesBoardWithDetailsResponseType createDeparturesBoardWithDetailsResponseType() {
        return new DeparturesBoardWithDetailsResponseType();
    }

    /**
     * Create an instance of {@link GetReasonCodeResponseType }
     * 
     */
    public GetReasonCodeResponseType createGetReasonCodeResponseType() {
        return new GetReasonCodeResponseType();
    }

    /**
     * Create an instance of {@link GetHistoricServiceDetailsRequestParams }
     * 
     */
    public GetHistoricServiceDetailsRequestParams createGetHistoricServiceDetailsRequestParams() {
        return new GetHistoricServiceDetailsRequestParams();
    }

    /**
     * Create an instance of {@link GetHistoricDepartureBoardResponseType }
     * 
     */
    public GetHistoricDepartureBoardResponseType createGetHistoricDepartureBoardResponseType() {
        return new GetHistoricDepartureBoardResponseType();
    }

    /**
     * Create an instance of {@link GetHistoricTimeLineResponseType }
     * 
     */
    public GetHistoricTimeLineResponseType createGetHistoricTimeLineResponseType() {
        return new GetHistoricTimeLineResponseType();
    }

    /**
     * Create an instance of {@link GetDisruptionListResponseType }
     * 
     */
    public GetDisruptionListResponseType createGetDisruptionListResponseType() {
        return new GetDisruptionListResponseType();
    }

    /**
     * Create an instance of {@link QueryServicesRequestParams }
     * 
     */
    public QueryServicesRequestParams createQueryServicesRequestParams() {
        return new QueryServicesRequestParams();
    }

    /**
     * Create an instance of {@link GetServiceDetailsByRIDParams }
     * 
     */
    public GetServiceDetailsByRIDParams createGetServiceDetailsByRIDParams() {
        return new GetServiceDetailsByRIDParams();
    }

    /**
     * Create an instance of {@link QueryServicesResponseType }
     * 
     */
    public QueryServicesResponseType createQueryServicesResponseType() {
        return new QueryServicesResponseType();
    }

    /**
     * Create an instance of {@link QueryHistoricServicesResponseType }
     * 
     */
    public QueryHistoricServicesResponseType createQueryHistoricServicesResponseType() {
        return new QueryHistoricServicesResponseType();
    }

    /**
     * Create an instance of {@link GetDeparturesParams.FilterList }
     * 
     */
    public GetDeparturesParams.FilterList createGetDeparturesParamsFilterList() {
        return new GetDeparturesParams.FilterList();
    }

    /**
     * Create an instance of {@link GetDisruptionListRequestParams.CRSList }
     * 
     */
    public GetDisruptionListRequestParams.CRSList createGetDisruptionListRequestParamsCRSList() {
        return new GetDisruptionListRequestParams.CRSList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoidParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetReasonCodeListRequest")
    public JAXBElement<VoidParams> createGetReasonCodeListRequest(VoidParams value) {
        return new JAXBElement<VoidParams>(_GetReasonCodeListRequest_QNAME, VoidParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoricDepartureBoardRequestParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetHistoricDepartureBoardRequest")
    public JAXBElement<GetHistoricDepartureBoardRequestParams> createGetHistoricDepartureBoardRequest(GetHistoricDepartureBoardRequestParams value) {
        return new JAXBElement<GetHistoricDepartureBoardRequestParams>(_GetHistoricDepartureBoardRequest_QNAME, GetHistoricDepartureBoardRequestParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardByCRSParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetArrivalBoardByCRSRequest")
    public JAXBElement<GetBoardByCRSParams> createGetArrivalBoardByCRSRequest(GetBoardByCRSParams value) {
        return new JAXBElement<GetBoardByCRSParams>(_GetArrivalBoardByCRSRequest_QNAME, GetBoardByCRSParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetDepartureBoardByCRSResponse")
    public JAXBElement<GetBoardResponseType> createGetDepartureBoardByCRSResponse(GetBoardResponseType value) {
        return new JAXBElement<GetBoardResponseType>(_GetDepartureBoardByCRSResponse_QNAME, GetBoardResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReasonCodeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetReasonCodeResponse")
    public JAXBElement<GetReasonCodeResponseType> createGetReasonCodeResponse(GetReasonCodeResponseType value) {
        return new JAXBElement<GetReasonCodeResponseType>(_GetReasonCodeResponse_QNAME, GetReasonCodeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoricTimeLineResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetHistoricTimeLineResponse")
    public JAXBElement<GetHistoricTimeLineResponseType> createGetHistoricTimeLineResponse(GetHistoricTimeLineResponseType value) {
        return new JAXBElement<GetHistoricTimeLineResponseType>(_GetHistoricTimeLineResponse_QNAME, GetHistoricTimeLineResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardByCRSParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetArrivalDepartureBoardByCRSRequest")
    public JAXBElement<GetBoardByCRSParams> createGetArrivalDepartureBoardByCRSRequest(GetBoardByCRSParams value) {
        return new JAXBElement<GetBoardByCRSParams>(_GetArrivalDepartureBoardByCRSRequest_QNAME, GetBoardByCRSParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeparturesParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetFastestDeparturesWithDetailsRequest")
    public JAXBElement<GetDeparturesParams> createGetFastestDeparturesWithDetailsRequest(GetDeparturesParams value) {
        return new JAXBElement<GetDeparturesParams>(_GetFastestDeparturesWithDetailsRequest_QNAME, GetDeparturesParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetArrivalDepartureBoardByTIPLOCResponse")
    public JAXBElement<GetBoardResponseType> createGetArrivalDepartureBoardByTIPLOCResponse(GetBoardResponseType value) {
        return new JAXBElement<GetBoardResponseType>(_GetArrivalDepartureBoardByTIPLOCResponse_QNAME, GetBoardResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardByTIPLOCParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetDepartureBoardByTIPLOCRequest")
    public JAXBElement<GetBoardByTIPLOCParams> createGetDepartureBoardByTIPLOCRequest(GetBoardByTIPLOCParams value) {
        return new JAXBElement<GetBoardByTIPLOCParams>(_GetDepartureBoardByTIPLOCRequest_QNAME, GetBoardByTIPLOCParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryServicesRequestParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "QueryServicesRequest")
    public JAXBElement<QueryServicesRequestParams> createQueryServicesRequest(QueryServicesRequestParams value) {
        return new JAXBElement<QueryServicesRequestParams>(_QueryServicesRequest_QNAME, QueryServicesRequestParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeparturesParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetFastestDeparturesRequest")
    public JAXBElement<GetDeparturesParams> createGetFastestDeparturesRequest(GetDeparturesParams value) {
        return new JAXBElement<GetDeparturesParams>(_GetFastestDeparturesRequest_QNAME, GetDeparturesParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryServicesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "QueryServicesResponse")
    public JAXBElement<QueryServicesResponseType> createQueryServicesResponse(QueryServicesResponseType value) {
        return new JAXBElement<QueryServicesResponseType>(_QueryServicesResponse_QNAME, QueryServicesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeparturesBoardWithDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetFastestDeparturesWithDetailsResponse")
    public JAXBElement<DeparturesBoardWithDetailsResponseType> createGetFastestDeparturesWithDetailsResponse(DeparturesBoardWithDetailsResponseType value) {
        return new JAXBElement<DeparturesBoardWithDetailsResponseType>(_GetFastestDeparturesWithDetailsResponse_QNAME, DeparturesBoardWithDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDisruptionListRequestParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetDisruptionListRequest")
    public JAXBElement<GetDisruptionListRequestParams> createGetDisruptionListRequest(GetDisruptionListRequestParams value) {
        return new JAXBElement<GetDisruptionListRequestParams>(_GetDisruptionListRequest_QNAME, GetDisruptionListRequestParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReasonCodeListResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetReasonCodeListResponse")
    public JAXBElement<GetReasonCodeListResponseType> createGetReasonCodeListResponse(GetReasonCodeListResponseType value) {
        return new JAXBElement<GetReasonCodeListResponseType>(_GetReasonCodeListResponse_QNAME, GetReasonCodeListResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardByTIPLOCParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetArrivalBoardByTIPLOCRequest")
    public JAXBElement<GetBoardByTIPLOCParams> createGetArrivalBoardByTIPLOCRequest(GetBoardByTIPLOCParams value) {
        return new JAXBElement<GetBoardByTIPLOCParams>(_GetArrivalBoardByTIPLOCRequest_QNAME, GetBoardByTIPLOCParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStationBoardWithDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetArrBoardWithDetailsResponse")
    public JAXBElement<GetStationBoardWithDetailsResponseType> createGetArrBoardWithDetailsResponse(GetStationBoardWithDetailsResponseType value) {
        return new JAXBElement<GetStationBoardWithDetailsResponseType>(_GetArrBoardWithDetailsResponse_QNAME, GetStationBoardWithDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSourceInstanceNamesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetSourceInstanceNamesResponse")
    public JAXBElement<GetSourceInstanceNamesResponseType> createGetSourceInstanceNamesResponse(GetSourceInstanceNamesResponseType value) {
        return new JAXBElement<GetSourceInstanceNamesResponseType>(_GetSourceInstanceNamesResponse_QNAME, GetSourceInstanceNamesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoidParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetSourceInstanceNamesRequest")
    public JAXBElement<VoidParams> createGetSourceInstanceNamesRequest(VoidParams value) {
        return new JAXBElement<VoidParams>(_GetSourceInstanceNamesRequest_QNAME, VoidParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeparturesBoardResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetNextDeparturesResponse")
    public JAXBElement<DeparturesBoardResponseType> createGetNextDeparturesResponse(DeparturesBoardResponseType value) {
        return new JAXBElement<DeparturesBoardResponseType>(_GetNextDeparturesResponse_QNAME, DeparturesBoardResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardByCRSParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetArrDepBoardWithDetailsRequest")
    public JAXBElement<GetBoardByCRSParams> createGetArrDepBoardWithDetailsRequest(GetBoardByCRSParams value) {
        return new JAXBElement<GetBoardByCRSParams>(_GetArrDepBoardWithDetailsRequest_QNAME, GetBoardByCRSParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeparturesBoardWithDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetNextDeparturesWithDetailsResponse")
    public JAXBElement<DeparturesBoardWithDetailsResponseType> createGetNextDeparturesWithDetailsResponse(DeparturesBoardWithDetailsResponseType value) {
        return new JAXBElement<DeparturesBoardWithDetailsResponseType>(_GetNextDeparturesWithDetailsResponse_QNAME, DeparturesBoardWithDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetArrivalDepartureBoardByCRSResponse")
    public JAXBElement<GetBoardResponseType> createGetArrivalDepartureBoardByCRSResponse(GetBoardResponseType value) {
        return new JAXBElement<GetBoardResponseType>(_GetArrivalDepartureBoardByCRSResponse_QNAME, GetBoardResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetArrivalBoardByCRSResponse")
    public JAXBElement<GetBoardResponseType> createGetArrivalBoardByCRSResponse(GetBoardResponseType value) {
        return new JAXBElement<GetBoardResponseType>(_GetArrivalBoardByCRSResponse_QNAME, GetBoardResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoricServiceDetailsRequestParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetHistoricServiceDetailsRequest")
    public JAXBElement<GetHistoricServiceDetailsRequestParams> createGetHistoricServiceDetailsRequest(GetHistoricServiceDetailsRequestParams value) {
        return new JAXBElement<GetHistoricServiceDetailsRequestParams>(_GetHistoricServiceDetailsRequest_QNAME, GetHistoricServiceDetailsRequestParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoricDepartureBoardResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetHistoricDepartureBoardResponse")
    public JAXBElement<GetHistoricDepartureBoardResponseType> createGetHistoricDepartureBoardResponse(GetHistoricDepartureBoardResponseType value) {
        return new JAXBElement<GetHistoricDepartureBoardResponseType>(_GetHistoricDepartureBoardResponse_QNAME, GetHistoricDepartureBoardResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStationBoardWithDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetArrDepBoardWithDetailsResponse")
    public JAXBElement<GetStationBoardWithDetailsResponseType> createGetArrDepBoardWithDetailsResponse(GetStationBoardWithDetailsResponseType value) {
        return new JAXBElement<GetStationBoardWithDetailsResponseType>(_GetArrDepBoardWithDetailsResponse_QNAME, GetStationBoardWithDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStationBoardWithDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetDepBoardWithDetailsResponse")
    public JAXBElement<GetStationBoardWithDetailsResponseType> createGetDepBoardWithDetailsResponse(GetStationBoardWithDetailsResponseType value) {
        return new JAXBElement<GetStationBoardWithDetailsResponseType>(_GetDepBoardWithDetailsResponse_QNAME, GetStationBoardWithDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardByTIPLOCParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetArrivalDepartureBoardByTIPLOCRequest")
    public JAXBElement<GetBoardByTIPLOCParams> createGetArrivalDepartureBoardByTIPLOCRequest(GetBoardByTIPLOCParams value) {
        return new JAXBElement<GetBoardByTIPLOCParams>(_GetArrivalDepartureBoardByTIPLOCRequest_QNAME, GetBoardByTIPLOCParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetArrivalBoardByTIPLOCResponse")
    public JAXBElement<GetBoardResponseType> createGetArrivalBoardByTIPLOCResponse(GetBoardResponseType value) {
        return new JAXBElement<GetBoardResponseType>(_GetArrivalBoardByTIPLOCResponse_QNAME, GetBoardResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDisruptionListResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetDisruptionListResponse")
    public JAXBElement<GetDisruptionListResponseType> createGetDisruptionListResponse(GetDisruptionListResponseType value) {
        return new JAXBElement<GetDisruptionListResponseType>(_GetDisruptionListResponse_QNAME, GetDisruptionListResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceDetailsByRIDParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetServiceDetailsByRIDRequest")
    public JAXBElement<GetServiceDetailsByRIDParams> createGetServiceDetailsByRIDRequest(GetServiceDetailsByRIDParams value) {
        return new JAXBElement<GetServiceDetailsByRIDParams>(_GetServiceDetailsByRIDRequest_QNAME, GetServiceDetailsByRIDParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardByCRSParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetDepBoardWithDetailsRequest")
    public JAXBElement<GetBoardByCRSParams> createGetDepBoardWithDetailsRequest(GetBoardByCRSParams value) {
        return new JAXBElement<GetBoardByCRSParams>(_GetDepBoardWithDetailsRequest_QNAME, GetBoardByCRSParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeparturesParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetNextDeparturesWithDetailsRequest")
    public JAXBElement<GetDeparturesParams> createGetNextDeparturesWithDetailsRequest(GetDeparturesParams value) {
        return new JAXBElement<GetDeparturesParams>(_GetNextDeparturesWithDetailsRequest_QNAME, GetDeparturesParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHistoricServicesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "QueryHistoricServicesResponse")
    public JAXBElement<QueryHistoricServicesResponseType> createQueryHistoricServicesResponse(QueryHistoricServicesResponseType value) {
        return new JAXBElement<QueryHistoricServicesResponseType>(_QueryHistoricServicesResponse_QNAME, QueryHistoricServicesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeparturesParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetNextDeparturesRequest")
    public JAXBElement<GetDeparturesParams> createGetNextDeparturesRequest(GetDeparturesParams value) {
        return new JAXBElement<GetDeparturesParams>(_GetNextDeparturesRequest_QNAME, GetDeparturesParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReasonCodeRequestParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetReasonCodeRequest")
    public JAXBElement<GetReasonCodeRequestParams> createGetReasonCodeRequest(GetReasonCodeRequestParams value) {
        return new JAXBElement<GetReasonCodeRequestParams>(_GetReasonCodeRequest_QNAME, GetReasonCodeRequestParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardByCRSParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetArrBoardWithDetailsRequest")
    public JAXBElement<GetBoardByCRSParams> createGetArrBoardWithDetailsRequest(GetBoardByCRSParams value) {
        return new JAXBElement<GetBoardByCRSParams>(_GetArrBoardWithDetailsRequest_QNAME, GetBoardByCRSParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoricServiceDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetHistoricServiceDetailsResponse")
    public JAXBElement<GetHistoricServiceDetailsResponseType> createGetHistoricServiceDetailsResponse(GetHistoricServiceDetailsResponseType value) {
        return new JAXBElement<GetHistoricServiceDetailsResponseType>(_GetHistoricServiceDetailsResponse_QNAME, GetHistoricServiceDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoricTimeLineRequestParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetHistoricTimeLineRequest")
    public JAXBElement<GetHistoricTimeLineRequestParams> createGetHistoricTimeLineRequest(GetHistoricTimeLineRequestParams value) {
        return new JAXBElement<GetHistoricTimeLineRequestParams>(_GetHistoricTimeLineRequest_QNAME, GetHistoricTimeLineRequestParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHistoricServicesRequestParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "QueryHistoricServicesRequest")
    public JAXBElement<QueryHistoricServicesRequestParams> createQueryHistoricServicesRequest(QueryHistoricServicesRequestParams value) {
        return new JAXBElement<QueryHistoricServicesRequestParams>(_QueryHistoricServicesRequest_QNAME, QueryHistoricServicesRequestParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetServiceDetailsByRIDResponse")
    public JAXBElement<GetServiceDetailsResponseType> createGetServiceDetailsByRIDResponse(GetServiceDetailsResponseType value) {
        return new JAXBElement<GetServiceDetailsResponseType>(_GetServiceDetailsByRIDResponse_QNAME, GetServiceDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardByCRSParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetDepartureBoardByCRSRequest")
    public JAXBElement<GetBoardByCRSParams> createGetDepartureBoardByCRSRequest(GetBoardByCRSParams value) {
        return new JAXBElement<GetBoardByCRSParams>(_GetDepartureBoardByCRSRequest_QNAME, GetBoardByCRSParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeparturesBoardResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetFastestDeparturesResponse")
    public JAXBElement<DeparturesBoardResponseType> createGetFastestDeparturesResponse(DeparturesBoardResponseType value) {
        return new JAXBElement<DeparturesBoardResponseType>(_GetFastestDeparturesResponse_QNAME, DeparturesBoardResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "GetDepartureBoardByTIPLOCResponse")
    public JAXBElement<GetBoardResponseType> createGetDepartureBoardByTIPLOCResponse(GetBoardResponseType value) {
        return new JAXBElement<GetBoardResponseType>(_GetDepartureBoardByTIPLOCResponse_QNAME, GetBoardResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "historicDateTime", scope = GetHistoricServiceDetailsRequestParams.class)
    public JAXBElement<XMLGregorianCalendar> createGetHistoricServiceDetailsRequestParamsHistoricDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetHistoricServiceDetailsRequestParamsHistoricDateTime_QNAME, XMLGregorianCalendar.class, GetHistoricServiceDetailsRequestParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepBoardDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "scheduleStartDate", scope = GetHistoricServiceDetailsRequestParams.class)
    public JAXBElement<DepBoardDateType> createGetHistoricServiceDetailsRequestParamsScheduleStartDate(DepBoardDateType value) {
        return new JAXBElement<DepBoardDateType>(_GetHistoricServiceDetailsRequestParamsScheduleStartDate_QNAME, DepBoardDateType.class, GetHistoricServiceDetailsRequestParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "historicDateTime", scope = QueryHistoricServicesRequestParams.class)
    public JAXBElement<XMLGregorianCalendar> createQueryHistoricServicesRequestParamsHistoricDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetHistoricServiceDetailsRequestParamsHistoricDateTime_QNAME, XMLGregorianCalendar.class, QueryHistoricServicesRequestParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepBoardDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "scheduleStartDate", scope = QueryHistoricServicesRequestParams.class)
    public JAXBElement<DepBoardDateType> createQueryHistoricServicesRequestParamsScheduleStartDate(DepBoardDateType value) {
        return new JAXBElement<DepBoardDateType>(_GetHistoricServiceDetailsRequestParamsScheduleStartDate_QNAME, DepBoardDateType.class, QueryHistoricServicesRequestParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "routeCRSFilter", scope = QueryHistoricServicesRequestParams.class)
    public JAXBElement<String> createQueryHistoricServicesRequestParamsRouteCRSFilter(String value) {
        return new JAXBElement<String>(_QueryHistoricServicesRequestParamsRouteCRSFilter_QNAME, String.class, QueryHistoricServicesRequestParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "tocFilter", scope = QueryHistoricServicesRequestParams.class)
    public JAXBElement<String> createQueryHistoricServicesRequestParamsTocFilter(String value) {
        return new JAXBElement<String>(_QueryHistoricServicesRequestParamsTocFilter_QNAME, String.class, QueryHistoricServicesRequestParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "timeFilter", scope = QueryHistoricServicesRequestParams.class)
    public JAXBElement<XMLGregorianCalendar> createQueryHistoricServicesRequestParamsTimeFilter(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QueryHistoricServicesRequestParamsTimeFilter_QNAME, XMLGregorianCalendar.class, QueryHistoricServicesRequestParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "historicDateTime", scope = GetHistoricDepartureBoardRequestParams.class)
    public JAXBElement<XMLGregorianCalendar> createGetHistoricDepartureBoardRequestParamsHistoricDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetHistoricServiceDetailsRequestParamsHistoricDateTime_QNAME, XMLGregorianCalendar.class, GetHistoricDepartureBoardRequestParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "depBoardTime", scope = GetHistoricDepartureBoardRequestParams.class)
    public JAXBElement<XMLGregorianCalendar> createGetHistoricDepartureBoardRequestParamsDepBoardTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetHistoricDepartureBoardRequestParamsDepBoardTime_QNAME, XMLGregorianCalendar.class, GetHistoricDepartureBoardRequestParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "filterCRSType", scope = GetHistoricDepartureBoardRequestParams.class)
    public JAXBElement<FilterType> createGetHistoricDepartureBoardRequestParamsFilterCRSType(FilterType value) {
        return new JAXBElement<FilterType>(_GetHistoricDepartureBoardRequestParamsFilterCRSType_QNAME, FilterType.class, GetHistoricDepartureBoardRequestParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "filterTOC", scope = GetHistoricDepartureBoardRequestParams.class)
    public JAXBElement<String> createGetHistoricDepartureBoardRequestParamsFilterTOC(String value) {
        return new JAXBElement<String>(_GetHistoricDepartureBoardRequestParamsFilterTOC_QNAME, String.class, GetHistoricDepartureBoardRequestParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepBoardDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "depBoardDate", scope = GetHistoricDepartureBoardRequestParams.class)
    public JAXBElement<DepBoardDateType> createGetHistoricDepartureBoardRequestParamsDepBoardDate(DepBoardDateType value) {
        return new JAXBElement<DepBoardDateType>(_GetHistoricDepartureBoardRequestParamsDepBoardDate_QNAME, DepBoardDateType.class, GetHistoricDepartureBoardRequestParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "filterCRS", scope = GetHistoricDepartureBoardRequestParams.class)
    public JAXBElement<String> createGetHistoricDepartureBoardRequestParamsFilterCRS(String value) {
        return new JAXBElement<String>(_GetHistoricDepartureBoardRequestParamsFilterCRS_QNAME, String.class, GetHistoricDepartureBoardRequestParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "filterTOC", scope = GetDeparturesParams.class)
    public JAXBElement<String> createGetDeparturesParamsFilterTOC(String value) {
        return new JAXBElement<String>(_GetHistoricDepartureBoardRequestParamsFilterTOC_QNAME, String.class, GetDeparturesParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "filterTOC", scope = GetBoardByCRSParams.class)
    public JAXBElement<String> createGetBoardByCRSParamsFilterTOC(String value) {
        return new JAXBElement<String>(_GetHistoricDepartureBoardRequestParamsFilterTOC_QNAME, String.class, GetBoardByCRSParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "filtercrs", scope = GetBoardByCRSParams.class)
    public JAXBElement<String> createGetBoardByCRSParamsFiltercrs(String value) {
        return new JAXBElement<String>(_GetBoardByCRSParamsFiltercrs_QNAME, String.class, GetBoardByCRSParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "filterTime", scope = QueryServicesRequestParams.class)
    public JAXBElement<XMLGregorianCalendar> createQueryServicesRequestParamsFilterTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QueryServicesRequestParamsFilterTime_QNAME, XMLGregorianCalendar.class, QueryServicesRequestParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "filtercrs", scope = QueryServicesRequestParams.class)
    public JAXBElement<String> createQueryServicesRequestParamsFiltercrs(String value) {
        return new JAXBElement<String>(_GetBoardByCRSParamsFiltercrs_QNAME, String.class, QueryServicesRequestParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "tocFilter", scope = QueryServicesRequestParams.class)
    public JAXBElement<String> createQueryServicesRequestParamsTocFilter(String value) {
        return new JAXBElement<String>(_QueryHistoricServicesRequestParamsTocFilter_QNAME, String.class, QueryServicesRequestParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "filterTOC", scope = GetBoardByTIPLOCParams.class)
    public JAXBElement<String> createGetBoardByTIPLOCParamsFilterTOC(String value) {
        return new JAXBElement<String>(_GetHistoricDepartureBoardRequestParamsFilterTOC_QNAME, String.class, GetBoardByTIPLOCParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", name = "filterTiploc", scope = GetBoardByTIPLOCParams.class)
    public JAXBElement<String> createGetBoardByTIPLOCParamsFilterTiploc(String value) {
        return new JAXBElement<String>(_GetBoardByTIPLOCParamsFilterTiploc_QNAME, String.class, GetBoardByTIPLOCParams.class, value);
    }

}
