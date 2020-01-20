//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.14 at 08:08:31 PM GST 
//


package org.opentravel.ota.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The category of accommodation on a train.
 * 
 * <p>Java class for AccommodationCategoryBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccommodationCategoryBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Seat" type="{http://www.opentravel.org/OTA/2003/05}SeatAccommodationType"/>
 *           &lt;element name="Berth" type="{http://www.opentravel.org/OTA/2003/05}BerthAccommodationType"/>
 *         &lt;/choice>
 *         &lt;element name="Class" type="{http://www.opentravel.org/OTA/2003/05}AccommodationClass" minOccurs="0"/>
 *         &lt;element name="Compartment" type="{http://www.opentravel.org/OTA/2003/05}CompartmentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccommodationCategoryBaseType", propOrder = {
    "seat",
    "berth",
    "clazz",
    "compartment"
})
public class AccommodationCategoryBaseType {

    @XmlElement(name = "Seat")
    @XmlSchemaType(name = "string")
    protected SeatAccommodationType seat;
    @XmlElement(name = "Berth")
    @XmlSchemaType(name = "string")
    protected BerthAccommodationType berth;
    @XmlElement(name = "Class")
    protected AccommodationClass clazz;
    @XmlElement(name = "Compartment")
    protected CompartmentType compartment;

    /**
     * Gets the value of the seat property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAccommodationType }
     *     
     */
    public SeatAccommodationType getSeat() {
        return seat;
    }

    /**
     * Sets the value of the seat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAccommodationType }
     *     
     */
    public void setSeat(SeatAccommodationType value) {
        this.seat = value;
    }

    /**
     * Gets the value of the berth property.
     * 
     * @return
     *     possible object is
     *     {@link BerthAccommodationType }
     *     
     */
    public BerthAccommodationType getBerth() {
        return berth;
    }

    /**
     * Sets the value of the berth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BerthAccommodationType }
     *     
     */
    public void setBerth(BerthAccommodationType value) {
        this.berth = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationClass }
     *     
     */
    public AccommodationClass getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationClass }
     *     
     */
    public void setClazz(AccommodationClass value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the compartment property.
     * 
     * @return
     *     possible object is
     *     {@link CompartmentType }
     *     
     */
    public CompartmentType getCompartment() {
        return compartment;
    }

    /**
     * Sets the value of the compartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompartmentType }
     *     
     */
    public void setCompartment(CompartmentType value) {
        this.compartment = value;
    }

}
