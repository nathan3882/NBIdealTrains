
package com.thalesgroup.rtti._2015_05_14.ldbsv_ref;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2015_05_14.ldbsv_ref.types.StationRefData;


/**
 * <p>Java class for GetStationListResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStationListResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetStationListResult" type="{http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/types}StationRefData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStationListResponseType", propOrder = {
    "getStationListResult"
})
public class GetStationListResponseType {

    @XmlElement(name = "GetStationListResult", required = true)
    protected StationRefData getStationListResult;

    /**
     * Gets the value of the getStationListResult property.
     * 
     * @return
     *     possible object is
     *     {@link StationRefData }
     *     
     */
    public StationRefData getGetStationListResult() {
        return getStationListResult;
    }

    /**
     * Sets the value of the getStationListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationRefData }
     *     
     */
    public void setGetStationListResult(StationRefData value) {
        this.getStationListResult = value;
    }

}
