
package com.thalesgroup.rtti._2017_10_01.ldbsv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2017_10_01.ldbsv.types.HistoricServiceDetails;


/**
 * <p>Java class for GetHistoricServiceDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHistoricServiceDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetHistoricServiceDetailsResult" type="{http://thalesgroup.com/RTTI/2017-10-01/ldbsv/types}HistoricServiceDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHistoricServiceDetailsResponseType", propOrder = {
    "getHistoricServiceDetailsResult"
})
public class GetHistoricServiceDetailsResponseType {

    @XmlElement(name = "GetHistoricServiceDetailsResult")
    protected HistoricServiceDetails getHistoricServiceDetailsResult;

    /**
     * Gets the value of the getHistoricServiceDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricServiceDetails }
     *     
     */
    public HistoricServiceDetails getGetHistoricServiceDetailsResult() {
        return getHistoricServiceDetailsResult;
    }

    /**
     * Sets the value of the getHistoricServiceDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricServiceDetails }
     *     
     */
    public void setGetHistoricServiceDetailsResult(HistoricServiceDetails value) {
        this.getHistoricServiceDetailsResult = value;
    }

}
