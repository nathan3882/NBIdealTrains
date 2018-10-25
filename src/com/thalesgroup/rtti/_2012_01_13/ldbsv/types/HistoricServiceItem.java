
package com.thalesgroup.rtti._2012_01_13.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An individual service's summary details for display on a historic departure board.
 * 
 * <p>Java class for HistoricServiceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoricServiceItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uid" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}UIDType"/>
 *         &lt;element name="trainid" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TrainIDType"/>
 *         &lt;element name="rsid" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}RSIDType" minOccurs="0"/>
 *         &lt;element name="sdd" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="operatorName" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TOCName"/>
 *         &lt;element name="operatorCode" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TOCCode"/>
 *         &lt;element name="origins" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ArrayOfEndPointLocations" minOccurs="0"/>
 *         &lt;element name="destinations" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ArrayOfEndPointLocations" minOccurs="0"/>
 *         &lt;element name="currentOrigins" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ArrayOfEndPointLocations" minOccurs="0"/>
 *         &lt;element name="currentDestinations" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ArrayOfEndPointLocations" minOccurs="0"/>
 *         &lt;element name="scheduledArrivalTime" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="expectedArrivalTime" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="arrivalType" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ForecastType" minOccurs="0"/>
 *         &lt;element name="arrivalIsUncertain" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isDelayedArrival" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="scheduledDepartureTime" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="expectedDepartureTime" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="departureType" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ForecastType" minOccurs="0"/>
 *         &lt;element name="departureIsUncertain" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isDelayedDeparture" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isLateReinstated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="platform" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}PlatformType" minOccurs="0"/>
 *         &lt;element name="isReliablePlatforms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isOverdue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="filterLocationCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lateness" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="adhocAlerts" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ArrayOfAdhocAlert"/>
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
@XmlType(name = "HistoricServiceItem", propOrder = {
    "uid",
    "trainid",
    "rsid",
    "sdd",
    "operatorName",
    "operatorCode",
    "origins",
    "destinations",
    "currentOrigins",
    "currentDestinations",
    "scheduledArrivalTime",
    "expectedArrivalTime",
    "arrivalType",
    "arrivalIsUncertain",
    "isDelayedArrival",
    "scheduledDepartureTime",
    "expectedDepartureTime",
    "departureType",
    "departureIsUncertain",
    "isDelayedDeparture",
    "isCancelled",
    "isLateReinstated",
    "platform",
    "isReliablePlatforms",
    "isDeleted",
    "isOverdue",
    "filterLocationCancelled",
    "lateness",
    "adhocAlerts",
    "arrivalSource",
    "arrivalSourceInstance",
    "departureSource",
    "departureSourceInstance"
})
public class HistoricServiceItem {

    @XmlElement(required = true)
    protected String uid;
    @XmlElement(required = true)
    protected String trainid;
    protected String rsid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sdd;
    @XmlElement(required = true)
    protected String operatorName;
    @XmlElement(required = true)
    protected String operatorCode;
    protected ArrayOfEndPointLocations origins;
    protected ArrayOfEndPointLocations destinations;
    protected ArrayOfEndPointLocations currentOrigins;
    protected ArrayOfEndPointLocations currentDestinations;
    protected XMLGregorianCalendar scheduledArrivalTime;
    protected XMLGregorianCalendar expectedArrivalTime;
    protected ForecastType arrivalType;
    @XmlElement(defaultValue = "false")
    protected Boolean arrivalIsUncertain;
    @XmlElement(defaultValue = "false")
    protected Boolean isDelayedArrival;
    protected XMLGregorianCalendar scheduledDepartureTime;
    protected XMLGregorianCalendar expectedDepartureTime;
    protected ForecastType departureType;
    @XmlElement(defaultValue = "false")
    protected Boolean departureIsUncertain;
    @XmlElement(defaultValue = "false")
    protected Boolean isDelayedDeparture;
    @XmlElement(defaultValue = "false")
    protected Boolean isCancelled;
    @XmlElement(defaultValue = "false")
    protected Boolean isLateReinstated;
    protected String platform;
    @XmlElement(defaultValue = "false")
    protected Boolean isReliablePlatforms;
    @XmlElement(defaultValue = "false")
    protected Boolean isDeleted;
    @XmlElement(defaultValue = "false")
    protected Boolean isOverdue;
    @XmlElement(defaultValue = "false")
    protected Boolean filterLocationCancelled;
    protected Integer lateness;
    @XmlElement(required = true)
    protected ArrayOfAdhocAlert adhocAlerts;
    protected String arrivalSource;
    protected String arrivalSourceInstance;
    protected String departureSource;
    protected String departureSourceInstance;

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the trainid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainid() {
        return trainid;
    }

