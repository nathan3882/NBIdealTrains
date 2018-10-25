
package com.thalesgroup.rtti._2014_02_20.ldbsv.types;

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
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}BaseServiceLocation">
 *       &lt;sequence>
 *         &lt;element name="eventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="isLateReinstated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eventSource" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}TimeLineSourceType"/>
 *         &lt;element name="activeAdhocExist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timelineEvent", propOrder = {
    "eventTime",
    "isLateReinstated",
    "eventSource",
    "activeAdhocExist"
})
public class TimelineEvent
    extends BaseServiceLocation
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTime;
    @XmlElement(defaultValue = "false")
    protected Boolean isLateReinstated;
    @XmlElement(required = true)
    protected String eventSource;
    @XmlElement(defaultValue = "false")
    protected boolean activeAdhocExist;

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

}
