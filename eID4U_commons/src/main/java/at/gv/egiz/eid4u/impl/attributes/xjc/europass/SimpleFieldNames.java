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
 * <p>Java-Klasse für SimpleFieldNames.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SimpleFieldNames"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LearnerInfo"/&gt;
 *     &lt;enumeration value="LearnerInfo.Identification"/&gt;
 *     &lt;enumeration value="LearnerInfo.Identification.PersonName"/&gt;
 *     &lt;enumeration value="LearnerInfo.Identification.ContactInfo.Address"/&gt;
 *     &lt;enumeration value="LearnerInfo.Identification.ContactInfo.Email"/&gt;
 *     &lt;enumeration value="LearnerInfo.Identification.ContactInfo.Telephone"/&gt;
 *     &lt;enumeration value="LearnerInfo.Identification.ContactInfo.Website"/&gt;
 *     &lt;enumeration value="LearnerInfo.Identification.ContactInfo.InstantMessaging"/&gt;
 *     &lt;enumeration value="LearnerInfo.Identification.Demographics.Gender"/&gt;
 *     &lt;enumeration value="LearnerInfo.Identification.Demographics.Birthdate"/&gt;
 *     &lt;enumeration value="LearnerInfo.Identification.Demographics.Nationality"/&gt;
 *     &lt;enumeration value="LearnerInfo.Identification.Photo"/&gt;
 *     &lt;enumeration value="LearnerInfo.ProfileSummary"/&gt;
 *     &lt;enumeration value="LearnerInfo.Headline"/&gt;
 *     &lt;enumeration value="LearnerInfo.Education"/&gt;
 *     &lt;enumeration value="LearnerInfo.WorkExperience"/&gt;
 *     &lt;enumeration value="LearnerInfo.Skills"/&gt;
 *     &lt;enumeration value="LearnerInfo.Skills.Linguistic.MotherTongue"/&gt;
 *     &lt;enumeration value="LearnerInfo.Skills.Linguistic.ForeignLanguage"/&gt;
 *     &lt;enumeration value="LearnerInfo.Skills.Communication"/&gt;
 *     &lt;enumeration value="LearnerInfo.Skills.Organisational"/&gt;
 *     &lt;enumeration value="LearnerInfo.Skills.JobRelated"/&gt;
 *     &lt;enumeration value="LearnerInfo.Skills.Computer"/&gt;
 *     &lt;enumeration value="LearnerInfo.Skills.Driving"/&gt;
 *     &lt;enumeration value="LearnerInfo.Skills.Other"/&gt;
 *     &lt;enumeration value="LearnerInfo.Achievement"/&gt;
 *     &lt;enumeration value="LearnerInfo.ReferenceTo"/&gt;
 *     &lt;enumeration value="LearnerInfo.CEFLanguageLevelsGrid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SimpleFieldNames")
@XmlEnum
public enum SimpleFieldNames {

    @XmlEnumValue("LearnerInfo")
    LEARNER_INFO("LearnerInfo"),
    @XmlEnumValue("LearnerInfo.Identification")
    LEARNER_INFO_IDENTIFICATION("LearnerInfo.Identification"),
    @XmlEnumValue("LearnerInfo.Identification.PersonName")
    LEARNER_INFO_IDENTIFICATION_PERSON_NAME("LearnerInfo.Identification.PersonName"),
    @XmlEnumValue("LearnerInfo.Identification.ContactInfo.Address")
    LEARNER_INFO_IDENTIFICATION_CONTACT_INFO_ADDRESS("LearnerInfo.Identification.ContactInfo.Address"),
    @XmlEnumValue("LearnerInfo.Identification.ContactInfo.Email")
    LEARNER_INFO_IDENTIFICATION_CONTACT_INFO_EMAIL("LearnerInfo.Identification.ContactInfo.Email"),
    @XmlEnumValue("LearnerInfo.Identification.ContactInfo.Telephone")
    LEARNER_INFO_IDENTIFICATION_CONTACT_INFO_TELEPHONE("LearnerInfo.Identification.ContactInfo.Telephone"),
    @XmlEnumValue("LearnerInfo.Identification.ContactInfo.Website")
    LEARNER_INFO_IDENTIFICATION_CONTACT_INFO_WEBSITE("LearnerInfo.Identification.ContactInfo.Website"),
    @XmlEnumValue("LearnerInfo.Identification.ContactInfo.InstantMessaging")
    LEARNER_INFO_IDENTIFICATION_CONTACT_INFO_INSTANT_MESSAGING("LearnerInfo.Identification.ContactInfo.InstantMessaging"),
    @XmlEnumValue("LearnerInfo.Identification.Demographics.Gender")
    LEARNER_INFO_IDENTIFICATION_DEMOGRAPHICS_GENDER("LearnerInfo.Identification.Demographics.Gender"),
    @XmlEnumValue("LearnerInfo.Identification.Demographics.Birthdate")
    LEARNER_INFO_IDENTIFICATION_DEMOGRAPHICS_BIRTHDATE("LearnerInfo.Identification.Demographics.Birthdate"),

