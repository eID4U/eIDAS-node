//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 generiert 
// Siehe <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.02 um 03:47:41 PM CEST 
//


package at.gv.egiz.eid4u.impl.attributes.xjc.europass;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InstantMessagingUsesEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InstantMessagingUsesEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="gtalk"/&gt;
 *     &lt;enumeration value="skype"/&gt;
 *     &lt;enumeration value="icq"/&gt;
 *     &lt;enumeration value="aim"/&gt;
 *     &lt;enumeration value="msn"/&gt;
 *     &lt;enumeration value="yahoo"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InstantMessagingUsesEnumeration")
@XmlEnum
public enum InstantMessagingUsesEnumeration {

    @XmlEnumValue("gtalk")
    GTALK("gtalk"),
    @XmlEnumValue("skype")
    SKYPE("skype"),
    @XmlEnumValue("icq")
    ICQ("icq"),
    @XmlEnumValue("aim")
    AIM("aim"),
    @XmlEnumValue("msn")
    MSN("msn"),
    @XmlEnumValue("yahoo")
    YAHOO("yahoo");
    private final String value;

    InstantMessagingUsesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InstantMessagingUsesEnumeration fromValue(String v) {
        for (InstantMessagingUsesEnumeration c: InstantMessagingUsesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
