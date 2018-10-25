
package com.thalesgroup.rtti._2012_01_13.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A station departure board message. The message may include embedded and xml encoded HTML-like hyperlinks and paragraphs. See the documetation for more details.
 * 
 * <p>Java class for HistoricNRCCMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoricNRCCMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xhtmlMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoricNRCCMessage", propOrder = {
    "xhtmlMessage"
})
public class HistoricNRCCMessage {

    @XmlElement(required = true)
    protected String xhtmlMessage;

    /**
     * Gets the value of the xhtmlMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXhtmlMessage() {
        return xhtmlMessage;
    }

    /**
     * Sets the value of the xhtmlMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXhtmlMessage(String value) {
        this.xhtmlMessage = value;
    }

}
