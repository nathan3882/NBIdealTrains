
package com.thalesgroup.rtti._2012_01_13.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An individual timeline event in a historic time line.
 * 
 * <p>Java class for timelineEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="timelineEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="falseDestination" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType" minOccurs="0"/>
 *         &lt;element name="isPassLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isLateReinstated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isDelayedArrival" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isDelayedDeparture" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isUncertainArrival" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isUncertainDeparture" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isOverdue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isReliablePlatform" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sta" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="ata" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="eta" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="arrivalType" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ForecastType" minOccurs="0"/>
 *         &lt;element name="std" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="atd" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="etd" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="departureType" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ForecastType" minOccurs="0"/>
 *         &lt;element name="platform" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}PlatformType" minOccurs="0"/>
 *         &lt;element name="lateness" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}LatenessType" minOccurs="0"/>
 *         &lt;element name="distruptionReason" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}DistruptionReasonType" minOccurs="0"/>
 *         &lt;element name="source" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeLineSourceType"/>
 *         &lt;element name="activeAdhocExist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="arrivalSource" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}SourceType" minOccurs="0"/>
 *         &lt;element name="arrivalSourceInstance" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}SourceInstanceType" minOccurs="0"/>
 *         &lt;element name="departureSource" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}SourceType" minOccurs="0"/>
 *         &lt;element name="departureSourceInstance" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}SourceInstanceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timelineEvent", propOrder = {
    "eventTime",
    "falseDestination",
    "isPassLocation",
    "isCancelled",
    "isLateReinstated",
    "isDelayedArrival",
    "isDelayedDeparture",
    "isUncertainArrival",
    "isUncertainDeparture",
    "isOverdue",
    "isReliablePlatform",
    "sta",
    "ata",
    "eta",
    "arrivalType",
    "std",
    "atd",
    "etd",
    "departureType",
    "platform",
    "lateness",
    "distruptionReason",
    "source",
    "activeAdhocExist",
    "arrivalSource",
    "arrivalSourceInstance",
    "departureSource",
    "departureSourceInstance"
})
public class TimelineEvent {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTime;
    protected String falseDestination;
    @XmlElement(defaultValue = "false")
    protected Boolean isPassLocation;
    @XmlElement(defaultValue = "false")
    protected Boolean isCancelled;
    @XmlElement(defaultValue = "false")
    protected Boolean isLateReinstated;
    @XmlElement(defaultValue = "false")
    protected Boolean isDelayedArrival;
    @XmlElement(defaultValue = "false")
    protected Boolean isDelayedDeparture;
    @XmlElement(defaultValue = "false")
    protected Boolean isUncertainArrival;
    @XmlElement(defaultValue = "false")
    protected Boolean isUncertainDeparture;
    @XmlElement(defaultValue = "false")
    protected Boolean isOverdue;
    @XmlElement(defaultValue = "false")
    protected Boolean isReliablePlatform;
    protected XMLGregorianCalendar sta;
    protected XMLGregorianCalendar ata;
    protected XMLGregorianCalendar eta;
    protected ForecastType arrivalType;
    protected XMLGregorianCalendar std;
    protected XMLGregorianCalendar atd;
    protected XMLGregorianCalendar etd;
    protected ForecastType departureType;
    protected String platform;
    protected String lateness;
    protected String distruptionReason;
    @XmlElement(required = true)
    protected String source;
    @XmlElement(defaultValue = "false")
    protected boolean activeAdhocExist;
    protected String arrivalSource;
    protected String arrivalSourceInstance;
    protected String departureSource;
    protected String departureSourceInstance;

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTime(XMLGregorianCalendar value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the falseDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFalseDestination() {
        return falseDestination;
    }

    /**
     * Sets the value of the falseDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFalseDestination(String value) {
        this.falseDestination = value;
    }

    /**
     * Gets the value of the isPassLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPassLocation() {
        return isPassLocation;
    }

    /**
     * Sets the value of the isPassLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPassLocation(Boolean value) {
        this.isPassLocation = value;
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
     * Gets the value of the isDelayedArrival property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDelayedArrival() {
        return isDelayedArrival;
    }

    /**
     * Sets the value of the isDelayedArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDelayedArrival(Boolean value) {
        this.isDelayedArrival = value;
    }

    /**
     * Gets the value of the isDelayedDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDelayedDeparture() {
        return isDelayedDeparture;
    }

    /**
     * Sets the value of the isDelayedDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDelayedDeparture(Boolean value) {
        this.isDelayedDeparture = value;
    }

    /**
     * Gets the value of the isUncertainArrival property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUncertainArrival() {
        return isUncertainArrival;
    }

    /**
     * Sets the value of the isUncertainArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUncertainArrival(Boolean value) {
        this.isUncertainArrival = value;
    }

    /**
     * Gets the value of the isUncertainDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUncertainDeparture() {
        return isUncertainDeparture;
    }

    /**
     * Sets the value of the isUncertainDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUncertainDeparture(Boolean value) {
        this.isUncertainDeparture = value;
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
     * Gets the value of the isReliablePlatform property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReliablePlatform() {
        return isReliablePlatform;
    }

    /**
     * Sets the value of the isReliablePlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReliablePlatform(Boolean value) {
        this.isReliablePlatform = value;
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

    /**
     * Gets the value of the distruptionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistruptionReason() {
        return distruptionReason;
    }

    /**
     * Sets the value of the distruptionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistruptionReason(String value) {
        this.distruptionReason = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the activeAdhocExist property.
     * 
     */
    public boolean isActiveAdhocExist() {
        return activeAdhocExist;
    }

    /**
     * Sets the value of the activeAdhocExist property.
     * 
     */
    public void setActiveAdhocExist(boolean value) {
        this.activeAdhocExist = value;
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

}
