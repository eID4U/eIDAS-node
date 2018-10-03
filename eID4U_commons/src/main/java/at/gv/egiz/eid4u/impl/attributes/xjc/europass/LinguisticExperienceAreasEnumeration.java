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
 * <p>Java-Klasse für LinguisticExperienceAreasEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LinguisticExperienceAreasEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="studying_training_language"/&gt;
 *     &lt;enumeration value="work_language"/&gt;
 *     &lt;enumeration value="living_traveling_language"/&gt;
 *     &lt;enumeration value="mediating_groups_language"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LinguisticExperienceAreasEnumeration")
@XmlEnum
public enum LinguisticExperienceAreasEnumeration {

    @XmlEnumValue("studying_training_language")
    STUDYING_TRAINING_LANGUAGE("studying_training_language"),
    @XmlEnumValue("work_language")
    WORK_LANGUAGE("work_language"),
    @XmlEnumValue("living_traveling_language")
    LIVING_TRAVELING_LANGUAGE("living_traveling_language"),
    @XmlEnumValue("mediating_groups_language")
    MEDIATING_GROUPS_LANGUAGE("mediating_groups_language");
    private final String value;

    LinguisticExperienceAreasEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinguisticExperienceAreasEnumeration fromValue(String v) {
        for (LinguisticExperienceAreasEnumeration c: LinguisticExperienceAreasEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
