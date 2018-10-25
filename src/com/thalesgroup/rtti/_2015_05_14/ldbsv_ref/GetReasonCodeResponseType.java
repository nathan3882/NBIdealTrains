
package com.thalesgroup.rtti._2015_05_14.ldbsv_ref;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2012_01_13.ldbsv.types.ReasonDescription;


/**
 * <p>Java class for GetReasonCodeResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetReasonCodeResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetReasonCodeResult" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ReasonDescription"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetReasonCodeResponseType", propOrder = {
    "getReasonCodeResult"
})
public class GetReasonCodeResponseType {

    @XmlElement(name = "GetReasonCodeResult", required = true)
    protected ReasonDescription getReasonCodeResult;

    /**
     * Gets the value of the getReasonCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonDescription }
     *     
     */
    public ReasonDescription getGetReasonCodeResult() {
        return getReasonCodeResult;
    }

    /**
     * Sets the value of the getReasonCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonDescription }
     *     
     */
    public void setGetReasonCodeResult(ReasonDescription value) {
        this.getReasonCodeResult = value;
    }

}
