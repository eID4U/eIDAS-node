//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 generiert 
// Siehe <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.02 um 03:47:41 PM CEST 
//


package at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.generic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DocumentTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="photo"/&gt;
 *     &lt;enumeration value="certificate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentTypeType")
@XmlEnum
public enum DocumentTypeType {

    @XmlEnumValue("photo")
    PHOTO("photo"),
    @XmlEnumValue("certificate")
    CERTIFICATE("certificate");
    private final String value;

    DocumentTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentTypeType fromValue(String v) {
        for (DocumentTypeType c: DocumentTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
