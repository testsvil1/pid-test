//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.03.07 alle 03:27:17 PM CET 
//


package it.gov.lavoro.servizi.unipi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per datiprospetto complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="datiprospetto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datariferimento" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="capogruppo" type="{http://servizi.lavoro.gov.it/UNIPI}S-N"/>
 *         &lt;element name="cfcapogruppo" type="{http://servizi.lavoro.gov.it/UNIPI}CodiceFiscaleInternazionale" minOccurs="0"/>
 *         &lt;element name="capogruppoestera" type="{http://servizi.lavoro.gov.it/UNIPI}S-N" minOccurs="0"/>
 *         &lt;element name="nlavoratorinazionali" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="categoriaazienda" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="A"/>
 *               &lt;enumeration value="B"/>
 *               &lt;enumeration value="C"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="dataprimaassunzione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *             &lt;element name="datasecondaassunzione" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *             &lt;element name="nessunaassunzioneaggiuntiva" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="nessunaassunzioneaggiuntiva" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiprospetto", propOrder = {
    "content"
})
public class Datiprospetto {

    @XmlElementRefs({
        @XmlElementRef(name = "dataprimaassunzione", namespace = "http://servizi.lavoro.gov.it/UNIPI", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "datariferimento", namespace = "http://servizi.lavoro.gov.it/UNIPI", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "capogruppo", namespace = "http://servizi.lavoro.gov.it/UNIPI", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "capogruppoestera", namespace = "http://servizi.lavoro.gov.it/UNIPI", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "categoriaazienda", namespace = "http://servizi.lavoro.gov.it/UNIPI", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cfcapogruppo", namespace = "http://servizi.lavoro.gov.it/UNIPI", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "nlavoratorinazionali", namespace = "http://servizi.lavoro.gov.it/UNIPI", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "datasecondaassunzione", namespace = "http://servizi.lavoro.gov.it/UNIPI", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "nessunaassunzioneaggiuntiva", namespace = "http://servizi.lavoro.gov.it/UNIPI", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Recupera il resto del modello di contenuto. 
     * 
     * <p>
     * Questa proprietà "catch-all" viene recuperata per il seguente motivo: 
     * Il nome di campo "Nessunaassunzioneaggiuntiva" è usato da due diverse parti di uno schema. Vedere: 
     * riga 346 di file:/C:/temp/Unipi.xsd
     * riga 342 di file:/C:/temp/Unipi.xsd
     * <p>
     * Per eliminare questa proprietà, applicare una personalizzazione della proprietà a una 
     * delle seguenti due dichiarazioni per modificarne il nome: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link SN }{@code >}
     * {@link JAXBElement }{@code <}{@link SN }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
