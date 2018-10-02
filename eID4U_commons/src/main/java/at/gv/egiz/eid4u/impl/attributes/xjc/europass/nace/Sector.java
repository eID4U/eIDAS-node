//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 generiert 
// Siehe <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.02 um 03:47:41 PM CEST 
//


package at.gv.egiz.eid4u.impl.attributes.xjc.europass.nace;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für sector.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="sector"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="A1.."/&gt;
 *     &lt;enumeration value="A1.1."/&gt;
 *     &lt;enumeration value="A1.1.1"/&gt;
 *     &lt;enumeration value="A1.1.2"/&gt;
 *     &lt;enumeration value="A1.1.3"/&gt;
 *     &lt;enumeration value="A1.1.4"/&gt;
 *     &lt;enumeration value="A1.1.5"/&gt;
 *     &lt;enumeration value="A1.1.6"/&gt;
 *     &lt;enumeration value="A1.1.9"/&gt;
 *     &lt;enumeration value="A1.2."/&gt;
 *     &lt;enumeration value="A1.2.1"/&gt;
 *     &lt;enumeration value="A1.2.2"/&gt;
 *     &lt;enumeration value="A1.2.3"/&gt;
 *     &lt;enumeration value="A1.2.4"/&gt;
 *     &lt;enumeration value="A1.2.5"/&gt;
 *     &lt;enumeration value="A1.2.6"/&gt;
 *     &lt;enumeration value="A1.2.7"/&gt;
 *     &lt;enumeration value="A1.2.8"/&gt;
 *     &lt;enumeration value="A1.2.9"/&gt;
 *     &lt;enumeration value="A1.3."/&gt;
 *     &lt;enumeration value="A1.3.0"/&gt;
 *     &lt;enumeration value="A1.4."/&gt;
 *     &lt;enumeration value="A1.4.1"/&gt;
 *     &lt;enumeration value="A1.4.2"/&gt;
 *     &lt;enumeration value="A1.4.3"/&gt;
 *     &lt;enumeration value="A1.4.4"/&gt;
 *     &lt;enumeration value="A1.4.5"/&gt;
 *     &lt;enumeration value="A1.4.6"/&gt;
 *     &lt;enumeration value="A1.4.7"/&gt;
 *     &lt;enumeration value="A1.4.9"/&gt;
 *     &lt;enumeration value="A1.5."/&gt;
 *     &lt;enumeration value="A1.5.0"/&gt;
 *     &lt;enumeration value="A1.6."/&gt;
 *     &lt;enumeration value="A1.6.1"/&gt;
 *     &lt;enumeration value="A1.6.2"/&gt;
 *     &lt;enumeration value="A1.6.3"/&gt;
 *     &lt;enumeration value="A1.6.4"/&gt;
 *     &lt;enumeration value="A1.7."/&gt;
 *     &lt;enumeration value="A1.7.0"/&gt;
 *     &lt;enumeration value="A2.."/&gt;
 *     &lt;enumeration value="A2.1."/&gt;
 *     &lt;enumeration value="A2.1.0"/&gt;
 *     &lt;enumeration value="A2.2."/&gt;
 *     &lt;enumeration value="A2.2.0"/&gt;
 *     &lt;enumeration value="A2.3."/&gt;
 *     &lt;enumeration value="A2.3.0"/&gt;
 *     &lt;enumeration value="A2.4."/&gt;
 *     &lt;enumeration value="A2.4.0"/&gt;
 *     &lt;enumeration value="A3.."/&gt;
 *     &lt;enumeration value="A3.1."/&gt;
 *     &lt;enumeration value="A3.1.1"/&gt;
 *     &lt;enumeration value="A3.1.2"/&gt;
 *     &lt;enumeration value="A3.2."/&gt;
 *     &lt;enumeration value="A3.2.1"/&gt;
 *     &lt;enumeration value="A3.2.2"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="B5.."/&gt;
 *     &lt;enumeration value="B5.1."/&gt;
 *     &lt;enumeration value="B5.1.0"/&gt;
 *     &lt;enumeration value="B5.2."/&gt;
 *     &lt;enumeration value="B5.2.0"/&gt;
 *     &lt;enumeration value="B6.."/&gt;
 *     &lt;enumeration value="B6.1."/&gt;
 *     &lt;enumeration value="B6.1.0"/&gt;
 *     &lt;enumeration value="B6.2."/&gt;
 *     &lt;enumeration value="B6.2.0"/&gt;
 *     &lt;enumeration value="B7.."/&gt;
 *     &lt;enumeration value="B7.1."/&gt;
 *     &lt;enumeration value="B7.1.0"/&gt;
 *     &lt;enumeration value="B7.2."/&gt;
 *     &lt;enumeration value="B7.2.1"/&gt;
 *     &lt;enumeration value="B7.2.9"/&gt;
 *     &lt;enumeration value="B8.."/&gt;
 *     &lt;enumeration value="B8.1."/&gt;
 *     &lt;enumeration value="B8.1.1"/&gt;
 *     &lt;enumeration value="B8.1.2"/&gt;
 *     &lt;enumeration value="B8.9."/&gt;
 *     &lt;enumeration value="B8.9.1"/&gt;
 *     &lt;enumeration value="B8.9.2"/&gt;
 *     &lt;enumeration value="B8.9.3"/&gt;
 *     &lt;enumeration value="B8.9.9"/&gt;
 *     &lt;enumeration value="B9.."/&gt;
 *     &lt;enumeration value="B9.1."/&gt;
 *     &lt;enumeration value="B9.1.0"/&gt;
 *     &lt;enumeration value="B9.9."/&gt;
 *     &lt;enumeration value="B9.9.0"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="C10.."/&gt;
 *     &lt;enumeration value="C10.1."/&gt;
 *     &lt;enumeration value="C10.1.1"/&gt;
 *     &lt;enumeration value="C10.1.2"/&gt;
 *     &lt;enumeration value="C10.1.3"/&gt;
 *     &lt;enumeration value="C10.2."/&gt;
 *     &lt;enumeration value="C10.2.0"/&gt;
 *     &lt;enumeration value="C10.3."/&gt;
 *     &lt;enumeration value="C10.3.1"/&gt;
 *     &lt;enumeration value="C10.3.2"/&gt;
 *     &lt;enumeration value="C10.3.9"/&gt;
 *     &lt;enumeration value="C10.4."/&gt;
 *     &lt;enumeration value="C10.4.1"/&gt;
 *     &lt;enumeration value="C10.4.2"/&gt;
 *     &lt;enumeration value="C10.5."/&gt;
 *     &lt;enumeration value="C10.5.1"/&gt;
 *     &lt;enumeration value="C10.5.2"/&gt;
 *     &lt;enumeration value="C10.6."/&gt;
 *     &lt;enumeration value="C10.6.1"/&gt;
 *     &lt;enumeration value="C10.6.2"/&gt;
 *     &lt;enumeration value="C10.7."/&gt;
 *     &lt;enumeration value="C10.7.1"/&gt;
 *     &lt;enumeration value="C10.7.2"/&gt;
 *     &lt;enumeration value="C10.7.3"/&gt;
 *     &lt;enumeration value="C10.8."/&gt;
 *     &lt;enumeration value="C10.8.1"/&gt;
 *     &lt;enumeration value="C10.8.2"/&gt;
 *     &lt;enumeration value="C10.8.3"/&gt;
 *     &lt;enumeration value="C10.8.4"/&gt;
 *     &lt;enumeration value="C10.8.5"/&gt;
 *     &lt;enumeration value="C10.8.6"/&gt;
 *     &lt;enumeration value="C10.8.9"/&gt;
 *     &lt;enumeration value="C10.9."/&gt;
 *     &lt;enumeration value="C10.9.1"/&gt;
 *     &lt;enumeration value="C10.9.2"/&gt;
 *     &lt;enumeration value="C11.."/&gt;
 *     &lt;enumeration value="C11.0."/&gt;
 *     &lt;enumeration value="C11.0.1"/&gt;
 *     &lt;enumeration value="C11.0.2"/&gt;
 *     &lt;enumeration value="C11.0.3"/&gt;
 *     &lt;enumeration value="C11.0.4"/&gt;
 *     &lt;enumeration value="C11.0.5"/&gt;
 *     &lt;enumeration value="C11.0.6"/&gt;
 *     &lt;enumeration value="C11.0.7"/&gt;
 *     &lt;enumeration value="C12.."/&gt;
 *     &lt;enumeration value="C12.0."/&gt;
 *     &lt;enumeration value="C12.0.0"/&gt;
 *     &lt;enumeration value="C13.."/&gt;
 *     &lt;enumeration value="C13.1."/&gt;
 *     &lt;enumeration value="C13.1.0"/&gt;
 *     &lt;enumeration value="C13.2."/&gt;
 *     &lt;enumeration value="C13.2.0"/&gt;
 *     &lt;enumeration value="C13.3."/&gt;
 *     &lt;enumeration value="C13.3.0"/&gt;
 *     &lt;enumeration value="C13.9."/&gt;
 *     &lt;enumeration value="C13.9.1"/&gt;
 *     &lt;enumeration value="C13.9.2"/&gt;
 *     &lt;enumeration value="C13.9.3"/&gt;
 *     &lt;enumeration value="C13.9.4"/&gt;
 *     &lt;enumeration value="C13.9.5"/&gt;
 *     &lt;enumeration value="C13.9.6"/&gt;
 *     &lt;enumeration value="C13.9.9"/&gt;
 *     &lt;enumeration value="C14.."/&gt;
 *     &lt;enumeration value="C14.1."/&gt;
 *     &lt;enumeration value="C14.1.1"/&gt;
 *     &lt;enumeration value="C14.1.2"/&gt;
 *     &lt;enumeration value="C14.1.3"/&gt;
 *     &lt;enumeration value="C14.1.4"/&gt;
 *     &lt;enumeration value="C14.1.9"/&gt;
 *     &lt;enumeration value="C14.2."/&gt;
 *     &lt;enumeration value="C14.2.0"/&gt;
 *     &lt;enumeration value="C14.3."/&gt;
 *     &lt;enumeration value="C14.3.1"/&gt;
 *     &lt;enumeration value="C14.3.9"/&gt;
 *     &lt;enumeration value="C15.."/&gt;
 *     &lt;enumeration value="C15.1."/&gt;
 *     &lt;enumeration value="C15.1.1"/&gt;
 *     &lt;enumeration value="C15.1.2"/&gt;
 *     &lt;enumeration value="C15.2."/&gt;
 *     &lt;enumeration value="C15.2.0"/&gt;
 *     &lt;enumeration value="C16.."/&gt;
 *     &lt;enumeration value="C16.1."/&gt;
 *     &lt;enumeration value="C16.1.0"/&gt;
 *     &lt;enumeration value="C16.2."/&gt;
 *     &lt;enumeration value="C16.2.1"/&gt;
 *     &lt;enumeration value="C16.2.2"/&gt;
 *     &lt;enumeration value="C16.2.3"/&gt;
 *     &lt;enumeration value="C16.2.4"/&gt;
 *     &lt;enumeration value="C16.2.9"/&gt;
 *     &lt;enumeration value="C17.."/&gt;
 *     &lt;enumeration value="C17.1."/&gt;
 *     &lt;enumeration value="C17.1.1"/&gt;
 *     &lt;enumeration value="C17.1.2"/&gt;
 *     &lt;enumeration value="C17.2."/&gt;
 *     &lt;enumeration value="C17.2.1"/&gt;
 *     &lt;enumeration value="C17.2.2"/&gt;
 *     &lt;enumeration value="C17.2.3"/&gt;
 *     &lt;enumeration value="C17.2.4"/&gt;
 *     &lt;enumeration value="C17.2.9"/&gt;
 *     &lt;enumeration value="C18.."/&gt;
 *     &lt;enumeration value="C18.1."/&gt;
 *     &lt;enumeration value="C18.1.1"/&gt;
 *     &lt;enumeration value="C18.1.2"/&gt;
 *     &lt;enumeration value="C18.1.3"/&gt;
 *     &lt;enumeration value="C18.1.4"/&gt;
 *     &lt;enumeration value="C18.2."/&gt;
 *     &lt;enumeration value="C18.2.0"/&gt;
 *     &lt;enumeration value="C19.."/&gt;
 *     &lt;enumeration value="C19.1."/&gt;
 *     &lt;enumeration value="C19.1.0"/&gt;
 *     &lt;enumeration value="C19.2."/&gt;
 *     &lt;enumeration value="C19.2.0"/&gt;
 *     &lt;enumeration value="C20.."/&gt;
 *     &lt;enumeration value="C20.1."/&gt;
 *     &lt;enumeration value="C20.1.1"/&gt;
 *     &lt;enumeration value="C20.1.2"/&gt;
 *     &lt;enumeration value="C20.1.3"/&gt;
 *     &lt;enumeration value="C20.1.4"/&gt;
 *     &lt;enumeration value="C20.1.5"/&gt;
 *     &lt;enumeration value="C20.1.6"/&gt;
 *     &lt;enumeration value="C20.1.7"/&gt;
 *     &lt;enumeration value="C20.2."/&gt;
 *     &lt;enumeration value="C20.2.0"/&gt;
 *     &lt;enumeration value="C20.3."/&gt;
 *     &lt;enumeration value="C20.3.0"/&gt;
 *     &lt;enumeration value="C20.4."/&gt;
 *     &lt;enumeration value="C20.4.1"/&gt;
 *     &lt;enumeration value="C20.4.2"/&gt;
 *     &lt;enumeration value="C20.5."/&gt;
 *     &lt;enumeration value="C20.5.1"/&gt;
 *     &lt;enumeration value="C20.5.2"/&gt;
 *     &lt;enumeration value="C20.5.3"/&gt;
 *     &lt;enumeration value="C20.5.9"/&gt;
 *     &lt;enumeration value="C20.6."/&gt;
 *     &lt;enumeration value="C20.6.0"/&gt;
 *     &lt;enumeration value="C21.."/&gt;
 *     &lt;enumeration value="C21.1."/&gt;
 *     &lt;enumeration value="C21.1.0"/&gt;
 *     &lt;enumeration value="C21.2."/&gt;
 *     &lt;enumeration value="C21.2.0"/&gt;
 *     &lt;enumeration value="C22.."/&gt;
 *     &lt;enumeration value="C22.1."/&gt;
 *     &lt;enumeration value="C22.1.1"/&gt;
 *     &lt;enumeration value="C22.1.9"/&gt;
 *     &lt;enumeration value="C22.2."/&gt;
 *     &lt;enumeration value="C22.2.1"/&gt;
 *     &lt;enumeration value="C22.2.2"/&gt;
 *     &lt;enumeration value="C22.2.3"/&gt;
 *     &lt;enumeration value="C22.2.9"/&gt;
 *     &lt;enumeration value="C23.."/&gt;
 *     &lt;enumeration value="C23.1."/&gt;
 *     &lt;enumeration value="C23.1.1"/&gt;
 *     &lt;enumeration value="C23.1.2"/&gt;
 *     &lt;enumeration value="C23.1.3"/&gt;
 *     &lt;enumeration value="C23.1.4"/&gt;
 *     &lt;enumeration value="C23.1.9"/&gt;
 *     &lt;enumeration value="C23.2."/&gt;
 *     &lt;enumeration value="C23.2.0"/&gt;
 *     &lt;enumeration value="C23.3."/&gt;
 *     &lt;enumeration value="C23.3.1"/&gt;
 *     &lt;enumeration value="C23.3.2"/&gt;
 *     &lt;enumeration value="C23.4."/&gt;
 *     &lt;enumeration value="C23.4.1"/&gt;
 *     &lt;enumeration value="C23.4.2"/&gt;
 *     &lt;enumeration value="C23.4.3"/&gt;
 *     &lt;enumeration value="C23.4.4"/&gt;
 *     &lt;enumeration value="C23.4.9"/&gt;
 *     &lt;enumeration value="C23.5."/&gt;
 *     &lt;enumeration value="C23.5.1"/&gt;
 *     &lt;enumeration value="C23.5.2"/&gt;
 *     &lt;enumeration value="C23.6."/&gt;
 *     &lt;enumeration value="C23.6.1"/&gt;
 *     &lt;enumeration value="C23.6.2"/&gt;
 *     &lt;enumeration value="C23.6.3"/&gt;
 *     &lt;enumeration value="C23.6.4"/&gt;
 *     &lt;enumeration value="C23.6.5"/&gt;
 *     &lt;enumeration value="C23.6.9"/&gt;
 *     &lt;enumeration value="C23.7."/&gt;
 *     &lt;enumeration value="C23.7.0"/&gt;
 *     &lt;enumeration value="C23.9."/&gt;
 *     &lt;enumeration value="C23.9.1"/&gt;
 *     &lt;enumeration value="C23.9.9"/&gt;
 *     &lt;enumeration value="C24.."/&gt;
 *     &lt;enumeration value="C24.1."/&gt;
 *     &lt;enumeration value="C24.1.0"/&gt;
 *     &lt;enumeration value="C24.2."/&gt;
 *     &lt;enumeration value="C24.2.0"/&gt;
 *     &lt;enumeration value="C24.3."/&gt;
 *     &lt;enumeration value="C24.3.1"/&gt;
 *     &lt;enumeration value="C24.3.2"/&gt;
 *     &lt;enumeration value="C24.3.3"/&gt;
 *     &lt;enumeration value="C24.3.4"/&gt;
 *     &lt;enumeration value="C24.4."/&gt;
 *     &lt;enumeration value="C24.4.1"/&gt;
 *     &lt;enumeration value="C24.4.2"/&gt;
 *     &lt;enumeration value="C24.4.3"/&gt;
 *     &lt;enumeration value="C24.4.4"/&gt;
 *     &lt;enumeration value="C24.4.5"/&gt;
 *     &lt;enumeration value="C24.4.6"/&gt;
 *     &lt;enumeration value="C24.5."/&gt;
 *     &lt;enumeration value="C24.5.1"/&gt;
 *     &lt;enumeration value="C24.5.2"/&gt;
 *     &lt;enumeration value="C24.5.3"/&gt;
 *     &lt;enumeration value="C24.5.4"/&gt;
 *     &lt;enumeration value="C25.."/&gt;
 *     &lt;enumeration value="C25.1."/&gt;
 *     &lt;enumeration value="C25.1.1"/&gt;
 *     &lt;enumeration value="C25.1.2"/&gt;
 *     &lt;enumeration value="C25.2."/&gt;
 *     &lt;enumeration value="C25.2.1"/&gt;
 *     &lt;enumeration value="C25.2.9"/&gt;
 *     &lt;enumeration value="C25.3."/&gt;
 *     &lt;enumeration value="C25.3.0"/&gt;
 *     &lt;enumeration value="C25.4."/&gt;
 *     &lt;enumeration value="C25.4.0"/&gt;
 *     &lt;enumeration value="C25.5."/&gt;
 *     &lt;enumeration value="C25.5.0"/&gt;
 *     &lt;enumeration value="C25.6."/&gt;
 *     &lt;enumeration value="C25.6.1"/&gt;
 *     &lt;enumeration value="C25.6.2"/&gt;
 *     &lt;enumeration value="C25.7."/&gt;
 *     &lt;enumeration value="C25.7.1"/&gt;
 *     &lt;enumeration value="C25.7.2"/&gt;
 *     &lt;enumeration value="C25.7.3"/&gt;
 *     &lt;enumeration value="C25.9."/&gt;
 *     &lt;enumeration value="C25.9.1"/&gt;
 *     &lt;enumeration value="C25.9.2"/&gt;
 *     &lt;enumeration value="C25.9.3"/&gt;
 *     &lt;enumeration value="C25.9.4"/&gt;
 *     &lt;enumeration value="C25.9.9"/&gt;
 *     &lt;enumeration value="C26.."/&gt;
 *     &lt;enumeration value="C26.1."/&gt;
 *     &lt;enumeration value="C26.1.1"/&gt;
 *     &lt;enumeration value="C26.1.2"/&gt;
 *     &lt;enumeration value="C26.2."/&gt;
 *     &lt;enumeration value="C26.2.0"/&gt;
 *     &lt;enumeration value="C26.3."/&gt;
 *     &lt;enumeration value="C26.3.0"/&gt;
 *     &lt;enumeration value="C26.4."/&gt;
 *     &lt;enumeration value="C26.4.0"/&gt;
 *     &lt;enumeration value="C26.5."/&gt;
 *     &lt;enumeration value="C26.5.1"/&gt;
 *     &lt;enumeration value="C26.5.2"/&gt;
 *     &lt;enumeration value="C26.6."/&gt;
 *     &lt;enumeration value="C26.6.0"/&gt;
 *     &lt;enumeration value="C26.7."/&gt;
 *     &lt;enumeration value="C26.7.0"/&gt;
 *     &lt;enumeration value="C26.8."/&gt;
 *     &lt;enumeration value="C26.8.0"/&gt;
 *     &lt;enumeration value="C27.."/&gt;
 *     &lt;enumeration value="C27.1."/&gt;
 *     &lt;enumeration value="C27.1.1"/&gt;
 *     &lt;enumeration value="C27.1.2"/&gt;
 *     &lt;enumeration value="C27.2."/&gt;
 *     &lt;enumeration value="C27.2.0"/&gt;
 *     &lt;enumeration value="C27.3."/&gt;
 *     &lt;enumeration value="C27.3.1"/&gt;
 *     &lt;enumeration value="C27.3.2"/&gt;
 *     &lt;enumeration value="C27.3.3"/&gt;
 *     &lt;enumeration value="C27.4."/&gt;
 *     &lt;enumeration value="C27.4.0"/&gt;
 *     &lt;enumeration value="C27.5."/&gt;
 *     &lt;enumeration value="C27.5.1"/&gt;
 *     &lt;enumeration value="C27.5.2"/&gt;
 *     &lt;enumeration value="C27.9."/&gt;
 *     &lt;enumeration value="C27.9.0"/&gt;
 *     &lt;enumeration value="C28.."/&gt;
 *     &lt;enumeration value="C28.1."/&gt;
 *     &lt;enumeration value="C28.1.1"/&gt;
 *     &lt;enumeration value="C28.1.2"/&gt;
 *     &lt;enumeration value="C28.1.3"/&gt;
 *     &lt;enumeration value="C28.1.4"/&gt;
 *     &lt;enumeration value="C28.1.5"/&gt;
 *     &lt;enumeration value="C28.2."/&gt;
 *     &lt;enumeration value="C28.2.1"/&gt;
 *     &lt;enumeration value="C28.2.2"/&gt;
 *     &lt;enumeration value="C28.2.3"/&gt;
 *     &lt;enumeration value="C28.2.4"/&gt;
 *     &lt;enumeration value="C28.2.5"/&gt;
 *     &lt;enumeration value="C28.2.9"/&gt;
 *     &lt;enumeration value="C28.3."/&gt;
 *     &lt;enumeration value="C28.3.0"/&gt;
 *     &lt;enumeration value="C28.4."/&gt;
 *     &lt;enumeration value="C28.4.1"/&gt;
 *     &lt;enumeration value="C28.4.9"/&gt;
 *     &lt;enumeration value="C28.9."/&gt;
 *     &lt;enumeration value="C28.9.1"/&gt;
 *     &lt;enumeration value="C28.9.2"/&gt;
 *     &lt;enumeration value="C28.9.3"/&gt;
 *     &lt;enumeration value="C28.9.4"/&gt;
 *     &lt;enumeration value="C28.9.5"/&gt;
 *     &lt;enumeration value="C28.9.6"/&gt;
 *     &lt;enumeration value="C28.9.9"/&gt;
 *     &lt;enumeration value="C29.."/&gt;
 *     &lt;enumeration value="C29.1."/&gt;
 *     &lt;enumeration value="C29.1.0"/&gt;
 *     &lt;enumeration value="C29.2."/&gt;
 *     &lt;enumeration value="C29.2.0"/&gt;
 *     &lt;enumeration value="C29.3."/&gt;
 *     &lt;enumeration value="C29.3.1"/&gt;
 *     &lt;enumeration value="C29.3.2"/&gt;
 *     &lt;enumeration value="C30.."/&gt;
 *     &lt;enumeration value="C30.1."/&gt;
 *     &lt;enumeration value="C30.1.1"/&gt;
 *     &lt;enumeration value="C30.1.2"/&gt;
 *     &lt;enumeration value="C30.2."/&gt;
 *     &lt;enumeration value="C30.2.0"/&gt;
 *     &lt;enumeration value="C30.3."/&gt;
 *     &lt;enumeration value="C30.3.0"/&gt;
 *     &lt;enumeration value="C30.4."/&gt;
 *     &lt;enumeration value="C30.4.0"/&gt;
 *     &lt;enumeration value="C30.9."/&gt;
 *     &lt;enumeration value="C30.9.1"/&gt;
 *     &lt;enumeration value="C30.9.2"/&gt;
 *     &lt;enumeration value="C30.9.9"/&gt;
 *     &lt;enumeration value="C31.."/&gt;
 *     &lt;enumeration value="C31.0."/&gt;
 *     &lt;enumeration value="C31.0.1"/&gt;
 *     &lt;enumeration value="C31.0.2"/&gt;
 *     &lt;enumeration value="C31.0.3"/&gt;
 *     &lt;enumeration value="C31.0.9"/&gt;
 *     &lt;enumeration value="C32.."/&gt;
 *     &lt;enumeration value="C32.1."/&gt;
 *     &lt;enumeration value="C32.1.1"/&gt;
 *     &lt;enumeration value="C32.1.2"/&gt;
 *     &lt;enumeration value="C32.1.3"/&gt;
 *     &lt;enumeration value="C32.2."/&gt;
 *     &lt;enumeration value="C32.2.0"/&gt;
 *     &lt;enumeration value="C32.3."/&gt;
 *     &lt;enumeration value="C32.3.0"/&gt;
 *     &lt;enumeration value="C32.4."/&gt;
 *     &lt;enumeration value="C32.4.0"/&gt;
 *     &lt;enumeration value="C32.5."/&gt;
 *     &lt;enumeration value="C32.5.0"/&gt;
 *     &lt;enumeration value="C32.9."/&gt;
 *     &lt;enumeration value="C32.9.1"/&gt;
 *     &lt;enumeration value="C32.9.9"/&gt;
 *     &lt;enumeration value="C33.."/&gt;
 *     &lt;enumeration value="C33.1."/&gt;
 *     &lt;enumeration value="C33.1.1"/&gt;
 *     &lt;enumeration value="C33.1.2"/&gt;
 *     &lt;enumeration value="C33.1.3"/&gt;
 *     &lt;enumeration value="C33.1.4"/&gt;
 *     &lt;enumeration value="C33.1.5"/&gt;
 *     &lt;enumeration value="C33.1.6"/&gt;
 *     &lt;enumeration value="C33.1.7"/&gt;
 *     &lt;enumeration value="C33.1.9"/&gt;
 *     &lt;enumeration value="C33.2."/&gt;
 *     &lt;enumeration value="C33.2.0"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="D35.."/&gt;
 *     &lt;enumeration value="D35.1."/&gt;
 *     &lt;enumeration value="D35.1.1"/&gt;
 *     &lt;enumeration value="D35.1.2"/&gt;
 *     &lt;enumeration value="D35.1.3"/&gt;
 *     &lt;enumeration value="D35.1.4"/&gt;
 *     &lt;enumeration value="D35.2."/&gt;
 *     &lt;enumeration value="D35.2.1"/&gt;
 *     &lt;enumeration value="D35.2.2"/&gt;
 *     &lt;enumeration value="D35.2.3"/&gt;
 *     &lt;enumeration value="D35.3."/&gt;
 *     &lt;enumeration value="D35.3.0"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="E36.."/&gt;
 *     &lt;enumeration value="E36.0."/&gt;
 *     &lt;enumeration value="E36.0.0"/&gt;
 *     &lt;enumeration value="E37.."/&gt;
 *     &lt;enumeration value="E37.0."/&gt;
 *     &lt;enumeration value="E37.0.0"/&gt;
 *     &lt;enumeration value="E38.."/&gt;
 *     &lt;enumeration value="E38.1."/&gt;
 *     &lt;enumeration value="E38.1.1"/&gt;
 *     &lt;enumeration value="E38.1.2"/&gt;
 *     &lt;enumeration value="E38.2."/&gt;
 *     &lt;enumeration value="E38.2.1"/&gt;
 *     &lt;enumeration value="E38.2.2"/&gt;
 *     &lt;enumeration value="E38.3."/&gt;
 *     &lt;enumeration value="E38.3.1"/&gt;
 *     &lt;enumeration value="E38.3.2"/&gt;
 *     &lt;enumeration value="E39.."/&gt;
 *     &lt;enumeration value="E39.0."/&gt;
 *     &lt;enumeration value="E39.0.0"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="F41.."/&gt;
 *     &lt;enumeration value="F41.1."/&gt;
 *     &lt;enumeration value="F41.1.0"/&gt;
 *     &lt;enumeration value="F41.2."/&gt;
 *     &lt;enumeration value="F41.2.0"/&gt;
 *     &lt;enumeration value="F42.."/&gt;
 *     &lt;enumeration value="F42.1."/&gt;
 *     &lt;enumeration value="F42.1.1"/&gt;
 *     &lt;enumeration value="F42.1.2"/&gt;
 *     &lt;enumeration value="F42.1.3"/&gt;
 *     &lt;enumeration value="F42.2."/&gt;
 *     &lt;enumeration value="F42.2.1"/&gt;
 *     &lt;enumeration value="F42.2.2"/&gt;
 *     &lt;enumeration value="F42.9."/&gt;
 *     &lt;enumeration value="F42.9.1"/&gt;
 *     &lt;enumeration value="F42.9.9"/&gt;
 *     &lt;enumeration value="F43.."/&gt;
 *     &lt;enumeration value="F43.1."/&gt;
 *     &lt;enumeration value="F43.1.1"/&gt;
 *     &lt;enumeration value="F43.1.2"/&gt;
 *     &lt;enumeration value="F43.1.3"/&gt;
 *     &lt;enumeration value="F43.2."/&gt;
 *     &lt;enumeration value="F43.2.1"/&gt;
 *     &lt;enumeration value="F43.2.2"/&gt;
 *     &lt;enumeration value="F43.2.9"/&gt;
 *     &lt;enumeration value="F43.3."/&gt;
 *     &lt;enumeration value="F43.3.1"/&gt;
 *     &lt;enumeration value="F43.3.2"/&gt;
 *     &lt;enumeration value="F43.3.3"/&gt;
 *     &lt;enumeration value="F43.3.4"/&gt;
 *     &lt;enumeration value="F43.3.9"/&gt;
 *     &lt;enumeration value="F43.9."/&gt;
 *     &lt;enumeration value="F43.9.1"/&gt;
 *     &lt;enumeration value="F43.9.9"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="G45.."/&gt;
 *     &lt;enumeration value="G45.1."/&gt;
 *     &lt;enumeration value="G45.1.1"/&gt;
 *     &lt;enumeration value="G45.1.9"/&gt;
 *     &lt;enumeration value="G45.2."/&gt;
 *     &lt;enumeration value="G45.2.0"/&gt;
 *     &lt;enumeration value="G45.3."/&gt;
 *     &lt;enumeration value="G45.3.1"/&gt;
 *     &lt;enumeration value="G45.3.2"/&gt;
 *     &lt;enumeration value="G45.4."/&gt;
 *     &lt;enumeration value="G45.4.0"/&gt;
 *     &lt;enumeration value="G46.."/&gt;
 *     &lt;enumeration value="G46.1."/&gt;
 *     &lt;enumeration value="G46.1.1"/&gt;
 *     &lt;enumeration value="G46.1.2"/&gt;
 *     &lt;enumeration value="G46.1.3"/&gt;
 *     &lt;enumeration value="G46.1.4"/&gt;
 *     &lt;enumeration value="G46.1.5"/&gt;
 *     &lt;enumeration value="G46.1.6"/&gt;
 *     &lt;enumeration value="G46.1.7"/&gt;
 *     &lt;enumeration value="G46.1.8"/&gt;
 *     &lt;enumeration value="G46.1.9"/&gt;
 *     &lt;enumeration value="G46.2."/&gt;
 *     &lt;enumeration value="G46.2.1"/&gt;
 *     &lt;enumeration value="G46.2.2"/&gt;
 *     &lt;enumeration value="G46.2.3"/&gt;
 *     &lt;enumeration value="G46.2.4"/&gt;
 *     &lt;enumeration value="G46.3."/&gt;
 *     &lt;enumeration value="G46.3.1"/&gt;
 *     &lt;enumeration value="G46.3.2"/&gt;
 *     &lt;enumeration value="G46.3.3"/&gt;
 *     &lt;enumeration value="G46.3.4"/&gt;
 *     &lt;enumeration value="G46.3.5"/&gt;
 *     &lt;enumeration value="G46.3.6"/&gt;
 *     &lt;enumeration value="G46.3.7"/&gt;
 *     &lt;enumeration value="G46.3.8"/&gt;
 *     &lt;enumeration value="G46.3.9"/&gt;
 *     &lt;enumeration value="G46.4."/&gt;
 *     &lt;enumeration value="G46.4.1"/&gt;
 *     &lt;enumeration value="G46.4.2"/&gt;
 *     &lt;enumeration value="G46.4.3"/&gt;
 *     &lt;enumeration value="G46.4.4"/&gt;
 *     &lt;enumeration value="G46.4.5"/&gt;
 *     &lt;enumeration value="G46.4.6"/&gt;
 *     &lt;enumeration value="G46.4.7"/&gt;
 *     &lt;enumeration value="G46.4.8"/&gt;
 *     &lt;enumeration value="G46.4.9"/&gt;
 *     &lt;enumeration value="G46.5."/&gt;
 *     &lt;enumeration value="G46.5.1"/&gt;
 *     &lt;enumeration value="G46.5.2"/&gt;
 *     &lt;enumeration value="G46.6."/&gt;
 *     &lt;enumeration value="G46.6.1"/&gt;
 *     &lt;enumeration value="G46.6.2"/&gt;
 *     &lt;enumeration value="G46.6.3"/&gt;
 *     &lt;enumeration value="G46.6.4"/&gt;
 *     &lt;enumeration value="G46.6.5"/&gt;
 *     &lt;enumeration value="G46.6.6"/&gt;
 *     &lt;enumeration value="G46.6.9"/&gt;
 *     &lt;enumeration value="G46.7."/&gt;
 *     &lt;enumeration value="G46.7.1"/&gt;
 *     &lt;enumeration value="G46.7.2"/&gt;
 *     &lt;enumeration value="G46.7.3"/&gt;
 *     &lt;enumeration value="G46.7.4"/&gt;
 *     &lt;enumeration value="G46.7.5"/&gt;
 *     &lt;enumeration value="G46.7.6"/&gt;
 *     &lt;enumeration value="G46.7.7"/&gt;
 *     &lt;enumeration value="G46.9."/&gt;
 *     &lt;enumeration value="G46.9.0"/&gt;
 *     &lt;enumeration value="G47.."/&gt;
 *     &lt;enumeration value="G47.1."/&gt;
 *     &lt;enumeration value="G47.1.1"/&gt;
 *     &lt;enumeration value="G47.1.9"/&gt;
 *     &lt;enumeration value="G47.2."/&gt;
 *     &lt;enumeration value="G47.2.1"/&gt;
 *     &lt;enumeration value="G47.2.2"/&gt;
 *     &lt;enumeration value="G47.2.3"/&gt;
 *     &lt;enumeration value="G47.2.4"/&gt;
 *     &lt;enumeration value="G47.2.5"/&gt;
 *     &lt;enumeration value="G47.2.6"/&gt;
 *     &lt;enumeration value="G47.2.9"/&gt;
 *     &lt;enumeration value="G47.3."/&gt;
 *     &lt;enumeration value="G47.3.0"/&gt;
 *     &lt;enumeration value="G47.4."/&gt;
 *     &lt;enumeration value="G47.4.1"/&gt;
 *     &lt;enumeration value="G47.4.2"/&gt;
 *     &lt;enumeration value="G47.4.3"/&gt;
 *     &lt;enumeration value="G47.5."/&gt;
 *     &lt;enumeration value="G47.5.1"/&gt;
 *     &lt;enumeration value="G47.5.2"/&gt;
 *     &lt;enumeration value="G47.5.3"/&gt;
 *     &lt;enumeration value="G47.5.4"/&gt;
 *     &lt;enumeration value="G47.5.9"/&gt;
 *     &lt;enumeration value="G47.6."/&gt;
 *     &lt;enumeration value="G47.6.1"/&gt;
 *     &lt;enumeration value="G47.6.2"/&gt;
 *     &lt;enumeration value="G47.6.3"/&gt;
 *     &lt;enumeration value="G47.6.4"/&gt;
 *     &lt;enumeration value="G47.6.5"/&gt;
 *     &lt;enumeration value="G47.7."/&gt;
 *     &lt;enumeration value="G47.7.1"/&gt;
 *     &lt;enumeration value="G47.7.2"/&gt;
 *     &lt;enumeration value="G47.7.3"/&gt;
 *     &lt;enumeration value="G47.7.4"/&gt;
 *     &lt;enumeration value="G47.7.5"/&gt;
 *     &lt;enumeration value="G47.7.6"/&gt;
 *     &lt;enumeration value="G47.7.7"/&gt;
 *     &lt;enumeration value="G47.7.8"/&gt;
 *     &lt;enumeration value="G47.7.9"/&gt;
 *     &lt;enumeration value="G47.8."/&gt;
 *     &lt;enumeration value="G47.8.1"/&gt;
 *     &lt;enumeration value="G47.8.2"/&gt;
 *     &lt;enumeration value="G47.8.9"/&gt;
 *     &lt;enumeration value="G47.9."/&gt;
 *     &lt;enumeration value="G47.9.1"/&gt;
 *     &lt;enumeration value="G47.9.9"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="H49.."/&gt;
 *     &lt;enumeration value="H49.1."/&gt;
 *     &lt;enumeration value="H49.1.0"/&gt;
 *     &lt;enumeration value="H49.2."/&gt;
 *     &lt;enumeration value="H49.2.0"/&gt;
 *     &lt;enumeration value="H49.3."/&gt;
 *     &lt;enumeration value="H49.3.1"/&gt;
 *     &lt;enumeration value="H49.3.2"/&gt;
 *     &lt;enumeration value="H49.3.9"/&gt;
 *     &lt;enumeration value="H49.4."/&gt;
 *     &lt;enumeration value="H49.4.1"/&gt;
 *     &lt;enumeration value="H49.4.2"/&gt;
 *     &lt;enumeration value="H49.5."/&gt;
 *     &lt;enumeration value="H49.5.0"/&gt;
 *     &lt;enumeration value="H50.."/&gt;
 *     &lt;enumeration value="H50.1."/&gt;
 *     &lt;enumeration value="H50.1.0"/&gt;
 *     &lt;enumeration value="H50.2."/&gt;
 *     &lt;enumeration value="H50.2.0"/&gt;
 *     &lt;enumeration value="H50.3."/&gt;
 *     &lt;enumeration value="H50.3.0"/&gt;
 *     &lt;enumeration value="H50.4."/&gt;
 *     &lt;enumeration value="H50.4.0"/&gt;
 *     &lt;enumeration value="H51.."/&gt;
 *     &lt;enumeration value="H51.1."/&gt;
 *     &lt;enumeration value="H51.1.0"/&gt;
 *     &lt;enumeration value="H51.2."/&gt;
 *     &lt;enumeration value="H51.2.1"/&gt;
 *     &lt;enumeration value="H51.2.2"/&gt;
 *     &lt;enumeration value="H52.."/&gt;
 *     &lt;enumeration value="H52.1."/&gt;
 *     &lt;enumeration value="H52.1.0"/&gt;
 *     &lt;enumeration value="H52.2."/&gt;
 *     &lt;enumeration value="H52.2.1"/&gt;
 *     &lt;enumeration value="H52.2.2"/&gt;
 *     &lt;enumeration value="H52.2.3"/&gt;
 *     &lt;enumeration value="H52.2.4"/&gt;
 *     &lt;enumeration value="H52.2.9"/&gt;
 *     &lt;enumeration value="H53.."/&gt;
 *     &lt;enumeration value="H53.1."/&gt;
 *     &lt;enumeration value="H53.1.0"/&gt;
 *     &lt;enumeration value="H53.2."/&gt;
 *     &lt;enumeration value="H53.2.0"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="I55.."/&gt;
 *     &lt;enumeration value="I55.1."/&gt;
 *     &lt;enumeration value="I55.1.0"/&gt;
 *     &lt;enumeration value="I55.2."/&gt;
 *     &lt;enumeration value="I55.2.0"/&gt;
 *     &lt;enumeration value="I55.3."/&gt;
 *     &lt;enumeration value="I55.3.0"/&gt;
 *     &lt;enumeration value="I55.9."/&gt;
 *     &lt;enumeration value="I55.9.0"/&gt;
 *     &lt;enumeration value="I56.."/&gt;
 *     &lt;enumeration value="I56.1."/&gt;
 *     &lt;enumeration value="I56.1.0"/&gt;
 *     &lt;enumeration value="I56.2."/&gt;
 *     &lt;enumeration value="I56.2.1"/&gt;
 *     &lt;enumeration value="I56.2.9"/&gt;
 *     &lt;enumeration value="I56.3."/&gt;
 *     &lt;enumeration value="I56.3.0"/&gt;
 *     &lt;enumeration value="J"/&gt;
 *     &lt;enumeration value="J58.."/&gt;
 *     &lt;enumeration value="J58.1."/&gt;
 *     &lt;enumeration value="J58.1.1"/&gt;
 *     &lt;enumeration value="J58.1.2"/&gt;
 *     &lt;enumeration value="J58.1.3"/&gt;
 *     &lt;enumeration value="J58.1.4"/&gt;
 *     &lt;enumeration value="J58.1.9"/&gt;
 *     &lt;enumeration value="J58.2."/&gt;
 *     &lt;enumeration value="J58.2.1"/&gt;
 *     &lt;enumeration value="J58.2.9"/&gt;
 *     &lt;enumeration value="J59.."/&gt;
 *     &lt;enumeration value="J59.1."/&gt;
 *     &lt;enumeration value="J59.1.1"/&gt;
 *     &lt;enumeration value="J59.1.2"/&gt;
 *     &lt;enumeration value="J59.1.3"/&gt;
 *     &lt;enumeration value="J59.1.4"/&gt;
 *     &lt;enumeration value="J59.2."/&gt;
 *     &lt;enumeration value="J59.2.0"/&gt;
 *     &lt;enumeration value="J60.."/&gt;
 *     &lt;enumeration value="J60.1."/&gt;
 *     &lt;enumeration value="J60.1.0"/&gt;
 *     &lt;enumeration value="J60.2."/&gt;
 *     &lt;enumeration value="J60.2.0"/&gt;
 *     &lt;enumeration value="J61.."/&gt;
 *     &lt;enumeration value="J61.1."/&gt;
 *     &lt;enumeration value="J61.1.0"/&gt;
 *     &lt;enumeration value="J61.2."/&gt;
 *     &lt;enumeration value="J61.2.0"/&gt;
 *     &lt;enumeration value="J61.3."/&gt;
 *     &lt;enumeration value="J61.3.0"/&gt;
 *     &lt;enumeration value="J61.9."/&gt;
 *     &lt;enumeration value="J61.9.0"/&gt;
 *     &lt;enumeration value="J62.."/&gt;
 *     &lt;enumeration value="J62.0."/&gt;
 *     &lt;enumeration value="J62.0.1"/&gt;
 *     &lt;enumeration value="J62.0.2"/&gt;
 *     &lt;enumeration value="J62.0.3"/&gt;
 *     &lt;enumeration value="J62.0.9"/&gt;
 *     &lt;enumeration value="J63.."/&gt;
 *     &lt;enumeration value="J63.1."/&gt;
 *     &lt;enumeration value="J63.1.1"/&gt;
 *     &lt;enumeration value="J63.1.2"/&gt;
 *     &lt;enumeration value="J63.9."/&gt;
 *     &lt;enumeration value="J63.9.1"/&gt;
 *     &lt;enumeration value="J63.9.9"/&gt;
 *     &lt;enumeration value="K"/&gt;
 *     &lt;enumeration value="K64.."/&gt;
 *     &lt;enumeration value="K64.1."/&gt;
 *     &lt;enumeration value="K64.1.1"/&gt;
 *     &lt;enumeration value="K64.1.9"/&gt;
 *     &lt;enumeration value="K64.2."/&gt;
 *     &lt;enumeration value="K64.2.0"/&gt;
 *     &lt;enumeration value="K64.3."/&gt;
 *     &lt;enumeration value="K64.3.0"/&gt;
 *     &lt;enumeration value="K64.9."/&gt;
 *     &lt;enumeration value="K64.9.1"/&gt;
 *     &lt;enumeration value="K64.9.2"/&gt;
 *     &lt;enumeration value="K64.9.9"/&gt;
 *     &lt;enumeration value="K65.."/&gt;
 *     &lt;enumeration value="K65.1."/&gt;
 *     &lt;enumeration value="K65.1.1"/&gt;
 *     &lt;enumeration value="K65.1.2"/&gt;
 *     &lt;enumeration value="K65.2."/&gt;
 *     &lt;enumeration value="K65.2.0"/&gt;
 *     &lt;enumeration value="K65.3."/&gt;
 *     &lt;enumeration value="K65.3.0"/&gt;
 *     &lt;enumeration value="K66.."/&gt;
 *     &lt;enumeration value="K66.1."/&gt;
 *     &lt;enumeration value="K66.1.1"/&gt;
 *     &lt;enumeration value="K66.1.2"/&gt;
 *     &lt;enumeration value="K66.1.9"/&gt;
 *     &lt;enumeration value="K66.2."/&gt;
 *     &lt;enumeration value="K66.2.1"/&gt;
 *     &lt;enumeration value="K66.2.2"/&gt;
 *     &lt;enumeration value="K66.2.9"/&gt;
 *     &lt;enumeration value="K66.3."/&gt;
 *     &lt;enumeration value="K66.3.0"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="L68.."/&gt;
 *     &lt;enumeration value="L68.1."/&gt;
 *     &lt;enumeration value="L68.1.0"/&gt;
 *     &lt;enumeration value="L68.2."/&gt;
 *     &lt;enumeration value="L68.2.0"/&gt;
 *     &lt;enumeration value="L68.3."/&gt;
 *     &lt;enumeration value="L68.3.1"/&gt;
 *     &lt;enumeration value="L68.3.2"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="M69.."/&gt;
 *     &lt;enumeration value="M69.1."/&gt;
 *     &lt;enumeration value="M69.1.0"/&gt;
 *     &lt;enumeration value="M69.2."/&gt;
 *     &lt;enumeration value="M69.2.0"/&gt;
 *     &lt;enumeration value="M70.."/&gt;
 *     &lt;enumeration value="M70.1."/&gt;
 *     &lt;enumeration value="M70.1.0"/&gt;
 *     &lt;enumeration value="M70.2."/&gt;
 *     &lt;enumeration value="M70.2.1"/&gt;
 *     &lt;enumeration value="M70.2.2"/&gt;
 *     &lt;enumeration value="M71.."/&gt;
 *     &lt;enumeration value="M71.1."/&gt;
 *     &lt;enumeration value="M71.1.1"/&gt;
 *     &lt;enumeration value="M71.1.2"/&gt;
 *     &lt;enumeration value="M71.2."/&gt;
 *     &lt;enumeration value="M71.2.0"/&gt;
 *     &lt;enumeration value="M72.."/&gt;
 *     &lt;enumeration value="M72.1."/&gt;
 *     &lt;enumeration value="M72.1.1"/&gt;
 *     &lt;enumeration value="M72.1.9"/&gt;
 *     &lt;enumeration value="M72.2."/&gt;
 *     &lt;enumeration value="M72.2.0"/&gt;
 *     &lt;enumeration value="M73.."/&gt;
 *     &lt;enumeration value="M73.1."/&gt;
 *     &lt;enumeration value="M73.1.1"/&gt;
 *     &lt;enumeration value="M73.1.2"/&gt;
 *     &lt;enumeration value="M73.2."/&gt;
 *     &lt;enumeration value="M73.2.0"/&gt;
 *     &lt;enumeration value="M74.."/&gt;
 *     &lt;enumeration value="M74.1."/&gt;
 *     &lt;enumeration value="M74.1.0"/&gt;
 *     &lt;enumeration value="M74.2."/&gt;
 *     &lt;enumeration value="M74.2.0"/&gt;
 *     &lt;enumeration value="M74.3."/&gt;
 *     &lt;enumeration value="M74.3.0"/&gt;
 *     &lt;enumeration value="M74.9."/&gt;
 *     &lt;enumeration value="M74.9.0"/&gt;
 *     &lt;enumeration value="M75.."/&gt;
 *     &lt;enumeration value="M75.0."/&gt;
 *     &lt;enumeration value="M75.0.0"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="N77.."/&gt;
 *     &lt;enumeration value="N77.1."/&gt;
 *     &lt;enumeration value="N77.1.1"/&gt;
 *     &lt;enumeration value="N77.1.2"/&gt;
 *     &lt;enumeration value="N77.2."/&gt;
 *     &lt;enumeration value="N77.2.1"/&gt;
 *     &lt;enumeration value="N77.2.2"/&gt;
 *     &lt;enumeration value="N77.2.9"/&gt;
 *     &lt;enumeration value="N77.3."/&gt;
 *     &lt;enumeration value="N77.3.1"/&gt;
 *     &lt;enumeration value="N77.3.2"/&gt;
 *     &lt;enumeration value="N77.3.3"/&gt;
 *     &lt;enumeration value="N77.3.4"/&gt;
 *     &lt;enumeration value="N77.3.5"/&gt;
 *     &lt;enumeration value="N77.3.9"/&gt;
 *     &lt;enumeration value="N77.4."/&gt;
 *     &lt;enumeration value="N77.4.0"/&gt;
 *     &lt;enumeration value="N78.."/&gt;
 *     &lt;enumeration value="N78.1."/&gt;
 *     &lt;enumeration value="N78.1.0"/&gt;
 *     &lt;enumeration value="N78.2."/&gt;
 *     &lt;enumeration value="N78.2.0"/&gt;
 *     &lt;enumeration value="N78.3."/&gt;
 *     &lt;enumeration value="N78.3.0"/&gt;
 *     &lt;enumeration value="N79.."/&gt;
 *     &lt;enumeration value="N79.1."/&gt;
 *     &lt;enumeration value="N79.1.1"/&gt;
 *     &lt;enumeration value="N79.1.2"/&gt;
 *     &lt;enumeration value="N79.9."/&gt;
 *     &lt;enumeration value="N79.9.0"/&gt;
 *     &lt;enumeration value="N80.."/&gt;
 *     &lt;enumeration value="N80.1."/&gt;
 *     &lt;enumeration value="N80.1.0"/&gt;
 *     &lt;enumeration value="N80.2."/&gt;
 *     &lt;enumeration value="N80.2.0"/&gt;
 *     &lt;enumeration value="N80.3."/&gt;
 *     &lt;enumeration value="N80.3.0"/&gt;
 *     &lt;enumeration value="N81.."/&gt;
 *     &lt;enumeration value="N81.1."/&gt;
 *     &lt;enumeration value="N81.1.0"/&gt;
 *     &lt;enumeration value="N81.2."/&gt;
 *     &lt;enumeration value="N81.2.1"/&gt;
 *     &lt;enumeration value="N81.2.2"/&gt;
 *     &lt;enumeration value="N81.2.9"/&gt;
 *     &lt;enumeration value="N81.3."/&gt;
 *     &lt;enumeration value="N81.3.0"/&gt;
 *     &lt;enumeration value="N82.."/&gt;
 *     &lt;enumeration value="N82.1."/&gt;
 *     &lt;enumeration value="N82.1.1"/&gt;
 *     &lt;enumeration value="N82.1.9"/&gt;
 *     &lt;enumeration value="N82.2."/&gt;
 *     &lt;enumeration value="N82.2.0"/&gt;
 *     &lt;enumeration value="N82.3."/&gt;
 *     &lt;enumeration value="N82.3.0"/&gt;
 *     &lt;enumeration value="N82.9."/&gt;
 *     &lt;enumeration value="N82.9.1"/&gt;
 *     &lt;enumeration value="N82.9.2"/&gt;
 *     &lt;enumeration value="N82.9.9"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="O84.."/&gt;
 *     &lt;enumeration value="O84.1."/&gt;
 *     &lt;enumeration value="O84.1.1"/&gt;
 *     &lt;enumeration value="O84.1.2"/&gt;
 *     &lt;enumeration value="O84.1.3"/&gt;
 *     &lt;enumeration value="O84.2."/&gt;
 *     &lt;enumeration value="O84.2.1"/&gt;
 *     &lt;enumeration value="O84.2.2"/&gt;
 *     &lt;enumeration value="O84.2.3"/&gt;
 *     &lt;enumeration value="O84.2.4"/&gt;
 *     &lt;enumeration value="O84.2.5"/&gt;
 *     &lt;enumeration value="O84.3."/&gt;
 *     &lt;enumeration value="O84.3.0"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="P85.."/&gt;
 *     &lt;enumeration value="P85.1."/&gt;
 *     &lt;enumeration value="P85.1.0"/&gt;
 *     &lt;enumeration value="P85.2."/&gt;
 *     &lt;enumeration value="P85.2.0"/&gt;
 *     &lt;enumeration value="P85.3."/&gt;
 *     &lt;enumeration value="P85.3.1"/&gt;
 *     &lt;enumeration value="P85.3.2"/&gt;
 *     &lt;enumeration value="P85.4."/&gt;
 *     &lt;enumeration value="P85.4.1"/&gt;
 *     &lt;enumeration value="P85.4.2"/&gt;
 *     &lt;enumeration value="P85.5."/&gt;
 *     &lt;enumeration value="P85.5.1"/&gt;
 *     &lt;enumeration value="P85.5.2"/&gt;
 *     &lt;enumeration value="P85.5.3"/&gt;
 *     &lt;enumeration value="P85.5.9"/&gt;
 *     &lt;enumeration value="P85.6."/&gt;
 *     &lt;enumeration value="P85.6.0"/&gt;
 *     &lt;enumeration value="Q"/&gt;
 *     &lt;enumeration value="Q86.."/&gt;
 *     &lt;enumeration value="Q86.1."/&gt;
 *     &lt;enumeration value="Q86.1.0"/&gt;
 *     &lt;enumeration value="Q86.2."/&gt;
 *     &lt;enumeration value="Q86.2.1"/&gt;
 *     &lt;enumeration value="Q86.2.2"/&gt;
 *     &lt;enumeration value="Q86.2.3"/&gt;
 *     &lt;enumeration value="Q86.9."/&gt;
 *     &lt;enumeration value="Q86.9.0"/&gt;
 *     &lt;enumeration value="Q87.."/&gt;
 *     &lt;enumeration value="Q87.1."/&gt;
 *     &lt;enumeration value="Q87.1.0"/&gt;
 *     &lt;enumeration value="Q87.2."/&gt;
 *     &lt;enumeration value="Q87.2.0"/&gt;
 *     &lt;enumeration value="Q87.3."/&gt;
 *     &lt;enumeration value="Q87.3.0"/&gt;
 *     &lt;enumeration value="Q87.9."/&gt;
 *     &lt;enumeration value="Q87.9.0"/&gt;
 *     &lt;enumeration value="Q88.."/&gt;
 *     &lt;enumeration value="Q88.1."/&gt;
 *     &lt;enumeration value="Q88.1.0"/&gt;
 *     &lt;enumeration value="Q88.9."/&gt;
 *     &lt;enumeration value="Q88.9.1"/&gt;
 *     &lt;enumeration value="Q88.9.9"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="R90.."/&gt;
 *     &lt;enumeration value="R90.0."/&gt;
 *     &lt;enumeration value="R90.0.1"/&gt;
 *     &lt;enumeration value="R90.0.2"/&gt;
 *     &lt;enumeration value="R90.0.3"/&gt;
 *     &lt;enumeration value="R90.0.4"/&gt;
 *     &lt;enumeration value="R91.."/&gt;
 *     &lt;enumeration value="R91.0."/&gt;
 *     &lt;enumeration value="R91.0.1"/&gt;
 *     &lt;enumeration value="R91.0.2"/&gt;
 *     &lt;enumeration value="R91.0.3"/&gt;
 *     &lt;enumeration value="R91.0.4"/&gt;
 *     &lt;enumeration value="R92.."/&gt;
 *     &lt;enumeration value="R92.0."/&gt;
 *     &lt;enumeration value="R92.0.0"/&gt;
 *     &lt;enumeration value="R93.."/&gt;
 *     &lt;enumeration value="R93.1."/&gt;
 *     &lt;enumeration value="R93.1.1"/&gt;
 *     &lt;enumeration value="R93.1.2"/&gt;
 *     &lt;enumeration value="R93.1.3"/&gt;
 *     &lt;enumeration value="R93.1.9"/&gt;
 *     &lt;enumeration value="R93.2."/&gt;
 *     &lt;enumeration value="R93.2.1"/&gt;
 *     &lt;enumeration value="R93.2.9"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="S94.."/&gt;
 *     &lt;enumeration value="S94.1."/&gt;
 *     &lt;enumeration value="S94.1.1"/&gt;
 *     &lt;enumeration value="S94.1.2"/&gt;
 *     &lt;enumeration value="S94.2."/&gt;
 *     &lt;enumeration value="S94.2.0"/&gt;
 *     &lt;enumeration value="S94.9."/&gt;
 *     &lt;enumeration value="S94.9.1"/&gt;
 *     &lt;enumeration value="S94.9.2"/&gt;
 *     &lt;enumeration value="S94.9.9"/&gt;
 *     &lt;enumeration value="S95.."/&gt;
 *     &lt;enumeration value="S95.1."/&gt;
 *     &lt;enumeration value="S95.1.1"/&gt;
 *     &lt;enumeration value="S95.1.2"/&gt;
 *     &lt;enumeration value="S95.2."/&gt;
 *     &lt;enumeration value="S95.2.1"/&gt;
 *     &lt;enumeration value="S95.2.2"/&gt;
 *     &lt;enumeration value="S95.2.3"/&gt;
 *     &lt;enumeration value="S95.2.4"/&gt;
 *     &lt;enumeration value="S95.2.5"/&gt;
 *     &lt;enumeration value="S95.2.9"/&gt;
 *     &lt;enumeration value="S96.."/&gt;
 *     &lt;enumeration value="S96.0."/&gt;
 *     &lt;enumeration value="S96.0.1"/&gt;
 *     &lt;enumeration value="S96.0.2"/&gt;
 *     &lt;enumeration value="S96.0.3"/&gt;
 *     &lt;enumeration value="S96.0.4"/&gt;
 *     &lt;enumeration value="S96.0.9"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="T97.."/&gt;
 *     &lt;enumeration value="T97.0."/&gt;
 *     &lt;enumeration value="T97.0.0"/&gt;
 *     &lt;enumeration value="T98.."/&gt;
 *     &lt;enumeration value="T98.1."/&gt;
 *     &lt;enumeration value="T98.1.0"/&gt;
 *     &lt;enumeration value="T98.2."/&gt;
 *     &lt;enumeration value="T98.2.0"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="U99.."/&gt;
 *     &lt;enumeration value="U99.0."/&gt;
 *     &lt;enumeration value="U99.0.0"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "sector", namespace = "http://europass.cedefop.europa.eu/NACE")
