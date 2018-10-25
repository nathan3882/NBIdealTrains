
package com.thalesgroup.rtti._2017_10_01.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Formation data at a calling point.
 * 
 * <p>Java class for FormationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="avgLoading" type="{http://thalesgroup.com/RTTI/2017-02-02/ldbsv/commontypes}LoadingValue" minOccurs="0"/>
 *         &lt;element name="coaches" type="{http://thalesgroup.com/RTTI/2017-10-01/ldbsv/types}ArrayOfCoaches" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="source" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}SourceType" />
 *       &lt;attribute name="sourceInstance" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}SourceInstanceType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormationData", propOrder = {
    "avgLoading",
    "coaches"
})
@XmlSeeAlso({
    LocFormationData.class
})
public class FormationData {

    protected Long avgLoading;
    protected ArrayOfCoaches coaches;
    @XmlAttribute(name = "source")
    protected String source;
    @XmlAttribute(name = "sourceInstance")
    protected String sourceInstance;

    /**
     * Gets the value of the avgLoading property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvgLoading() {
        return avgLoading;
    }

    /**
     * Sets the value of the avgLoading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvgLoading(Long value) {
        this.avgLoading = value;
    }

    /**
     * Gets the value of the coaches property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCoaches }
     *     
     */
    public ArrayOfCoaches getCoaches() {
        return coaches;
    }

    /**
     * Sets the value of the coaches property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCoaches }
     *     
     */
    public void setCoaches(ArrayOfCoaches value) {
        this.coaches = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the sourceInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceInstance() {
        return sourceInstance;
    }

    /**
     * Sets the value of the sourceInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceInstance(String value) {
        this.sourceInstance = value;
    }

}
