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
 * <p>Java-Klasse für HeadlineTypesEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="HeadlineTypesEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="preferred_job"/&gt;
 *     &lt;enumeration value="job_applied_for"/&gt;
 *     &lt;enumeration value="studies_applied_for"/&gt;
 *     &lt;enumeration value="position"/&gt;
 *     &lt;enumeration value="personal_statement"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HeadlineTypesEnumeration")
@XmlEnum
public enum HeadlineTypesEnumeration {

    @XmlEnumValue("preferred_job")
    PREFERRED_JOB("preferred_job"),
    @XmlEnumValue("job_applied_for")
    JOB_APPLIED_FOR("job_applied_for"),
    @XmlEnumValue("studies_applied_for")
    STUDIES_APPLIED_FOR("studies_applied_for"),
    @XmlEnumValue("position")
    POSITION("position"),
    @XmlEnumValue("personal_statement")
    PERSONAL_STATEMENT("personal_statement");
    private final String value;

    HeadlineTypesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeadlineTypesEnumeration fromValue(String v) {
        for (HeadlineTypesEnumeration c: HeadlineTypesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