@XmlEnum
public enum Sector {


    /**
     * Agriculture, forestry and fishing
     * 
     */
    A("A"),

    /**
     * Crop and animal production, hunting and related service activities
     * 
     */
    @XmlEnumValue("A1..")
    A_1("A1.."),

    /**
     * Growing of non
     * 
     */
    @XmlEnumValue("A1.1.")
    A_1_1("A1.1."),

    /**
     * Growing of cereals (except rice), leguminous crops and oil seeds
     * 
     */
    @XmlEnumValue("A1.1.1")
    A_1_1_1("A1.1.1"),

    /**
     * Growing of rice
     * 
     */
    @XmlEnumValue("A1.1.2")
    A_1_1_2("A1.1.2"),

    /**
     * Growing of vegetables and melons, roots and tubers
     * 
     */
    @XmlEnumValue("A1.1.3")
    A_1_1_3("A1.1.3"),

    /**
     * Growing of sugar cane
     * 
     */
    @XmlEnumValue("A1.1.4")
    A_1_1_4("A1.1.4"),

    /**
     * Growing of tobacco
     * 
     */
    @XmlEnumValue("A1.1.5")
    A_1_1_5("A1.1.5"),

    /**
     * Growing of fibre crops
     * 
     */
    @XmlEnumValue("A1.1.6")
    A_1_1_6("A1.1.6"),

