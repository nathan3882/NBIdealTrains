
package com.thalesgroup.rtti._2017_10_01.ldbsv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.thalesgroup.rtti._2015_11_27.ldbsv.commontypes.DepBoardDateType;


/**
 * <p>Java class for QueryHistoricServicesRequestParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryHistoricServicesRequestParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceID" type="{http://thalesgroup.com/RTTI/2016-02-16/ldbsv/commontypes}ServiceIDType"/>
 *         &lt;element name="historicDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="scheduleStartDate" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}DepBoardDateType" minOccurs="0"/>
 *         &lt;element name="timeFilter" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="routeCRSFilter" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" minOccurs="0"/>
 *         &lt;element name="tocFilter" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TOCCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryHistoricServicesRequestParams", propOrder = {
    "serviceID",
    "historicDateTime",
    "scheduleStartDate",
    "timeFilter",
    "routeCRSFilter",
    "tocFilter"
})
public class QueryHistoricServicesRequestParams {

    @XmlElement(required = true)
    protected String serviceID;
    @XmlElementRef(name = "historicDateTime", namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> historicDateTime;
    @XmlElementRef(name = "scheduleStartDate", namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", type = JAXBElement.class, required = false)
    protected JAXBElement<DepBoardDateType> scheduleStartDate;
    @XmlElementRef(name = "timeFilter", namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> timeFilter;
    @XmlElementRef(name = "routeCRSFilter", namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeCRSFilter;
    @XmlElementRef(name = "tocFilter", namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tocFilter;

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the historicDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getHistoricDateTime() {
        return historicDateTime;
    }

    /**
     * Sets the value of the historicDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setHistoricDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.historicDateTime = value;
    }

    /**
     * Gets the value of the scheduleStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DepBoardDateType }{@code >}
     *     
     */
    public JAXBElement<DepBoardDateType> getScheduleStartDate() {
        return scheduleStartDate;
    }

    /**
     * Sets the value of the scheduleStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DepBoardDateType }{@code >}
     *     
     */
    public void setScheduleStartDate(JAXBElement<DepBoardDateType> value) {
        this.scheduleStartDate = value;
    }

    /**
     * Gets the value of the timeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTimeFilter() {
        return timeFilter;
    }

    /**
     * Sets the value of the timeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTimeFilter(JAXBElement<XMLGregorianCalendar> value) {
        this.timeFilter = value;
    }

    /**
     * Gets the value of the routeCRSFilter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteCRSFilter() {
        return routeCRSFilter;
    }

    /**
     * Sets the value of the routeCRSFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteCRSFilter(JAXBElement<String> value) {
        this.routeCRSFilter = value;
    }

    /**
     * Gets the value of the tocFilter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTocFilter() {
        return tocFilter;
    }

    /**
     * Sets the value of the tocFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTocFilter(JAXBElement<String> value) {
        this.tocFilter = value;
    }

}