    /**
     * Controls the display of all possible nationality labels
     * 
     */
    @XmlEnumValue("LearnerInfo.Identification.Demographics.Nationality")
    LEARNER_INFO_IDENTIFICATION_DEMOGRAPHICS_NATIONALITY("LearnerInfo.Identification.Demographics.Nationality"),
    @XmlEnumValue("LearnerInfo.Identification.Photo")
    LEARNER_INFO_IDENTIFICATION_PHOTO("LearnerInfo.Identification.Photo"),
    @XmlEnumValue("LearnerInfo.ProfileSummary")
    LEARNER_INFO_PROFILE_SUMMARY("LearnerInfo.ProfileSummary"),
    @XmlEnumValue("LearnerInfo.Headline")
    LEARNER_INFO_HEADLINE("LearnerInfo.Headline"),
    @XmlEnumValue("LearnerInfo.Education")
    LEARNER_INFO_EDUCATION("LearnerInfo.Education"),
    @XmlEnumValue("LearnerInfo.WorkExperience")
    LEARNER_INFO_WORK_EXPERIENCE("LearnerInfo.WorkExperience"),
    @XmlEnumValue("LearnerInfo.Skills")
    LEARNER_INFO_SKILLS("LearnerInfo.Skills"),
    @XmlEnumValue("LearnerInfo.Skills.Linguistic.MotherTongue")
    LEARNER_INFO_SKILLS_LINGUISTIC_MOTHER_TONGUE("LearnerInfo.Skills.Linguistic.MotherTongue"),
    @XmlEnumValue("LearnerInfo.Skills.Linguistic.ForeignLanguage")
    LEARNER_INFO_SKILLS_LINGUISTIC_FOREIGN_LANGUAGE("LearnerInfo.Skills.Linguistic.ForeignLanguage"),
    @XmlEnumValue("LearnerInfo.Skills.Communication")
    LEARNER_INFO_SKILLS_COMMUNICATION("LearnerInfo.Skills.Communication"),
    @XmlEnumValue("LearnerInfo.Skills.Organisational")
    LEARNER_INFO_SKILLS_ORGANISATIONAL("LearnerInfo.Skills.Organisational"),
    @XmlEnumValue("LearnerInfo.Skills.JobRelated")
    LEARNER_INFO_SKILLS_JOB_RELATED("LearnerInfo.Skills.JobRelated"),
    @XmlEnumValue("LearnerInfo.Skills.Computer")
    LEARNER_INFO_SKILLS_COMPUTER("LearnerInfo.Skills.Computer"),
    @XmlEnumValue("LearnerInfo.Skills.Driving")
    LEARNER_INFO_SKILLS_DRIVING("LearnerInfo.Skills.Driving"),
    @XmlEnumValue("LearnerInfo.Skills.Other")
    LEARNER_INFO_SKILLS_OTHER("LearnerInfo.Skills.Other"),
    @XmlEnumValue("LearnerInfo.Achievement")
    LEARNER_INFO_ACHIEVEMENT("LearnerInfo.Achievement"),
    @XmlEnumValue("LearnerInfo.ReferenceTo")
    LEARNER_INFO_REFERENCE_TO("LearnerInfo.ReferenceTo"),
    @XmlEnumValue("LearnerInfo.CEFLanguageLevelsGrid")
    LEARNER_INFO_CEF_LANGUAGE_LEVELS_GRID("LearnerInfo.CEFLanguageLevelsGrid");
    private final String value;

    SimpleFieldNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SimpleFieldNames fromValue(String v) {
        for (SimpleFieldNames c: SimpleFieldNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
