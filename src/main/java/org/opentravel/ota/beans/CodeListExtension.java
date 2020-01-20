//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.14 at 08:08:31 PM GST 
//


package org.opentravel.ota.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Choice between summary and detailed code extension information.
 * 
 * <p>Java class for CodeListExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeListExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Summary" type="{http://www.opentravel.org/OTA/2003/05}CodeListSummaryExtension" minOccurs="0"/>
 *         &lt;element name="Detail" type="{http://www.opentravel.org/OTA/2003/05}CodeListDetailExtension" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="ChargeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ProximityInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="QuantityInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ScheduleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeListExtension", propOrder = {
    "summary",
    "detail"
})
public class CodeListExtension {

    @XmlElement(name = "Summary")
    protected CodeListSummaryExtension summary;
    @XmlElement(name = "Detail")
    protected CodeListDetailExtension detail;
    @XmlAttribute(name = "ChargeInd")
    protected Boolean chargeInd;
    @XmlAttribute(name = "ProximityInd")
    protected Boolean proximityInd;
    @XmlAttribute(name = "QuantityInd")
    protected Boolean quantityInd;
    @XmlAttribute(name = "ScheduleInd")
    protected Boolean scheduleInd;

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListSummaryExtension }
     *     
     */
    public CodeListSummaryExtension getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListSummaryExtension }
     *     
     */
    public void setSummary(CodeListSummaryExtension value) {
        this.summary = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListDetailExtension }
     *     
     */
    public CodeListDetailExtension getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListDetailExtension }
     *     
     */
    public void setDetail(CodeListDetailExtension value) {
        this.detail = value;
    }

    /**
     * Gets the value of the chargeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChargeInd() {
        return chargeInd;
    }

    /**
     * Sets the value of the chargeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChargeInd(Boolean value) {
        this.chargeInd = value;
    }

    /**
     * Gets the value of the proximityInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProximityInd() {
        return proximityInd;
    }

    /**
     * Sets the value of the proximityInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProximityInd(Boolean value) {
        this.proximityInd = value;
    }

    /**
     * Gets the value of the quantityInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantityInd() {
        return quantityInd;
    }

    /**
     * Sets the value of the quantityInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantityInd(Boolean value) {
        this.quantityInd = value;
    }

    /**
     * Gets the value of the scheduleInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScheduleInd() {
        return scheduleInd;
    }

    /**
     * Sets the value of the scheduleInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduleInd(Boolean value) {
        this.scheduleInd = value;
    }

}
