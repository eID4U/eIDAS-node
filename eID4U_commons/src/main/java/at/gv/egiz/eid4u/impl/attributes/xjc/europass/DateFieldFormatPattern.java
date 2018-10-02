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
 * <p>Java-Klasse für DateFieldFormatPattern.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DateFieldFormatPattern"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="text/short"/&gt;
 *     &lt;enumeration value="text/long"/&gt;
 *     &lt;enumeration value="text/long/suffix"/&gt;
 *     &lt;enumeration value="text/long/texts"/&gt;
 *     &lt;enumeration value="numeric/long"/&gt;
 *     &lt;enumeration value="numeric/medium"/&gt;
 *     &lt;enumeration value="numeric/short"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DateFieldFormatPattern")
@XmlEnum
public enum DateFieldFormatPattern {

    @XmlEnumValue("text/short")
    TEXT_SHORT("text/short"),
    @XmlEnumValue("text/long")
    TEXT_LONG("text/long"),
    @XmlEnumValue("text/long/suffix")
    TEXT_LONG_SUFFIX("text/long/suffix"),
    @XmlEnumValue("text/long/texts")
    TEXT_LONG_TEXTS("text/long/texts"),
    @XmlEnumValue("numeric/long")
    NUMERIC_LONG("numeric/long"),
    @XmlEnumValue("numeric/medium")
    NUMERIC_MEDIUM("numeric/medium"),
    @XmlEnumValue("numeric/short")
    NUMERIC_SHORT("numeric/short");
    private final String value;

    DateFieldFormatPattern(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateFieldFormatPattern fromValue(String v) {
        for (DateFieldFormatPattern c: DateFieldFormatPattern.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