    /**
     * Growing of other non
     * 
     */
    @XmlEnumValue("A1.1.9")
    A_1_1_9("A1.1.9"),

    /**
     * Growing of perennial crops
     * 
     */
    @XmlEnumValue("A1.2.")
    A_1_2("A1.2."),

    /**
     * Growing of grapes
     * 
     */
    @XmlEnumValue("A1.2.1")
    A_1_2_1("A1.2.1"),

    /**
     * Growing of tropical and subtropical fruits
     * 
     */
    @XmlEnumValue("A1.2.2")
    A_1_2_2("A1.2.2"),

    /**
     * Growing of citrus fruits
     * 
     */
    @XmlEnumValue("A1.2.3")
    A_1_2_3("A1.2.3"),

    /**
     * Growing of pome fruits and stone fruits
     * 
     */
    @XmlEnumValue("A1.2.4")
    A_1_2_4("A1.2.4"),

    /**
     * Growing of other tree and bush fruits and nuts
     * 
     */
    @XmlEnumValue("A1.2.5")
    A_1_2_5("A1.2.5"),

    /**
     * Growing of oleaginous fruits
     * 
     */
    @XmlEnumValue("A1.2.6")
    A_1_2_6("A1.2.6"),

    /**
     * Growing of beverage crops
     * 
     */
    @XmlEnumValue("A1.2.7")
    A_1_2_7("A1.2.7"),

    /**
     * Growing of spices, aromatic, drug and pharmaceutical crops
     * 
     */
    @XmlEnumValue("A1.2.8")
    A_1_2_8("A1.2.8"),

    /**
     * Growing of other perennial crops
     * 
     */
    @XmlEnumValue("A1.2.9")
    A_1_2_9("A1.2.9"),

    /**
     * Plant propagation
     * 
     */
    @XmlEnumValue("A1.3.")
    A_1_3("A1.3."),

    /**
     * Plant propagation
     * 
     */
    @XmlEnumValue("A1.3.0")
    A_1_3_0("A1.3.0"),

    /**
     * Animal production
     * 
     */
    @XmlEnumValue("A1.4.")
    A_1_4("A1.4."),

    /**
     * Raising of dairy cattle
     * 
     */
    @XmlEnumValue("A1.4.1")
    A_1_4_1("A1.4.1"),

    /**
     * Raising of other cattle and buffaloes
     * 
     */
    @XmlEnumValue("A1.4.2")
    A_1_4_2("A1.4.2"),

    /**
     * Raising of horses and other equines
     * 
     */
    @XmlEnumValue("A1.4.3")
    A_1_4_3("A1.4.3"),

    /**
     * Raising of camels and camelids
     * 
     */
    @XmlEnumValue("A1.4.4")
    A_1_4_4("A1.4.4"),

    /**
     * Raising of sheep and goats
     * 
     */
    @XmlEnumValue("A1.4.5")
    A_1_4_5("A1.4.5"),

    /**
     * Raising of swine/pigs
     * 
     */
    @XmlEnumValue("A1.4.6")
    A_1_4_6("A1.4.6"),

    /**
     * Raising of poultry
     * 
     */
    @XmlEnumValue("A1.4.7")
    A_1_4_7("A1.4.7"),

    /**
     * Raising of other animals
     * 
     */
    @XmlEnumValue("A1.4.9")
    A_1_4_9("A1.4.9"),

    /**
     * Mixed farming
     * 
     */
    @XmlEnumValue("A1.5.")
    A_1_5("A1.5."),

    /**
     * Mixed farming
     * 
     */
    @XmlEnumValue("A1.5.0")
    A_1_5_0("A1.5.0"),

    /**
     * Support activities to agriculture and post
     * 
     */
    @XmlEnumValue("A1.6.")
    A_1_6("A1.6."),

    /**
     * Support activities for crop production
     * 
     */
    @XmlEnumValue("A1.6.1")
    A_1_6_1("A1.6.1"),

    /**
     * Support activities for animal production
     * 
     */
    @XmlEnumValue("A1.6.2")
    A_1_6_2("A1.6.2"),

    /**
     * Post
     * 
     */
    @XmlEnumValue("A1.6.3")
    A_1_6_3("A1.6.3"),

    /**
     * Seed processing for propagation
     * 
     */
    @XmlEnumValue("A1.6.4")
    A_1_6_4("A1.6.4"),

    /**
     * Hunting, trapping and related service activities
     * 
     */
    @XmlEnumValue("A1.7.")
    A_1_7("A1.7."),

    /**
     * Hunting, trapping and related service activities
     * 
     */
    @XmlEnumValue("A1.7.0")
    A_1_7_0("A1.7.0"),

    /**
     * Forestry and logging
     * 
     */
    @XmlEnumValue("A2..")
    A_2("A2.."),

    /**
     * Silviculture and other forestry activities
     * 
     */
    @XmlEnumValue("A2.1.")
    A_2_1("A2.1."),

    /**
     * Silviculture and other forestry activities
     * 
     */
    @XmlEnumValue("A2.1.0")
    A_2_1_0("A2.1.0"),

    /**
     * Logging
     * 
     */
    @XmlEnumValue("A2.2.")
    A_2_2("A2.2."),

    /**
     * Logging
     * 
     */
    @XmlEnumValue("A2.2.0")
    A_2_2_0("A2.2.0"),

    /**
     * Gathering of wild growing non
     * 
     */
    @XmlEnumValue("A2.3.")
    A_2_3("A2.3."),

    /**
     * Gathering of wild growing non
     * 
     */
    @XmlEnumValue("A2.3.0")
    A_2_3_0("A2.3.0"),

    /**
     * Support services to forestry
     * 
     */
    @XmlEnumValue("A2.4.")
    A_2_4("A2.4."),

    /**
     * Support services to forestry
     * 
     */
    @XmlEnumValue("A2.4.0")
    A_2_4_0("A2.4.0"),

    /**
     * Fishing and aquaculture
     * 
     */
    @XmlEnumValue("A3..")
    A_3("A3.."),

    /**
     * Fishing
     * 
     */
    @XmlEnumValue("A3.1.")
    A_3_1("A3.1."),

    /**
     * Marine fishing
     * 
     */
    @XmlEnumValue("A3.1.1")
    A_3_1_1("A3.1.1"),

    /**
     * Freshwater fishing
     * 
     */
    @XmlEnumValue("A3.1.2")
    A_3_1_2("A3.1.2"),

    /**
     * Aquaculture
     * 
     */
    @XmlEnumValue("A3.2.")
    A_3_2("A3.2."),

    /**
     * Marine aquaculture
     * 
     */
    @XmlEnumValue("A3.2.1")
    A_3_2_1("A3.2.1"),

    /**
     * Freshwater aquaculture
     * 
     */
    @XmlEnumValue("A3.2.2")
    A_3_2_2("A3.2.2"),

    /**
     * Mining and quarrying
     * 
     */
    B("B"),

    /**
     * Mining of coal and lignite
     * 
     */
    @XmlEnumValue("B5..")
    B_5("B5.."),

    /**
     * Mining of hard coal
     * 
     */
    @XmlEnumValue("B5.1.")
    B_5_1("B5.1."),

    /**
     * Mining of hard coal
     * 
     */
    @XmlEnumValue("B5.1.0")
    B_5_1_0("B5.1.0"),

    /**
     * Mining of lignite
     * 
     */
    @XmlEnumValue("B5.2.")
    B_5_2("B5.2."),

    /**
     * Mining of lignite
     * 
     */
    @XmlEnumValue("B5.2.0")
    B_5_2_0("B5.2.0"),

    /**
     * Extraction of crude petroleum and natural gas
     * 
     */
    @XmlEnumValue("B6..")
    B_6("B6.."),

    /**
     * Extraction of crude petroleum
     * 
     */
    @XmlEnumValue("B6.1.")
    B_6_1("B6.1."),

    /**
     * Extraction of crude petroleum
     * 
     */
    @XmlEnumValue("B6.1.0")
    B_6_1_0("B6.1.0"),

    /**
     * Extraction of natural gas
     * 
     */
    @XmlEnumValue("B6.2.")
    B_6_2("B6.2."),

    /**
     * Extraction of natural gas
     * 
     */
    @XmlEnumValue("B6.2.0")
    B_6_2_0("B6.2.0"),

    /**
     * Mining of metal ores
     * 
     */
    @XmlEnumValue("B7..")
    B_7("B7.."),

    /**
     * Mining of iron ores
     * 
     */
    @XmlEnumValue("B7.1.")
    B_7_1("B7.1."),

    /**
     * Mining of iron ores
     * 
     */
    @XmlEnumValue("B7.1.0")
    B_7_1_0("B7.1.0"),

    /**
     * Mining of non
     * 
     */
    @XmlEnumValue("B7.2.")
    B_7_2("B7.2."),

    /**
     * Mining of uranium and thorium ores
     * 
     */
    @XmlEnumValue("B7.2.1")
    B_7_2_1("B7.2.1"),

    /**
     * Mining of other non
     * 
     */
    @XmlEnumValue("B7.2.9")
    B_7_2_9("B7.2.9"),

    /**
     * Other mining and quarrying
     * 
     */
    @XmlEnumValue("B8..")
    B_8("B8.."),

    /**
     * Quarrying of stone, sand and clay
     * 
     */
    @XmlEnumValue("B8.1.")
    B_8_1("B8.1."),

    /**
     * Quarrying of ornamental and building stone, limestone, gypsum, chalk and slate
     * 
     */
    @XmlEnumValue("B8.1.1")
    B_8_1_1("B8.1.1"),

    /**
     * Operation of gravel and sand pits; mining of clays and kaolin
     * 
     */
    @XmlEnumValue("B8.1.2")
    B_8_1_2("B8.1.2"),

    /**
     * Mining and quarrying n.e.c.
     * 
     */
    @XmlEnumValue("B8.9.")
    B_8_9("B8.9."),

    /**
     * Mining of chemical and fertiliser minerals
     * 
     */
    @XmlEnumValue("B8.9.1")
    B_8_9_1("B8.9.1"),

    /**
     * Extraction of peat
     * 
     */
    @XmlEnumValue("B8.9.2")
    B_8_9_2("B8.9.2"),

    /**
     * Extraction of salt
     * 
     */
    @XmlEnumValue("B8.9.3")
    B_8_9_3("B8.9.3"),

    /**
     * Other mining and quarrying n.e.c.
     * 
     */
    @XmlEnumValue("B8.9.9")
    B_8_9_9("B8.9.9"),

    /**
     * Mining support service activities
     * 
     */
    @XmlEnumValue("B9..")
    B_9("B9.."),

    /**
     * Support activities for petroleum and natural gas extraction
     * 
     */
    @XmlEnumValue("B9.1.")
    B_9_1("B9.1."),

    /**
     * Support activities for petroleum and natural gas extraction
     * 
     */
    @XmlEnumValue("B9.1.0")
    B_9_1_0("B9.1.0"),

    /**
     * Support activities for other mining and quarrying
     * 
     */
    @XmlEnumValue("B9.9.")
    B_9_9("B9.9."),

    /**
     * Support activities for other mining and quarrying
     * 
     */
    @XmlEnumValue("B9.9.0")
    B_9_9_0("B9.9.0"),

    /**
     * Manufacturing
     * 
     */
    C("C"),

    /**
     * Manufacture of food products
     * 
     */
    @XmlEnumValue("C10..")
    C_10("C10.."),

    /**
     * Processing and preserving of meat and production of meat products
     * 
     */
    @XmlEnumValue("C10.1.")
    C_10_1("C10.1."),

    /**
     * Processing and preserving of meat
     * 
     */
    @XmlEnumValue("C10.1.1")
    C_10_1_1("C10.1.1"),

    /**
     * Processing and preserving of poultry meat
     * 
     */
    @XmlEnumValue("C10.1.2")
    C_10_1_2("C10.1.2"),

    /**
     * Production of meat and poultry meat products
     * 
     */
    @XmlEnumValue("C10.1.3")
    C_10_1_3("C10.1.3"),

    /**
     * Processing and preserving of fish, crustaceans and molluscs
     * 
     */
    @XmlEnumValue("C10.2.")
    C_10_2("C10.2."),

    /**
     * Processing and preserving of fish, crustaceans and molluscs
     * 
     */
    @XmlEnumValue("C10.2.0")
    C_10_2_0("C10.2.0"),

    /**
     * Processing and preserving of fruit and vegetables
     * 
     */
    @XmlEnumValue("C10.3.")
    C_10_3("C10.3."),

    /**
     * Processing and preserving of potatoes
     * 
     */
    @XmlEnumValue("C10.3.1")
    C_10_3_1("C10.3.1"),

    /**
     * Manufacture of fruit and vegetable juice
     * 
     */
    @XmlEnumValue("C10.3.2")
    C_10_3_2("C10.3.2"),

    /**
     * Other processing and preserving of fruit and vegetables
     * 
     */
    @XmlEnumValue("C10.3.9")
    C_10_3_9("C10.3.9"),

    /**
     * Manufacture of vegetable and animal oils and fats
     * 
     */
    @XmlEnumValue("C10.4.")
    C_10_4("C10.4."),

    /**
     * Manufacture of oils and fats
     * 
     */
    @XmlEnumValue("C10.4.1")
    C_10_4_1("C10.4.1"),

    /**
     * Manufacture of margarine and similar edible fats
     * 
     */
    @XmlEnumValue("C10.4.2")
    C_10_4_2("C10.4.2"),

    /**
     * Manufacture of dairy products
     * 
     */
    @XmlEnumValue("C10.5.")
    C_10_5("C10.5."),

    /**
     * Operation of dairies and cheese making
     * 
     */
    @XmlEnumValue("C10.5.1")
    C_10_5_1("C10.5.1"),

    /**
     * Manufacture of ice cream
     * 
     */
    @XmlEnumValue("C10.5.2")
    C_10_5_2("C10.5.2"),

    /**
     * Manufacture of grain mill products, starches and starch products
     * 
     */
    @XmlEnumValue("C10.6.")
    C_10_6("C10.6."),

    /**
     * Manufacture of grain mill products
     * 
     */
    @XmlEnumValue("C10.6.1")
    C_10_6_1("C10.6.1"),

    /**
     * Manufacture of starches and starch products
     * 
     */
    @XmlEnumValue("C10.6.2")
    C_10_6_2("C10.6.2"),

    /**
     * Manufacture of bakery and farinaceous products
     * 
     */
    @XmlEnumValue("C10.7.")
    C_10_7("C10.7."),

    /**
     * Manufacture of bread; manufacture of fresh pastry goods and cakes
     * 
     */
    @XmlEnumValue("C10.7.1")
    C_10_7_1("C10.7.1"),

    /**
     * Manufacture of rusks and biscuits; manufacture of preserved pastry goods and cakes
     * 
     */
    @XmlEnumValue("C10.7.2")
    C_10_7_2("C10.7.2"),

    /**
     * Manufacture of macaroni, noodles, couscous and similar farinaceous products
     * 
     */
    @XmlEnumValue("C10.7.3")
    C_10_7_3("C10.7.3"),

    /**
     * Manufacture of other food products
     * 
     */
    @XmlEnumValue("C10.8.")
    C_10_8("C10.8."),

    /**
     * Manufacture of sugar
     * 
     */
    @XmlEnumValue("C10.8.1")
    C_10_8_1("C10.8.1"),

    /**
     * Manufacture of cocoa, chocolate and sugar confectionery
     * 
     */
    @XmlEnumValue("C10.8.2")
    C_10_8_2("C10.8.2"),

    /**
     * Processing of tea and coffee
     * 
     */
    @XmlEnumValue("C10.8.3")
    C_10_8_3("C10.8.3"),

    /**
     * Manufacture of condiments and seasonings
     * 
     */
    @XmlEnumValue("C10.8.4")
    C_10_8_4("C10.8.4"),

    /**
     * Manufacture of prepared meals and dishes
     * 
     */
    @XmlEnumValue("C10.8.5")
    C_10_8_5("C10.8.5"),

    /**
     * Manufacture of homogenised food preparations and dietetic food
     * 
     */
    @XmlEnumValue("C10.8.6")
    C_10_8_6("C10.8.6"),

    /**
     * Manufacture of other food products n.e.c.
     * 
     */
    @XmlEnumValue("C10.8.9")
    C_10_8_9("C10.8.9"),

    /**
     * Manufacture of prepared animal feeds
     * 
     */
    @XmlEnumValue("C10.9.")
    C_10_9("C10.9."),

    /**
     * Manufacture of prepared feeds for farm animals
     * 
     */
    @XmlEnumValue("C10.9.1")
    C_10_9_1("C10.9.1"),

    /**
     * Manufacture of prepared pet foods
     * 
     */
    @XmlEnumValue("C10.9.2")
    C_10_9_2("C10.9.2"),

    /**
     * Manufacture of beverages
     * 
     */
    @XmlEnumValue("C11..")
    C_11("C11.."),

