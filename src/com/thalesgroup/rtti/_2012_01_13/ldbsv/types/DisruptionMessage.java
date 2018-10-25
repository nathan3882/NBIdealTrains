
package com.thalesgroup.rtti._2012_01_13.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A disruption message. The message may include embedded and xml encoded HTML-like hyperlinks and paragraphs. See the documetation for more details.
 * 
 * <p>Java class for DisruptionMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisruptionMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="category">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Train service"/>
 *               &lt;enumeration value="Station"/>
 *               &lt;enumeration value="Connecting services"/>
 *               &lt;enumeration value="System related"/>
 *               &lt;enumeration value="Miscellaneous"/>
 *               &lt;enumeration value="Prior (trains)"/>
 *               &lt;enumeration value="Prior (other)"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="severity">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Normal"/>
 *               &lt;enumeration value="Minor"/>
 *               &lt;enumeration value="Major"/>
 *               &lt;enumeration value="Severe"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="isSuppressed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="xhtmlMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisruptionMessage", propOrder = {
    "id",
    "category",
    "severity",
    "isSuppressed",
    "xhtmlMessage",
    "description"
})
public class DisruptionMessage {

    protected int id;
    @XmlElement(required = true)
    protected String category;
    @XmlElement(required = true)
    protected String severity;
    @XmlElement(defaultValue = "false")
    protected Boolean isSuppressed;
    @XmlElement(required = true)
    protected String xhtmlMessage;
    @XmlElement(required = true)
    protected String description;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the isSuppressed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSuppressed() {
        return isSuppressed;
    }

    /**
     * Sets the value of the isSuppressed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSuppressed(Boolean value) {
        this.isSuppressed = value;
    }

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

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
