
package com.thalesgroup.rtti._2012_01_13.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationName" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
 *         &lt;element name="locationCrs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" minOccurs="0"/>
 *         &lt;element name="fullTiploc" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}FullTiplocType"/>
 *         &lt;element name="isPass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isLateReinstated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="falseDest" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType" minOccurs="0"/>
 *         &lt;element name="disruptionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="platform" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}PlatformType" minOccurs="0"/>
 *         &lt;element name="platformIsUnreliable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sta" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="ata" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="eta" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="arrivalType" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ForecastType" minOccurs="0"/>
 *         &lt;element name="arrIsUncertain" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="arrIsDelayed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="std" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="atd" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="etd" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="departureType" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ForecastType" minOccurs="0"/>
 *         &lt;element name="depIsUncertain" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="depIsDelayed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isOverdue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lateness" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="hasAdhocAlert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="arrivalSource" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}SourceType" minOccurs="0"/>
 *         &lt;element name="arrivalSourceInstance" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}SourceInstanceType" minOccurs="0"/>
 *         &lt;element name="departureSource" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}SourceType" minOccurs="0"/>
 *         &lt;element name="departureSourceInstance" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}SourceInstanceType" minOccurs="0"/>
 *         &lt;element name="associations" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ArrayOfAssociations" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
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
    "isPass",
    "isCancelled",
    "isLateReinstated",
    "falseDest",
    "disruptionReason",
    "platform",
    "platformIsUnreliable",
    "sta",
    "ata",
    "eta",
    "arrivalType",
    "arrIsUncertain",
    "arrIsDelayed",
    "std",
    "atd",
    "etd",
    "departureType",
    "depIsUncertain",
    "depIsDelayed",
    "isOverdue",
    "lateness",
    "hasAdhocAlert",
    "arrivalSource",
    "arrivalSourceInstance",
    "departureSource",
    "departureSourceInstance",
    "associations"
})
public class HistoricServiceLocation {

    @XmlElement(required = true)
    protected String locationName;
    protected String locationCrs;
    @XmlElement(required = true)
    protected String fullTiploc;
    @XmlElement(defaultValue = "false")
    protected Boolean isPass;
    @XmlElement(defaultValue = "false")
    protected Boolean isCancelled;
    @XmlElement(defaultValue = "false")
    protected Boolean isLateReinstated;
    protected String falseDest;
    protected String disruptionReason;
    protected String platform;
    @XmlElement(defaultValue = "false")
    protected Boolean platformIsUnreliable;
    protected XMLGregorianCalendar sta;
    protected XMLGregorianCalendar ata;
    protected XMLGregorianCalendar eta;
    protected ForecastType arrivalType;
    @XmlElement(defaultValue = "false")
    protected Boolean arrIsUncertain;
    @XmlElement(defaultValue = "false")
    protected Boolean arrIsDelayed;
    protected XMLGregorianCalendar std;
    protected XMLGregorianCalendar atd;
    protected XMLGregorianCalendar etd;
    protected ForecastType departureType;
    @XmlElement(defaultValue = "false")
    protected Boolean depIsUncertain;
    @XmlElement(defaultValue = "false")
    protected Boolean depIsDelayed;
    @XmlElement(defaultValue = "false")
    protected Boolean isOverdue;
    protected Integer lateness;
    protected Boolean hasAdhocAlert;
    protected String arrivalSource;
    protected String arrivalSourceInstance;
    protected String departureSource;
    protected String departureSourceInstance;
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
     * Gets the value of the isPass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPass() {
        return isPass;
    }

