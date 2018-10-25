
package com.thalesgroup.rtti._2017_10_01.ldbsv;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.thalesgroup.rtti._2015_05_14.ldbsv_ref.GetReasonCodeListResponseType;
import com.thalesgroup.rtti._2015_05_14.ldbsv_ref.GetReasonCodeRequestParams;
import com.thalesgroup.rtti._2015_05_14.ldbsv_ref.GetReasonCodeResponseType;
import com.thalesgroup.rtti._2015_05_14.ldbsv_ref.GetSourceInstanceNamesResponseType;
import com.thalesgroup.rtti._2015_05_14.ldbsv_ref.GetStationListResponseType;
import com.thalesgroup.rtti._2015_05_14.ldbsv_ref.GetTOCListResponseType;
import com.thalesgroup.rtti._2015_05_14.ldbsv_ref.GetVersionedRefDataRequestParams;
import com.thalesgroup.rtti._2015_05_14.ldbsv_ref.VoidParams;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LDBSVRefServiceSoap", targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.thalesgroup.rtti._2017_10_01.ldbsv.types.ObjectFactory.class,
    com.thalesgroup.rtti._2017_10_01.ldbsv.ObjectFactory.class,
    com.thalesgroup.rtti._2015_05_14.ldbsv_ref.types.ObjectFactory.class,
    com.thalesgroup.rtti._2012_01_13.ldbsv.types.ObjectFactory.class,
    com.thalesgroup.rtti._2013_11_28.token.types.ObjectFactory.class,
    com.thalesgroup.rtti._2014_02_20.ldbsv.types.ObjectFactory.class,
    com.thalesgroup.rtti._2015_05_14.ldbsv_ref.ObjectFactory.class,
    com.thalesgroup.rtti._2015_11_27.ldbsv.commontypes.ObjectFactory.class,
    com.thalesgroup.rtti._2015_11_27.ldbsv.types.ObjectFactory.class,
    com.thalesgroup.rtti._2016_02_16.ldbsv.types.ObjectFactory.class,
    com.thalesgroup.rtti._2017_10_01.ldbsv.commontypes.ObjectFactory.class,
    com.thalesgroup.rtti._2007_10_10.ldb.commontypes.ObjectFactory.class
})
public interface LDBSVRefServiceSoap {


    /**
     * 
     * @param parameters
     * @return
     *     returns com.thalesgroup.rtti._2015_05_14.ldbsv_ref.GetReasonCodeResponseType
     */
    @WebMethod(operationName = "GetReasonCode", action = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/GetReasonCode")
    @WebResult(name = "GetReasonCodeResponse", targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", partName = "parameters")
    public GetReasonCodeResponseType getReasonCode(
        @WebParam(name = "GetReasonCodeRequest", targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", partName = "parameters")
        GetReasonCodeRequestParams parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.thalesgroup.rtti._2015_05_14.ldbsv_ref.GetReasonCodeListResponseType
     */
    @WebMethod(operationName = "GetReasonCodeList", action = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/GetReasonCodeList")
    @WebResult(name = "GetReasonCodeListResponse", targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", partName = "parameters")
    public GetReasonCodeListResponseType getReasonCodeList(
        @WebParam(name = "GetReasonCodeListRequest", targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", partName = "parameters")
        VoidParams parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.thalesgroup.rtti._2015_05_14.ldbsv_ref.GetSourceInstanceNamesResponseType
     */
    @WebMethod(operationName = "GetSourceInstanceNames", action = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/GetSourceInstanceNames")
    @WebResult(name = "GetSourceInstanceNamesResponse", targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", partName = "parameters")
    public GetSourceInstanceNamesResponseType getSourceInstanceNames(
        @WebParam(name = "GetSourceInstanceNamesRequest", targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", partName = "parameters")
        VoidParams parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.thalesgroup.rtti._2015_05_14.ldbsv_ref.GetTOCListResponseType
     */
    @WebMethod(operationName = "GetTOCList", action = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/GetTOCList")
    @WebResult(name = "GetTOCListResponse", targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", partName = "parameters")
    public GetTOCListResponseType getTOCList(
        @WebParam(name = "GetTOCListRequest", targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", partName = "parameters")
        GetVersionedRefDataRequestParams parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.thalesgroup.rtti._2015_05_14.ldbsv_ref.GetStationListResponseType
     */
    @WebMethod(operationName = "GetStationList", action = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/GetStationList")
    @WebResult(name = "GetStationListResponse", targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", partName = "parameters")
    public GetStationListResponseType getStationList(
        @WebParam(name = "GetStationListRequest", targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", partName = "parameters")
        GetVersionedRefDataRequestParams parameters);

}