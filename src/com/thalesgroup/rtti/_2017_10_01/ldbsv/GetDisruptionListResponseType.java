
package com.thalesgroup.rtti._2017_10_01.ldbsv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2012_01_13.ldbsv.types.ArrayOfDisruptionItems;


/**
 * <p>Java class for GetDisruptionListResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDisruptionListResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetDisruptionListResult" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ArrayOfDisruptionItems"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDisruptionListResponseType", propOrder = {
    "getDisruptionListResult"
})
public class GetDisruptionListResponseType {

    @XmlElement(name = "GetDisruptionListResult", required = true)
    protected ArrayOfDisruptionItems getDisruptionListResult;

    /**
     * Gets the value of the getDisruptionListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDisruptionItems }
     *     
     */
    public ArrayOfDisruptionItems getGetDisruptionListResult() {
        return getDisruptionListResult;
    }

    /**
     * Sets the value of the getDisruptionListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDisruptionItems }
     *     
     */
    public void setGetDisruptionListResult(ArrayOfDisruptionItems value) {
        this.getDisruptionListResult = value;
    }

}
