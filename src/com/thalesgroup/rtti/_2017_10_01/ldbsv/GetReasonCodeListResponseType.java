
package com.thalesgroup.rtti._2017_10_01.ldbsv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2012_01_13.ldbsv.types.ArrayOfReasonDescriptions;


/**
 * <p>Java class for GetReasonCodeListResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetReasonCodeListResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetReasonCodeListResult" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ArrayOfReasonDescriptions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetReasonCodeListResponseType", propOrder = {
    "getReasonCodeListResult"
})
public class GetReasonCodeListResponseType {

    @XmlElement(name = "GetReasonCodeListResult", required = true)
    protected ArrayOfReasonDescriptions getReasonCodeListResult;

    /**
     * Gets the value of the getReasonCodeListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReasonDescriptions }
     *     
     */
    public ArrayOfReasonDescriptions getGetReasonCodeListResult() {
        return getReasonCodeListResult;
    }

    /**
     * Sets the value of the getReasonCodeListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReasonDescriptions }
     *     
     */
    public void setGetReasonCodeListResult(ArrayOfReasonDescriptions value) {
        this.getReasonCodeListResult = value;
    }

}
