//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 generiert 
// Siehe <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.02 um 03:47:41 PM CEST 
//


package at.gv.egiz.eid4u.impl.attributes.xjc.europass;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DocumentTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ECV_ESP"/&gt;
 *     &lt;enumeration value="ESP"/&gt;
 *     &lt;enumeration value="ECV"/&gt;
 *     &lt;enumeration value="ELP"/&gt;
 *     &lt;enumeration value="ECL"/&gt;
 *     &lt;enumeration value="EX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentTypeType")
@XmlEnum
public enum DocumentTypeType {

    ECV_ESP,
    ESP,
    ECV,
    ELP,
    ECL,
    EX;

    public String value() {
        return name();
    }

    public static DocumentTypeType fromValue(String v) {
        return valueOf(v);
    }

}
