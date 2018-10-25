
package com.thalesgroup.rtti._2017_10_01.ldbsv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.thalesgroup.rtti._2007_10_10.ldb.commontypes.FilterType;
import com.thalesgroup.rtti._2015_11_27.ldbsv.commontypes.DepBoardDateType;


/**
 * <p>Java class for GetHistoricDepartureBoardRequestParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHistoricDepartureBoardRequestParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numRows" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="crs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType"/>
 *         &lt;element name="historicDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="depBoardDate" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}DepBoardDateType" minOccurs="0"/>
 *         &lt;element name="depBoardTime" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}DepBoardTimeType" minOccurs="0"/>
 *         &lt;element name="timeWindow" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="filterCRS" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" minOccurs="0"/>
 *         &lt;element name="filterCRSType" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}FilterType" minOccurs="0"/>
 *         &lt;element name="filterTOC" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TOCCode" minOccurs="0"/>
 *         &lt;element name="services" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}ServiceMaskType" minOccurs="0"/>
 *         &lt;element name="getNonPassengerServices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHistoricDepartureBoardRequestParams", propOrder = {
    "numRows",
    "crs",
    "historicDateTime",
    "depBoardDate",
    "depBoardTime",
    "timeWindow",
    "filterCRS",
    "filterCRSType",
    "filterTOC",
    "services",
    "getNonPassengerServices"
})
public class GetHistoricDepartureBoardRequestParams {

    @XmlSchemaType(name = "unsignedShort")
    protected int numRows;
    @XmlElement(required = true)
    protected String crs;
    @XmlElementRef(name = "historicDateTime", namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> historicDateTime;
    @XmlElementRef(name = "depBoardDate", namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", type = JAXBElement.class, required = false)
    protected JAXBElement<DepBoardDateType> depBoardDate;
    @XmlElementRef(name = "depBoardTime", namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> depBoardTime;
    @XmlSchemaType(name = "unsignedShort")
    protected int timeWindow;
    @XmlElementRef(name = "filterCRS", namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filterCRS;
    @XmlElementRef(name = "filterCRSType", namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", type = JAXBElement.class, required = false)
    protected JAXBElement<FilterType> filterCRSType;
    @XmlElementRef(name = "filterTOC", namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filterTOC;
    @XmlElement(defaultValue = "PBS")
    protected String services;
    @XmlElement(defaultValue = "false")
    protected Boolean getNonPassengerServices;

    /**
     * Gets the value of the numRows property.
     * 
     */
    public int getNumRows() {
        return numRows;
    }

    /**
     * Sets the value of the numRows property.
     * 
     */
    public void setNumRows(int value) {
        this.numRows = value;
    }

    /**
     * Gets the value of the crs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrs() {
        return crs;
    }

    /**
     * Sets the value of the crs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrs(String value) {
        this.crs = value;
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
     * Gets the value of the depBoardDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DepBoardDateType }{@code >}
     *     
     */
    public JAXBElement<DepBoardDateType> getDepBoardDate() {
        return depBoardDate;
    }

    /**
     * Sets the value of the depBoardDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DepBoardDateType }{@code >}
     *     
     */
    public void setDepBoardDate(JAXBElement<DepBoardDateType> value) {
        this.depBoardDate = value;
    }

    /**
     * Gets the value of the depBoardTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDepBoardTime() {
        return depBoardTime;
    }

    /**
     * Sets the value of the depBoardTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDepBoardTime(JAXBElement<XMLGregorianCalendar> value) {
        this.depBoardTime = value;
    }

    /**
     * Gets the value of the timeWindow property.
     * 
     */
    public int getTimeWindow() {
        return timeWindow;
    }

    /**
     * Sets the value of the timeWindow property.
     * 
     */
    public void setTimeWindow(int value) {
        this.timeWindow = value;
    }

    /**
     * Gets the value of the filterCRS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilterCRS() {
        return filterCRS;
    }

    /**
     * Sets the value of the filterCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilterCRS(JAXBElement<String> value) {
        this.filterCRS = value;
    }

    /**
     * Gets the value of the filterCRSType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FilterType }{@code >}
     *     
     */
    public JAXBElement<FilterType> getFilterCRSType() {
        return filterCRSType;
    }

    /**
     * Sets the value of the filterCRSType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FilterType }{@code >}
     *     
     */
    public void setFilterCRSType(JAXBElement<FilterType> value) {
        this.filterCRSType = value;
    }

    /**
     * Gets the value of the filterTOC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilterTOC() {
        return filterTOC;
    }

    /**
     * Sets the value of the filterTOC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilterTOC(JAXBElement<String> value) {
        this.filterTOC = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServices(String value) {
        this.services = value;
    }

    /**
     * Gets the value of the getNonPassengerServices property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetNonPassengerServices() {
        return getNonPassengerServices;
    }

    /**
     * Sets the value of the getNonPassengerServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetNonPassengerServices(Boolean value) {
        this.getNonPassengerServices = value;
    }

}