    /**
     * Sets the value of the isPass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPass(Boolean value) {
        this.isPass = value;
    }

    /**
     * Gets the value of the isCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCancelled() {
        return isCancelled;
    }

    /**
     * Sets the value of the isCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCancelled(Boolean value) {
        this.isCancelled = value;
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
     * Gets the value of the falseDest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFalseDest() {
        return falseDest;
    }

    /**
     * Sets the value of the falseDest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFalseDest(String value) {
        this.falseDest = value;
    }

    /**
     * Gets the value of the disruptionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisruptionReason() {
        return disruptionReason;
    }

    /**
     * Sets the value of the disruptionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisruptionReason(String value) {
        this.disruptionReason = value;
    }

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatform(String value) {
        this.platform = value;
    }

    /**
     * Gets the value of the platformIsUnreliable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlatformIsUnreliable() {
        return platformIsUnreliable;
    }

    /**
     * Sets the value of the platformIsUnreliable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlatformIsUnreliable(Boolean value) {
        this.platformIsUnreliable = value;
    }

    /**
     * Gets the value of the sta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSta() {
        return sta;
    }

    /**
     * Sets the value of the sta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSta(XMLGregorianCalendar value) {
        this.sta = value;
    }

    /**
     * Gets the value of the ata property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAta() {
        return ata;
    }

    /**
     * Sets the value of the ata property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAta(XMLGregorianCalendar value) {
        this.ata = value;
    }

    /**
     * Gets the value of the eta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEta() {
        return eta;
    }

    /**
     * Sets the value of the eta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEta(XMLGregorianCalendar value) {
        this.eta = value;
    }

    /**
     * Gets the value of the arrivalType property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastType }
     *     
     */
    public ForecastType getArrivalType() {
        return arrivalType;
    }

    /**
     * Sets the value of the arrivalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastType }
     *     
     */
    public void setArrivalType(ForecastType value) {
        this.arrivalType = value;
    }

    /**
     * Gets the value of the arrIsUncertain property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArrIsUncertain() {
        return arrIsUncertain;
    }

    /**
     * Sets the value of the arrIsUncertain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArrIsUncertain(Boolean value) {
        this.arrIsUncertain = value;
    }

    /**
     * Gets the value of the arrIsDelayed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArrIsDelayed() {
        return arrIsDelayed;
    }

    /**
     * Sets the value of the arrIsDelayed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArrIsDelayed(Boolean value) {
        this.arrIsDelayed = value;
    }

    /**
     * Gets the value of the std property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStd() {
        return std;
    }

    /**
     * Sets the value of the std property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStd(XMLGregorianCalendar value) {
        this.std = value;
    }

    /**
     * Gets the value of the atd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAtd() {
        return atd;
    }

    /**
     * Sets the value of the atd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAtd(XMLGregorianCalendar value) {
        this.atd = value;
    }

    /**
     * Gets the value of the etd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEtd() {
        return etd;
    }

    /**
     * Sets the value of the etd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEtd(XMLGregorianCalendar value) {
        this.etd = value;
    }

    /**
     * Gets the value of the departureType property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastType }
     *     
     */
    public ForecastType getDepartureType() {
        return departureType;
    }

    /**
     * Sets the value of the departureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastType }
     *     
     */
    public void setDepartureType(ForecastType value) {
        this.departureType = value;
    }

    /**
     * Gets the value of the depIsUncertain property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepIsUncertain() {
        return depIsUncertain;
    }

    /**
     * Sets the value of the depIsUncertain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepIsUncertain(Boolean value) {
        this.depIsUncertain = value;
    }

    /**
     * Gets the value of the depIsDelayed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepIsDelayed() {
        return depIsDelayed;
    }

    /**
     * Sets the value of the depIsDelayed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepIsDelayed(Boolean value) {
        this.depIsDelayed = value;
    }

    /**
     * Gets the value of the isOverdue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOverdue() {
        return isOverdue;
    }

    /**
     * Sets the value of the isOverdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOverdue(Boolean value) {
        this.isOverdue = value;
    }

    /**
     * Gets the value of the lateness property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLateness() {
        return lateness;
    }

    /**
     * Sets the value of the lateness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLateness(Integer value) {
        this.lateness = value;
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
     * Gets the value of the arrivalSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalSource() {
        return arrivalSource;
    }

    /**
     * Sets the value of the arrivalSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalSource(String value) {
        this.arrivalSource = value;
    }

    /**
     * Gets the value of the arrivalSourceInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalSourceInstance() {
        return arrivalSourceInstance;
    }

    /**
     * Sets the value of the arrivalSourceInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalSourceInstance(String value) {
        this.arrivalSourceInstance = value;
    }

    /**
     * Gets the value of the departureSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureSource() {
        return departureSource;
    }

    /**
     * Sets the value of the departureSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureSource(String value) {
        this.departureSource = value;
    }

    /**
     * Gets the value of the departureSourceInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureSourceInstance() {
        return departureSourceInstance;
    }

    /**
     * Sets the value of the departureSourceInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureSourceInstance(String value) {
        this.departureSourceInstance = value;
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
