//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 generiert 
// Siehe <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.02 um 03:47:41 PM CEST 
//


package at.gv.egiz.eid4u.impl.attributes.xjc.europass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für WebsiteUseLabelType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WebsiteUseLabelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://europass.cedefop.europa.eu/Europass}LabelType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://europass.cedefop.europa.eu/Europass}WebsiteUsesEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebsiteUseLabelType")
public class WebsiteUseLabelType
    extends LabelType
{


}
