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
 * <p>Classe Java per dichiarante complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="dichiarante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipologiadichiarante">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="A"/>
 *               &lt;enumeration value="B"/>
 *               &lt;enumeration value="C"/>
 *               &lt;enumeration value="D"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codicefiscale" type="{http://servizi.lavoro.gov.it/UNIPI}CodiceFiscale"/>
 *         &lt;element name="denominazione" type="{http://servizi.lavoro.gov.it/UNIPI}Stringa100"/>
 *         &lt;element name="settore" type="{http://servizi.lavoro.gov.it/UNIPI}Settore"/>
 *         &lt;element name="ccnl" type="{http://servizi.lavoro.gov.it/UNIPI}CCNL"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dichiarante", propOrder = {
    "tipologiadichiarante",
    "codicefiscale",
    "denominazione",
    "settore",
    "ccnl"
})
public class Dichiarante {

    @XmlElement(required = true)
    protected String tipologiadichiarante;
    @XmlElement(required = true)
    protected String codicefiscale;
    @XmlElement(required = true)
    protected String denominazione;
    @XmlElement(required = true)
    protected String settore;
    @XmlElement(required = true)
    protected String ccnl;

    /**
     * Recupera il valore della proprietà tipologiadichiarante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipologiadichiarante() {
        return tipologiadichiarante;
    }

    /**
     * Imposta il valore della proprietà tipologiadichiarante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipologiadichiarante(String value) {
        this.tipologiadichiarante = value;
    }

    /**
     * Recupera il valore della proprietà codicefiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodicefiscale() {
        return codicefiscale;
    }

    /**
     * Imposta il valore della proprietà codicefiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodicefiscale(String value) {
        this.codicefiscale = value;
    }

    /**
     * Recupera il valore della proprietà denominazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominazione() {
        return denominazione;
    }

    /**
     * Imposta il valore della proprietà denominazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominazione(String value) {
        this.denominazione = value;
    }

    /**
     * Recupera il valore della proprietà settore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettore() {
        return settore;
    }

    /**
     * Imposta il valore della proprietà settore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettore(String value) {
        this.settore = value;
    }

    /**
     * Recupera il valore della proprietà ccnl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcnl() {
        return ccnl;
    }

    /**
     * Imposta il valore della proprietà ccnl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcnl(String value) {
        this.ccnl = value;
    }

}
