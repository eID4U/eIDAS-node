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
 * <p>Java-Klasse für CoverLetterFieldNames.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CoverLetterFieldNames"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CoverLetter"/&gt;
 *     &lt;enumeration value="CoverLetter.Addressee"/&gt;
 *     &lt;enumeration value="CoverLetter.Addressee.PersonName"/&gt;
 *     &lt;enumeration value="CoverLetter.Addressee.Organisation.ContactInfo.Address"/&gt;
 *     &lt;enumeration value="CoverLetter.Letter.Localisation"/&gt;
 *     &lt;enumeration value="CoverLetter.Letter.Localisation.Date"/&gt;
 *     &lt;enumeration value="CoverLetter.Letter.ClosingSalutation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CoverLetterFieldNames")
@XmlEnum
public enum CoverLetterFieldNames {

    @XmlEnumValue("CoverLetter")
    COVER_LETTER("CoverLetter"),
    @XmlEnumValue("CoverLetter.Addressee")
    COVER_LETTER_ADDRESSEE("CoverLetter.Addressee"),
    @XmlEnumValue("CoverLetter.Addressee.PersonName")
    COVER_LETTER_ADDRESSEE_PERSON_NAME("CoverLetter.Addressee.PersonName"),
    @XmlEnumValue("CoverLetter.Addressee.Organisation.ContactInfo.Address")
    COVER_LETTER_ADDRESSEE_ORGANISATION_CONTACT_INFO_ADDRESS("CoverLetter.Addressee.Organisation.ContactInfo.Address"),
    @XmlEnumValue("CoverLetter.Letter.Localisation")
    COVER_LETTER_LETTER_LOCALISATION("CoverLetter.Letter.Localisation"),
    @XmlEnumValue("CoverLetter.Letter.Localisation.Date")
    COVER_LETTER_LETTER_LOCALISATION_DATE("CoverLetter.Letter.Localisation.Date"),
    @XmlEnumValue("CoverLetter.Letter.ClosingSalutation")
    COVER_LETTER_LETTER_CLOSING_SALUTATION("CoverLetter.Letter.ClosingSalutation");
    private final String value;

    CoverLetterFieldNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CoverLetterFieldNames fromValue(String v) {
        for (CoverLetterFieldNames c: CoverLetterFieldNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