    /**
     * Sets the value of the trainid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainid(String value) {
        this.trainid = value;
    }

    /**
     * Gets the value of the rsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsid() {
        return rsid;
    }

    /**
     * Sets the value of the rsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsid(String value) {
        this.rsid = value;
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
     * Gets the value of the operatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * Sets the value of the operatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorName(String value) {
        this.operatorName = value;
    }

    /**
     * Gets the value of the operatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorCode() {
        return operatorCode;
    }

    /**
     * Sets the value of the operatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorCode(String value) {
        this.operatorCode = value;
    }

    /**
     * Gets the value of the origins property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEndPointLocations }
     *     
     */
    public ArrayOfEndPointLocations getOrigins() {
        return origins;
    }

    /**
     * Sets the value of the origins property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEndPointLocations }
     *     
     */
    public void setOrigins(ArrayOfEndPointLocations value) {
        this.origins = value;
    }

    /**
     * Gets the value of the destinations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEndPointLocations }
     *     
     */
    public ArrayOfEndPointLocations getDestinations() {
        return destinations;
    }

    /**
     * Sets the value of the destinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEndPointLocations }
     *     
     */
    public void setDestinations(ArrayOfEndPointLocations value) {
        this.destinations = value;
    }

    /**
     * Gets the value of the currentOrigins property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEndPointLocations }
     *     
     */
    public ArrayOfEndPointLocations getCurrentOrigins() {
        return currentOrigins;
    }

    /**
     * Sets the value of the currentOrigins property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEndPointLocations }
     *     
     */
    public void setCurrentOrigins(ArrayOfEndPointLocations value) {
        this.currentOrigins = value;
    }

    /**
     * Gets the value of the currentDestinations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEndPointLocations }
     *     
     */
    public ArrayOfEndPointLocations getCurrentDestinations() {
        return currentDestinations;
    }

    /**
     * Sets the value of the currentDestinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEndPointLocations }
     *     
     */
    public void setCurrentDestinations(ArrayOfEndPointLocations value) {
        this.currentDestinations = value;
    }

    /**
     * Gets the value of the scheduledArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledArrivalTime() {
        return scheduledArrivalTime;
    }

    /**
     * Sets the value of the scheduledArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledArrivalTime(XMLGregorianCalendar value) {
        this.scheduledArrivalTime = value;
    }

    /**
     * Gets the value of the expectedArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedArrivalTime() {
        return expectedArrivalTime;
    }

    /**
     * Sets the value of the expectedArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedArrivalTime(XMLGregorianCalendar value) {
        this.expectedArrivalTime = value;
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
     * Gets the value of the arrivalIsUncertain property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArrivalIsUncertain() {
        return arrivalIsUncertain;
    }

    /**
     * Sets the value of the arrivalIsUncertain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArrivalIsUncertain(Boolean value) {
        this.arrivalIsUncertain = value;
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
     * Gets the value of the scheduledDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDepartureTime() {
        return scheduledDepartureTime;
    }

    /**
     * Sets the value of the scheduledDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDepartureTime(XMLGregorianCalendar value) {
        this.scheduledDepartureTime = value;
    }

    /**
     * Gets the value of the expectedDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDepartureTime() {
        return expectedDepartureTime;
    }

    /**
     * Sets the value of the expectedDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDepartureTime(XMLGregorianCalendar value) {
        this.expectedDepartureTime = value;
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
     * Gets the value of the departureIsUncertain property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepartureIsUncertain() {
        return departureIsUncertain;
    }

    /**
     * Sets the value of the departureIsUncertain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepartureIsUncertain(Boolean value) {
        this.departureIsUncertain = value;
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
     * Gets the value of the isReliablePlatforms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReliablePlatforms() {
        return isReliablePlatforms;
    }

    /**
     * Sets the value of the isReliablePlatforms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReliablePlatforms(Boolean value) {
        this.isReliablePlatforms = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
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
     * Gets the value of the filterLocationCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilterLocationCancelled() {
        return filterLocationCancelled;
    }

    /**
     * Sets the value of the filterLocationCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilterLocationCancelled(Boolean value) {
        this.filterLocationCancelled = value;
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