    /**
     * Manufacture of beverages
     * 
     */
    @XmlEnumValue("C11.0.")
    C_11_0("C11.0."),

    /**
     * Distilling, rectifying and blending of spirits
     * 
     */
    @XmlEnumValue("C11.0.1")
    C_11_0_1("C11.0.1"),

    /**
     * Manufacture of wine from grape
     * 
     */
    @XmlEnumValue("C11.0.2")
    C_11_0_2("C11.0.2"),

    /**
     * Manufacture of cider and other fruit wines
     * 
     */
    @XmlEnumValue("C11.0.3")
    C_11_0_3("C11.0.3"),

    /**
     * Manufacture of other non
     * 
     */
    @XmlEnumValue("C11.0.4")
    C_11_0_4("C11.0.4"),

    /**
     * Manufacture of beer
     * 
     */
    @XmlEnumValue("C11.0.5")
    C_11_0_5("C11.0.5"),

    /**
     * Manufacture of malt
     * 
     */
    @XmlEnumValue("C11.0.6")
    C_11_0_6("C11.0.6"),

    /**
     * Manufacture of soft drinks; production of mineral waters and other bottled waters
     * 
     */
    @XmlEnumValue("C11.0.7")
    C_11_0_7("C11.0.7"),

    /**
     * Manufacture of tobacco products
     * 
     */
    @XmlEnumValue("C12..")
    C_12("C12.."),

    /**
     * Manufacture of tobacco products
     * 
     */
    @XmlEnumValue("C12.0.")
    C_12_0("C12.0."),

    /**
     * Manufacture of tobacco products
     * 
     */
    @XmlEnumValue("C12.0.0")
    C_12_0_0("C12.0.0"),

    /**
     * Manufacture of textiles
     * 
     */
    @XmlEnumValue("C13..")
    C_13("C13.."),

    /**
     * Preparation and spinning of textile fibres
     * 
     */
    @XmlEnumValue("C13.1.")
    C_13_1("C13.1."),

    /**
     * Preparation and spinning of textile fibres
     * 
     */
    @XmlEnumValue("C13.1.0")
    C_13_1_0("C13.1.0"),

    /**
     * Weaving of textiles
     * 
     */
    @XmlEnumValue("C13.2.")
    C_13_2("C13.2."),

    /**
     * Weaving of textiles
     * 
     */
    @XmlEnumValue("C13.2.0")
    C_13_2_0("C13.2.0"),

    /**
     * Finishing of textiles
     * 
     */
    @XmlEnumValue("C13.3.")
    C_13_3("C13.3."),

    /**
     * Finishing of textiles
     * 
     */
    @XmlEnumValue("C13.3.0")
    C_13_3_0("C13.3.0"),

    /**
     * Manufacture of other textiles
     * 
     */
    @XmlEnumValue("C13.9.")
    C_13_9("C13.9."),

    /**
     * Manufacture of knitted and crocheted fabrics
     * 
     */
    @XmlEnumValue("C13.9.1")
    C_13_9_1("C13.9.1"),

    /**
     * Manufacture of made
     * 
     */
    @XmlEnumValue("C13.9.2")
    C_13_9_2("C13.9.2"),

    /**
     * Manufacture of carpets and rugs
     * 
     */
    @XmlEnumValue("C13.9.3")
    C_13_9_3("C13.9.3"),

    /**
     * Manufacture of cordage, rope, twine and netting
     * 
     */
    @XmlEnumValue("C13.9.4")
    C_13_9_4("C13.9.4"),

    /**
     * Manufacture of non
     * 
     */
    @XmlEnumValue("C13.9.5")
    C_13_9_5("C13.9.5"),

    /**
     * Manufacture of other technical and industrial textiles
     * 
     */
    @XmlEnumValue("C13.9.6")
    C_13_9_6("C13.9.6"),

    /**
     * Manufacture of other textiles n.e.c.
     * 
     */
    @XmlEnumValue("C13.9.9")
    C_13_9_9("C13.9.9"),

    /**
     * Manufacture of wearing apparel
     * 
     */
    @XmlEnumValue("C14..")
    C_14("C14.."),

    /**
     * Manufacture of wearing apparel, except fur apparel
     * 
     */
    @XmlEnumValue("C14.1.")
    C_14_1("C14.1."),

    /**
     * Manufacture of leather clothes
     * 
     */
    @XmlEnumValue("C14.1.1")
    C_14_1_1("C14.1.1"),

    /**
     * Manufacture of workwear
     * 
     */
    @XmlEnumValue("C14.1.2")
    C_14_1_2("C14.1.2"),

    /**
     * Manufacture of other outerwear
     * 
     */
    @XmlEnumValue("C14.1.3")
    C_14_1_3("C14.1.3"),

    /**
     * Manufacture of underwear
     * 
     */
    @XmlEnumValue("C14.1.4")
    C_14_1_4("C14.1.4"),

    /**
     * Manufacture of other wearing apparel and accessories
     * 
     */
    @XmlEnumValue("C14.1.9")
    C_14_1_9("C14.1.9"),

    /**
     * Manufacture of articles of fur
     * 
     */
    @XmlEnumValue("C14.2.")
    C_14_2("C14.2."),

    /**
     * Manufacture of articles of fur
     * 
     */
    @XmlEnumValue("C14.2.0")
    C_14_2_0("C14.2.0"),

    /**
     * Manufacture of knitted and crocheted apparel
     * 
     */
    @XmlEnumValue("C14.3.")
    C_14_3("C14.3."),

    /**
     * Manufacture of knitted and crocheted hosiery
     * 
     */
    @XmlEnumValue("C14.3.1")
    C_14_3_1("C14.3.1"),

    /**
     * Manufacture of other knitted and crocheted apparel
     * 
     */
    @XmlEnumValue("C14.3.9")
    C_14_3_9("C14.3.9"),

    /**
     * Manufacture of leather and related products
     * 
     */
    @XmlEnumValue("C15..")
    C_15("C15.."),

    /**
     * Tanning and dressing of leather; manufacture of luggage, handbags, saddlery and harness; dressing and dyeing of fur
     * 
     */
    @XmlEnumValue("C15.1.")
    C_15_1("C15.1."),

    /**
     * Tanning and dressing of leather; dressing and dyeing of fur
     * 
     */
    @XmlEnumValue("C15.1.1")
    C_15_1_1("C15.1.1"),

    /**
     * Manufacture of luggage, handbags and the like, saddlery and harness
     * 
     */
    @XmlEnumValue("C15.1.2")
    C_15_1_2("C15.1.2"),

    /**
     * Manufacture of footwear
     * 
     */
    @XmlEnumValue("C15.2.")
    C_15_2("C15.2."),

    /**
     * Manufacture of footwear
     * 
     */
    @XmlEnumValue("C15.2.0")
    C_15_2_0("C15.2.0"),

    /**
     * Manufacture of wood and of products of wood and cork, except furniture; manufacture of articles of straw and plaiting materials
     * 
     */
    @XmlEnumValue("C16..")
    C_16("C16.."),

    /**
     * Sawmilling and planing of wood
     * 
     */
    @XmlEnumValue("C16.1.")
    C_16_1("C16.1."),

    /**
     * Sawmilling and planing of wood
     * 
     */
    @XmlEnumValue("C16.1.0")
    C_16_1_0("C16.1.0"),

    /**
     * Manufacture of products of wood, cork, straw and plaiting materials
     * 
     */
    @XmlEnumValue("C16.2.")
    C_16_2("C16.2."),

    /**
     * Manufacture of veneer sheets and wood
     * 
     */
    @XmlEnumValue("C16.2.1")
    C_16_2_1("C16.2.1"),

    /**
     * Manufacture of assembled parquet floors
     * 
     */
    @XmlEnumValue("C16.2.2")
    C_16_2_2("C16.2.2"),

    /**
     * Manufacture of other builders' carpentry and joinery
     * 
     */
    @XmlEnumValue("C16.2.3")
    C_16_2_3("C16.2.3"),

    /**
     * Manufacture of wooden containers
     * 
     */
    @XmlEnumValue("C16.2.4")
    C_16_2_4("C16.2.4"),

    /**
     * Manufacture of other products of wood; manufacture of articles of cork, straw and plaiting materials
     * 
     */
    @XmlEnumValue("C16.2.9")
    C_16_2_9("C16.2.9"),

    /**
     * Manufacture of paper and paper products
     * 
     */
    @XmlEnumValue("C17..")
    C_17("C17.."),

    /**
     * Manufacture of pulp, paper and paperboard
     * 
     */
    @XmlEnumValue("C17.1.")
    C_17_1("C17.1."),

    /**
     * Manufacture of pulp
     * 
     */
    @XmlEnumValue("C17.1.1")
    C_17_1_1("C17.1.1"),

    /**
     * Manufacture of paper and paperboard
     * 
     */
    @XmlEnumValue("C17.1.2")
    C_17_1_2("C17.1.2"),

    /**
     * Manufacture of articles of paper and paperboard
     * 
     */
    @XmlEnumValue("C17.2.")
    C_17_2("C17.2."),

    /**
     * Manufacture of corrugated paper and paperboard and of containers of paper and paperboard
     * 
     */
    @XmlEnumValue("C17.2.1")
    C_17_2_1("C17.2.1"),

    /**
     * Manufacture of household and sanitary goods and of toilet requisites
     * 
     */
    @XmlEnumValue("C17.2.2")
    C_17_2_2("C17.2.2"),

    /**
     * Manufacture of paper stationery
     * 
     */
    @XmlEnumValue("C17.2.3")
    C_17_2_3("C17.2.3"),

    /**
     * Manufacture of wallpaper
     * 
     */
    @XmlEnumValue("C17.2.4")
    C_17_2_4("C17.2.4"),

    /**
     * Manufacture of other articles of paper and paperboard
     * 
     */
    @XmlEnumValue("C17.2.9")
    C_17_2_9("C17.2.9"),

    /**
     * Printing and reproduction of recorded media
     * 
     */
    @XmlEnumValue("C18..")
    C_18("C18.."),

    /**
     * Printing and service activities related to printing
     * 
     */
    @XmlEnumValue("C18.1.")
    C_18_1("C18.1."),

    /**
     * Printing of newspapers
     * 
     */
    @XmlEnumValue("C18.1.1")
    C_18_1_1("C18.1.1"),

    /**
     * Other printing
     * 
     */
    @XmlEnumValue("C18.1.2")
    C_18_1_2("C18.1.2"),

    /**
     * Pre
     * 
     */
    @XmlEnumValue("C18.1.3")
    C_18_1_3("C18.1.3"),

    /**
     * Binding and related services
     * 
     */
    @XmlEnumValue("C18.1.4")
    C_18_1_4("C18.1.4"),

    /**
     * Reproduction of recorded media
     * 
     */
    @XmlEnumValue("C18.2.")
    C_18_2("C18.2."),

    /**
     * Reproduction of recorded media
     * 
     */
    @XmlEnumValue("C18.2.0")
    C_18_2_0("C18.2.0"),

    /**
     * Manufacture of coke and refined petroleum products
     * 
     */
    @XmlEnumValue("C19..")
    C_19("C19.."),

    /**
     * Manufacture of coke oven products
     * 
     */
    @XmlEnumValue("C19.1.")
    C_19_1("C19.1."),

    /**
     * Manufacture of coke oven products
     * 
     */
    @XmlEnumValue("C19.1.0")
    C_19_1_0("C19.1.0"),

    /**
     * Manufacture of refined petroleum products
     * 
     */
    @XmlEnumValue("C19.2.")
    C_19_2("C19.2."),

    /**
     * Manufacture of refined petroleum products
     * 
     */
    @XmlEnumValue("C19.2.0")
    C_19_2_0("C19.2.0"),

    /**
     * Manufacture of chemicals and chemical products
     * 
     */
    @XmlEnumValue("C20..")
    C_20("C20.."),

    /**
     * Manufacture of basic chemicals, fertilisers and nitrogen compounds, plastics and synthetic rubber in primary forms
     * 
     */
    @XmlEnumValue("C20.1.")
    C_20_1("C20.1."),

    /**
     * Manufacture of industrial gases
     * 
     */
    @XmlEnumValue("C20.1.1")
    C_20_1_1("C20.1.1"),

    /**
     * Manufacture of dyes and pigments
     * 
     */
    @XmlEnumValue("C20.1.2")
    C_20_1_2("C20.1.2"),

    /**
     * Manufacture of other inorganic basic chemicals
     * 
     */
    @XmlEnumValue("C20.1.3")
    C_20_1_3("C20.1.3"),

    /**
     * Manufacture of other organic basic chemicals
     * 
     */
    @XmlEnumValue("C20.1.4")
    C_20_1_4("C20.1.4"),

    /**
     * Manufacture of fertilisers and nitrogen compounds
     * 
     */
    @XmlEnumValue("C20.1.5")
    C_20_1_5("C20.1.5"),

    /**
     * Manufacture of plastics in primary forms
     * 
     */
    @XmlEnumValue("C20.1.6")
    C_20_1_6("C20.1.6"),

    /**
     * Manufacture of synthetic rubber in primary forms
     * 
     */
    @XmlEnumValue("C20.1.7")
    C_20_1_7("C20.1.7"),

    /**
     * Manufacture of pesticides and other agrochemical products
     * 
     */
    @XmlEnumValue("C20.2.")
    C_20_2("C20.2."),

    /**
     * Manufacture of pesticides and other agrochemical products
     * 
     */
    @XmlEnumValue("C20.2.0")
    C_20_2_0("C20.2.0"),

    /**
     * Manufacture of paints, varnishes and similar coatings, printing ink and mastics
     * 
     */
    @XmlEnumValue("C20.3.")
    C_20_3("C20.3."),

    /**
     * Manufacture of paints, varnishes and similar coatings, printing ink and mastics
     * 
     */
    @XmlEnumValue("C20.3.0")
    C_20_3_0("C20.3.0"),

    /**
     * Manufacture of soap and detergents, cleaning and polishing preparations, perfumes and toilet preparations
     * 
     */
    @XmlEnumValue("C20.4.")
    C_20_4("C20.4."),

    /**
     * Manufacture of soap and detergents, cleaning and polishing preparations
     * 
     */
    @XmlEnumValue("C20.4.1")
    C_20_4_1("C20.4.1"),

    /**
     * Manufacture of perfumes and toilet preparations
     * 
     */
    @XmlEnumValue("C20.4.2")
    C_20_4_2("C20.4.2"),

    /**
     * Manufacture of other chemical products
     * 
     */
    @XmlEnumValue("C20.5.")
    C_20_5("C20.5."),

    /**
     * Manufacture of explosives
     * 
     */
    @XmlEnumValue("C20.5.1")
    C_20_5_1("C20.5.1"),

    /**
     * Manufacture of glues
     * 
     */
    @XmlEnumValue("C20.5.2")
    C_20_5_2("C20.5.2"),

    /**
     * Manufacture of essential oils
     * 
     */
    @XmlEnumValue("C20.5.3")
    C_20_5_3("C20.5.3"),

    /**
     * Manufacture of other chemical products n.e.c.
     * 
     */
    @XmlEnumValue("C20.5.9")
    C_20_5_9("C20.5.9"),

    /**
     * Manufacture of man
     * 
     */
    @XmlEnumValue("C20.6.")
    C_20_6("C20.6."),

    /**
     * Manufacture of man
     * 
     */
    @XmlEnumValue("C20.6.0")
    C_20_6_0("C20.6.0"),

    /**
     * Manufacture of basic pharmaceutical products and pharmaceutical preparations
     * 
     */
    @XmlEnumValue("C21..")
    C_21("C21.."),

    /**
     * Manufacture of basic pharmaceutical products
     * 
     */
    @XmlEnumValue("C21.1.")
    C_21_1("C21.1."),

    /**
     * Manufacture of basic pharmaceutical products
     * 
     */
    @XmlEnumValue("C21.1.0")
    C_21_1_0("C21.1.0"),

    /**
     * Manufacture of pharmaceutical preparations
     * 
     */
    @XmlEnumValue("C21.2.")
    C_21_2("C21.2."),

    /**
     * Manufacture of pharmaceutical preparations
     * 
     */
    @XmlEnumValue("C21.2.0")
    C_21_2_0("C21.2.0"),

    /**
     * Manufacture of rubber and plastic products
     * 
     */
    @XmlEnumValue("C22..")
    C_22("C22.."),

    /**
     * Manufacture of rubber products
     * 
     */
    @XmlEnumValue("C22.1.")
    C_22_1("C22.1."),

    /**
     * Manufacture of rubber tyres and tubes; retreading and rebuilding of rubber tyres
     * 
     */
    @XmlEnumValue("C22.1.1")
    C_22_1_1("C22.1.1"),

    /**
     * Manufacture of other rubber products
     * 
     */
    @XmlEnumValue("C22.1.9")
    C_22_1_9("C22.1.9"),

    /**
     * Manufacture of plastics products
     * 
     */
    @XmlEnumValue("C22.2.")
    C_22_2("C22.2."),

    /**
     * Manufacture of plastic plates, sheets, tubes and profiles
     * 
     */
    @XmlEnumValue("C22.2.1")
    C_22_2_1("C22.2.1"),

    /**
     * Manufacture of plastic packing goods
     * 
     */
    @XmlEnumValue("C22.2.2")
    C_22_2_2("C22.2.2"),

    /**
     * Manufacture of builders’ ware of plastic
     * 
     */
    @XmlEnumValue("C22.2.3")
    C_22_2_3("C22.2.3"),

    /**
     * Manufacture of other plastic products
     * 
     */
    @XmlEnumValue("C22.2.9")
    C_22_2_9("C22.2.9"),

    /**
     * Manufacture of other non
     * 
     */
    @XmlEnumValue("C23..")
    C_23("C23.."),

    /**
     * Manufacture of glass and glass products
     * 
     */
    @XmlEnumValue("C23.1.")
    C_23_1("C23.1."),

    /**
     * Manufacture of flat glass
     * 
     */
    @XmlEnumValue("C23.1.1")
    C_23_1_1("C23.1.1"),

    /**
     * Shaping and processing of flat glass
     * 
     */
    @XmlEnumValue("C23.1.2")
    C_23_1_2("C23.1.2"),

    /**
     * Manufacture of hollow glass
     * 
     */
    @XmlEnumValue("C23.1.3")
    C_23_1_3("C23.1.3"),

    /**
     * Manufacture of glass fibres
     * 
     */
    @XmlEnumValue("C23.1.4")
    C_23_1_4("C23.1.4"),

    /**
     * Manufacture and processing of other glass, including technical glassware
     * 
     */
    @XmlEnumValue("C23.1.9")
    C_23_1_9("C23.1.9"),

    /**
     * Manufacture of refractory products
     * 
     */
    @XmlEnumValue("C23.2.")
    C_23_2("C23.2."),

    /**
     * Manufacture of refractory products
     * 
     */
    @XmlEnumValue("C23.2.0")
    C_23_2_0("C23.2.0"),

    /**
     * Manufacture of clay building materials
     * 
     */
    @XmlEnumValue("C23.3.")
    C_23_3("C23.3."),

    /**
     * Manufacture of ceramic tiles and flags
     * 
     */
    @XmlEnumValue("C23.3.1")
    C_23_3_1("C23.3.1"),

    /**
     * Manufacture of bricks, tiles and construction products, in baked clay
     * 
     */
    @XmlEnumValue("C23.3.2")
    C_23_3_2("C23.3.2"),

    /**
     * Manufacture of other porcelain and ceramic products
     * 
     */
    @XmlEnumValue("C23.4.")
    C_23_4("C23.4."),

    /**
     * Manufacture of ceramic household and ornamental articles
     * 
     */
    @XmlEnumValue("C23.4.1")
    C_23_4_1("C23.4.1"),

    /**
     * Manufacture of ceramic sanitary fixtures
     * 
     */
    @XmlEnumValue("C23.4.2")
    C_23_4_2("C23.4.2"),

    /**
     * Manufacture of ceramic insulators and insulating fittings
     * 
     */
    @XmlEnumValue("C23.4.3")
    C_23_4_3("C23.4.3"),

    /**
     * Manufacture of other technical ceramic products
     * 
     */
    @XmlEnumValue("C23.4.4")
    C_23_4_4("C23.4.4"),

    /**
     * Manufacture of other ceramic products
     * 
     */
    @XmlEnumValue("C23.4.9")
    C_23_4_9("C23.4.9"),

    /**
     * Manufacture of cement, lime and plaster
     * 
     */
    @XmlEnumValue("C23.5.")
    C_23_5("C23.5."),

    /**
     * Manufacture of cement
     * 
     */
    @XmlEnumValue("C23.5.1")
    C_23_5_1("C23.5.1"),

    /**
     * Manufacture of lime and plaster
     * 
     */
    @XmlEnumValue("C23.5.2")
    C_23_5_2("C23.5.2"),

    /**
     * Manufacture of articles of concrete, cement and plaster
     * 
     */
    @XmlEnumValue("C23.6.")
    C_23_6("C23.6."),

    /**
     * Manufacture of concrete products for construction purposes
     * 
     */
    @XmlEnumValue("C23.6.1")
    C_23_6_1("C23.6.1"),

    /**
     * Manufacture of plaster products for construction purposes
     * 
     */
    @XmlEnumValue("C23.6.2")
    C_23_6_2("C23.6.2"),

    /**
     * Manufacture of ready
     * 
     */
    @XmlEnumValue("C23.6.3")
    C_23_6_3("C23.6.3"),

    /**
     * Manufacture of mortars
     * 
     */
    @XmlEnumValue("C23.6.4")
    C_23_6_4("C23.6.4"),

    /**
     * Manufacture of fibre cement
     * 
     */
    @XmlEnumValue("C23.6.5")
    C_23_6_5("C23.6.5"),

    /**
     * Manufacture of other articles of concrete, plaster and cement
     * 
     */
    @XmlEnumValue("C23.6.9")
    C_23_6_9("C23.6.9"),

    /**
     * Cutting, shaping and finishing of stone
     * 
     */
    @XmlEnumValue("C23.7.")
    C_23_7("C23.7."),

    /**
     * Cutting, shaping and finishing of stone
     * 
     */
    @XmlEnumValue("C23.7.0")
    C_23_7_0("C23.7.0"),

    /**
     * Manufacture of abrasive products and non
     * 
     */
    @XmlEnumValue("C23.9.")
    C_23_9("C23.9."),

    /**
     * Production of abrasive products
     * 
     */
    @XmlEnumValue("C23.9.1")
    C_23_9_1("C23.9.1"),

    /**
     * Manufacture of other non
     * 
     */
    @XmlEnumValue("C23.9.9")
    C_23_9_9("C23.9.9"),

    /**
     * Manufacture of basic metals
     * 
     */
    @XmlEnumValue("C24..")
    C_24("C24.."),

    /**
     * Manufacture of basic iron and steel and of ferro
     * 
     */
    @XmlEnumValue("C24.1.")
    C_24_1("C24.1."),

    /**
     * Manufacture of basic iron and steel and of ferro
     * 
     */
    @XmlEnumValue("C24.1.0")
    C_24_1_0("C24.1.0"),

    /**
     * Manufacture of tubes, pipes, hollow profiles and related fittings, of steel
     * 
     */
    @XmlEnumValue("C24.2.")
    C_24_2("C24.2."),

    /**
     * Manufacture of tubes, pipes, hollow profiles and related fittings, of steel
     * 
     */
    @XmlEnumValue("C24.2.0")
    C_24_2_0("C24.2.0"),

    /**
     * Manufacture of other products of first processing of steel
     * 
     */
    @XmlEnumValue("C24.3.")
    C_24_3("C24.3."),

    /**
     * Cold drawing of bars
     * 
     */
    @XmlEnumValue("C24.3.1")
    C_24_3_1("C24.3.1"),

    /**
     * Cold rolling of narrow strip
     * 
     */
    @XmlEnumValue("C24.3.2")
    C_24_3_2("C24.3.2"),

    /**
     * Cold forming or folding
     * 
     */
    @XmlEnumValue("C24.3.3")
    C_24_3_3("C24.3.3"),

    /**
     * Cold drawing of wire
     * 
     */
    @XmlEnumValue("C24.3.4")
    C_24_3_4("C24.3.4"),

    /**
     * Manufacture of basic precious and other non
     * 
     */
    @XmlEnumValue("C24.4.")
    C_24_4("C24.4."),

    /**
     * Precious metals production
     * 
     */
    @XmlEnumValue("C24.4.1")
    C_24_4_1("C24.4.1"),

    /**
     * Aluminium production
     * 
     */
    @XmlEnumValue("C24.4.2")
    C_24_4_2("C24.4.2"),

    /**
     * Lead, zinc and tin production
     * 
     */
    @XmlEnumValue("C24.4.3")
    C_24_4_3("C24.4.3"),

    /**
     * Copper production
     * 
     */
    @XmlEnumValue("C24.4.4")
    C_24_4_4("C24.4.4"),

    /**
     * Other non
     * 
     */
    @XmlEnumValue("C24.4.5")
    C_24_4_5("C24.4.5"),

    /**
     * Processing of nuclear fuel
     * 
     */
    @XmlEnumValue("C24.4.6")
    C_24_4_6("C24.4.6"),

    /**
     * Casting of metals
     * 
     */
    @XmlEnumValue("C24.5.")
    C_24_5("C24.5."),

    /**
     * Casting of iron
     * 
     */
    @XmlEnumValue("C24.5.1")
    C_24_5_1("C24.5.1"),

    /**
     * Casting of steel
     * 
     */
    @XmlEnumValue("C24.5.2")
    C_24_5_2("C24.5.2"),

    /**
     * Casting of light metals
     * 
     */
    @XmlEnumValue("C24.5.3")
    C_24_5_3("C24.5.3"),

    /**
     * Casting of other non
     * 
     */
    @XmlEnumValue("C24.5.4")
    C_24_5_4("C24.5.4"),

