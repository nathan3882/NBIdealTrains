
package com.thalesgroup.rtti._2015_05_14.ldbsv_ref.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference data giving all the known Station CRS codes and their display names.
 * 
 * <p>Java class for StationRefData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StationRefData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/types}RefDataVersion"/>
 *         &lt;element name="StationList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Station" type="{http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/types}StationName" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationRefData", propOrder = {
    "version",
    "stationList"
})
public class StationRefData {

    @XmlElement(required = true)
    protected String version;
    @XmlElement(name = "StationList", required = true, nillable = true)
    protected StationRefData.StationList stationList;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the stationList property.
     * 
     * @return
     *     possible object is
     *     {@link StationRefData.StationList }
     *     
     */
    public StationRefData.StationList getStationList() {
        return stationList;
    }

    /**
     * Sets the value of the stationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationRefData.StationList }
     *     
     */
    public void setStationList(StationRefData.StationList value) {
        this.stationList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Station" type="{http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/types}StationName" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "station"
    })
    public static class StationList {

        @XmlElement(name = "Station")
        protected List<StationName> station;

        /**
         * Gets the value of the station property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the station property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StationName }
         * 
         * 
         */
        public List<StationName> getStation() {
            if (station == null) {
                station = new ArrayList<StationName>();
            }
            return this.station;
        }

    }

}
