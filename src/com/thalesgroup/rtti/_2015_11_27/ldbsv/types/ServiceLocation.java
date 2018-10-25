
package com.thalesgroup.rtti._2015_11_27.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2012_01_13.ldbsv.types.ArrayOfAdhocAlert;
import com.thalesgroup.rtti._2014_02_20.ldbsv.types.ArrayOfAssociations;


/**
 * An individual location in a service.
 * 
 * <p>Java class for ServiceLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/types}BaseServiceLocation">
 *       &lt;sequence>
 *         &lt;element name="locationName" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
 *         &lt;element name="tiploc" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TiplocType"/>
 *         &lt;element name="crs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" minOccurs="0"/>
 *         &lt;element name="associations" type="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}ArrayOfAssociations" minOccurs="0"/>
 *         &lt;element name="adhocAlerts" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ArrayOfAdhocAlert" minOccurs="0"/>
 *         &lt;element name="activities" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}ActivityCodes" minOccurs="0"/>
 *         &lt;element name="length" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}TrainLength" minOccurs="0"/>
 *         &lt;element name="detachFront" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLocation", propOrder = {
    "locationName",
    "tiploc",
    "crs",
    "associations",
    "adhocAlerts",
    "activities",
    "length",
    "detachFront"
})
public class ServiceLocation
    extends BaseServiceLocation
{

    @XmlElement(required = true)
    protected String locationName;
    @XmlElement(required = true)
    protected String tiploc;
    protected String crs;
    protected ArrayOfAssociations associations;
    protected ArrayOfAdhocAlert adhocAlerts;
    @XmlElement(defaultValue = "")
    protected String activities;
    @XmlElement(defaultValue = "0")
    protected Integer length;
    @XmlElement(defaultValue = "false")
    protected Boolean detachFront;

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
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssociations }
     *     
     */
    public ArrayOfAssociations getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssociations }
     *     
     */
    public void setAssociations(ArrayOfAssociations value) {
        this.associations = value;
    }

    /**
     * Gets the value of the adhocAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdhocAlert }
     *     
     */
    public ArrayOfAdhocAlert getAdhocAlerts() {
        return adhocAlerts;
    }

    /**
     * Sets the value of the adhocAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdhocAlert }
     *     
     */
    public void setAdhocAlerts(ArrayOfAdhocAlert value) {
        this.adhocAlerts = value;
    }

    /**
     * Gets the value of the activities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivities() {
        return activities;
    }

    /**
     * Sets the value of the activities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivities(String value) {
        this.activities = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLength(Integer value) {
        this.length = value;
    }

    /**
     * Gets the value of the detachFront property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDetachFront() {
        return detachFront;
    }

    /**
     * Sets the value of the detachFront property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetachFront(Boolean value) {
        this.detachFront = value;
    }

}
