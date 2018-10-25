
package com.thalesgroup.rtti._2015_05_14.ldbsv_ref;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2012_01_13.ldbsv.types.ArrayOfSourceInstanceNames;


/**
 * <p>Java class for GetSourceInstanceNamesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSourceInstanceNamesResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetSourceInstanceNamesResult" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ArrayOfSourceInstanceNames"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSourceInstanceNamesResponseType", propOrder = {
    "getSourceInstanceNamesResult"
})
public class GetSourceInstanceNamesResponseType {

    @XmlElement(name = "GetSourceInstanceNamesResult", required = true)
    protected ArrayOfSourceInstanceNames getSourceInstanceNamesResult;

    /**
     * Gets the value of the getSourceInstanceNamesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSourceInstanceNames }
     *     
     */
    public ArrayOfSourceInstanceNames getGetSourceInstanceNamesResult() {
        return getSourceInstanceNamesResult;
    }

    /**
     * Sets the value of the getSourceInstanceNamesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSourceInstanceNames }
     *     
     */
    public void setGetSourceInstanceNamesResult(ArrayOfSourceInstanceNames value) {
        this.getSourceInstanceNamesResult = value;
    }

}
