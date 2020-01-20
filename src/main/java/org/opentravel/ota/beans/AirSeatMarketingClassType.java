//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.14 at 08:08:31 PM GST 
//


package org.opentravel.ota.beans;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Seat marketing classification data for a section of seats within a specified aircraft equipment type.
 * 
 * <p>Java class for AirSeatMarketingClassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirSeatMarketingClassType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CabinInfo" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SubType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="SeatType" type="{http://www.opentravel.org/OTA/2003/05}AirSeatPreferenceType" />
 *                           &lt;attribute name="ClassCode" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ReqSeatQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="ResBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
 *                 &lt;attribute name="ClassCode" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
 *                 &lt;attribute name="SeatType" type="{http://www.opentravel.org/OTA/2003/05}AirSeatPreferenceType" />
 *                 &lt;attribute name="TravelerRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="OrigDestSequenceRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="ItinerarySegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AirEquipType">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.opentravel.org/OTA/2003/05}StringLength3 {http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="PurchasedSeatRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirSeatMarketingClassType", propOrder = {
    "cabinInfo",
    "tpaExtensions"
})
@XmlSeeAlso({
    org.opentravel.ota.beans.AirPricedOfferType.SeatInfo.class
})
public class AirSeatMarketingClassType {

    @XmlElement(name = "CabinInfo")
    protected List<AirSeatMarketingClassType.CabinInfo> cabinInfo;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "AirEquipType")
    protected String airEquipType;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "PurchasedSeatRPH")
    protected String purchasedSeatRPH;

    /**
     * Gets the value of the cabinInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSeatMarketingClassType.CabinInfo }
     * 
     * 
     */
    public List<AirSeatMarketingClassType.CabinInfo> getCabinInfo() {
        if (cabinInfo == null) {
            cabinInfo = new ArrayList<AirSeatMarketingClassType.CabinInfo>();
        }
        return this.cabinInfo;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the airEquipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirEquipType() {
        return airEquipType;
    }

    /**
     * Sets the value of the airEquipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirEquipType(String value) {
        this.airEquipType = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * Gets the value of the purchasedSeatRPH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasedSeatRPH() {
        return purchasedSeatRPH;
    }

    /**
     * Sets the value of the purchasedSeatRPH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasedSeatRPH(String value) {
        this.purchasedSeatRPH = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SubType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="SeatType" type="{http://www.opentravel.org/OTA/2003/05}AirSeatPreferenceType" />
     *                 &lt;attribute name="ClassCode" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ReqSeatQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="ResBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
     *       &lt;attribute name="ClassCode" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
     *       &lt;attribute name="SeatType" type="{http://www.opentravel.org/OTA/2003/05}AirSeatPreferenceType" />
     *       &lt;attribute name="TravelerRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="OrigDestSequenceRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="ItinerarySegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subType"
    })
    public static class CabinInfo {

        @XmlElement(name = "SubType")
        protected List<AirSeatMarketingClassType.CabinInfo.SubType> subType;
        @XmlAttribute(name = "ReqSeatQty")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger reqSeatQty;
        @XmlAttribute(name = "ResBookDesigCode")
        protected String resBookDesigCode;
        @XmlAttribute(name = "ClassCode")
        protected String classCode;
        @XmlAttribute(name = "SeatType")
        protected String seatType;
        @XmlAttribute(name = "TravelerRPH")
        protected String travelerRPH;
        @XmlAttribute(name = "OrigDestSequenceRPH")
        protected String origDestSequenceRPH;
        @XmlAttribute(name = "ItinerarySegmentRPH")
        protected String itinerarySegmentRPH;
        @XmlAttribute(name = "RPH")
        protected String rph;

        /**
         * Gets the value of the subType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirSeatMarketingClassType.CabinInfo.SubType }
         * 
         * 
         */
        public List<AirSeatMarketingClassType.CabinInfo.SubType> getSubType() {
            if (subType == null) {
                subType = new ArrayList<AirSeatMarketingClassType.CabinInfo.SubType>();
            }
            return this.subType;
        }

        /**
         * Gets the value of the reqSeatQty property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getReqSeatQty() {
            return reqSeatQty;
        }

        /**
         * Sets the value of the reqSeatQty property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setReqSeatQty(BigInteger value) {
            this.reqSeatQty = value;
        }

        /**
         * Gets the value of the resBookDesigCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResBookDesigCode() {
            return resBookDesigCode;
        }

        /**
         * Sets the value of the resBookDesigCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResBookDesigCode(String value) {
            this.resBookDesigCode = value;
        }

        /**
         * Gets the value of the classCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassCode() {
            return classCode;
        }

        /**
         * Sets the value of the classCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassCode(String value) {
            this.classCode = value;
        }

        /**
         * Gets the value of the seatType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeatType() {
            return seatType;
        }

        /**
         * Sets the value of the seatType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeatType(String value) {
            this.seatType = value;
        }

        /**
         * Gets the value of the travelerRPH property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelerRPH() {
            return travelerRPH;
        }

        /**
         * Sets the value of the travelerRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelerRPH(String value) {
            this.travelerRPH = value;
        }

        /**
         * Gets the value of the origDestSequenceRPH property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigDestSequenceRPH() {
            return origDestSequenceRPH;
        }

        /**
         * Sets the value of the origDestSequenceRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigDestSequenceRPH(String value) {
            this.origDestSequenceRPH = value;
        }

        /**
         * Gets the value of the itinerarySegmentRPH property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItinerarySegmentRPH() {
            return itinerarySegmentRPH;
        }

        /**
         * Sets the value of the itinerarySegmentRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItinerarySegmentRPH(String value) {
            this.itinerarySegmentRPH = value;
        }

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="SeatType" type="{http://www.opentravel.org/OTA/2003/05}AirSeatPreferenceType" />
         *       &lt;attribute name="ClassCode" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SubType {

            @XmlAttribute(name = "SeatType")
            protected String seatType;
            @XmlAttribute(name = "ClassCode")
            protected String classCode;

            /**
             * Gets the value of the seatType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSeatType() {
                return seatType;
            }

            /**
             * Sets the value of the seatType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSeatType(String value) {
                this.seatType = value;
            }

            /**
             * Gets the value of the classCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClassCode() {
                return classCode;
            }

            /**
             * Sets the value of the classCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClassCode(String value) {
                this.classCode = value;
            }

        }

    }

}
