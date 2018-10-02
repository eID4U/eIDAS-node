//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 generiert 
// Siehe <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.09.30 um 08:08:27 PM CEST 
//


package at.gv.egiz.eid4u.impl.attributes.xjc.europass;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MimeTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MimeTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="image/jpeg"/&gt;
 *     &lt;enumeration value="image/pjpeg"/&gt;
 *     &lt;enumeration value="image/png"/&gt;
 *     &lt;enumeration value="image/x-png"/&gt;
 *     &lt;enumeration value="application/pdf"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MimeTypeEnumeration")
@XmlEnum
public enum MimeTypeEnumeration {

    @XmlEnumValue("image/jpeg")
    IMAGE_JPEG("image/jpeg"),
    @XmlEnumValue("image/pjpeg")
    IMAGE_PJPEG("image/pjpeg"),
    @XmlEnumValue("image/png")
    IMAGE_PNG("image/png"),
    @XmlEnumValue("image/x-png")
    IMAGE_X_PNG("image/x-png"),
    @XmlEnumValue("application/pdf")
    APPLICATION_PDF("application/pdf");
    private final String value;

    MimeTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MimeTypeEnumeration fromValue(String v) {
        for (MimeTypeEnumeration c: MimeTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
