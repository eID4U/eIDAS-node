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
 *                 Defines a Linguistic Certificate by restricting the allowed type for the level element to be "CEFLanguageLevel"
 *             
 * 
 * <p>Java-Klasse für LinguisticCertificateType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LinguisticCertificateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://europass.cedefop.europa.eu/Europass}CertificateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AwardingBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://europass.cedefop.europa.eu/Europass}DateType" minOccurs="0"/&gt;
 *         &lt;element name="Level" type="{http://europass.cedefop.europa.eu/Europass}CEFLanguageLevelType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinguisticCertificateType")
public class LinguisticCertificateType
    extends CertificateType
{


}
