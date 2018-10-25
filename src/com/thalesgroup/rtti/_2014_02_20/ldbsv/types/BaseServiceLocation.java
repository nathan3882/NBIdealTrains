
package com.thalesgroup.rtti._2014_02_20.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An individual location in a service.
 * 
 * <p>Java class for BaseServiceLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseServiceLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isOperational" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isPass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="falseDest" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType" minOccurs="0"/>
 *         &lt;element name="fdTiploc" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TiplocType" minOccurs="0"/>
 *         &lt;element name="disruptionReason" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ReasonCodeType" minOccurs="0"/>
 *         &lt;element name="platform" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}PlatformType" minOccurs="0"/>
 *         &lt;element name="platformIsHidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="serviceIsSupressed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sta" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="ata" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="eta" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="arrivalType" type="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}ForecastType" minOccurs="0"/>
 *         &lt;element name="arrivalSource" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}SourceType" minOccurs="0"/>
 *         &lt;element name="arrivalSourceInstance" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}SourceInstanceType" minOccurs="0"/>
 *         &lt;element name="std" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="atd" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="etd" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="departureType" type="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}ForecastType" minOccurs="0"/>
 *         &lt;element name="departureSource" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}SourceType" minOccurs="0"/>
 *         &lt;element name="departureSourceInstance" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}SourceInstanceType" minOccurs="0"/>
 *         &lt;element name="lateness" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}LatenessType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseServiceLocation", propOrder = {
    "isOperational",
    "isPass",
    "isCancelled",
    "falseDest",
    "fdTiploc",
    "disruptionReason",
    "platform",
    "platformIsHidden",
    "serviceIsSupressed",
    "sta",
    "ata",
    "eta",
    "arrivalType",
    "arrivalSource",
    "arrivalSourceInstance",
    "std",
    "atd",
    "etd",
    "departureType",
    "departureSource",
    "departureSourceInstance",
    "lateness"
})
@XmlSeeAlso({
    TimelineEvent.class,
    HistoricServiceLocation.class,
    ServiceLocation.class
})
public class BaseServiceLocation {

    @XmlElement(defaultValue = "false")
    protected Boolean isOperational;
    @XmlElement(defaultValue = "false")
    protected Boolean isPass;
    @XmlElement(defaultValue = "false")
    protected Boolean isCancelled;
    protected String falseDest;
    protected String fdTiploc;
    protected Integer disruptionReason;
    protected String platform;
    @XmlElement(defaultValue = "false")
    protected Boolean platformIsHidden;
    @XmlElement(defaultValue = "false")
    protected Boolean serviceIsSupressed;
    protected XMLGregorianCalendar sta;
    protected XMLGregorianCalendar ata;
    protected XMLGregorianCalendar eta;
    protected ForecastType arrivalType;
    protected String arrivalSource;
    protected String arrivalSourceInstance;
    protected XMLGregorianCalendar std;
    protected XMLGregorianCalendar atd;
    protected XMLGregorianCalendar etd;
    protected ForecastType departureType;
    protected String departureSource;
    protected String departureSourceInstance;
    protected String lateness;

    /**
     * Gets the value of the isOperational property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOperational() {
        return isOperational;
    }

    /**
     * Sets the value of the isOperational property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOperational(Boolean value) {
        this.isOperational = value;
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
     * Gets the value of the fdTiploc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdTiploc() {
        return fdTiploc;
    }

    /**
     * Sets the value of the fdTiploc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdTiploc(String value) {
        this.fdTiploc = value;
    }

    /**
     * Gets the value of the disruptionReason property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisruptionReason() {
        return disruptionReason;
    }

    /**
     * Sets the value of the disruptionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisruptionReason(Integer value) {
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
     * Gets the value of the platformIsHidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlatformIsHidden() {
        return platformIsHidden;
    }

    /**
     * Sets the value of the platformIsHidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlatformIsHidden(Boolean value) {
        this.platformIsHidden = value;
    }

    /**
     * Gets the value of the serviceIsSupressed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceIsSupressed() {
        return serviceIsSupressed;
    }

    /**
     * Sets the value of the serviceIsSupressed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceIsSupressed(Boolean value) {
        this.serviceIsSupressed = value;
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
     * Gets the value of the lateness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLateness() {
        return lateness;
    }

    /**
     * Sets the value of the lateness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLateness(String value) {
        this.lateness = value;
    }

}
