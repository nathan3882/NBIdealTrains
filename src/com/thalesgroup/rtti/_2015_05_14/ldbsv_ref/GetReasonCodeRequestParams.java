
package com.thalesgroup.rtti._2015_05_14.ldbsv_ref;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetReasonCodeRequestParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetReasonCodeRequestParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ReasonCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetReasonCodeRequestParams", propOrder = {
    "reasonCode"
})
public class GetReasonCodeRequestParams {

    protected int reasonCode;

    /**
     * Gets the value of the reasonCode property.
     * 
     */
    public int getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     */
    public void setReasonCode(int value) {
        this.reasonCode = value;
    }

}
