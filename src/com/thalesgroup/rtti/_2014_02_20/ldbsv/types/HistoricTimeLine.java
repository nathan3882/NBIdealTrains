
package com.thalesgroup.rtti._2014_02_20.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A structure containing details of a historic timeline.
 * 
 * <p>Java class for HistoricTimeLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoricTimeLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="historicDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="departureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="rid" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}RIDType"/>
 *         &lt;element name="uid" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}UIDType"/>
 *         &lt;element name="trainid" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TrainIDType"/>
 *         &lt;element name="rsid" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}RSIDType" minOccurs="0"/>
 *         &lt;element name="operatorName" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TOCName"/>
 *         &lt;element name="originName" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
 *         &lt;element name="originCRS" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType"/>
 *         &lt;element name="destinationName" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
 *         &lt;element name="destinationCRS" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType"/>
 *         &lt;element name="currentLocationName" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
 *         &lt;element name="currentLocationCRS" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType"/>
 *         &lt;element name="currentLocationTiploc" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TiplocType"/>
 *         &lt;element name="currentLocationOperator" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}StationOperatorType"/>
 *         &lt;element name="prevLocationName" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
 *         &lt;element name="prevLocationCRS" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType"/>
 *         &lt;element name="prevLocationTiploc" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TiplocType"/>
 *         &lt;element name="prevLocationIsFirst" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nextLocationName" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
 *         &lt;element name="nextLocationCRS" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType"/>
 *         &lt;element name="nextLocationTiploc" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TiplocType"/>
 *         &lt;element name="nextLocationIsLast" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="timelineEvents" type="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}ArrayOfTimelineEvent"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoricTimeLine", propOrder = {
    "historicDateTime",
    "departureDateTime",
    "rid",
    "uid",
    "trainid",
    "rsid",
    "operatorName",
    "originName",
    "originCRS",
    "destinationName",
    "destinationCRS",
    "currentLocationName",
    "currentLocationCRS",
    "currentLocationTiploc",
    "currentLocationOperator",
    "prevLocationName",
    "prevLocationCRS",
    "prevLocationTiploc",
    "prevLocationIsFirst",
    "nextLocationName",
    "nextLocationCRS",
    "nextLocationTiploc",
    "nextLocationIsLast",
    "timelineEvents"
})
public class HistoricTimeLine {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar historicDateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateTime;
    @XmlElement(required = true)
    protected String rid;
    @XmlElement(required = true)
    protected String uid;
    @XmlElement(required = true)
    protected String trainid;
    protected String rsid;
    @XmlElement(required = true)
    protected String operatorName;
    @XmlElement(required = true, nillable = true)
    protected String originName;
    @XmlElement(required = true, nillable = true)
    protected String originCRS;
    @XmlElement(required = true, nillable = true)
    protected String destinationName;
    @XmlElement(required = true, nillable = true)
    protected String destinationCRS;
    @XmlElement(required = true)
    protected String currentLocationName;
    @XmlElement(required = true)
    protected String currentLocationCRS;
    @XmlElement(required = true)
    protected String currentLocationTiploc;
    @XmlElement(required = true)
    protected String currentLocationOperator;
    @XmlElement(required = true)
    protected String prevLocationName;
    @XmlElement(required = true)
    protected String prevLocationCRS;
    @XmlElement(required = true, nillable = true)
    protected String prevLocationTiploc;
    protected boolean prevLocationIsFirst;
    @XmlElement(required = true)
    protected String nextLocationName;
    @XmlElement(required = true)
    protected String nextLocationCRS;
    @XmlElement(required = true, nillable = true)
    protected String nextLocationTiploc;
    protected boolean nextLocationIsLast;
    @XmlElement(required = true)
    protected ArrayOfTimelineEvent timelineEvents;

