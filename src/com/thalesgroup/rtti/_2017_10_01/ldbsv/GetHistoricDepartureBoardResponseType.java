
package com.thalesgroup.rtti._2017_10_01.ldbsv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2017_10_01.ldbsv.types.HistoricDepartureBoard;


/**
 * <p>Java class for GetHistoricDepartureBoardResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHistoricDepartureBoardResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetHistoricDepartureBoardResult" type="{http://thalesgroup.com/RTTI/2017-10-01/ldbsv/types}HistoricDepartureBoard" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHistoricDepartureBoardResponseType", propOrder = {
    "getHistoricDepartureBoardResult"
})
public class GetHistoricDepartureBoardResponseType {

    @XmlElement(name = "GetHistoricDepartureBoardResult")
    protected HistoricDepartureBoard getHistoricDepartureBoardResult;

    /**
     * Gets the value of the getHistoricDepartureBoardResult property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricDepartureBoard }
     *     
     */
    public HistoricDepartureBoard getGetHistoricDepartureBoardResult() {
        return getHistoricDepartureBoardResult;
    }

    /**
     * Sets the value of the getHistoricDepartureBoardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricDepartureBoard }
     *     
     */
    public void setGetHistoricDepartureBoardResult(HistoricDepartureBoard value) {
        this.getHistoricDepartureBoardResult = value;
    }

}
