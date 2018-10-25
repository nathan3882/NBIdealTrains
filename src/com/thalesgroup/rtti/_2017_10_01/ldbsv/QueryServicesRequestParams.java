
package com.thalesgroup.rtti._2017_10_01.ldbsv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for QueryServicesRequestParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryServicesRequestParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceID" type="{http://thalesgroup.com/RTTI/2016-02-16/ldbsv/commontypes}ServiceIDType"/>
 *         &lt;element name="sdd" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="filterTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="filtercrs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" minOccurs="0"/>
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
@XmlType(name = "QueryServicesRequestParams", propOrder = {
    "serviceID",
    "sdd",
    "filterTime",
    "filtercrs",
    "tocFilter"
})
public class QueryServicesRequestParams {

    @XmlElement(required = true)
    protected String serviceID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sdd;
    @XmlElementRef(name = "filterTime", namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> filterTime;
    @XmlElementRef(name = "filtercrs", namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filtercrs;
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
     * Gets the value of the sdd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSdd() {
        return sdd;
    }

    /**
     * Sets the value of the sdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSdd(XMLGregorianCalendar value) {
        this.sdd = value;
    }

    /**
     * Gets the value of the filterTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFilterTime() {
        return filterTime;
    }

    /**
     * Sets the value of the filterTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFilterTime(JAXBElement<XMLGregorianCalendar> value) {
        this.filterTime = value;
    }

    /**
     * Gets the value of the filtercrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiltercrs() {
        return filtercrs;
    }

    /**
     * Sets the value of the filtercrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiltercrs(JAXBElement<String> value) {
        this.filtercrs = value;
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
