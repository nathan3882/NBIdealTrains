
package com.thalesgroup.rtti._2012_01_13.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.thalesgroup.rtti._2007_10_10.ldb.commontypes.FilterType;


/**
 * A structure containing details of a historic departure board.
 * 
 * <p>Java class for HistoricDepartureBoard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoricDepartureBoard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stationCrs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType"/>
 *         &lt;element name="stationName" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType" minOccurs="0"/>
 *         &lt;element name="stationOperator" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}StationOperatorType" minOccurs="0"/>
 *         &lt;element name="stationMessages" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ArrayOfHistoricNRCCMessages" minOccurs="0"/>
 *         &lt;element name="filterStationType" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}FilterType" minOccurs="0"/>
 *         &lt;element name="filterStationCrs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" minOccurs="0"/>
 *         &lt;element name="filterStationName" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType" minOccurs="0"/>
 *         &lt;element name="departureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="historicDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="isTableSuppressed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="trainServices" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ArrayOfHistoricServiceItems" minOccurs="0"/>
 *         &lt;element name="busServices" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ArrayOfHistoricServiceItems" minOccurs="0"/>
 *         &lt;element name="ferryServices" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ArrayOfHistoricServiceItems" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoricDepartureBoard", propOrder = {
    "stationCrs",
    "stationName",
    "stationOperator",
    "stationMessages",
    "filterStationType",
    "filterStationCrs",
    "filterStationName",
    "departureDateTime",
    "historicDateTime",
    "isTableSuppressed",
    "trainServices",
    "busServices",
    "ferryServices"
})
public class HistoricDepartureBoard {

    @XmlElement(required = true)
    protected String stationCrs;
    protected String stationName;
    protected String stationOperator;
    protected ArrayOfHistoricNRCCMessages stationMessages;
    @XmlElement(defaultValue = "to")
    protected FilterType filterStationType;
    protected String filterStationCrs;
    protected String filterStationName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar historicDateTime;
    protected Boolean isTableSuppressed;
    protected ArrayOfHistoricServiceItems trainServices;
    protected ArrayOfHistoricServiceItems busServices;
    protected ArrayOfHistoricServiceItems ferryServices;

    /**
     * Gets the value of the stationCrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationCrs() {
        return stationCrs;
    }

    /**
     * Sets the value of the stationCrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationCrs(String value) {
        this.stationCrs = value;
    }

    /**
     * Gets the value of the stationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * Sets the value of the stationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationName(String value) {
        this.stationName = value;
    }

    /**
     * Gets the value of the stationOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationOperator() {
        return stationOperator;
    }

    /**
     * Sets the value of the stationOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationOperator(String value) {
        this.stationOperator = value;
    }

    /**
     * Gets the value of the stationMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistoricNRCCMessages }
     *     
     */
    public ArrayOfHistoricNRCCMessages getStationMessages() {
        return stationMessages;
    }

    /**
     * Sets the value of the stationMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistoricNRCCMessages }
     *     
     */
    public void setStationMessages(ArrayOfHistoricNRCCMessages value) {
        this.stationMessages = value;
    }

    /**
     * Gets the value of the filterStationType property.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getFilterStationType() {
        return filterStationType;
    }

    /**
     * Sets the value of the filterStationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setFilterStationType(FilterType value) {
        this.filterStationType = value;
    }

    /**
     * Gets the value of the filterStationCrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterStationCrs() {
        return filterStationCrs;
    }

    /**
     * Sets the value of the filterStationCrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterStationCrs(String value) {
        this.filterStationCrs = value;
    }

    /**
     * Gets the value of the filterStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterStationName() {
        return filterStationName;
    }

    /**
     * Sets the value of the filterStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterStationName(String value) {
        this.filterStationName = value;
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
     * Gets the value of the isTableSuppressed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTableSuppressed() {
        return isTableSuppressed;
    }

    /**
     * Sets the value of the isTableSuppressed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTableSuppressed(Boolean value) {
        this.isTableSuppressed = value;
    }

    /**
     * Gets the value of the trainServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistoricServiceItems }
     *     
     */
    public ArrayOfHistoricServiceItems getTrainServices() {
        return trainServices;
    }

    /**
     * Sets the value of the trainServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistoricServiceItems }
     *     
     */
    public void setTrainServices(ArrayOfHistoricServiceItems value) {
        this.trainServices = value;
    }

    /**
     * Gets the value of the busServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistoricServiceItems }
     *     
     */
    public ArrayOfHistoricServiceItems getBusServices() {
        return busServices;
    }

    /**
     * Sets the value of the busServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistoricServiceItems }
     *     
     */
    public void setBusServices(ArrayOfHistoricServiceItems value) {
        this.busServices = value;
    }

    /**
     * Gets the value of the ferryServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistoricServiceItems }
     *     
     */
    public ArrayOfHistoricServiceItems getFerryServices() {
        return ferryServices;
    }

    /**
     * Sets the value of the ferryServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistoricServiceItems }
     *     
     */
    public void setFerryServices(ArrayOfHistoricServiceItems value) {
        this.ferryServices = value;
    }

}
