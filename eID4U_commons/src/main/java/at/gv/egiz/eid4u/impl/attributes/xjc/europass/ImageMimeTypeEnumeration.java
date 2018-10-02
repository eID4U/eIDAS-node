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
 * <p>Java-Klasse für ImageMimeTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageMimeTypeEnumeration"&gt;
 *   &lt;restriction base="{http://europass.cedefop.europa.eu/Europass}MimeTypeEnumeration"&gt;
 *     &lt;enumeration value="image/jpeg"/&gt;
 *     &lt;enumeration value="image/pjpeg"/&gt;
 *     &lt;enumeration value="image/png"/&gt;
 *     &lt;enumeration value="image/x-png"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImageMimeTypeEnumeration")
@XmlEnum(MimeTypeEnumeration.class)
public enum ImageMimeTypeEnumeration {

    @XmlEnumValue("image/jpeg")
    IMAGE_JPEG(MimeTypeEnumeration.IMAGE_JPEG),
    @XmlEnumValue("image/pjpeg")
    IMAGE_PJPEG(MimeTypeEnumeration.IMAGE_PJPEG),
    @XmlEnumValue("image/png")
    IMAGE_PNG(MimeTypeEnumeration.IMAGE_PNG),
    @XmlEnumValue("image/x-png")
    IMAGE_X_PNG(MimeTypeEnumeration.IMAGE_X_PNG);
    private final MimeTypeEnumeration value;

    ImageMimeTypeEnumeration(MimeTypeEnumeration v) {
        value = v;
    }

    public MimeTypeEnumeration value() {
        return value;
    }

    public static ImageMimeTypeEnumeration fromValue(MimeTypeEnumeration v) {
        for (ImageMimeTypeEnumeration c: ImageMimeTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