    /**
     * Gets the value of the historicDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHistoricDateTime() {
        return historicDateTime;
    }

    /**
     * Sets the value of the historicDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHistoricDateTime(XMLGregorianCalendar value) {
        this.historicDateTime = value;
    }

    /**
     * Gets the value of the departureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Sets the value of the departureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDateTime(XMLGregorianCalendar value) {
        this.departureDateTime = value;
    }

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
     * Gets the value of the originName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginName() {
        return originName;
    }

    /**
     * Sets the value of the originName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginName(String value) {
        this.originName = value;
    }

    /**
     * Gets the value of the originCRS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCRS() {
        return originCRS;
    }

    /**
     * Sets the value of the originCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCRS(String value) {
        this.originCRS = value;
    }

    /**
     * Gets the value of the destinationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationName() {
        return destinationName;
    }

    /**
     * Sets the value of the destinationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationName(String value) {
        this.destinationName = value;
    }

    /**
     * Gets the value of the destinationCRS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCRS() {
        return destinationCRS;
    }

    /**
     * Sets the value of the destinationCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCRS(String value) {
        this.destinationCRS = value;
    }

    /**
     * Gets the value of the currentLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentLocationName() {
        return currentLocationName;
    }

    /**
     * Sets the value of the currentLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentLocationName(String value) {
        this.currentLocationName = value;
    }

    /**
     * Gets the value of the currentLocationCRS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentLocationCRS() {
        return currentLocationCRS;
    }

    /**
     * Sets the value of the currentLocationCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentLocationCRS(String value) {
        this.currentLocationCRS = value;
    }

    /**
     * Gets the value of the currentLocationTiploc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentLocationTiploc() {
        return currentLocationTiploc;
    }

    /**
     * Sets the value of the currentLocationTiploc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentLocationTiploc(String value) {
        this.currentLocationTiploc = value;
    }

    /**
     * Gets the value of the currentLocationOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentLocationOperator() {
        return currentLocationOperator;
    }

    /**
     * Sets the value of the currentLocationOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentLocationOperator(String value) {
        this.currentLocationOperator = value;
    }

    /**
     * Gets the value of the prevLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevLocationName() {
        return prevLocationName;
    }

    /**
     * Sets the value of the prevLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevLocationName(String value) {
        this.prevLocationName = value;
    }

    /**
     * Gets the value of the prevLocationCRS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevLocationCRS() {
        return prevLocationCRS;
    }

    /**
     * Sets the value of the prevLocationCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevLocationCRS(String value) {
        this.prevLocationCRS = value;
    }

    /**
     * Gets the value of the prevLocationTiploc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevLocationTiploc() {
        return prevLocationTiploc;
    }

    /**
     * Sets the value of the prevLocationTiploc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevLocationTiploc(String value) {
        this.prevLocationTiploc = value;
    }

    /**
     * Gets the value of the prevLocationIsFirst property.
     * 
     */
    public boolean isPrevLocationIsFirst() {
        return prevLocationIsFirst;
    }

    /**
     * Sets the value of the prevLocationIsFirst property.
     * 
     */
    public void setPrevLocationIsFirst(boolean value) {
        this.prevLocationIsFirst = value;
    }

    /**
     * Gets the value of the nextLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextLocationName() {
        return nextLocationName;
    }

    /**
     * Sets the value of the nextLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextLocationName(String value) {
        this.nextLocationName = value;
    }

    /**
     * Gets the value of the nextLocationCRS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextLocationCRS() {
        return nextLocationCRS;
    }

    /**
     * Sets the value of the nextLocationCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextLocationCRS(String value) {
        this.nextLocationCRS = value;
    }

    /**
     * Gets the value of the nextLocationTiploc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextLocationTiploc() {
        return nextLocationTiploc;
    }

    /**
     * Sets the value of the nextLocationTiploc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextLocationTiploc(String value) {
        this.nextLocationTiploc = value;
    }

    /**
     * Gets the value of the nextLocationIsLast property.
     * 
     */
    public boolean isNextLocationIsLast() {
        return nextLocationIsLast;
    }

    /**
     * Sets the value of the nextLocationIsLast property.
     * 
     */
    public void setNextLocationIsLast(boolean value) {
        this.nextLocationIsLast = value;
    }

    /**
     * Gets the value of the timelineEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTimelineEvent }
     *     
     */
    public ArrayOfTimelineEvent getTimelineEvents() {
        return timelineEvents;
    }

    /**
     * Sets the value of the timelineEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTimelineEvent }
     *     
     */
    public void setTimelineEvents(ArrayOfTimelineEvent value) {
        this.timelineEvents = value;
    }

}
