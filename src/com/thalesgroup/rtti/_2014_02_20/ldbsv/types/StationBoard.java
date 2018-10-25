
package com.thalesgroup.rtti._2014_02_20.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure containing details of a departure board for a specific location.
 * 
 * <p>Java class for StationBoard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StationBoard">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}BaseStationBoard">
 *       &lt;sequence>
 *         &lt;element name="qos" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *               &lt;minInclusive value="0.0"/>
 *               &lt;maxInclusive value="1.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="isTruncated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="trainServices" type="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}ArrayOfServiceItems" minOccurs="0"/>
 *         &lt;element name="busServices" type="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}ArrayOfServiceItems" minOccurs="0"/>
 *         &lt;element name="ferryServices" type="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}ArrayOfServiceItems" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationBoard", propOrder = {
    "qos",
    "isTruncated",
    "trainServices",
    "busServices",
    "ferryServices"
})
public class StationBoard
    extends BaseStationBoard
{

    protected Float qos;
    @XmlElement(defaultValue = "false")
    protected Boolean isTruncated;
    protected ArrayOfServiceItems trainServices;
    protected ArrayOfServiceItems busServices;
    protected ArrayOfServiceItems ferryServices;

    /**
     * Gets the value of the qos property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQos() {
        return qos;
    }

    /**
     * Sets the value of the qos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQos(Float value) {
        this.qos = value;
    }

    /**
     * Gets the value of the isTruncated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * Sets the value of the isTruncated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTruncated(Boolean value) {
        this.isTruncated = value;
    }

    /**
     * Gets the value of the trainServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceItems }
     *     
     */
    public ArrayOfServiceItems getTrainServices() {
        return trainServices;
    }

    /**
     * Sets the value of the trainServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceItems }
     *     
     */
    public void setTrainServices(ArrayOfServiceItems value) {
        this.trainServices = value;
    }

    /**
     * Gets the value of the busServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceItems }
     *     
     */
    public ArrayOfServiceItems getBusServices() {
        return busServices;
    }

    /**
     * Sets the value of the busServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceItems }
     *     
     */
    public void setBusServices(ArrayOfServiceItems value) {
        this.busServices = value;
    }

    /**
     * Gets the value of the ferryServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceItems }
     *     
     */
    public ArrayOfServiceItems getFerryServices() {
        return ferryServices;
    }

    /**
     * Sets the value of the ferryServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceItems }
     *     
     */
    public void setFerryServices(ArrayOfServiceItems value) {
        this.ferryServices = value;
    }

}
