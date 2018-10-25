
package com.thalesgroup.rtti._2012_01_13.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2007_10_10.ldb.commontypes.ServiceType;


/**
 * An individual origin or destination location of a service. Note that vias will only be specified for destinations.
 * 
 * <p>Java class for EndPointLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndPointLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationName" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
 *         &lt;element name="crs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType"/>
 *         &lt;element name="tiploc" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TiplocType"/>
 *         &lt;element name="via" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="futureChangeTo" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}ServiceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndPointLocation", propOrder = {
    "locationName",
    "crs",
    "tiploc",
    "via",
    "futureChangeTo"
})
@XmlSeeAlso({
    com.thalesgroup.rtti._2014_02_20.ldbsv.types.EndPointLocation.class
})
public class EndPointLocation {

    @XmlElement(required = true)
    protected String locationName;
    @XmlElement(required = true)
    protected String crs;
    @XmlElement(required = true)
    protected String tiploc;
    protected String via;
    protected ServiceType futureChangeTo;

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
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
     * Gets the value of the via property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVia() {
        return via;
    }

    /**
     * Sets the value of the via property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVia(String value) {
        this.via = value;
    }

    /**
     * Gets the value of the futureChangeTo property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getFutureChangeTo() {
        return futureChangeTo;
    }

    /**
     * Sets the value of the futureChangeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setFutureChangeTo(ServiceType value) {
        this.futureChangeTo = value;
    }

}
