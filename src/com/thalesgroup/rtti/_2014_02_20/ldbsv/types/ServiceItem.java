
package com.thalesgroup.rtti._2014_02_20.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.thalesgroup.rtti._2012_01_13.ldbsv.types.ArrayOfAdhocAlert;


/**
 * An individual service's summary details for display on a departure board.
 * 
 * <p>Java class for ServiceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rid" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}RIDType"/>
 *         &lt;element name="uid" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}UIDType"/>
 *         &lt;element name="trainid" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TrainIDType"/>
 *         &lt;element name="rsid" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}RSIDType" minOccurs="0"/>
 *         &lt;element name="sdd" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="operator" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TOCName"/>
 *         &lt;element name="operatorCode" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TOCCode"/>
 *         &lt;element name="origin" type="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}ArrayOfEndPointLocations" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}ArrayOfEndPointLocations" minOccurs="0"/>
 *         &lt;element name="currentOrigins" type="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}ArrayOfEndPointLocations" minOccurs="0"/>
 *         &lt;element name="currentDestinations" type="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}ArrayOfEndPointLocations" minOccurs="0"/>
 *         &lt;element name="isPassengerService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isOperationalCall" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sta" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="ata" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="eta" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="arrivalType" type="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}ForecastType" minOccurs="0"/>
 *         &lt;element name="std" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="atd" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="etd" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeType" minOccurs="0"/>
 *         &lt;element name="departureType" type="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}ForecastType" minOccurs="0"/>
 *         &lt;element name="platform" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}PlatformType" minOccurs="0"/>
 *         &lt;element name="platformIsHidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="serviceIsSupressed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isCircularRoute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="filterLocationCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="filterLocationOperational" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="adhocAlerts" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ArrayOfAdhocAlert" minOccurs="0"/>
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
@XmlType(name = "ServiceItem", propOrder = {
    "rid",
    "uid",
    "trainid",
    "rsid",
    "sdd",
    "operator",
    "operatorCode",
    "origin",
    "destination",
    "currentOrigins",
    "currentDestinations",
    "isPassengerService",
    "isOperationalCall",
    "sta",
    "ata",
    "eta",
    "arrivalType",
    "std",
    "atd",
    "etd",
    "departureType",
    "platform",
    "platformIsHidden",
    "serviceIsSupressed",
    "isCircularRoute",
    "isCancelled",
    "filterLocationCancelled",
    "filterLocationOperational",
    "adhocAlerts",
    "arrivalSource",
    "arrivalSourceInstance",
    "departureSource",
    "departureSourceInstance"
})
@XmlSeeAlso({
    HistoricServiceItem.class
})
public class ServiceItem {

    @XmlElement(required = true)
    protected String rid;
    @XmlElement(required = true)
    protected String uid;
    @XmlElement(required = true)
    protected String trainid;
    protected String rsid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sdd;
    @XmlElement(required = true)
    protected String operator;
    @XmlElement(required = true)
    protected String operatorCode;
    protected ArrayOfEndPointLocations origin;
    protected ArrayOfEndPointLocations destination;
    protected ArrayOfEndPointLocations currentOrigins;
    protected ArrayOfEndPointLocations currentDestinations;
    @XmlElement(defaultValue = "true")
    protected Boolean isPassengerService;
    @XmlElement(defaultValue = "false")
    protected Boolean isOperationalCall;
    protected XMLGregorianCalendar sta;
    protected XMLGregorianCalendar ata;
    protected XMLGregorianCalendar eta;
    protected ForecastType arrivalType;
    protected XMLGregorianCalendar std;
    protected XMLGregorianCalendar atd;
    protected XMLGregorianCalendar etd;
    protected ForecastType departureType;
    protected String platform;
    @XmlElement(defaultValue = "false")
    protected Boolean platformIsHidden;
    @XmlElement(defaultValue = "false")
    protected Boolean serviceIsSupressed;
    @XmlElement(defaultValue = "false")
    protected Boolean isCircularRoute;
    @XmlElement(defaultValue = "false")
    protected Boolean isCancelled;
    @XmlElement(defaultValue = "false")
    protected Boolean filterLocationCancelled;
    @XmlElement(defaultValue = "false")
    protected Boolean filterLocationOperational;
    protected ArrayOfAdhocAlert adhocAlerts;
    protected String arrivalSource;
    protected String arrivalSourceInstance;
    protected String departureSource;
    protected String departureSourceInstance;

    /**
     * Gets the value of the rid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRid() {
        return rid;
    }

    /**
     * Sets the value of the rid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRid(String value) {
        this.rid = value;
    }

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
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
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
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEndPointLocations }
     *     
     */
    public ArrayOfEndPointLocations getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEndPointLocations }
     *     
     */
    public void setOrigin(ArrayOfEndPointLocations value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEndPointLocations }
     *     
     */
    public ArrayOfEndPointLocations getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEndPointLocations }
     *     
     */
    public void setDestination(ArrayOfEndPointLocations value) {
        this.destination = value;
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
     * Gets the value of the isPassengerService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPassengerService() {
        return isPassengerService;
    }

    /**
     * Sets the value of the isPassengerService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPassengerService(Boolean value) {
        this.isPassengerService = value;
    }

    /**
     * Gets the value of the isOperationalCall property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOperationalCall() {
        return isOperationalCall;
    }

    /**
     * Sets the value of the isOperationalCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOperationalCall(Boolean value) {
        this.isOperationalCall = value;
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
     * Gets the value of the isCircularRoute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCircularRoute() {
        return isCircularRoute;
    }

    /**
     * Sets the value of the isCircularRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCircularRoute(Boolean value) {
        this.isCircularRoute = value;
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
     * Gets the value of the filterLocationOperational property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilterLocationOperational() {
        return filterLocationOperational;
    }

    /**
     * Sets the value of the filterLocationOperational property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilterLocationOperational(Boolean value) {
        this.filterLocationOperational = value;
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
