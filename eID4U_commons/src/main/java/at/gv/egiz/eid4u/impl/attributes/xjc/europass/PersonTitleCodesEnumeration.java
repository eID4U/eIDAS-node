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
 * <p>Java-Klasse für PersonTitleCodesEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonTitleCodesEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="mr"/&gt;
 *     &lt;enumeration value="ms"/&gt;
 *     &lt;enumeration value="mrs"/&gt;
 *     &lt;enumeration value="miss"/&gt;
 *     &lt;enumeration value="dr"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PersonTitleCodesEnumeration")
@XmlEnum
public enum PersonTitleCodesEnumeration {

    @XmlEnumValue("mr")
    MR("mr"),
    @XmlEnumValue("ms")
    MS("ms"),
    @XmlEnumValue("mrs")
    MRS("mrs"),
    @XmlEnumValue("miss")
    MISS("miss"),
    @XmlEnumValue("dr")
    DR("dr");
    private final String value;

    PersonTitleCodesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonTitleCodesEnumeration fromValue(String v) {
        for (PersonTitleCodesEnumeration c: PersonTitleCodesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