    /**
     * Manufacture of fabricated metal products, except machinery and equipment
     * 
     */
    @XmlEnumValue("C25..")
    C_25("C25.."),

    /**
     * Manufacture of structural metal products
     * 
     */
    @XmlEnumValue("C25.1.")
    C_25_1("C25.1."),

    /**
     * Manufacture of metal structures and parts of structures
     * 
     */
    @XmlEnumValue("C25.1.1")
    C_25_1_1("C25.1.1"),

    /**
     * Manufacture of doors and windows of metal
     * 
     */
    @XmlEnumValue("C25.1.2")
    C_25_1_2("C25.1.2"),

    /**
     * Manufacture of tanks, reservoirs and containers of metal
     * 
     */
    @XmlEnumValue("C25.2.")
    C_25_2("C25.2."),

    /**
     * Manufacture of central heating radiators and boilers
     * 
     */
    @XmlEnumValue("C25.2.1")
    C_25_2_1("C25.2.1"),

    /**
     * Manufacture of other tanks, reservoirs and containers of metal
     * 
     */
    @XmlEnumValue("C25.2.9")
    C_25_2_9("C25.2.9"),

    /**
     * Manufacture of steam generators, except central heating hot water boilers
     * 
     */
    @XmlEnumValue("C25.3.")
    C_25_3("C25.3."),

    /**
     * Manufacture of steam generators, except central heating hot water boilers
     * 
     */
    @XmlEnumValue("C25.3.0")
    C_25_3_0("C25.3.0"),

    /**
     * Manufacture of weapons and ammunition
     * 
     */
    @XmlEnumValue("C25.4.")
    C_25_4("C25.4."),

    /**
     * Manufacture of weapons and ammunition
     * 
     */
    @XmlEnumValue("C25.4.0")
    C_25_4_0("C25.4.0"),

    /**
     * Forging, pressing, stamping and roll
     * 
     */
    @XmlEnumValue("C25.5.")
    C_25_5("C25.5."),

    /**
     * Forging, pressing, stamping and roll
     * 
     */
    @XmlEnumValue("C25.5.0")
    C_25_5_0("C25.5.0"),

    /**
     * Treatment and coating of metals; machining
     * 
     */
    @XmlEnumValue("C25.6.")
    C_25_6("C25.6."),

    /**
     * Treatment and coating of metals
     * 
     */
    @XmlEnumValue("C25.6.1")
    C_25_6_1("C25.6.1"),

    /**
     * Machining
     * 
     */
    @XmlEnumValue("C25.6.2")
    C_25_6_2("C25.6.2"),

    /**
     * Manufacture of cutlery, tools and general hardware
     * 
     */
    @XmlEnumValue("C25.7.")
    C_25_7("C25.7."),

    /**
     * Manufacture of cutlery
     * 
     */
    @XmlEnumValue("C25.7.1")
    C_25_7_1("C25.7.1"),

    /**
     * Manufacture of locks and hinges
     * 
     */
    @XmlEnumValue("C25.7.2")
    C_25_7_2("C25.7.2"),

    /**
     * Manufacture of tools
     * 
     */
    @XmlEnumValue("C25.7.3")
    C_25_7_3("C25.7.3"),

    /**
     * Manufacture of other fabricated metal products
     * 
     */
    @XmlEnumValue("C25.9.")
    C_25_9("C25.9."),

    /**
     * Manufacture of steel drums and similar containers
     * 
     */
    @XmlEnumValue("C25.9.1")
    C_25_9_1("C25.9.1"),

    /**
     * Manufacture of light metal packaging
     * 
     */
    @XmlEnumValue("C25.9.2")
    C_25_9_2("C25.9.2"),

    /**
     * Manufacture of wire products, chain and springs
     * 
     */
    @XmlEnumValue("C25.9.3")
    C_25_9_3("C25.9.3"),

    /**
     * Manufacture of fasteners and screw machine products
     * 
     */
    @XmlEnumValue("C25.9.4")
    C_25_9_4("C25.9.4"),

    /**
     * Manufacture of other fabricated metal products n.e.c.
     * 
     */
    @XmlEnumValue("C25.9.9")
    C_25_9_9("C25.9.9"),

    /**
     * Manufacture of computer, electronic and optical products
     * 
     */
    @XmlEnumValue("C26..")
    C_26("C26.."),

    /**
     * Manufacture of electronic components and boards
     * 
     */
    @XmlEnumValue("C26.1.")
    C_26_1("C26.1."),

    /**
     * Manufacture of electronic components
     * 
     */
    @XmlEnumValue("C26.1.1")
    C_26_1_1("C26.1.1"),

    /**
     * Manufacture of loaded electronic boards
     * 
     */
    @XmlEnumValue("C26.1.2")
    C_26_1_2("C26.1.2"),

    /**
     * Manufacture of computers and peripheral equipment
     * 
     */
    @XmlEnumValue("C26.2.")
    C_26_2("C26.2."),

    /**
     * Manufacture of computers and peripheral equipment
     * 
     */
    @XmlEnumValue("C26.2.0")
    C_26_2_0("C26.2.0"),

    /**
     * Manufacture of communication equipment
     * 
     */
    @XmlEnumValue("C26.3.")
    C_26_3("C26.3."),

    /**
     * Manufacture of communication equipment
     * 
     */
    @XmlEnumValue("C26.3.0")
    C_26_3_0("C26.3.0"),

    /**
     * Manufacture of consumer electronics
     * 
     */
    @XmlEnumValue("C26.4.")
    C_26_4("C26.4."),

    /**
     * Manufacture of consumer electronics
     * 
     */
    @XmlEnumValue("C26.4.0")
    C_26_4_0("C26.4.0"),

    /**
     * Manufacture of instruments and appliances for measuring, testing and navigation; watches and clocks
     * 
     */
    @XmlEnumValue("C26.5.")
    C_26_5("C26.5."),

    /**
     * Manufacture of instruments and appliances for measuring, testing and navigation
     * 
     */
    @XmlEnumValue("C26.5.1")
    C_26_5_1("C26.5.1"),

    /**
     * Manufacture of watches and clocks
     * 
     */
    @XmlEnumValue("C26.5.2")
    C_26_5_2("C26.5.2"),

    /**
     * Manufacture of irradiation, electromedical and electrotherapeutic equipment
     * 
     */
    @XmlEnumValue("C26.6.")
    C_26_6("C26.6."),

    /**
     * Manufacture of irradiation, electromedical and electrotherapeutic equipment
     * 
     */
    @XmlEnumValue("C26.6.0")
    C_26_6_0("C26.6.0"),

    /**
     * Manufacture of optical instruments and photographic equipment
     * 
     */
    @XmlEnumValue("C26.7.")
    C_26_7("C26.7."),

    /**
     * Manufacture of optical instruments and photographic equipment
     * 
     */
    @XmlEnumValue("C26.7.0")
    C_26_7_0("C26.7.0"),

    /**
     * Manufacture of magnetic and optical media
     * 
     */
    @XmlEnumValue("C26.8.")
    C_26_8("C26.8."),

    /**
     * Manufacture of magnetic and optical media
     * 
     */
    @XmlEnumValue("C26.8.0")
    C_26_8_0("C26.8.0"),

    /**
     * Manufacture of electrical equipment
     * 
     */
    @XmlEnumValue("C27..")
    C_27("C27.."),

    /**
     * Manufacture of electric motors, generators, transformers and electricity distribution and control apparatus
     * 
     */
    @XmlEnumValue("C27.1.")
    C_27_1("C27.1."),

    /**
     * Manufacture of electric motors, generators and transformers
     * 
     */
    @XmlEnumValue("C27.1.1")
    C_27_1_1("C27.1.1"),

    /**
     * Manufacture of electricity distribution and control apparatus
     * 
     */
    @XmlEnumValue("C27.1.2")
    C_27_1_2("C27.1.2"),

    /**
     * Manufacture of batteries and accumulators
     * 
     */
    @XmlEnumValue("C27.2.")
    C_27_2("C27.2."),

    /**
     * Manufacture of batteries and accumulators
     * 
     */
    @XmlEnumValue("C27.2.0")
    C_27_2_0("C27.2.0"),

    /**
     * Manufacture of wiring and wiring devices
     * 
     */
    @XmlEnumValue("C27.3.")
    C_27_3("C27.3."),

    /**
     * Manufacture of fibre optic cables
     * 
     */
    @XmlEnumValue("C27.3.1")
    C_27_3_1("C27.3.1"),

    /**
     * Manufacture of other electronic and electric wires and cables
     * 
     */
    @XmlEnumValue("C27.3.2")
    C_27_3_2("C27.3.2"),

    /**
     * Manufacture of wiring devices
     * 
     */
    @XmlEnumValue("C27.3.3")
    C_27_3_3("C27.3.3"),

    /**
     * Manufacture of electric lighting equipment
     * 
     */
    @XmlEnumValue("C27.4.")
    C_27_4("C27.4."),

    /**
     * Manufacture of electric lighting equipment
     * 
     */
    @XmlEnumValue("C27.4.0")
    C_27_4_0("C27.4.0"),

    /**
     * Manufacture of domestic appliances
     * 
     */
    @XmlEnumValue("C27.5.")
    C_27_5("C27.5."),

    /**
     * Manufacture of electric domestic appliances
     * 
     */
    @XmlEnumValue("C27.5.1")
    C_27_5_1("C27.5.1"),

    /**
     * Manufacture of non
     * 
     */
    @XmlEnumValue("C27.5.2")
    C_27_5_2("C27.5.2"),

    /**
     * Manufacture of other electrical equipment
     * 
     */
    @XmlEnumValue("C27.9.")
    C_27_9("C27.9."),

    /**
     * Manufacture of other electrical equipment
     * 
     */
    @XmlEnumValue("C27.9.0")
    C_27_9_0("C27.9.0"),

    /**
     * Manufacture of machinery and equipment n.e.c.
     * 
     */
    @XmlEnumValue("C28..")
    C_28("C28.."),

    /**
     * Manufacture of general
     * 
     */
    @XmlEnumValue("C28.1.")
    C_28_1("C28.1."),

    /**
     * Manufacture of engines and turbines, except aircraft, vehicle and cycle engines
     * 
     */
    @XmlEnumValue("C28.1.1")
    C_28_1_1("C28.1.1"),

    /**
     * Manufacture of fluid power equipment
     * 
     */
    @XmlEnumValue("C28.1.2")
    C_28_1_2("C28.1.2"),

    /**
     * Manufacture of other pumps and compressors
     * 
     */
    @XmlEnumValue("C28.1.3")
    C_28_1_3("C28.1.3"),

    /**
     * Manufacture of other taps and valves
     * 
     */
    @XmlEnumValue("C28.1.4")
    C_28_1_4("C28.1.4"),

    /**
     * Manufacture of bearings, gears, gearing and driving elements
     * 
     */
    @XmlEnumValue("C28.1.5")
    C_28_1_5("C28.1.5"),

    /**
     * Manufacture of other general
     * 
     */
    @XmlEnumValue("C28.2.")
    C_28_2("C28.2."),

    /**
     * Manufacture of ovens, furnaces and furnace burners
     * 
     */
    @XmlEnumValue("C28.2.1")
    C_28_2_1("C28.2.1"),

    /**
     * Manufacture of lifting and handling equipment
     * 
     */
    @XmlEnumValue("C28.2.2")
    C_28_2_2("C28.2.2"),

    /**
     * Manufacture of office machinery and equipment (except computers and peripheral equipment)
     * 
     */
    @XmlEnumValue("C28.2.3")
    C_28_2_3("C28.2.3"),

    /**
     * Manufacture of power
     * 
     */
    @XmlEnumValue("C28.2.4")
    C_28_2_4("C28.2.4"),

    /**
     * Manufacture of non
     * 
     */
    @XmlEnumValue("C28.2.5")
    C_28_2_5("C28.2.5"),

    /**
     * Manufacture of other general
     * 
     */
    @XmlEnumValue("C28.2.9")
    C_28_2_9("C28.2.9"),

    /**
     * Manufacture of agricultural and forestry machinery
     * 
     */
    @XmlEnumValue("C28.3.")
    C_28_3("C28.3."),

    /**
     * Manufacture of agricultural and forestry machinery
     * 
     */
    @XmlEnumValue("C28.3.0")
    C_28_3_0("C28.3.0"),

    /**
     * Manufacture of metal forming machinery and machine tools
     * 
     */
    @XmlEnumValue("C28.4.")
    C_28_4("C28.4."),

    /**
     * Manufacture of metal forming machinery
     * 
     */
    @XmlEnumValue("C28.4.1")
    C_28_4_1("C28.4.1"),

    /**
     * Manufacture of other machine tools
     * 
     */
    @XmlEnumValue("C28.4.9")
    C_28_4_9("C28.4.9"),

    /**
     * Manufacture of other special
     * 
     */
    @XmlEnumValue("C28.9.")
    C_28_9("C28.9."),

    /**
     * Manufacture of machinery for metallurgy
     * 
     */
    @XmlEnumValue("C28.9.1")
    C_28_9_1("C28.9.1"),

    /**
     * Manufacture of machinery for mining, quarrying and construction
     * 
     */
    @XmlEnumValue("C28.9.2")
    C_28_9_2("C28.9.2"),

    /**
     * Manufacture of machinery for food, beverage and tobacco processing
     * 
     */
    @XmlEnumValue("C28.9.3")
    C_28_9_3("C28.9.3"),

    /**
     * Manufacture of machinery for textile, apparel and leather production
     * 
     */
    @XmlEnumValue("C28.9.4")
    C_28_9_4("C28.9.4"),

    /**
     * Manufacture of machinery for paper and paperboard production
     * 
     */
    @XmlEnumValue("C28.9.5")
    C_28_9_5("C28.9.5"),

    /**
     * Manufacture of plastics and rubber machinery
     * 
     */
    @XmlEnumValue("C28.9.6")
    C_28_9_6("C28.9.6"),

    /**
     * Manufacture of other special
     * 
     */
    @XmlEnumValue("C28.9.9")
    C_28_9_9("C28.9.9"),

    /**
     * Manufacture of motor vehicles, trailers and semi
     * 
     */
    @XmlEnumValue("C29..")
    C_29("C29.."),

    /**
     * Manufacture of motor vehicles
     * 
     */
    @XmlEnumValue("C29.1.")
    C_29_1("C29.1."),

    /**
     * Manufacture of motor vehicles
     * 
     */
    @XmlEnumValue("C29.1.0")
    C_29_1_0("C29.1.0"),

    /**
     * Manufacture of bodies (coachwork) for motor vehicles; manufacture of trailers and semi
     * 
     */
    @XmlEnumValue("C29.2.")
    C_29_2("C29.2."),

    /**
     * Manufacture of bodies (coachwork) for motor vehicles; manufacture of trailers and semi
     * 
     */
    @XmlEnumValue("C29.2.0")
    C_29_2_0("C29.2.0"),

    /**
     * Manufacture of parts and accessories for motor vehicles
     * 
     */
    @XmlEnumValue("C29.3.")
    C_29_3("C29.3."),

    /**
     * Manufacture of electrical and electronic equipment for motor vehicles
     * 
     */
    @XmlEnumValue("C29.3.1")
    C_29_3_1("C29.3.1"),

    /**
     * Manufacture of other parts and accessories for motor vehicles
     * 
     */
    @XmlEnumValue("C29.3.2")
    C_29_3_2("C29.3.2"),

    /**
     * Manufacture of other transport equipment
     * 
     */
    @XmlEnumValue("C30..")
    C_30("C30.."),

    /**
     * Building of ships and boats
     * 
     */
    @XmlEnumValue("C30.1.")
    C_30_1("C30.1."),

    /**
     * Building of ships and floating structures
     * 
     */
    @XmlEnumValue("C30.1.1")
    C_30_1_1("C30.1.1"),

    /**
     * Building of pleasure and sporting boats
     * 
     */
    @XmlEnumValue("C30.1.2")
    C_30_1_2("C30.1.2"),

    /**
     * Manufacture of railway locomotives and rolling stock
     * 
     */
    @XmlEnumValue("C30.2.")
    C_30_2("C30.2."),

    /**
     * Manufacture of railway locomotives and rolling stock
     * 
     */
    @XmlEnumValue("C30.2.0")
    C_30_2_0("C30.2.0"),

    /**
     * Manufacture of air and spacecraft and related machinery
     * 
     */
    @XmlEnumValue("C30.3.")
    C_30_3("C30.3."),

    /**
     * Manufacture of air and spacecraft and related machinery
     * 
     */
    @XmlEnumValue("C30.3.0")
    C_30_3_0("C30.3.0"),

    /**
     * Manufacture of military fighting vehicles
     * 
     */
    @XmlEnumValue("C30.4.")
    C_30_4("C30.4."),

    /**
     * Manufacture of military fighting vehicles
     * 
     */
    @XmlEnumValue("C30.4.0")
    C_30_4_0("C30.4.0"),

    /**
     * Manufacture of transport equipment n.e.c.
     * 
     */
    @XmlEnumValue("C30.9.")
    C_30_9("C30.9."),

    /**
     * Manufacture of motorcycles
     * 
     */
    @XmlEnumValue("C30.9.1")
    C_30_9_1("C30.9.1"),

    /**
     * Manufacture of bicycles and invalid carriages
     * 
     */
    @XmlEnumValue("C30.9.2")
    C_30_9_2("C30.9.2"),

    /**
     * Manufacture of other transport equipment n.e.c.
     * 
     */
    @XmlEnumValue("C30.9.9")
    C_30_9_9("C30.9.9"),

    /**
     * Manufacture of furniture
     * 
     */
    @XmlEnumValue("C31..")
    C_31("C31.."),

    /**
     * Manufacture of furniture
     * 
     */
    @XmlEnumValue("C31.0.")
    C_31_0("C31.0."),

    /**
     * Manufacture of office and shop furniture
     * 
     */
    @XmlEnumValue("C31.0.1")
    C_31_0_1("C31.0.1"),

    /**
     * Manufacture of kitchen furniture
     * 
     */
    @XmlEnumValue("C31.0.2")
    C_31_0_2("C31.0.2"),

    /**
     * Manufacture of mattresses
     * 
     */
    @XmlEnumValue("C31.0.3")
    C_31_0_3("C31.0.3"),

    /**
     * Manufacture of other furniture
     * 
     */
    @XmlEnumValue("C31.0.9")
    C_31_0_9("C31.0.9"),

    /**
     * Other manufacturing
     * 
     */
    @XmlEnumValue("C32..")
    C_32("C32.."),

    /**
     * Manufacture of jewellery, bijouterie and related articles
     * 
     */
    @XmlEnumValue("C32.1.")
    C_32_1("C32.1."),

    /**
     * Striking of coins
     * 
     */
    @XmlEnumValue("C32.1.1")
    C_32_1_1("C32.1.1"),

    /**
     * Manufacture of jewellery and related articles
     * 
     */
    @XmlEnumValue("C32.1.2")
    C_32_1_2("C32.1.2"),

    /**
     * Manufacture of imitation jewellery and related articles
     * 
     */
    @XmlEnumValue("C32.1.3")
    C_32_1_3("C32.1.3"),

    /**
     * Manufacture of musical instruments
     * 
     */
    @XmlEnumValue("C32.2.")
    C_32_2("C32.2."),

    /**
     * Manufacture of musical instruments
     * 
     */
    @XmlEnumValue("C32.2.0")
    C_32_2_0("C32.2.0"),

    /**
     * Manufacture of sports goods
     * 
     */
    @XmlEnumValue("C32.3.")
    C_32_3("C32.3."),

    /**
     * Manufacture of sports goods
     * 
     */
    @XmlEnumValue("C32.3.0")
    C_32_3_0("C32.3.0"),

    /**
     * Manufacture of games and toys
     * 
     */
    @XmlEnumValue("C32.4.")
    C_32_4("C32.4."),

    /**
     * Manufacture of games and toys
     * 
     */
    @XmlEnumValue("C32.4.0")
    C_32_4_0("C32.4.0"),

    /**
     * Manufacture of medical and dental instruments and supplies
     * 
     */
    @XmlEnumValue("C32.5.")
    C_32_5("C32.5."),

    /**
     * Manufacture of medical and dental instruments and supplies
     * 
     */
    @XmlEnumValue("C32.5.0")
    C_32_5_0("C32.5.0"),

    /**
     * Manufacturing n.e.c.
     * 
     */
    @XmlEnumValue("C32.9.")
    C_32_9("C32.9."),

    /**
     * Manufacture of brooms and brushes
     * 
     */
    @XmlEnumValue("C32.9.1")
    C_32_9_1("C32.9.1"),

    /**
     * Other manufacturing n.e.c.
     * 
     */
    @XmlEnumValue("C32.9.9")
    C_32_9_9("C32.9.9"),

    /**
     * Repair and installation of machinery and equipment
     * 
     */
    @XmlEnumValue("C33..")
    C_33("C33.."),

    /**
     * Repair of fabricated metal products, machinery and equipment
     * 
     */
    @XmlEnumValue("C33.1.")
    C_33_1("C33.1."),

    /**
     * Repair of fabricated metal products
     * 
     */
    @XmlEnumValue("C33.1.1")
    C_33_1_1("C33.1.1"),

    /**
     * Repair of machinery
     * 
     */
    @XmlEnumValue("C33.1.2")
    C_33_1_2("C33.1.2"),

    /**
     * Repair of electronic and optical equipment
     * 
     */
    @XmlEnumValue("C33.1.3")
    C_33_1_3("C33.1.3"),

    /**
     * Repair of electrical equipment
     * 
     */
    @XmlEnumValue("C33.1.4")
    C_33_1_4("C33.1.4"),

    /**
     * Repair and maintenance of ships and boats
     * 
     */
    @XmlEnumValue("C33.1.5")
    C_33_1_5("C33.1.5"),

    /**
     * Repair and maintenance of aircraft and spacecraft
     * 
     */
    @XmlEnumValue("C33.1.6")
    C_33_1_6("C33.1.6"),

    /**
     * Repair and maintenance of other transport equipment
     * 
     */
    @XmlEnumValue("C33.1.7")
    C_33_1_7("C33.1.7"),

    /**
     * Repair of other equipment
     * 
     */
    @XmlEnumValue("C33.1.9")
    C_33_1_9("C33.1.9"),

    /**
     * Installation of industrial machinery and equipment
     * 
     */
    @XmlEnumValue("C33.2.")
    C_33_2("C33.2."),

    /**
     * Installation of industrial machinery and equipment
     * 
     */
    @XmlEnumValue("C33.2.0")
    C_33_2_0("C33.2.0"),

    /**
     * Electricity, gas, steam and air conditioning supply
     * 
     */
    D("D"),

    /**
     * Electricity, gas, steam and air conditioning supply
     * 
     */
    @XmlEnumValue("D35..")
    D_35("D35.."),

    /**
     * Electric power generation, transmission and distribution
     * 
     */
    @XmlEnumValue("D35.1.")
    D_35_1("D35.1."),

    /**
     * Production of electricity
     * 
     */
    @XmlEnumValue("D35.1.1")
    D_35_1_1("D35.1.1"),

    /**
     * Transmission of electricity
     * 
     */
    @XmlEnumValue("D35.1.2")
    D_35_1_2("D35.1.2"),

    /**
     * Distribution of electricity
     * 
     */
    @XmlEnumValue("D35.1.3")
    D_35_1_3("D35.1.3"),

    /**
     * Trade of electricity
     * 
     */
    @XmlEnumValue("D35.1.4")
    D_35_1_4("D35.1.4"),

    /**
     * Manufacture of gas; distribution of gaseous fuels through mains
     * 
     */
    @XmlEnumValue("D35.2.")
    D_35_2("D35.2."),

    /**
     * Manufacture of gas
     * 
     */
    @XmlEnumValue("D35.2.1")
    D_35_2_1("D35.2.1"),

    /**
     * Distribution of gaseous fuels through mains
     * 
     */
    @XmlEnumValue("D35.2.2")
    D_35_2_2("D35.2.2"),

    /**
     * Trade of gas through mains
     * 
     */
    @XmlEnumValue("D35.2.3")
    D_35_2_3("D35.2.3"),

    /**
     * Steam and air conditioning supply
     * 
     */
    @XmlEnumValue("D35.3.")
    D_35_3("D35.3."),

    /**
     * Steam and air conditioning supply
     * 
     */
    @XmlEnumValue("D35.3.0")
    D_35_3_0("D35.3.0"),

    /**
     * Whater supply; sewerage; waste managment and remediation activities
     * 
     */
    E("E"),

    /**
     * Water collection, treatment and supply
     * 
     */
    @XmlEnumValue("E36..")
    E_36("E36.."),

    /**
     * Water collection, treatment and supply
     * 
     */
    @XmlEnumValue("E36.0.")
    E_36_0("E36.0."),

    /**
     * Water collection, treatment and supply
     * 
     */
    @XmlEnumValue("E36.0.0")
    E_36_0_0("E36.0.0"),

    /**
     * Sewerage
     * 
     */
    @XmlEnumValue("E37..")
    E_37("E37.."),

    /**
     * Sewerage
     * 
     */
    @XmlEnumValue("E37.0.")
    E_37_0("E37.0."),

    /**
     * Sewerage
     * 
     */
    @XmlEnumValue("E37.0.0")
    E_37_0_0("E37.0.0"),

    /**
     * Waste collection, treatment and disposal activities; materials recovery
     * 
     */
    @XmlEnumValue("E38..")
    E_38("E38.."),

    /**
     * Waste collection
     * 
     */
    @XmlEnumValue("E38.1.")
    E_38_1("E38.1."),

    /**
     * Collection of non
     * 
     */
    @XmlEnumValue("E38.1.1")
    E_38_1_1("E38.1.1"),

    /**
     * Collection of hazardous waste
     * 
     */
    @XmlEnumValue("E38.1.2")
    E_38_1_2("E38.1.2"),

    /**
     * Waste treatment and disposal
     * 
     */
    @XmlEnumValue("E38.2.")
    E_38_2("E38.2."),

