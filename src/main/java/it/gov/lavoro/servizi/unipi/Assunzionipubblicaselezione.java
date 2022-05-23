//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.03.07 alle 03:27:17 PM CET 
//


package it.gov.lavoro.servizi.unipi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per assunzionipubblicaselezione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="assunzionipubblicaselezione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regione" type="{http://servizi.lavoro.gov.it/UNIPI}Regione"/>
 *         &lt;element name="saldodisabili" type="{http://servizi.lavoro.gov.it/UNIPI}NumericoPositivoNegativo"/>
 *         &lt;element name="saldoexart18" type="{http://servizi.lavoro.gov.it/UNIPI}NumericoPositivoNegativo"/>
 *         &lt;element name="note" type="{http://servizi.lavoro.gov.it/UNIPI}note" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assunzionipubblicaselezione", propOrder = {
    "regione",
    "saldodisabili",
    "saldoexart18",
    "note"
})
public class Assunzionipubblicaselezione {

    @XmlElement(required = true)
    protected String regione;
    @XmlElement(required = true)
    protected String saldodisabili;
    @XmlElement(required = true)
    protected String saldoexart18;
    protected String note;

    /**
     * Recupera il valore della proprietà regione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegione() {
        return regione;
    }

    /**
     * Imposta il valore della proprietà regione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegione(String value) {
        this.regione = value;
    }

    /**
     * Recupera il valore della proprietà saldodisabili.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaldodisabili() {
        return saldodisabili;
    }

    /**
     * Imposta il valore della proprietà saldodisabili.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaldodisabili(String value) {
        this.saldodisabili = value;
    }

    /**
     * Recupera il valore della proprietà saldoexart18.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaldoexart18() {
        return saldoexart18;
    }

    /**
     * Imposta il valore della proprietà saldoexart18.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaldoexart18(String value) {
        this.saldoexart18 = value;
    }

    /**
     * Recupera il valore della proprietà note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Imposta il valore della proprietà note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
