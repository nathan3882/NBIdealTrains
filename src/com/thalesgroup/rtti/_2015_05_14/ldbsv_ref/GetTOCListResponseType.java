
package com.thalesgroup.rtti._2015_05_14.ldbsv_ref;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2015_05_14.ldbsv_ref.types.TOCRefData;


/**
 * <p>Java class for GetTOCListResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTOCListResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetTOCListResult" type="{http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/types}TOCRefData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTOCListResponseType", propOrder = {
    "getTOCListResult"
})
public class GetTOCListResponseType {

    @XmlElement(name = "GetTOCListResult", required = true)
    protected TOCRefData getTOCListResult;

    /**
     * Gets the value of the getTOCListResult property.
     * 
     * @return
     *     possible object is
     *     {@link TOCRefData }
     *     
     */
    public TOCRefData getGetTOCListResult() {
        return getTOCListResult;
    }

    /**
     * Sets the value of the getTOCListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOCRefData }
     *     
     */
    public void setGetTOCListResult(TOCRefData value) {
        this.getTOCListResult = value;
    }

}
