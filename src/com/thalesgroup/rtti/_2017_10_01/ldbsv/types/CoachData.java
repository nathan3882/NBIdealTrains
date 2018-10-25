
package com.thalesgroup.rtti._2017_10_01.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import com.thalesgroup.rtti._2017_10_01.ldbsv.commontypes.ToiletAvailabilityType;


/**
 * The data for an individual coach in a formation.
 * 
 * <p>Java class for CoachData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoachData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coachClass" type="{http://thalesgroup.com/RTTI/2017-02-02/ldbsv/commontypes}CoachClassType" minOccurs="0"/>
 *         &lt;element name="toilet" type="{http://thalesgroup.com/RTTI/2017-10-01/ldbsv/commontypes}ToiletAvailabilityType" minOccurs="0"/>
 *         &lt;element name="loading" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://thalesgroup.com/RTTI/2017-02-02/ldbsv/commontypes>LoadingValue">
 *                 &lt;attribute name="source" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}SourceType" />
 *                 &lt;attribute name="sourceInstance" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}SourceInstanceType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="number" use="required" type="{http://thalesgroup.com/RTTI/2017-02-02/ldbsv/commontypes}CoachNumberType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoachData", propOrder = {
    "coachClass",
    "toilet",
    "loading"
})
public class CoachData {

    protected String coachClass;
    protected ToiletAvailabilityType toilet;
    protected CoachData.Loading loading;
    @XmlAttribute(name = "number", required = true)
    protected String number;

    /**
     * Gets the value of the coachClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoachClass() {
        return coachClass;
    }

    /**
     * Sets the value of the coachClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoachClass(String value) {
        this.coachClass = value;
    }

    /**
     * Gets the value of the toilet property.
     * 
     * @return
     *     possible object is
     *     {@link ToiletAvailabilityType }
     *     
     */
    public ToiletAvailabilityType getToilet() {
        return toilet;
    }

    /**
     * Sets the value of the toilet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToiletAvailabilityType }
     *     
     */
    public void setToilet(ToiletAvailabilityType value) {
        this.toilet = value;
    }

    /**
     * Gets the value of the loading property.
     * 
     * @return
     *     possible object is
     *     {@link CoachData.Loading }
     *     
     */
    public CoachData.Loading getLoading() {
        return loading;
    }

    /**
     * Sets the value of the loading property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoachData.Loading }
     *     
     */
    public void setLoading(CoachData.Loading value) {
        this.loading = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://thalesgroup.com/RTTI/2017-02-02/ldbsv/commontypes>LoadingValue">
     *       &lt;attribute name="source" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}SourceType" />
     *       &lt;attribute name="sourceInstance" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}SourceInstanceType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Loading {

        @XmlValue
        protected long value;
        @XmlAttribute(name = "source")
        protected String source;
        @XmlAttribute(name = "sourceInstance")
        protected String sourceInstance;

        /**
         * A value representing the loading of a train coach as a percentage (0-100%).
         * 
         */
        public long getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(long value) {
            this.value = value;
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

}
