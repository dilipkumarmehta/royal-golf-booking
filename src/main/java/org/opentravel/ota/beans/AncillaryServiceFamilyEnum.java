//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.14 at 08:08:31 PM GST 
//


package org.opentravel.ota.beans;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AncillaryServiceFamilyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AncillaryServiceFamilyEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="A_FreeBaggageAllowance"/>
 *     &lt;enumeration value="C_BaggageCharges"/>
 *     &lt;enumeration value="F_FlightRelated"/>
 *     &lt;enumeration value="T_TicketRelated"/>
 *     &lt;enumeration value="M_MerchandiseRelated"/>
 *     &lt;enumeration value="R_RuleBuster"/>
 *     &lt;enumeration value="P_PrepaidBaggage"/>
 *     &lt;enumeration value="E_Embargos"/>
 *     &lt;enumeration value="GT_GroundTransportationNonAirServices"/>
 *     &lt;enumeration value="IE_InFlightEntertainment"/>
 *     &lt;enumeration value="LG_Lounge"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AncillaryServiceFamilyEnum")
@XmlEnum
public enum AncillaryServiceFamilyEnum {


    /**
     * All service family types.
     * 
     */
    @XmlEnumValue("All")
    ALL("All"),

    /**
     * Free Baggage Allowance
     * 
     */
    @XmlEnumValue("A_FreeBaggageAllowance")
    A_FREE_BAGGAGE_ALLOWANCE("A_FreeBaggageAllowance"),

    /**
     * Baggage Charges
     * 
     */
    @XmlEnumValue("C_BaggageCharges")
    C_BAGGAGE_CHARGES("C_BaggageCharges"),

    /**
     * Flight-Related.
     * 
     */
    @XmlEnumValue("F_FlightRelated")
    F_FLIGHT_RELATED("F_FlightRelated"),

    /**
     * Ticket-Related.
     * 
     */
    @XmlEnumValue("T_TicketRelated")
    T_TICKET_RELATED("T_TicketRelated"),

    /**
     * Merchandise-Related
     * 
     */
    @XmlEnumValue("M_MerchandiseRelated")
    M_MERCHANDISE_RELATED("M_MerchandiseRelated"),

    /**
     * Rule Buster (fare override)
     * 
     */
    @XmlEnumValue("R_RuleBuster")
    R_RULE_BUSTER("R_RuleBuster"),

    /**
     * Pre-paid Baggage
     * 
     */
    @XmlEnumValue("P_PrepaidBaggage")
    P_PREPAID_BAGGAGE("P_PrepaidBaggage"),

    /**
     * Embargos
     * 
     */
    @XmlEnumValue("E_Embargos")
    E_EMBARGOS("E_Embargos"),
    @XmlEnumValue("GT_GroundTransportationNonAirServices")
    GT_GROUND_TRANSPORTATION_NON_AIR_SERVICES("GT_GroundTransportationNonAirServices"),
    @XmlEnumValue("IE_InFlightEntertainment")
    IE_IN_FLIGHT_ENTERTAINMENT("IE_InFlightEntertainment"),
    @XmlEnumValue("LG_Lounge")
    LG_LOUNGE("LG_Lounge"),

    /**
     * OpenTravel Reserved words, "Other_" as enumerated value for  open enumeration support to support additional compartment type. The Value corresponding to "Other_" will be specified in the  "Value" attribute. See CompartmentType.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    AncillaryServiceFamilyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AncillaryServiceFamilyEnum fromValue(String v) {
        for (AncillaryServiceFamilyEnum c: AncillaryServiceFamilyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}