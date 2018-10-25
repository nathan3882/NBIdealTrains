
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


/**
 * <p>Java class for GetBoardByTIPLOCParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBoardByTIPLOCParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numRows" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="tiploc" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TiplocType"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="timeWindow" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="filterTiploc" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TiplocType" minOccurs="0"/>
 *         &lt;element name="filterType" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}FilterType" minOccurs="0"/>
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
@XmlType(name = "GetBoardByTIPLOCParams", propOrder = {
    "numRows",
    "tiploc",
    "time",
    "timeWindow",
    "filterTiploc",
    "filterType",
    "filterTOC",
    "services",
    "getNonPassengerServices"
})
public class GetBoardByTIPLOCParams {

    @XmlSchemaType(name = "unsignedShort")
    protected int numRows;
    @XmlElement(required = true)
    protected String tiploc;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlSchemaType(name = "unsignedShort")
    protected int timeWindow;
    @XmlElementRef(name = "filterTiploc", namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filterTiploc;
    @XmlElement(defaultValue = "to")
    protected FilterType filterType;
    @XmlElementRef(name = "filterTOC", namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filterTOC;
    @XmlElement(defaultValue = "P")
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
     * Gets the value of the tiploc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiploc() {
        return tiploc;
    }

    /**
     * Sets the value of the tiploc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiploc(String value) {
        this.tiploc = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
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
     * Gets the value of the filterTiploc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilterTiploc() {
        return filterTiploc;
    }

    /**
     * Sets the value of the filterTiploc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilterTiploc(JAXBElement<String> value) {
        this.filterTiploc = value;
    }

    /**
     * Gets the value of the filterType property.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getFilterType() {
        return filterType;
    }

    /**
     * Sets the value of the filterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setFilterType(FilterType value) {
        this.filterType = value;
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
