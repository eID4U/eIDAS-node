//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 generiert 
// Siehe <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.09.30 um 08:08:27 PM CEST 
//


package at.gv.egiz.eid4u.impl.attributes.xjc.europass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Restricts the generic skill type by specifying the data type of the elements that describe the level of knowledge of the language and related linguistic diplomas and/or experiences. 
 *             
 * 
 * <p>Java-Klasse für ForeignLanguageSkillType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ForeignLanguageSkillType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://europass.cedefop.europa.eu/Europass}SkillType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://europass.cedefop.europa.eu/Europass}ForeignLanguageType" minOccurs="0"/&gt;
 *         &lt;element name="ProficiencyLevel" type="{http://europass.cedefop.europa.eu/Europass}ProficiencyLevelType" minOccurs="0"/&gt;
 *         &lt;element name="AcquiredDuring" type="{http://europass.cedefop.europa.eu/Europass}LinguisticExperienceListType" minOccurs="0"/&gt;
 *         &lt;element name="VerifiedBy" type="{http://europass.cedefop.europa.eu/Europass}LinguisticCertificateListType" minOccurs="0"/&gt;
 *         &lt;element name="Documentation" type="{http://europass.cedefop.europa.eu/Europass}IntraDocumentDocumentationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignLanguageSkillType")
public class ForeignLanguageSkillType
    extends SkillType
{


}
