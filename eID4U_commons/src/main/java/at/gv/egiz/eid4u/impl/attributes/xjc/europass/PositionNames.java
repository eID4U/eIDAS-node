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
 * <p>Java-Klasse für PositionNames.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PositionNames"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="left-align"/&gt;
 *     &lt;enumeration value="right-align"/&gt;
 *     &lt;enumeration value="middle-align"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PositionNames")
@XmlEnum
public enum PositionNames {

    @XmlEnumValue("left-align")
    LEFT_ALIGN("left-align"),
    @XmlEnumValue("right-align")
    RIGHT_ALIGN("right-align"),
    @XmlEnumValue("middle-align")
    MIDDLE_ALIGN("middle-align");
    private final String value;

    PositionNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionNames fromValue(String v) {
        for (PositionNames c: PositionNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
