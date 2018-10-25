
package com.thalesgroup.rtti._2017_10_01.ldbsv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2017_10_01.ldbsv.types.ServiceDetails;


/**
 * <p>Java class for GetServiceDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetServiceDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetServiceDetailsResult" type="{http://thalesgroup.com/RTTI/2017-10-01/ldbsv/types}ServiceDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetServiceDetailsResponseType", propOrder = {
    "getServiceDetailsResult"
})
public class GetServiceDetailsResponseType {

    @XmlElement(name = "GetServiceDetailsResult")
    protected ServiceDetails getServiceDetailsResult;

    /**
     * Gets the value of the getServiceDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDetails }
     *     
     */
    public ServiceDetails getGetServiceDetailsResult() {
        return getServiceDetailsResult;
    }

    /**
     * Sets the value of the getServiceDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDetails }
     *     
     */
    public void setGetServiceDetailsResult(ServiceDetails value) {
        this.getServiceDetailsResult = value;
    }

}
