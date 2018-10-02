//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 generiert 
// Siehe <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.02 um 03:47:41 PM CEST 
//


package at.gv.egiz.eid4u.impl.attributes.xjc.europass.eudriving;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für drivinglicence.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="drivinglicence"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="A1"/&gt;
 *     &lt;enumeration value="A2"/&gt;
 *     &lt;enumeration value="AM"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="B1"/&gt;
 *     &lt;enumeration value="BE"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="C1"/&gt;
 *     &lt;enumeration value="C1E"/&gt;
 *     &lt;enumeration value="CE"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="D1"/&gt;
 *     &lt;enumeration value="D1E"/&gt;
 *     &lt;enumeration value="DE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "drivinglicence", namespace = "http://europass.cedefop.europa.eu/EUDriving")
@XmlEnum
public enum Drivinglicence {

    A("A"),
    @XmlEnumValue("A1")
    A_1("A1"),
    @XmlEnumValue("A2")
    A_2("A2"),
    AM("AM"),
    B("B"),
    @XmlEnumValue("B1")
    B_1("B1"),
    BE("BE"),
    C("C"),
    @XmlEnumValue("C1")
    C_1("C1"),
    @XmlEnumValue("C1E")
    C_1_E("C1E"),
    CE("CE"),
    D("D"),
    @XmlEnumValue("D1")
    D_1("D1"),
    @XmlEnumValue("D1E")
    D_1_E("D1E"),
    DE("DE");
    private final String value;

    Drivinglicence(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Drivinglicence fromValue(String v) {
        for (Drivinglicence c: Drivinglicence.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
