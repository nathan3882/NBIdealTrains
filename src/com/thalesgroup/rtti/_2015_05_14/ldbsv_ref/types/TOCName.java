
package com.thalesgroup.rtti._2015_05_14.ldbsv_ref.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * A TOC name reference data item.
 * 
 * <p>Java class for TOCName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TOCName">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes>TOCName">
 *       &lt;attribute name="toc" use="required" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TOCCode" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOCName", propOrder = {
    "value"
})
public class TOCName {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "toc", required = true)
    protected String toc;

    /**
     * The display name of a Train Operating Company
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the toc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToc() {
        return toc;
    }

    /**
     * Sets the value of the toc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToc(String value) {
        this.toc = value;
    }

}
