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
 * 				Contains the base-64 encoded bytes of a JPEG or PNG image file that represents the signature an individual.
 * 				Restricts the FileDataType by excluding the Name sub-element and specifying that the MimeType accepts values from the ImageMimeTypeEnumeration.
 * 			
 * 
 * <p>Java-Klasse für SignatureDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SignatureDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://europass.cedefop.europa.eu/Europass}PhotoDataType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureDataType")
public class SignatureDataType
    extends PhotoDataType
{


}