    /**
     * Treatment and disposal of non
     * 
     */
    @XmlEnumValue("E38.2.1")
    E_38_2_1("E38.2.1"),

    /**
     * Treatment and disposal of hazardous waste
     * 
     */
    @XmlEnumValue("E38.2.2")
    E_38_2_2("E38.2.2"),

    /**
     * Materials recovery
     * 
     */
    @XmlEnumValue("E38.3.")
    E_38_3("E38.3."),

    /**
     * Dismantling of wrecks
     * 
     */
    @XmlEnumValue("E38.3.1")
    E_38_3_1("E38.3.1"),

    /**
     * Recovery of sorted materials
     * 
     */
    @XmlEnumValue("E38.3.2")
    E_38_3_2("E38.3.2"),

    /**
     * Remediation activities and other waste management services
     * 
     */
    @XmlEnumValue("E39..")
    E_39("E39.."),

    /**
     * Remediation activities and other waste management services
     * 
     */
    @XmlEnumValue("E39.0.")
    E_39_0("E39.0."),

    /**
     * Remediation activities and other waste management services
     * 
     */
    @XmlEnumValue("E39.0.0")
    E_39_0_0("E39.0.0"),

    /**
     * Construction
     * 
     */
    F("F"),

    /**
     * Construction of buildings
     * 
     */
    @XmlEnumValue("F41..")
    F_41("F41.."),

    /**
     * Development of building projects
     * 
     */
    @XmlEnumValue("F41.1.")
    F_41_1("F41.1."),

    /**
     * Development of building projects
     * 
     */
    @XmlEnumValue("F41.1.0")
    F_41_1_0("F41.1.0"),

    /**
     * Construction of residential and non
     * 
     */
    @XmlEnumValue("F41.2.")
    F_41_2("F41.2."),

    /**
     * Construction of residential and non
     * 
     */
    @XmlEnumValue("F41.2.0")
    F_41_2_0("F41.2.0"),

    /**
     * Civil engineering
     * 
     */
    @XmlEnumValue("F42..")
    F_42("F42.."),

    /**
     * Construction of roads and railways
     * 
     */
    @XmlEnumValue("F42.1.")
    F_42_1("F42.1."),

    /**
     * Construction of roads and motorways
     * 
     */
    @XmlEnumValue("F42.1.1")
    F_42_1_1("F42.1.1"),

    /**
     * Construction of railways and underground railways
     * 
     */
    @XmlEnumValue("F42.1.2")
    F_42_1_2("F42.1.2"),

    /**
     * Construction of bridges and tunnels
     * 
     */
    @XmlEnumValue("F42.1.3")
    F_42_1_3("F42.1.3"),

    /**
     * Construction of utility projects
     * 
     */
    @XmlEnumValue("F42.2.")
    F_42_2("F42.2."),

    /**
     * Construction of utility projects for fluids
     * 
     */
    @XmlEnumValue("F42.2.1")
    F_42_2_1("F42.2.1"),

    /**
     * Construction of utility projects for electricity and telecommunications
     * 
     */
    @XmlEnumValue("F42.2.2")
    F_42_2_2("F42.2.2"),

    /**
     * Construction of other civil engineering projects
     * 
     */
    @XmlEnumValue("F42.9.")
    F_42_9("F42.9."),

    /**
     * Construction of water projects
     * 
     */
    @XmlEnumValue("F42.9.1")
    F_42_9_1("F42.9.1"),

    /**
     * Construction of other civil engineering projects n.e.c.
     * 
     */
    @XmlEnumValue("F42.9.9")
    F_42_9_9("F42.9.9"),

    /**
     * Specialised construction activities
     * 
     */
    @XmlEnumValue("F43..")
    F_43("F43.."),

    /**
     * Demolition and site preparation
     * 
     */
    @XmlEnumValue("F43.1.")
    F_43_1("F43.1."),

    /**
     * Demolition
     * 
     */
    @XmlEnumValue("F43.1.1")
    F_43_1_1("F43.1.1"),

    /**
     * Site preparation
     * 
     */
    @XmlEnumValue("F43.1.2")
    F_43_1_2("F43.1.2"),

    /**
     * Test drilling and boring
     * 
     */
    @XmlEnumValue("F43.1.3")
    F_43_1_3("F43.1.3"),

    /**
     * Electrical, plumbing and other construction installation activities
     * 
     */
    @XmlEnumValue("F43.2.")
    F_43_2("F43.2."),

    /**
     * Electrical installation
     * 
     */
    @XmlEnumValue("F43.2.1")
    F_43_2_1("F43.2.1"),

    /**
     * Plumbing, heat and air
     * 
     */
    @XmlEnumValue("F43.2.2")
    F_43_2_2("F43.2.2"),

    /**
     * Other construction installation
     * 
     */
    @XmlEnumValue("F43.2.9")
    F_43_2_9("F43.2.9"),

    /**
     * Building completion and finishing
     * 
     */
    @XmlEnumValue("F43.3.")
    F_43_3("F43.3."),

    /**
     * Plastering
     * 
     */
    @XmlEnumValue("F43.3.1")
    F_43_3_1("F43.3.1"),

    /**
     * Joinery installation
     * 
     */
    @XmlEnumValue("F43.3.2")
    F_43_3_2("F43.3.2"),

    /**
     * Floor and wall covering
     * 
     */
    @XmlEnumValue("F43.3.3")
    F_43_3_3("F43.3.3"),

    /**
     * Painting and glazing
     * 
     */
    @XmlEnumValue("F43.3.4")
    F_43_3_4("F43.3.4"),

    /**
     * Other building completion and finishing
     * 
     */
    @XmlEnumValue("F43.3.9")
    F_43_3_9("F43.3.9"),

    /**
     * Other specialised construction activities
     * 
     */
    @XmlEnumValue("F43.9.")
    F_43_9("F43.9."),

    /**
     * Roofing activities
     * 
     */
    @XmlEnumValue("F43.9.1")
    F_43_9_1("F43.9.1"),

    /**
     * Other specialised construction activities n.e.c.
     * 
     */
    @XmlEnumValue("F43.9.9")
    F_43_9_9("F43.9.9"),

    /**
     * Wholesale and retail trade; repair of motor vehicles and motorcycles
     * 
     */
    G("G"),

    /**
     * Wholesale and retail trade and repair of motor vehicles and motorcycles
     * 
     */
    @XmlEnumValue("G45..")
    G_45("G45.."),

    /**
     * Sale of motor vehicles
     * 
     */
    @XmlEnumValue("G45.1.")
    G_45_1("G45.1."),

    /**
     * Sale of cars and light motor vehicles
     * 
     */
    @XmlEnumValue("G45.1.1")
    G_45_1_1("G45.1.1"),

    /**
     * Sale of other motor vehicles
     * 
     */
    @XmlEnumValue("G45.1.9")
    G_45_1_9("G45.1.9"),

    /**
     * Maintenance and repair of motor vehicles
     * 
     */
    @XmlEnumValue("G45.2.")
    G_45_2("G45.2."),

    /**
     * Maintenance and repair of motor vehicles
     * 
     */
    @XmlEnumValue("G45.2.0")
    G_45_2_0("G45.2.0"),

    /**
     * Sale of motor vehicle parts and accessories
     * 
     */
    @XmlEnumValue("G45.3.")
    G_45_3("G45.3."),

    /**
     * Wholesale trade of motor vehicle parts and accessories
     * 
     */
    @XmlEnumValue("G45.3.1")
    G_45_3_1("G45.3.1"),

    /**
     * Retail trade of motor vehicle parts and accessories
     * 
     */
    @XmlEnumValue("G45.3.2")
    G_45_3_2("G45.3.2"),

    /**
     * Sale, maintenance and repair of motorcycles and related parts and accessories
     * 
     */
    @XmlEnumValue("G45.4.")
    G_45_4("G45.4."),

    /**
     * Sale, maintenance and repair of motorcycles and related parts and accessories
     * 
     */
    @XmlEnumValue("G45.4.0")
    G_45_4_0("G45.4.0"),

    /**
     * Wholesale trade, except of motor vehicles and motorcycles
     * 
     */
    @XmlEnumValue("G46..")
    G_46("G46.."),

    /**
     * Wholesale on a fee or contract basis
     * 
     */
    @XmlEnumValue("G46.1.")
    G_46_1("G46.1."),

    /**
     * Agents involved in the sale of agricultural raw materials, live animals, textile raw materials and semi
     * 
     */
    @XmlEnumValue("G46.1.1")
    G_46_1_1("G46.1.1"),

    /**
     * Agents involved in the sale of fuels, ores, metals and industrial chemicals
     * 
     */
    @XmlEnumValue("G46.1.2")
    G_46_1_2("G46.1.2"),

    /**
     * Agents involved in the sale of timber and building materials
     * 
     */
    @XmlEnumValue("G46.1.3")
    G_46_1_3("G46.1.3"),

    /**
     * Agents involved in the sale of machinery, industrial equipment, ships and aircraft
     * 
     */
    @XmlEnumValue("G46.1.4")
    G_46_1_4("G46.1.4"),

    /**
     * Agents involved in the sale of furniture, household goods, hardware and ironmongery
     * 
     */
    @XmlEnumValue("G46.1.5")
    G_46_1_5("G46.1.5"),

    /**
     * Agents involved in the sale of textiles, clothing, fur, footwear and leather goods
     * 
     */
    @XmlEnumValue("G46.1.6")
    G_46_1_6("G46.1.6"),

    /**
     * Agents involved in the sale of food, beverages and tobacco
     * 
     */
    @XmlEnumValue("G46.1.7")
    G_46_1_7("G46.1.7"),

    /**
     * Agents specialised in the sale of other particular products
     * 
     */
    @XmlEnumValue("G46.1.8")
    G_46_1_8("G46.1.8"),

    /**
     * Agents involved in the sale of a variety of goods
     * 
     */
    @XmlEnumValue("G46.1.9")
    G_46_1_9("G46.1.9"),

    /**
     * Wholesale of agricultural raw materials and live animals
     * 
     */
    @XmlEnumValue("G46.2.")
    G_46_2("G46.2."),

    /**
     * Wholesale of grain, unmanufactured tobacco, seeds and animal feeds
     * 
     */
    @XmlEnumValue("G46.2.1")
    G_46_2_1("G46.2.1"),

    /**
     * Wholesale of flowers and plants
     * 
     */
    @XmlEnumValue("G46.2.2")
    G_46_2_2("G46.2.2"),

    /**
     * Wholesale of live animals
     * 
     */
    @XmlEnumValue("G46.2.3")
    G_46_2_3("G46.2.3"),

    /**
     * Wholesale of hides, skins and leather
     * 
     */
    @XmlEnumValue("G46.2.4")
    G_46_2_4("G46.2.4"),

    /**
     * Wholesale of food, beverages and tobacco
     * 
     */
    @XmlEnumValue("G46.3.")
    G_46_3("G46.3."),

    /**
     * Wholesale of fruit and vegetables
     * 
     */
    @XmlEnumValue("G46.3.1")
    G_46_3_1("G46.3.1"),

    /**
     * Wholesale of meat and meat products
     * 
     */
    @XmlEnumValue("G46.3.2")
    G_46_3_2("G46.3.2"),

    /**
     * Wholesale of dairy products, eggs and edible oils and fats
     * 
     */
    @XmlEnumValue("G46.3.3")
    G_46_3_3("G46.3.3"),

    /**
     * Wholesale of beverages
     * 
     */
    @XmlEnumValue("G46.3.4")
    G_46_3_4("G46.3.4"),

    /**
     * Wholesale of tobacco products
     * 
     */
    @XmlEnumValue("G46.3.5")
    G_46_3_5("G46.3.5"),

    /**
     * Wholesale of sugar and chocolate and sugar confectionery
     * 
     */
    @XmlEnumValue("G46.3.6")
    G_46_3_6("G46.3.6"),

    /**
     * Wholesale of coffee, tea, cocoa and spices
     * 
     */
    @XmlEnumValue("G46.3.7")
    G_46_3_7("G46.3.7"),

    /**
     * Wholesale of other food, including fish, crustaceans and molluscs
     * 
     */
    @XmlEnumValue("G46.3.8")
    G_46_3_8("G46.3.8"),

    /**
     * Non
     * 
     */
    @XmlEnumValue("G46.3.9")
    G_46_3_9("G46.3.9"),

    /**
     * Wholesale of household goods
     * 
     */
    @XmlEnumValue("G46.4.")
    G_46_4("G46.4."),

    /**
     * Wholesale of textiles
     * 
     */
    @XmlEnumValue("G46.4.1")
    G_46_4_1("G46.4.1"),

    /**
     * Wholesale of clothing and footwear
     * 
     */
    @XmlEnumValue("G46.4.2")
    G_46_4_2("G46.4.2"),

    /**
     * Wholesale of electrical household appliances
     * 
     */
    @XmlEnumValue("G46.4.3")
    G_46_4_3("G46.4.3"),

    /**
     * Wholesale of china and glassware and cleaning materials
     * 
     */
    @XmlEnumValue("G46.4.4")
    G_46_4_4("G46.4.4"),

    /**
     * Wholesale of perfume and cosmetics
     * 
     */
    @XmlEnumValue("G46.4.5")
    G_46_4_5("G46.4.5"),

    /**
     * Wholesale of pharmaceutical goods
     * 
     */
    @XmlEnumValue("G46.4.6")
    G_46_4_6("G46.4.6"),

    /**
     * Wholesale of furniture, carpets and lighting equipment
     * 
     */
    @XmlEnumValue("G46.4.7")
    G_46_4_7("G46.4.7"),

    /**
     * Wholesale of watches and jewellery
     * 
     */
    @XmlEnumValue("G46.4.8")
    G_46_4_8("G46.4.8"),

    /**
     * Wholesale of other household goods
     * 
     */
    @XmlEnumValue("G46.4.9")
    G_46_4_9("G46.4.9"),

    /**
     * Wholesale of information and communication equipment
     * 
     */
    @XmlEnumValue("G46.5.")
    G_46_5("G46.5."),

    /**
     * Wholesale of computers, computer peripheral equipment and software
     * 
     */
    @XmlEnumValue("G46.5.1")
    G_46_5_1("G46.5.1"),

    /**
     * Wholesale of electronic and telecommunications equipment and parts
     * 
     */
    @XmlEnumValue("G46.5.2")
    G_46_5_2("G46.5.2"),

    /**
     * Wholesale of other machinery, equipment and supplies
     * 
     */
    @XmlEnumValue("G46.6.")
    G_46_6("G46.6."),

    /**
     * Wholesale of agricultural machinery, equipment and supplies
     * 
     */
    @XmlEnumValue("G46.6.1")
    G_46_6_1("G46.6.1"),

    /**
     * Wholesale of machine tools
     * 
     */
    @XmlEnumValue("G46.6.2")
    G_46_6_2("G46.6.2"),

    /**
     * Wholesale of mining, construction and civil engineering machinery
     * 
     */
    @XmlEnumValue("G46.6.3")
    G_46_6_3("G46.6.3"),

    /**
     * Wholesale of machinery for the textile industry and of sewing and knitting machines
     * 
     */
    @XmlEnumValue("G46.6.4")
    G_46_6_4("G46.6.4"),

    /**
     * Wholesale of office furniture
     * 
     */
    @XmlEnumValue("G46.6.5")
    G_46_6_5("G46.6.5"),

    /**
     * Wholesale of other office machinery and equipment
     * 
     */
    @XmlEnumValue("G46.6.6")
    G_46_6_6("G46.6.6"),

    /**
     * Wholesale of other machinery and equipment
     * 
     */
    @XmlEnumValue("G46.6.9")
    G_46_6_9("G46.6.9"),

    /**
     * Other specialised wholesale
     * 
     */
    @XmlEnumValue("G46.7.")
    G_46_7("G46.7."),

    /**
     * Wholesale of solid, liquid and gaseous fuels and related products
     * 
     */
    @XmlEnumValue("G46.7.1")
    G_46_7_1("G46.7.1"),

    /**
     * Wholesale of metals and metal ores
     * 
     */
    @XmlEnumValue("G46.7.2")
    G_46_7_2("G46.7.2"),

    /**
     * Wholesale of wood, construction materials and sanitary equipment
     * 
     */
    @XmlEnumValue("G46.7.3")
    G_46_7_3("G46.7.3"),

    /**
     * Wholesale of hardware, plumbing and heating equipment and supplies
     * 
     */
    @XmlEnumValue("G46.7.4")
    G_46_7_4("G46.7.4"),

    /**
     * Wholesale of chemical products
     * 
     */
    @XmlEnumValue("G46.7.5")
    G_46_7_5("G46.7.5"),

    /**
     * Wholesale of other intermediate products
     * 
     */
    @XmlEnumValue("G46.7.6")
    G_46_7_6("G46.7.6"),

    /**
     * Wholesale of waste and scrap
     * 
     */
    @XmlEnumValue("G46.7.7")
    G_46_7_7("G46.7.7"),

    /**
     * Non
     * 
     */
    @XmlEnumValue("G46.9.")
    G_46_9("G46.9."),

    /**
     * Non
     * 
     */
    @XmlEnumValue("G46.9.0")
    G_46_9_0("G46.9.0"),

    /**
     * Retail trade, except of motor vehicles and motorcycles
     * 
     */
    @XmlEnumValue("G47..")
    G_47("G47.."),

    /**
     * Retail sale in non
     * 
     */
    @XmlEnumValue("G47.1.")
    G_47_1("G47.1."),

    /**
     * Retail sale in non
     * 
     */
    @XmlEnumValue("G47.1.1")
    G_47_1_1("G47.1.1"),

    /**
     * Other retail sale in non
     * 
     */
    @XmlEnumValue("G47.1.9")
    G_47_1_9("G47.1.9"),

    /**
     * Retail sale of food, beverages and tobacco in specialised stores
     * 
     */
    @XmlEnumValue("G47.2.")
    G_47_2("G47.2."),

    /**
     * Retail sale of fruit and vegetables in specialised stores
     * 
     */
    @XmlEnumValue("G47.2.1")
    G_47_2_1("G47.2.1"),

    /**
     * Retail sale of meat and meat products in specialised stores
     * 
     */
    @XmlEnumValue("G47.2.2")
    G_47_2_2("G47.2.2"),

    /**
     * Retail sale of fish, crustaceans and molluscs in specialised stores
     * 
     */
    @XmlEnumValue("G47.2.3")
    G_47_2_3("G47.2.3"),

    /**
     * Retail sale of bread, cakes, flour confectionery and sugar confectionery in specialised stores
     * 
     */
    @XmlEnumValue("G47.2.4")
    G_47_2_4("G47.2.4"),

    /**
     * Retail sale of beverages in specialised stores
     * 
     */
    @XmlEnumValue("G47.2.5")
    G_47_2_5("G47.2.5"),

    /**
     * Retail sale of tobacco products in specialised stores
     * 
     */
    @XmlEnumValue("G47.2.6")
    G_47_2_6("G47.2.6"),

    /**
     * Other retail sale of food in specialised stores
     * 
     */
    @XmlEnumValue("G47.2.9")
    G_47_2_9("G47.2.9"),

    /**
     * Retail sale of automotive fuel in specialised stores
     * 
     */
    @XmlEnumValue("G47.3.")
    G_47_3("G47.3."),

    /**
     * Retail sale of automotive fuel in specialised stores
     * 
     */
    @XmlEnumValue("G47.3.0")
    G_47_3_0("G47.3.0"),

    /**
     * Retail sale of information and communication equipment in specialised stores
     * 
     */
    @XmlEnumValue("G47.4.")
    G_47_4("G47.4."),

    /**
     * Retail sale of computers, peripheral units and software in specialised stores
     * 
     */
    @XmlEnumValue("G47.4.1")
    G_47_4_1("G47.4.1"),

    /**
     * Retail sale of telecommunications equipment in specialised stores
     * 
     */
    @XmlEnumValue("G47.4.2")
    G_47_4_2("G47.4.2"),

    /**
     * Retail sale of audio and video equipment in specialised stores
     * 
     */
    @XmlEnumValue("G47.4.3")
    G_47_4_3("G47.4.3"),

    /**
     * Retail sale of other household equipment in specialised stores
     * 
     */
    @XmlEnumValue("G47.5.")
    G_47_5("G47.5."),

    /**
     * Retail sale of textiles in specialised stores
     * 
     */
    @XmlEnumValue("G47.5.1")
    G_47_5_1("G47.5.1"),

    /**
     * Retail sale of hardware, paints and glass in specialised stores
     * 
     */
    @XmlEnumValue("G47.5.2")
    G_47_5_2("G47.5.2"),

    /**
     * Retail sale of carpets, rugs, wall and floor coverings in specialised stores
     * 
     */
    @XmlEnumValue("G47.5.3")
    G_47_5_3("G47.5.3"),

    /**
     * Retail sale of electrical household appliances in specialised stores
     * 
     */
    @XmlEnumValue("G47.5.4")
    G_47_5_4("G47.5.4"),

    /**
     * Retail sale of furniture, lighting equipment and other household articles in specialised stores
     * 
     */
    @XmlEnumValue("G47.5.9")
    G_47_5_9("G47.5.9"),

    /**
     * Retail sale of cultural and recreation goods in specialised stores
     * 
     */
    @XmlEnumValue("G47.6.")
    G_47_6("G47.6."),

    /**
     * Retail sale of books in specialised stores
     * 
     */
    @XmlEnumValue("G47.6.1")
    G_47_6_1("G47.6.1"),

    /**
     * Retail sale of newspapers and stationery in specialised stores
     * 
     */
    @XmlEnumValue("G47.6.2")
    G_47_6_2("G47.6.2"),

    /**
     * Retail sale of music and video recordings in specialised stores
     * 
     */
    @XmlEnumValue("G47.6.3")
    G_47_6_3("G47.6.3"),

    /**
     * Retail sale of sporting equipment in specialised stores
     * 
     */
    @XmlEnumValue("G47.6.4")
    G_47_6_4("G47.6.4"),

    /**
     * Retail sale of games and toys in specialised stores
     * 
     */
    @XmlEnumValue("G47.6.5")
    G_47_6_5("G47.6.5"),

    /**
     * Retail sale of other goods in specialised stores
     * 
     */
    @XmlEnumValue("G47.7.")
    G_47_7("G47.7."),

    /**
     * Retail sale of clothing in specialised stores
     * 
     */
    @XmlEnumValue("G47.7.1")
    G_47_7_1("G47.7.1"),

    /**
     * Retail sale of footwear and leather goods in specialised stores
     * 
     */
    @XmlEnumValue("G47.7.2")
    G_47_7_2("G47.7.2"),

    /**
     * Dispensing chemist in specialised stores
     * 
     */
    @XmlEnumValue("G47.7.3")
    G_47_7_3("G47.7.3"),

    /**
     * Retail sale of medical and orthopaedic goods in specialised stores
     * 
     */
    @XmlEnumValue("G47.7.4")
    G_47_7_4("G47.7.4"),

    /**
     * Retail sale of cosmetic and toilet articles in specialised stores
     * 
     */
    @XmlEnumValue("G47.7.5")
    G_47_7_5("G47.7.5"),

    /**
     * Retail sale of flowers, plants, seeds, fertilisers, pet animals and pet food in specialised stores
     * 
     */
    @XmlEnumValue("G47.7.6")
    G_47_7_6("G47.7.6"),

    /**
     * Retail sale of watches and jewellery in specialised stores
     * 
     */
    @XmlEnumValue("G47.7.7")
    G_47_7_7("G47.7.7"),

    /**
     * Other retail sale of new goods in specialised stores
     * 
     */
    @XmlEnumValue("G47.7.8")
    G_47_7_8("G47.7.8"),

    /**
     * Retail sale of second
     * 
     */
    @XmlEnumValue("G47.7.9")
    G_47_7_9("G47.7.9"),

    /**
     * Retail sale via stalls and markets
     * 
     */
    @XmlEnumValue("G47.8.")
    G_47_8("G47.8."),

    /**
     * Retail sale via stalls and markets of food, beverages and tobacco products
     * 
     */
    @XmlEnumValue("G47.8.1")
    G_47_8_1("G47.8.1"),

    /**
     * Retail sale via stalls and markets of textiles, clothing and footwear
     * 
     */
    @XmlEnumValue("G47.8.2")
    G_47_8_2("G47.8.2"),

    /**
     * Retail sale via stalls and markets of other goods
     * 
     */
    @XmlEnumValue("G47.8.9")
    G_47_8_9("G47.8.9"),

    /**
     * Retail trade not in stores, stalls or markets
     * 
     */
    @XmlEnumValue("G47.9.")
    G_47_9("G47.9."),

    /**
     * Retail sale via mail order houses or via Internet
     * 
     */
    @XmlEnumValue("G47.9.1")
    G_47_9_1("G47.9.1"),

    /**
     * Other retail sale not in stores, stalls or markets
     * 
     */
    @XmlEnumValue("G47.9.9")
    G_47_9_9("G47.9.9"),

    /**
     * Transporting and storage
     * 
     */
    H("H"),

    /**
     * Land transport and transport via pipelines
     * 
     */
    @XmlEnumValue("H49..")
    H_49("H49.."),

    /**
     * Passenger rail transport, interurban
     * 
     */
    @XmlEnumValue("H49.1.")
    H_49_1("H49.1."),

    /**
     * Passenger rail transport, interurban
     * 
     */
    @XmlEnumValue("H49.1.0")
    H_49_1_0("H49.1.0"),

    /**
     * Freight rail transport
     * 
     */
    @XmlEnumValue("H49.2.")
    H_49_2("H49.2."),

    /**
     * Freight rail transport
     * 
     */
    @XmlEnumValue("H49.2.0")
    H_49_2_0("H49.2.0"),

    /**
     * Other passenger land transport
     * 
     */
    @XmlEnumValue("H49.3.")
    H_49_3("H49.3."),

    /**
     * Urban and suburban passenger land transport
     * 
     */
    @XmlEnumValue("H49.3.1")
    H_49_3_1("H49.3.1"),

