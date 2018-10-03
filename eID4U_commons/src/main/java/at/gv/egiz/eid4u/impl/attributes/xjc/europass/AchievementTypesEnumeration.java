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
 * <p>Java-Klasse für AchievementTypesEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AchievementTypesEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="honors_awards"/&gt;
 *     &lt;enumeration value="presentations"/&gt;
 *     &lt;enumeration value="publications"/&gt;
 *     &lt;enumeration value="projects"/&gt;
 *     &lt;enumeration value="citations"/&gt;
 *     &lt;enumeration value="memberships"/&gt;
 *     &lt;enumeration value="conferences"/&gt;
 *     &lt;enumeration value="seminars"/&gt;
 *     &lt;enumeration value="workshops"/&gt;
 *     &lt;enumeration value="references"/&gt;
 *     &lt;enumeration value="signature_equivalent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AchievementTypesEnumeration")
@XmlEnum
public enum AchievementTypesEnumeration {

    @XmlEnumValue("honors_awards")
    HONORS_AWARDS("honors_awards"),
    @XmlEnumValue("presentations")
    PRESENTATIONS("presentations"),
    @XmlEnumValue("publications")
    PUBLICATIONS("publications"),
    @XmlEnumValue("projects")
    PROJECTS("projects"),
    @XmlEnumValue("citations")
    CITATIONS("citations"),
    @XmlEnumValue("memberships")
    MEMBERSHIPS("memberships"),
    @XmlEnumValue("conferences")
    CONFERENCES("conferences"),
    @XmlEnumValue("seminars")
    SEMINARS("seminars"),
    @XmlEnumValue("workshops")
    WORKSHOPS("workshops"),
    @XmlEnumValue("references")
    REFERENCES("references"),
    @XmlEnumValue("signature_equivalent")
    SIGNATURE_EQUIVALENT("signature_equivalent");
    private final String value;

    AchievementTypesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AchievementTypesEnumeration fromValue(String v) {
        for (AchievementTypesEnumeration c: AchievementTypesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
