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
 * <p>Classe Java per datiaziendali complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="datiaziendali">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dichiarante" type="{http://servizi.lavoro.gov.it/UNIPI}dichiarante"/>
 *         &lt;element name="sedelegale" type="{http://servizi.lavoro.gov.it/UNIPI}sedelegale"/>
 *         &lt;element name="referente" type="{http://servizi.lavoro.gov.it/UNIPI}referente"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiaziendali", propOrder = {
    "dichiarante",
    "sedelegale",
    "referente"
})
public class Datiaziendali {

    @XmlElement(required = true)
    protected Dichiarante dichiarante;
    @XmlElement(required = true)
    protected Sedelegale sedelegale;
    @XmlElement(required = true)
    protected Referente referente;

    /**
     * Recupera il valore della proprietà dichiarante.
     * 
     * @return
     *     possible object is
     *     {@link Dichiarante }
     *     
     */
    public Dichiarante getDichiarante() {
        return dichiarante;
    }

    /**
     * Imposta il valore della proprietà dichiarante.
     * 
     * @param value
     *     allowed object is
     *     {@link Dichiarante }
     *     
     */
    public void setDichiarante(Dichiarante value) {
        this.dichiarante = value;
    }

    /**
     * Recupera il valore della proprietà sedelegale.
     * 
     * @return
     *     possible object is
     *     {@link Sedelegale }
     *     
     */
    public Sedelegale getSedelegale() {
        return sedelegale;
    }

    /**
     * Imposta il valore della proprietà sedelegale.
     * 
     * @param value
     *     allowed object is
     *     {@link Sedelegale }
     *     
     */
    public void setSedelegale(Sedelegale value) {
        this.sedelegale = value;
    }

    /**
     * Recupera il valore della proprietà referente.
     * 
     * @return
     *     possible object is
     *     {@link Referente }
     *     
     */
    public Referente getReferente() {
        return referente;
    }

    /**
     * Imposta il valore della proprietà referente.
     * 
     * @param value
     *     allowed object is
     *     {@link Referente }
     *     
     */
    public void setReferente(Referente value) {
        this.referente = value;
    }

}