    /**
     * Taxi operation
     * 
     */
    @XmlEnumValue("H49.3.2")
    H_49_3_2("H49.3.2"),

    /**
     * Other passenger land transport n.e.c.
     * 
     */
    @XmlEnumValue("H49.3.9")
    H_49_3_9("H49.3.9"),

    /**
     * Freight transport by road and removal services
     * 
     */
    @XmlEnumValue("H49.4.")
    H_49_4("H49.4."),

    /**
     * Freight transport by road
     * 
     */
    @XmlEnumValue("H49.4.1")
    H_49_4_1("H49.4.1"),

    /**
     * Removal services
     * 
     */
    @XmlEnumValue("H49.4.2")
    H_49_4_2("H49.4.2"),

    /**
     * Transport via pipeline
     * 
     */
    @XmlEnumValue("H49.5.")
    H_49_5("H49.5."),

    /**
     * Transport via pipeline
     * 
     */
    @XmlEnumValue("H49.5.0")
    H_49_5_0("H49.5.0"),

    /**
     * Water transport
     * 
     */
    @XmlEnumValue("H50..")
    H_50("H50.."),

    /**
     * Sea and coastal passenger water transport
     * 
     */
    @XmlEnumValue("H50.1.")
    H_50_1("H50.1."),

    /**
     * Sea and coastal passenger water transport
     * 
     */
    @XmlEnumValue("H50.1.0")
    H_50_1_0("H50.1.0"),

    /**
     * Sea and coastal freight water transport
     * 
     */
    @XmlEnumValue("H50.2.")
    H_50_2("H50.2."),

    /**
     * Sea and coastal freight water transport
     * 
     */
    @XmlEnumValue("H50.2.0")
    H_50_2_0("H50.2.0"),

    /**
     * Inland passenger water transport
     * 
     */
    @XmlEnumValue("H50.3.")
    H_50_3("H50.3."),

    /**
     * Inland passenger water transport
     * 
     */
    @XmlEnumValue("H50.3.0")
    H_50_3_0("H50.3.0"),

    /**
     * Inland freight water transport
     * 
     */
    @XmlEnumValue("H50.4.")
    H_50_4("H50.4."),

    /**
     * Inland freight water transport
     * 
     */
    @XmlEnumValue("H50.4.0")
    H_50_4_0("H50.4.0"),

    /**
     * Air transport
     * 
     */
    @XmlEnumValue("H51..")
    H_51("H51.."),

    /**
     * Passenger air transport
     * 
     */
    @XmlEnumValue("H51.1.")
    H_51_1("H51.1."),

    /**
     * Passenger air transport
     * 
     */
    @XmlEnumValue("H51.1.0")
    H_51_1_0("H51.1.0"),

    /**
     * Freight air transport and space transport
     * 
     */
    @XmlEnumValue("H51.2.")
    H_51_2("H51.2."),

    /**
     * Freight air transport
     * 
     */
    @XmlEnumValue("H51.2.1")
    H_51_2_1("H51.2.1"),

    /**
     * Space transport
     * 
     */
    @XmlEnumValue("H51.2.2")
    H_51_2_2("H51.2.2"),

    /**
     * Warehousing and support activities for transportation
     * 
     */
    @XmlEnumValue("H52..")
    H_52("H52.."),

    /**
     * Warehousing and storage
     * 
     */
    @XmlEnumValue("H52.1.")
    H_52_1("H52.1."),

    /**
     * Warehousing and storage
     * 
     */
    @XmlEnumValue("H52.1.0")
    H_52_1_0("H52.1.0"),

    /**
     * Support activities for transportation
     * 
     */
    @XmlEnumValue("H52.2.")
    H_52_2("H52.2."),

    /**
     * Service activities incidental to land transportation
     * 
     */
    @XmlEnumValue("H52.2.1")
    H_52_2_1("H52.2.1"),

    /**
     * Service activities incidental to water transportation
     * 
     */
    @XmlEnumValue("H52.2.2")
    H_52_2_2("H52.2.2"),

    /**
     * Service activities incidental to air transportation
     * 
     */
    @XmlEnumValue("H52.2.3")
    H_52_2_3("H52.2.3"),

    /**
     * Cargo handling
     * 
     */
    @XmlEnumValue("H52.2.4")
    H_52_2_4("H52.2.4"),

    /**
     * Other transportation support activities
     * 
     */
    @XmlEnumValue("H52.2.9")
    H_52_2_9("H52.2.9"),

    /**
     * Postal and courier activities
     * 
     */
    @XmlEnumValue("H53..")
    H_53("H53.."),

    /**
     * Postal activities under universal service obligation
     * 
     */
    @XmlEnumValue("H53.1.")
    H_53_1("H53.1."),

    /**
     * Postal activities under universal service obligation
     * 
     */
    @XmlEnumValue("H53.1.0")
    H_53_1_0("H53.1.0"),

    /**
     * Other postal and courier activities
     * 
     */
    @XmlEnumValue("H53.2.")
    H_53_2("H53.2."),

    /**
     * Other postal and courier activities
     * 
     */
    @XmlEnumValue("H53.2.0")
    H_53_2_0("H53.2.0"),

    /**
     * Accommodation and food service activities
     * 
     */
    I("I"),

    /**
     * Accommodation
     * 
     */
    @XmlEnumValue("I55..")
    I_55("I55.."),

    /**
     * Hotels and similar accommodation
     * 
     */
    @XmlEnumValue("I55.1.")
    I_55_1("I55.1."),

    /**
     * Hotels and similar accommodation
     * 
     */
    @XmlEnumValue("I55.1.0")
    I_55_1_0("I55.1.0"),

    /**
     * Holiday and other short
     * 
     */
    @XmlEnumValue("I55.2.")
    I_55_2("I55.2."),

    /**
     * Holiday and other short
     * 
     */
    @XmlEnumValue("I55.2.0")
    I_55_2_0("I55.2.0"),

    /**
     * Camping grounds, recreational vehicle parks and trailer parks
     * 
     */
    @XmlEnumValue("I55.3.")
    I_55_3("I55.3."),

    /**
     * Camping grounds, recreational vehicle parks and trailer parks
     * 
     */
    @XmlEnumValue("I55.3.0")
    I_55_3_0("I55.3.0"),

    /**
     * Other accommodation
     * 
     */
    @XmlEnumValue("I55.9.")
    I_55_9("I55.9."),

    /**
     * Other accommodation
     * 
     */
    @XmlEnumValue("I55.9.0")
    I_55_9_0("I55.9.0"),

    /**
     * Food and beverage service activities
     * 
     */
    @XmlEnumValue("I56..")
    I_56("I56.."),

    /**
     * Restaurants and mobile food service activities
     * 
     */
    @XmlEnumValue("I56.1.")
    I_56_1("I56.1."),

    /**
     * Restaurants and mobile food service activities
     * 
     */
    @XmlEnumValue("I56.1.0")
    I_56_1_0("I56.1.0"),

    /**
     * Event catering and other food service activities
     * 
     */
    @XmlEnumValue("I56.2.")
    I_56_2("I56.2."),

    /**
     * Event catering activities
     * 
     */
    @XmlEnumValue("I56.2.1")
    I_56_2_1("I56.2.1"),

    /**
     * Other food service activities
     * 
     */
    @XmlEnumValue("I56.2.9")
    I_56_2_9("I56.2.9"),

    /**
     * Beverage serving activities
     * 
     */
    @XmlEnumValue("I56.3.")
    I_56_3("I56.3."),

    /**
     * Beverage serving activities
     * 
     */
    @XmlEnumValue("I56.3.0")
    I_56_3_0("I56.3.0"),

    /**
     * Information and communication
     * 
     */
    J("J"),

    /**
     * Publishing activities
     * 
     */
    @XmlEnumValue("J58..")
    J_58("J58.."),

    /**
     * Publishing of books, periodicals and other publishing activities
     * 
     */
    @XmlEnumValue("J58.1.")
    J_58_1("J58.1."),

    /**
     * Book publishing
     * 
     */
    @XmlEnumValue("J58.1.1")
    J_58_1_1("J58.1.1"),

    /**
     * Publishing of directories and mailing lists
     * 
     */
    @XmlEnumValue("J58.1.2")
    J_58_1_2("J58.1.2"),

    /**
     * Publishing of newspapers
     * 
     */
    @XmlEnumValue("J58.1.3")
    J_58_1_3("J58.1.3"),

    /**
     * Publishing of journals and periodicals
     * 
     */
    @XmlEnumValue("J58.1.4")
    J_58_1_4("J58.1.4"),

    /**
     * Other publishing activities
     * 
     */
    @XmlEnumValue("J58.1.9")
    J_58_1_9("J58.1.9"),

    /**
     * Software publishing
     * 
     */
    @XmlEnumValue("J58.2.")
    J_58_2("J58.2."),

    /**
     * Publishing of computer games
     * 
     */
    @XmlEnumValue("J58.2.1")
    J_58_2_1("J58.2.1"),

    /**
     * Other software publishing
     * 
     */
    @XmlEnumValue("J58.2.9")
    J_58_2_9("J58.2.9"),

    /**
     * Motion picture, video and television programme production, sound recording and music publishing activities
     * 
     */
    @XmlEnumValue("J59..")
    J_59("J59.."),

    /**
     * Motion picture, video and television programme activities
     * 
     */
    @XmlEnumValue("J59.1.")
    J_59_1("J59.1."),

    /**
     * Motion picture, video and television programme production activities
     * 
     */
    @XmlEnumValue("J59.1.1")
    J_59_1_1("J59.1.1"),

    /**
     * Motion picture, video and television programme post
     * 
     */
    @XmlEnumValue("J59.1.2")
    J_59_1_2("J59.1.2"),

    /**
     * Motion picture, video and television programme distribution activities
     * 
     */
    @XmlEnumValue("J59.1.3")
    J_59_1_3("J59.1.3"),

    /**
     * Motion picture projection activities
     * 
     */
    @XmlEnumValue("J59.1.4")
    J_59_1_4("J59.1.4"),

    /**
     * Sound recording and music publishing activities
     * 
     */
    @XmlEnumValue("J59.2.")
    J_59_2("J59.2."),

    /**
     * Sound recording and music publishing activities
     * 
     */
    @XmlEnumValue("J59.2.0")
    J_59_2_0("J59.2.0"),

    /**
     * Programming and broadcasting activities
     * 
     */
    @XmlEnumValue("J60..")
    J_60("J60.."),

    /**
     * Radio broadcasting
     * 
     */
    @XmlEnumValue("J60.1.")
    J_60_1("J60.1."),

    /**
     * Radio broadcasting
     * 
     */
    @XmlEnumValue("J60.1.0")
    J_60_1_0("J60.1.0"),

    /**
     * Television programming and broadcasting activities
     * 
     */
    @XmlEnumValue("J60.2.")
    J_60_2("J60.2."),

    /**
     * Television programming and broadcasting activities
     * 
     */
    @XmlEnumValue("J60.2.0")
    J_60_2_0("J60.2.0"),

    /**
     * Telecommunications
     * 
     */
    @XmlEnumValue("J61..")
    J_61("J61.."),

    /**
     * Wired telecommunications activities
     * 
     */
    @XmlEnumValue("J61.1.")
    J_61_1("J61.1."),

    /**
     * Wired telecommunications activities
     * 
     */
    @XmlEnumValue("J61.1.0")
    J_61_1_0("J61.1.0"),

    /**
     * Wireless telecommunications activities
     * 
     */
    @XmlEnumValue("J61.2.")
    J_61_2("J61.2."),

    /**
     * Wireless telecommunications activities
     * 
     */
    @XmlEnumValue("J61.2.0")
    J_61_2_0("J61.2.0"),

    /**
     * Satellite telecommunications activities
     * 
     */
    @XmlEnumValue("J61.3.")
    J_61_3("J61.3."),

    /**
     * Satellite telecommunications activities
     * 
     */
    @XmlEnumValue("J61.3.0")
    J_61_3_0("J61.3.0"),

    /**
     * Other telecommunications activities
     * 
     */
    @XmlEnumValue("J61.9.")
    J_61_9("J61.9."),

    /**
     * Other telecommunications activities
     * 
     */
    @XmlEnumValue("J61.9.0")
    J_61_9_0("J61.9.0"),

    /**
     * Computer programming, consultancy and related activities
     * 
     */
    @XmlEnumValue("J62..")
    J_62("J62.."),

    /**
     * Computer programming, consultancy and related activities
     * 
     */
    @XmlEnumValue("J62.0.")
    J_62_0("J62.0."),

    /**
     * Computer programming activities
     * 
     */
    @XmlEnumValue("J62.0.1")
    J_62_0_1("J62.0.1"),

    /**
     * Computer consultancy activities
     * 
     */
    @XmlEnumValue("J62.0.2")
    J_62_0_2("J62.0.2"),

    /**
     * Computer facilities management activities
     * 
     */
    @XmlEnumValue("J62.0.3")
    J_62_0_3("J62.0.3"),

    /**
     * Other information technology and computer service activities
     * 
     */
    @XmlEnumValue("J62.0.9")
    J_62_0_9("J62.0.9"),

    /**
     * Information service activities
     * 
     */
    @XmlEnumValue("J63..")
    J_63("J63.."),

    /**
     * Data processing, hosting and related activities; web portals
     * 
     */
    @XmlEnumValue("J63.1.")
    J_63_1("J63.1."),

    /**
     * Data processing, hosting and related activities
     * 
     */
    @XmlEnumValue("J63.1.1")
    J_63_1_1("J63.1.1"),

    /**
     * Web portals
     * 
     */
    @XmlEnumValue("J63.1.2")
    J_63_1_2("J63.1.2"),

    /**
     * Other information service activities
     * 
     */
    @XmlEnumValue("J63.9.")
    J_63_9("J63.9."),

    /**
     * News agency activities
     * 
     */
    @XmlEnumValue("J63.9.1")
    J_63_9_1("J63.9.1"),

    /**
     * Other information service activities n.e.c.
     * 
     */
    @XmlEnumValue("J63.9.9")
    J_63_9_9("J63.9.9"),

    /**
     * Financial and insurance activities
     * 
     */
    K("K"),

    /**
     * Financial service activities, except insurance and pension funding
     * 
     */
    @XmlEnumValue("K64..")
    K_64("K64.."),

    /**
     * Monetary intermediation
     * 
     */
    @XmlEnumValue("K64.1.")
    K_64_1("K64.1."),

    /**
     * Central banking
     * 
     */
    @XmlEnumValue("K64.1.1")
    K_64_1_1("K64.1.1"),

    /**
     * Other monetary intermediation
     * 
     */
    @XmlEnumValue("K64.1.9")
    K_64_1_9("K64.1.9"),

    /**
     * Activities of holding companies
     * 
     */
    @XmlEnumValue("K64.2.")
    K_64_2("K64.2."),

    /**
     * Activities of holding companies
     * 
     */
    @XmlEnumValue("K64.2.0")
    K_64_2_0("K64.2.0"),

    /**
     * Trusts, funds and similar financial entities
     * 
     */
    @XmlEnumValue("K64.3.")
    K_64_3("K64.3."),

    /**
     * Trusts, funds and similar financial entities
     * 
     */
    @XmlEnumValue("K64.3.0")
    K_64_3_0("K64.3.0"),

    /**
     * Other financial service activities, except insurance and pension funding
     * 
     */
    @XmlEnumValue("K64.9.")
    K_64_9("K64.9."),

    /**
     * Financial leasing
     * 
     */
    @XmlEnumValue("K64.9.1")
    K_64_9_1("K64.9.1"),

    /**
     * Other credit granting
     * 
     */
    @XmlEnumValue("K64.9.2")
    K_64_9_2("K64.9.2"),

    /**
     * Other financial service activities, except insurance and pension funding n.e.c.
     * 
     */
    @XmlEnumValue("K64.9.9")
    K_64_9_9("K64.9.9"),

    /**
     * Insurance, reinsurance and pension funding, except compulsory social security
     * 
     */
    @XmlEnumValue("K65..")
    K_65("K65.."),

    /**
     * Insurance
     * 
     */
    @XmlEnumValue("K65.1.")
    K_65_1("K65.1."),

    /**
     * Life insurance
     * 
     */
    @XmlEnumValue("K65.1.1")
    K_65_1_1("K65.1.1"),

    /**
     * Non
     * 
     */
    @XmlEnumValue("K65.1.2")
    K_65_1_2("K65.1.2"),

    /**
     * Reinsurance
     * 
     */
    @XmlEnumValue("K65.2.")
    K_65_2("K65.2."),

    /**
     * Reinsurance
     * 
     */
    @XmlEnumValue("K65.2.0")
    K_65_2_0("K65.2.0"),

    /**
     * Pension funding
     * 
     */
    @XmlEnumValue("K65.3.")
    K_65_3("K65.3."),

    /**
     * Pension funding
     * 
     */
    @XmlEnumValue("K65.3.0")
    K_65_3_0("K65.3.0"),

    /**
     * Activities auxiliary to financial services and insurance activities
     * 
     */
    @XmlEnumValue("K66..")
    K_66("K66.."),

    /**
     * Activities auxiliary to financial services, except insurance and pension funding
     * 
     */
    @XmlEnumValue("K66.1.")
    K_66_1("K66.1."),

    /**
     * Administration of financial markets
     * 
     */
    @XmlEnumValue("K66.1.1")
    K_66_1_1("K66.1.1"),

    /**
     * Security and commodity contracts brokerage
     * 
     */
    @XmlEnumValue("K66.1.2")
    K_66_1_2("K66.1.2"),

    /**
     * Other activities auxiliary to financial services, except insurance and pension funding
     * 
     */
    @XmlEnumValue("K66.1.9")
    K_66_1_9("K66.1.9"),

    /**
     * Activities auxiliary to insurance and pension funding
     * 
     */
    @XmlEnumValue("K66.2.")
    K_66_2("K66.2."),

    /**
     * Risk and damage evaluation
     * 
     */
    @XmlEnumValue("K66.2.1")
    K_66_2_1("K66.2.1"),

    /**
     * Activities of insurance agents and brokers
     * 
     */
    @XmlEnumValue("K66.2.2")
    K_66_2_2("K66.2.2"),

    /**
     * Other activities auxiliary to insurance and pension funding
     * 
     */
    @XmlEnumValue("K66.2.9")
    K_66_2_9("K66.2.9"),

    /**
     * Fund management activities
     * 
     */
    @XmlEnumValue("K66.3.")
    K_66_3("K66.3."),

    /**
     * Fund management activities
     * 
     */
    @XmlEnumValue("K66.3.0")
    K_66_3_0("K66.3.0"),

    /**
     * Real estate activities
     * 
     */
    L("L"),

    /**
     * Real estate activities
     * 
     */
    @XmlEnumValue("L68..")
    L_68("L68.."),

    /**
     * Buying and selling of own real estate
     * 
     */
    @XmlEnumValue("L68.1.")
    L_68_1("L68.1."),

    /**
     * Buying and selling of own real estate
     * 
     */
    @XmlEnumValue("L68.1.0")
    L_68_1_0("L68.1.0"),

    /**
     * Renting and operating of own or leased real estate
     * 
     */
    @XmlEnumValue("L68.2.")
    L_68_2("L68.2."),

    /**
     * Renting and operating of own or leased real estate
     * 
     */
    @XmlEnumValue("L68.2.0")
    L_68_2_0("L68.2.0"),

    /**
     * Real estate activities on a fee or contract basis
     * 
     */
    @XmlEnumValue("L68.3.")
    L_68_3("L68.3."),

    /**
     * Real estate agencies
     * 
     */
    @XmlEnumValue("L68.3.1")
    L_68_3_1("L68.3.1"),

    /**
     * Management of real estate on a fee or contract basis
     * 
     */
    @XmlEnumValue("L68.3.2")
    L_68_3_2("L68.3.2"),

    /**
     * Professional, scientific and technical activities
     * 
     */
    M("M"),

    /**
     * Legal and accounting activities
     * 
     */
    @XmlEnumValue("M69..")
    M_69("M69.."),

    /**
     * Legal activities
     * 
     */
    @XmlEnumValue("M69.1.")
    M_69_1("M69.1."),

    /**
     * Legal activities
     * 
     */
    @XmlEnumValue("M69.1.0")
    M_69_1_0("M69.1.0"),

    /**
     * Accounting, bookkeeping and auditing activities; tax consultancy
     * 
     */
    @XmlEnumValue("M69.2.")
    M_69_2("M69.2."),

    /**
     * Accounting, bookkeeping and auditing activities; tax consultancy
     * 
     */
    @XmlEnumValue("M69.2.0")
    M_69_2_0("M69.2.0"),

    /**
     * Activities of head offices; management consultancy activities
     * 
     */
    @XmlEnumValue("M70..")
    M_70("M70.."),

    /**
     * Activities of head offices
     * 
     */
    @XmlEnumValue("M70.1.")
    M_70_1("M70.1."),

    /**
     * Activities of head offices
     * 
     */
    @XmlEnumValue("M70.1.0")
    M_70_1_0("M70.1.0"),

    /**
     * Management consultancy activities
     * 
     */
    @XmlEnumValue("M70.2.")
    M_70_2("M70.2."),

    /**
     * Public relations and communication activities
     * 
     */
    @XmlEnumValue("M70.2.1")
    M_70_2_1("M70.2.1"),

    /**
     * Business and other management consultancy activities
     * 
     */
    @XmlEnumValue("M70.2.2")
    M_70_2_2("M70.2.2"),

    /**
     * Architectural and engineering activities; technical testing and analysis
     * 
     */
    @XmlEnumValue("M71..")
    M_71("M71.."),

    /**
     * Architectural and engineering activities and related technical consultancy
     * 
     */
    @XmlEnumValue("M71.1.")
    M_71_1("M71.1."),

    /**
     * Architectural activities
     * 
     */
    @XmlEnumValue("M71.1.1")
    M_71_1_1("M71.1.1"),

    /**
     * Engineering activities and related technical consultancy
     * 
     */
    @XmlEnumValue("M71.1.2")
    M_71_1_2("M71.1.2"),

    /**
     * Technical testing and analysis
     * 
     */
    @XmlEnumValue("M71.2.")
    M_71_2("M71.2."),

    /**
     * Technical testing and analysis
     * 
     */
    @XmlEnumValue("M71.2.0")
    M_71_2_0("M71.2.0"),

    /**
     * Scientific research and development
     * 
     */
    @XmlEnumValue("M72..")
    M_72("M72.."),

    /**
     * Research and experimental development on natural sciences and engineering
     * 
     */
    @XmlEnumValue("M72.1.")
    M_72_1("M72.1."),

    /**
     * Research and experimental development on biotechnology
     * 
     */
    @XmlEnumValue("M72.1.1")
    M_72_1_1("M72.1.1"),

    /**
     * Other research and experimental development on natural sciences and engineering
     * 
     */
    @XmlEnumValue("M72.1.9")
    M_72_1_9("M72.1.9"),

    /**
     * Research and experimental development on social sciences and humanities
     * 
     */
    @XmlEnumValue("M72.2.")
    M_72_2("M72.2."),

    /**
     * Research and experimental development on social sciences and humanities
     * 
     */
    @XmlEnumValue("M72.2.0")
    M_72_2_0("M72.2.0"),

    /**
     * Advertising and market research
     * 
     */
    @XmlEnumValue("M73..")
    M_73("M73.."),

    /**
     * Advertising
     * 
     */
    @XmlEnumValue("M73.1.")
    M_73_1("M73.1."),

    /**
     * Advertising agencies
     * 
     */
    @XmlEnumValue("M73.1.1")
    M_73_1_1("M73.1.1"),

    /**
     * Media representation
     * 
     */
    @XmlEnumValue("M73.1.2")
    M_73_1_2("M73.1.2"),

    /**
     * Market research and public opinion polling
     * 
     */
    @XmlEnumValue("M73.2.")
    M_73_2("M73.2."),

    /**
     * Market research and public opinion polling
     * 
     */
    @XmlEnumValue("M73.2.0")
    M_73_2_0("M73.2.0"),

    /**
     * Other professional, scientific and technical activities
     * 
     */
    @XmlEnumValue("M74..")
    M_74("M74.."),

    /**
     * Specialised design activities
     * 
     */
    @XmlEnumValue("M74.1.")
    M_74_1("M74.1."),

    /**
     * Specialised design activities
     * 
     */
    @XmlEnumValue("M74.1.0")
    M_74_1_0("M74.1.0"),

    /**
     * Photographic activities
     * 
     */
    @XmlEnumValue("M74.2.")
    M_74_2("M74.2."),

    /**
     * Photographic activities
     * 
     */
    @XmlEnumValue("M74.2.0")
    M_74_2_0("M74.2.0"),

    /**
     * Translation and interpretation activities
     * 
     */
    @XmlEnumValue("M74.3.")
    M_74_3("M74.3."),

    /**
     * Translation and interpretation activities
     * 
     */
    @XmlEnumValue("M74.3.0")
    M_74_3_0("M74.3.0"),

    /**
     * Other professional, scientific and technical activities n.e.c.
     * 
     */
    @XmlEnumValue("M74.9.")
    M_74_9("M74.9."),

    /**
     * Other professional, scientific and technical activities n.e.c.
     * 
     */
    @XmlEnumValue("M74.9.0")
    M_74_9_0("M74.9.0"),

    /**
     * Veterinary activities
     * 
     */
    @XmlEnumValue("M75..")
    M_75("M75.."),

    /**
     * Veterinary activities
     * 
     */
    @XmlEnumValue("M75.0.")
    M_75_0("M75.0."),

    /**
     * Veterinary activities
     * 
     */
    @XmlEnumValue("M75.0.0")
    M_75_0_0("M75.0.0"),

    /**
     * Administrative and support service activities
     * 
     */
    N("N"),

    /**
     * Rental and leasing activities
     * 
     */
    @XmlEnumValue("N77..")
    N_77("N77.."),

