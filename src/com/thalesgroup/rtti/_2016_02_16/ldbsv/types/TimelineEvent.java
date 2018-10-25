
package com.thalesgroup.rtti._2016_02_16.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.thalesgroup.rtti._2015_11_27.ldbsv.types.BaseServiceLocation;


/**
 * An individual timeline event in a historic time line.
 * 
 * <p>Java class for TimelineEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimelineEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/types}BaseServiceLocation">
 *       &lt;sequence>
 *         &lt;element name="eventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="disruptionReason" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}ReasonCodeType" minOccurs="0"/>
 *         &lt;element name="isLateReinstated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eventSource" type="{http://thalesgroup.com/RTTI/2016-02-16/ldbsv/types}TimeLineSourceType"/>
 *         &lt;element name="activeAdhocExist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isDeletedService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isDeletedLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimelineEvent", propOrder = {
    "eventTime",
    "disruptionReason",
    "isLateReinstated",
    "eventSource",
    "activeAdhocExist",
    "isDeletedService",
    "isDeletedLocation"
})
public class TimelineEvent
    extends BaseServiceLocation
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTime;
    protected Integer disruptionReason;
    @XmlElement(defaultValue = "false")
    protected Boolean isLateReinstated;
    @XmlElement(required = true)
    protected String eventSource;
    @XmlElement(defaultValue = "false")
    protected boolean activeAdhocExist;
    @XmlElement(defaultValue = "false")
    protected Boolean isDeletedService;
    @XmlElement(defaultValue = "false")
    protected Boolean isDeletedLocation;

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
     * Gets the value of the eventSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventSource() {
        return eventSource;
    }

    /**
     * Sets the value of the eventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventSource(String value) {
        this.eventSource = value;
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
     * Gets the value of the isDeletedService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeletedService() {
        return isDeletedService;
    }

    /**
     * Sets the value of the isDeletedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeletedService(Boolean value) {
        this.isDeletedService = value;
    }

    /**
     * Gets the value of the isDeletedLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeletedLocation() {
        return isDeletedLocation;
    }

    /**
     * Sets the value of the isDeletedLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeletedLocation(Boolean value) {
        this.isDeletedLocation = value;
    }

}
