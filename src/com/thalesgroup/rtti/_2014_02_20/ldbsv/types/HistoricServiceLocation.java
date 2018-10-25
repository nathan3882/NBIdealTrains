
package com.thalesgroup.rtti._2014_02_20.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An individual location in a historic service.
 * 
 * <p>Java class for HistoricServiceLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoricServiceLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}BaseServiceLocation">
 *       &lt;sequence>
 *         &lt;element name="locationName" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
 *         &lt;element name="locationCrs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" minOccurs="0"/>
 *         &lt;element name="fullTiploc" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}FullTiplocType"/>
 *         &lt;element name="isLateReinstated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasAdhocAlert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="associations" type="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}ArrayOfAssociations" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoricServiceLocation", propOrder = {
    "locationName",
    "locationCrs",
    "fullTiploc",
    "isLateReinstated",
    "hasAdhocAlert",
    "associations"
})
public class HistoricServiceLocation
    extends BaseServiceLocation
{

    @XmlElement(required = true)
    protected String locationName;
    protected String locationCrs;
    @XmlElement(required = true)
    protected String fullTiploc;
    @XmlElement(defaultValue = "false")
    protected Boolean isLateReinstated;
    protected Boolean hasAdhocAlert;
    protected ArrayOfAssociations associations;

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
     * Gets the value of the locationCrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCrs() {
        return locationCrs;
    }

    /**
     * Sets the value of the locationCrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCrs(String value) {
        this.locationCrs = value;
    }

    /**
     * Gets the value of the fullTiploc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullTiploc() {
        return fullTiploc;
    }

    /**
     * Sets the value of the fullTiploc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullTiploc(String value) {
        this.fullTiploc = value;
    }

    /**
     * Gets the value of the isLateReinstated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLateReinstated() {
        return isLateReinstated;
    }

    /**
     * Sets the value of the isLateReinstated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLateReinstated(Boolean value) {
        this.isLateReinstated = value;
    }

    /**
     * Gets the value of the hasAdhocAlert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAdhocAlert() {
        return hasAdhocAlert;
    }

    /**
     * Sets the value of the hasAdhocAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAdhocAlert(Boolean value) {
        this.hasAdhocAlert = value;
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

}