    /**
     * Renting and leasing of motor vehicles
     * 
     */
    @XmlEnumValue("N77.1.")
    N_77_1("N77.1."),

    /**
     * Renting and leasing of cars and light motor vehicles
     * 
     */
    @XmlEnumValue("N77.1.1")
    N_77_1_1("N77.1.1"),

    /**
     * Renting and leasing of trucks
     * 
     */
    @XmlEnumValue("N77.1.2")
    N_77_1_2("N77.1.2"),

    /**
     * Renting and leasing of personal and household goods
     * 
     */
    @XmlEnumValue("N77.2.")
    N_77_2("N77.2."),

    /**
     * Renting and leasing of recreational and sports goods
     * 
     */
    @XmlEnumValue("N77.2.1")
    N_77_2_1("N77.2.1"),

    /**
     * Renting of video tapes and disks
     * 
     */
    @XmlEnumValue("N77.2.2")
    N_77_2_2("N77.2.2"),

    /**
     * Renting and leasing of other personal and household goods
     * 
     */
    @XmlEnumValue("N77.2.9")
    N_77_2_9("N77.2.9"),

    /**
     * Renting and leasing of other machinery, equipment and tangible goods
     * 
     */
    @XmlEnumValue("N77.3.")
    N_77_3("N77.3."),

    /**
     * Renting and leasing of agricultural machinery and equipment
     * 
     */
    @XmlEnumValue("N77.3.1")
    N_77_3_1("N77.3.1"),

    /**
     * Renting and leasing of construction and civil engineering machinery and equipment
     * 
     */
    @XmlEnumValue("N77.3.2")
    N_77_3_2("N77.3.2"),

    /**
     * Renting and leasing of office machinery and equipment (including computers)
     * 
     */
    @XmlEnumValue("N77.3.3")
    N_77_3_3("N77.3.3"),

    /**
     * Renting and leasing of water transport equipment
     * 
     */
    @XmlEnumValue("N77.3.4")
    N_77_3_4("N77.3.4"),

    /**
     * Renting and leasing of air transport equipment
     * 
     */
    @XmlEnumValue("N77.3.5")
    N_77_3_5("N77.3.5"),

    /**
     * Renting and leasing of other machinery, equipment and tangible goods n.e.c.
     * 
     */
    @XmlEnumValue("N77.3.9")
    N_77_3_9("N77.3.9"),

    /**
     * Leasing of intellectual property and similar products, except copyrighted works
     * 
     */
    @XmlEnumValue("N77.4.")
    N_77_4("N77.4."),

    /**
     * Leasing of intellectual property and similar products, except copyrighted works
     * 
     */
    @XmlEnumValue("N77.4.0")
    N_77_4_0("N77.4.0"),

    /**
     * Employment activities
     * 
     */
    @XmlEnumValue("N78..")
    N_78("N78.."),

    /**
     * Activities of employment placement agencies
     * 
     */
    @XmlEnumValue("N78.1.")
    N_78_1("N78.1."),

    /**
     * Activities of employment placement agencies
     * 
     */
    @XmlEnumValue("N78.1.0")
    N_78_1_0("N78.1.0"),

    /**
     * Temporary employment agency activities
     * 
     */
    @XmlEnumValue("N78.2.")
    N_78_2("N78.2."),

    /**
     * Temporary employment agency activities
     * 
     */
    @XmlEnumValue("N78.2.0")
    N_78_2_0("N78.2.0"),

    /**
     * Other human resources provision
     * 
     */
    @XmlEnumValue("N78.3.")
    N_78_3("N78.3."),

    /**
     * Other human resources provision
     * 
     */
    @XmlEnumValue("N78.3.0")
    N_78_3_0("N78.3.0"),

    /**
     * Travel agency, tour operator and other reservation service and related activities
     * 
     */
    @XmlEnumValue("N79..")
    N_79("N79.."),

    /**
     * Travel agency and tour operator activities
     * 
     */
    @XmlEnumValue("N79.1.")
    N_79_1("N79.1."),

    /**
     * Travel agency activities
     * 
     */
    @XmlEnumValue("N79.1.1")
    N_79_1_1("N79.1.1"),

    /**
     * Tour operator activities
     * 
     */
    @XmlEnumValue("N79.1.2")
    N_79_1_2("N79.1.2"),

    /**
     * Other reservation service and related activities
     * 
     */
    @XmlEnumValue("N79.9.")
    N_79_9("N79.9."),

    /**
     * Other reservation service and related activities
     * 
     */
    @XmlEnumValue("N79.9.0")
    N_79_9_0("N79.9.0"),

    /**
     * Security and investigation activities
     * 
     */
    @XmlEnumValue("N80..")
    N_80("N80.."),

    /**
     * Private security activities
     * 
     */
    @XmlEnumValue("N80.1.")
    N_80_1("N80.1."),

    /**
     * Private security activities
     * 
     */
    @XmlEnumValue("N80.1.0")
    N_80_1_0("N80.1.0"),

    /**
     * Security systems service activities
     * 
     */
    @XmlEnumValue("N80.2.")
    N_80_2("N80.2."),

    /**
     * Security systems service activities
     * 
     */
    @XmlEnumValue("N80.2.0")
    N_80_2_0("N80.2.0"),

    /**
     * Investigation activities
     * 
     */
    @XmlEnumValue("N80.3.")
    N_80_3("N80.3."),

    /**
     * Investigation activities
     * 
     */
    @XmlEnumValue("N80.3.0")
    N_80_3_0("N80.3.0"),

    /**
     * Services to buildings and landscape activities
     * 
     */
    @XmlEnumValue("N81..")
    N_81("N81.."),

    /**
     * Combined facilities support activities
     * 
     */
    @XmlEnumValue("N81.1.")
    N_81_1("N81.1."),

    /**
     * Combined facilities support activities
     * 
     */
    @XmlEnumValue("N81.1.0")
    N_81_1_0("N81.1.0"),

    /**
     * Cleaning activities
     * 
     */
    @XmlEnumValue("N81.2.")
    N_81_2("N81.2."),

    /**
     * General cleaning of buildings
     * 
     */
    @XmlEnumValue("N81.2.1")
    N_81_2_1("N81.2.1"),

    /**
     * Other building and industrial cleaning activities
     * 
     */
    @XmlEnumValue("N81.2.2")
    N_81_2_2("N81.2.2"),

    /**
     * Other cleaning activities
     * 
     */
    @XmlEnumValue("N81.2.9")
    N_81_2_9("N81.2.9"),

    /**
     * Landscape service activities
     * 
     */
    @XmlEnumValue("N81.3.")
    N_81_3("N81.3."),

    /**
     * Landscape service activities
     * 
     */
    @XmlEnumValue("N81.3.0")
    N_81_3_0("N81.3.0"),

    /**
     * Office administrative, office support and other business support activities
     * 
     */
    @XmlEnumValue("N82..")
    N_82("N82.."),

    /**
     * Office administrative and support activities
     * 
     */
    @XmlEnumValue("N82.1.")
    N_82_1("N82.1."),

    /**
     * Combined office administrative service activities
     * 
     */
    @XmlEnumValue("N82.1.1")
    N_82_1_1("N82.1.1"),

    /**
     * Photocopying, document preparation and other specialised office support activities
     * 
     */
    @XmlEnumValue("N82.1.9")
    N_82_1_9("N82.1.9"),

    /**
     * Activities of call centres
     * 
     */
    @XmlEnumValue("N82.2.")
    N_82_2("N82.2."),

    /**
     * Activities of call centres
     * 
     */
    @XmlEnumValue("N82.2.0")
    N_82_2_0("N82.2.0"),

    /**
     * Organisation of conventions and trade shows
     * 
     */
    @XmlEnumValue("N82.3.")
    N_82_3("N82.3."),

    /**
     * Organisation of conventions and trade shows
     * 
     */
    @XmlEnumValue("N82.3.0")
    N_82_3_0("N82.3.0"),

    /**
     * Business support service activities n.e.c.
     * 
     */
    @XmlEnumValue("N82.9.")
    N_82_9("N82.9."),

    /**
     * Activities of collection agencies and credit bureaus
     * 
     */
    @XmlEnumValue("N82.9.1")
    N_82_9_1("N82.9.1"),

    /**
     * Packaging activities
     * 
     */
    @XmlEnumValue("N82.9.2")
    N_82_9_2("N82.9.2"),

    /**
     * Other business support service activities n.e.c.
     * 
     */
    @XmlEnumValue("N82.9.9")
    N_82_9_9("N82.9.9"),

    /**
     * Public administration and defence; compulsatory social security
     * 
     */
    O("O"),

    /**
     * Public administration and defence; compulsory social security
     * 
     */
    @XmlEnumValue("O84..")
    O_84("O84.."),

    /**
     * Administration of the State and the economic and social policy of the community
     * 
     */
    @XmlEnumValue("O84.1.")
    O_84_1("O84.1."),

    /**
     * General public administration activities
     * 
     */
    @XmlEnumValue("O84.1.1")
    O_84_1_1("O84.1.1"),

    /**
     * Regulation of the activities of providing health care, education, cultural services and other social services, excluding social security
     * 
     */
    @XmlEnumValue("O84.1.2")
    O_84_1_2("O84.1.2"),

    /**
     * Regulation of and contribution to more efficient operation of businesses
     * 
     */
    @XmlEnumValue("O84.1.3")
    O_84_1_3("O84.1.3"),

    /**
     * Provision of services to the community as a whole
     * 
     */
    @XmlEnumValue("O84.2.")
    O_84_2("O84.2."),

    /**
     * Foreign affairs
     * 
     */
    @XmlEnumValue("O84.2.1")
    O_84_2_1("O84.2.1"),

    /**
     * Defence activities
     * 
     */
    @XmlEnumValue("O84.2.2")
    O_84_2_2("O84.2.2"),

    /**
     * Justice and judicial activities
     * 
     */
    @XmlEnumValue("O84.2.3")
    O_84_2_3("O84.2.3"),

    /**
     * Public order and safety activities
     * 
     */
    @XmlEnumValue("O84.2.4")
    O_84_2_4("O84.2.4"),

    /**
     * Fire service activities
     * 
     */
    @XmlEnumValue("O84.2.5")
    O_84_2_5("O84.2.5"),

    /**
     * Compulsory social security activities
     * 
     */
    @XmlEnumValue("O84.3.")
    O_84_3("O84.3."),

    /**
     * Compulsory social security activities
     * 
     */
    @XmlEnumValue("O84.3.0")
    O_84_3_0("O84.3.0"),

    /**
     * Education
     * 
     */
    P("P"),

    /**
     * Education
     * 
     */
    @XmlEnumValue("P85..")
    P_85("P85.."),

    /**
     * Pre
     * 
     */
    @XmlEnumValue("P85.1.")
    P_85_1("P85.1."),

    /**
     * Pre
     * 
     */
    @XmlEnumValue("P85.1.0")
    P_85_1_0("P85.1.0"),

    /**
     * Primary education
     * 
     */
    @XmlEnumValue("P85.2.")
    P_85_2("P85.2."),

    /**
     * Primary education
     * 
     */
    @XmlEnumValue("P85.2.0")
    P_85_2_0("P85.2.0"),

    /**
     * Secondary education
     * 
     */
    @XmlEnumValue("P85.3.")
    P_85_3("P85.3."),

    /**
     * General secondary education
     * 
     */
    @XmlEnumValue("P85.3.1")
    P_85_3_1("P85.3.1"),

    /**
     * Technical and vocational secondary education
     * 
     */
    @XmlEnumValue("P85.3.2")
    P_85_3_2("P85.3.2"),

    /**
     * Higher education
     * 
     */
    @XmlEnumValue("P85.4.")
    P_85_4("P85.4."),

    /**
     * Post
     * 
     */
    @XmlEnumValue("P85.4.1")
    P_85_4_1("P85.4.1"),

    /**
     * Tertiary education
     * 
     */
    @XmlEnumValue("P85.4.2")
    P_85_4_2("P85.4.2"),

    /**
     * Other education
     * 
     */
    @XmlEnumValue("P85.5.")
    P_85_5("P85.5."),

    /**
     * Sports and recreation education
     * 
     */
    @XmlEnumValue("P85.5.1")
    P_85_5_1("P85.5.1"),

    /**
     * Cultural education
     * 
     */
    @XmlEnumValue("P85.5.2")
    P_85_5_2("P85.5.2"),

    /**
     * Driving school activities
     * 
     */
    @XmlEnumValue("P85.5.3")
    P_85_5_3("P85.5.3"),

    /**
     * Other education n.e.c.
     * 
     */
    @XmlEnumValue("P85.5.9")
    P_85_5_9("P85.5.9"),

    /**
     * Educational support activities
     * 
     */
    @XmlEnumValue("P85.6.")
    P_85_6("P85.6."),

    /**
     * Educational support activities
     * 
     */
    @XmlEnumValue("P85.6.0")
    P_85_6_0("P85.6.0"),

    /**
     * Human helth and social work activities
     * 
     */
    Q("Q"),

    /**
     * Human health activities
     * 
     */
    @XmlEnumValue("Q86..")
    Q_86("Q86.."),

    /**
     * Hospital activities
     * 
     */
    @XmlEnumValue("Q86.1.")
    Q_86_1("Q86.1."),

    /**
     * Hospital activities
     * 
     */
    @XmlEnumValue("Q86.1.0")
    Q_86_1_0("Q86.1.0"),

    /**
     * Medical and dental practice activities
     * 
     */
    @XmlEnumValue("Q86.2.")
    Q_86_2("Q86.2."),

    /**
     * General medical practice activities
     * 
     */
    @XmlEnumValue("Q86.2.1")
    Q_86_2_1("Q86.2.1"),

    /**
     * Specialist medical practice activities
     * 
     */
    @XmlEnumValue("Q86.2.2")
    Q_86_2_2("Q86.2.2"),

    /**
     * Dental practice activities
     * 
     */
    @XmlEnumValue("Q86.2.3")
    Q_86_2_3("Q86.2.3"),

    /**
     * Other human health activities
     * 
     */
    @XmlEnumValue("Q86.9.")
    Q_86_9("Q86.9."),

    /**
     * Other human health activities
     * 
     */
    @XmlEnumValue("Q86.9.0")
    Q_86_9_0("Q86.9.0"),

    /**
     * Residential care activities
     * 
     */
    @XmlEnumValue("Q87..")
    Q_87("Q87.."),

    /**
     * Residential nursing care activities
     * 
     */
    @XmlEnumValue("Q87.1.")
    Q_87_1("Q87.1."),

    /**
     * Residential nursing care activities
     * 
     */
    @XmlEnumValue("Q87.1.0")
    Q_87_1_0("Q87.1.0"),

    /**
     * Residential care activities for mental retardation, mental health and substance abuse
     * 
     */
    @XmlEnumValue("Q87.2.")
    Q_87_2("Q87.2."),

    /**
     * Residential care activities for mental retardation, mental health and substance abuse
     * 
     */
    @XmlEnumValue("Q87.2.0")
    Q_87_2_0("Q87.2.0"),

    /**
     * Residential care activities for the elderly and disabled
     * 
     */
    @XmlEnumValue("Q87.3.")
    Q_87_3("Q87.3."),

    /**
     * Residential care activities for the elderly and disabled
     * 
     */
    @XmlEnumValue("Q87.3.0")
    Q_87_3_0("Q87.3.0"),

    /**
     * Other residential care activities
     * 
     */
    @XmlEnumValue("Q87.9.")
    Q_87_9("Q87.9."),

    /**
     * Other residential care activities
     * 
     */
    @XmlEnumValue("Q87.9.0")
    Q_87_9_0("Q87.9.0"),

    /**
     * Social work activities without accommodation
     * 
     */
    @XmlEnumValue("Q88..")
    Q_88("Q88.."),

    /**
     * Social work activities without accommodation for the elderly and disabled
     * 
     */
    @XmlEnumValue("Q88.1.")
    Q_88_1("Q88.1."),

    /**
     * Social work activities without accommodation for the elderly and disabled
     * 
     */
    @XmlEnumValue("Q88.1.0")
    Q_88_1_0("Q88.1.0"),

    /**
     * Other social work activities without accommodation
     * 
     */
    @XmlEnumValue("Q88.9.")
    Q_88_9("Q88.9."),

    /**
     * Child day
     * 
     */
    @XmlEnumValue("Q88.9.1")
    Q_88_9_1("Q88.9.1"),

    /**
     * Other social work activities without accommodation n.e.c.
     * 
     */
    @XmlEnumValue("Q88.9.9")
    Q_88_9_9("Q88.9.9"),

    /**
     * Arts, entertainment and recreation
     * 
     */
    R("R"),

    /**
     * Creative, arts and entertainment activities
     * 
     */
    @XmlEnumValue("R90..")
    R_90("R90.."),

    /**
     * Creative, arts and entertainment activities
     * 
     */
    @XmlEnumValue("R90.0.")
    R_90_0("R90.0."),

    /**
     * Performing arts
     * 
     */
    @XmlEnumValue("R90.0.1")
    R_90_0_1("R90.0.1"),

    /**
     * Support activities to performing arts
     * 
     */
    @XmlEnumValue("R90.0.2")
    R_90_0_2("R90.0.2"),

    /**
     * Artistic creation
     * 
     */
    @XmlEnumValue("R90.0.3")
    R_90_0_3("R90.0.3"),

    /**
     * Operation of arts facilities
     * 
     */
    @XmlEnumValue("R90.0.4")
    R_90_0_4("R90.0.4"),

    /**
     * Libraries, archives, museums and other cultural activities
     * 
     */
    @XmlEnumValue("R91..")
    R_91("R91.."),

    /**
     * Libraries, archives, museums and other cultural activities
     * 
     */
    @XmlEnumValue("R91.0.")
    R_91_0("R91.0."),

    /**
     * Library and archives activities
     * 
     */
    @XmlEnumValue("R91.0.1")
    R_91_0_1("R91.0.1"),

    /**
     * Museums activities
     * 
     */
    @XmlEnumValue("R91.0.2")
    R_91_0_2("R91.0.2"),

    /**
     * Operation of historical sites and buildings and similar visitor attractions
     * 
     */
    @XmlEnumValue("R91.0.3")
    R_91_0_3("R91.0.3"),

    /**
     * Botanical and zoological gardens and nature reserves activities
     * 
     */
    @XmlEnumValue("R91.0.4")
    R_91_0_4("R91.0.4"),

    /**
     * Gambling and betting activities
     * 
     */
    @XmlEnumValue("R92..")
    R_92("R92.."),

    /**
     * Gambling and betting activities
     * 
     */
    @XmlEnumValue("R92.0.")
    R_92_0("R92.0."),

    /**
     * Gambling and betting activities
     * 
     */
    @XmlEnumValue("R92.0.0")
    R_92_0_0("R92.0.0"),

    /**
     * Sports activities and amusement and recreation activities
     * 
     */
    @XmlEnumValue("R93..")
    R_93("R93.."),

    /**
     * Sports activities
     * 
     */
    @XmlEnumValue("R93.1.")
    R_93_1("R93.1."),

    /**
     * Operation of sports facilities
     * 
     */
    @XmlEnumValue("R93.1.1")
    R_93_1_1("R93.1.1"),

    /**
     * Activities of sport clubs
     * 
     */
    @XmlEnumValue("R93.1.2")
    R_93_1_2("R93.1.2"),

    /**
     * Fitness facilities
     * 
     */
    @XmlEnumValue("R93.1.3")
    R_93_1_3("R93.1.3"),

    /**
     * Other sports activities
     * 
     */
    @XmlEnumValue("R93.1.9")
    R_93_1_9("R93.1.9"),

    /**
     * Amusement and recreation activities
     * 
     */
    @XmlEnumValue("R93.2.")
    R_93_2("R93.2."),

    /**
     * Activities of amusement parks and theme parks
     * 
     */
    @XmlEnumValue("R93.2.1")
    R_93_2_1("R93.2.1"),

    /**
     * Other amusement and recreation activities
     * 
     */
    @XmlEnumValue("R93.2.9")
    R_93_2_9("R93.2.9"),

    /**
     * Other services activities
     * 
     */
    S("S"),

    /**
     * Activities of membership organisations
     * 
     */
    @XmlEnumValue("S94..")
    S_94("S94.."),

    /**
     * Activities of business, employers and professional membership organisations
     * 
     */
    @XmlEnumValue("S94.1.")
    S_94_1("S94.1."),

    /**
     * Activities of business and employers membership organisations
     * 
     */
    @XmlEnumValue("S94.1.1")
    S_94_1_1("S94.1.1"),

    /**
     * Activities of professional membership organisations
     * 
     */
    @XmlEnumValue("S94.1.2")
    S_94_1_2("S94.1.2"),

    /**
     * Activities of trade unions
     * 
     */
    @XmlEnumValue("S94.2.")
    S_94_2("S94.2."),

    /**
     * Activities of trade unions
     * 
     */
    @XmlEnumValue("S94.2.0")
    S_94_2_0("S94.2.0"),

    /**
     * Activities of other membership organisations
     * 
     */
    @XmlEnumValue("S94.9.")
    S_94_9("S94.9."),

    /**
     * Activities of religious organisations
     * 
     */
    @XmlEnumValue("S94.9.1")
    S_94_9_1("S94.9.1"),

    /**
     * Activities of political organisations
     * 
     */
    @XmlEnumValue("S94.9.2")
    S_94_9_2("S94.9.2"),

    /**
     * Activities of other membership organisations n.e.c.
     * 
     */
    @XmlEnumValue("S94.9.9")
    S_94_9_9("S94.9.9"),

    /**
     * Repair of computers and personal and household goods
     * 
     */
    @XmlEnumValue("S95..")
    S_95("S95.."),

    /**
     * Repair of computers and communication equipment
     * 
     */
    @XmlEnumValue("S95.1.")
    S_95_1("S95.1."),

    /**
     * Repair of computers and peripheral equipment
     * 
     */
    @XmlEnumValue("S95.1.1")
    S_95_1_1("S95.1.1"),

    /**
     * Repair of communication equipment
     * 
     */
    @XmlEnumValue("S95.1.2")
    S_95_1_2("S95.1.2"),

    /**
     * Repair of personal and household goods
     * 
     */
    @XmlEnumValue("S95.2.")
    S_95_2("S95.2."),

    /**
     * Repair of consumer electronics
     * 
     */
    @XmlEnumValue("S95.2.1")
    S_95_2_1("S95.2.1"),

    /**
     * Repair of household appliances and home and garden equipment
     * 
     */
    @XmlEnumValue("S95.2.2")
    S_95_2_2("S95.2.2"),

    /**
     * Repair of footwear and leather goods
     * 
     */
    @XmlEnumValue("S95.2.3")
    S_95_2_3("S95.2.3"),

    /**
     * Repair of furniture and home furnishings
     * 
     */
    @XmlEnumValue("S95.2.4")
    S_95_2_4("S95.2.4"),

    /**
     * Repair of watches, clocks and jewellery
     * 
     */
    @XmlEnumValue("S95.2.5")
    S_95_2_5("S95.2.5"),

    /**
     * Repair of other personal and household goods
     * 
     */
    @XmlEnumValue("S95.2.9")
    S_95_2_9("S95.2.9"),

    /**
     * Other personal service activities
     * 
     */
    @XmlEnumValue("S96..")
    S_96("S96.."),

    /**
     * Other personal service activities
     * 
     */
    @XmlEnumValue("S96.0.")
    S_96_0("S96.0."),

    /**
     * Washing and (dry
     * 
     */
    @XmlEnumValue("S96.0.1")
    S_96_0_1("S96.0.1"),

    /**
     * Hairdressing and other beauty treatment
     * 
     */
    @XmlEnumValue("S96.0.2")
    S_96_0_2("S96.0.2"),

    /**
     * Funeral and related activities
     * 
     */
    @XmlEnumValue("S96.0.3")
    S_96_0_3("S96.0.3"),

    /**
     * Physical well
     * 
     */
    @XmlEnumValue("S96.0.4")
    S_96_0_4("S96.0.4"),

    /**
     * Other personal service activities n.e.c.
     * 
     */
    @XmlEnumValue("S96.0.9")
    S_96_0_9("S96.0.9"),

    /**
     * Activities of hoseholds as employers; undifferentiated goods
     * 
     */
    T("T"),

    /**
     * Activities of households as employers of domestic personnel
     * 
     */
    @XmlEnumValue("T97..")
    T_97("T97.."),

    /**
     * Activities of households as employers of domestic personnel
     * 
     */
    @XmlEnumValue("T97.0.")
    T_97_0("T97.0."),

    /**
     * Activities of households as employers of domestic personnel
     * 
     */
    @XmlEnumValue("T97.0.0")
    T_97_0_0("T97.0.0"),

    /**
     * Undifferentiated goods
     * 
     */
    @XmlEnumValue("T98..")
    T_98("T98.."),

    /**
     * Undifferentiated goods
     * 
     */
    @XmlEnumValue("T98.1.")
    T_98_1("T98.1."),

    /**
     * Undifferentiated goods
     * 
     */
    @XmlEnumValue("T98.1.0")
    T_98_1_0("T98.1.0"),

    /**
     * Undifferentiated service
     * 
     */
    @XmlEnumValue("T98.2.")
    T_98_2("T98.2."),

    /**
     * Undifferentiated service
     * 
     */
    @XmlEnumValue("T98.2.0")
    T_98_2_0("T98.2.0"),

    /**
     * Activities of extraterritorial organisations and bodies
     * 
     */
    U("U"),

    /**
     * Activities of extraterritorial organisations and bodies
     * 
     */
    @XmlEnumValue("U99..")
    U_99("U99.."),

    /**
     * Activities of extraterritorial organisations and bodies
     * 
     */
    @XmlEnumValue("U99.0.")
    U_99_0("U99.0."),

    /**
     * Activities of extraterritorial organisations and bodies
     * 
     */
    @XmlEnumValue("U99.0.0")
    U_99_0_0("U99.0.0");
    private final String value;

    Sector(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Sector fromValue(String v) {
        for (Sector c: Sector.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
