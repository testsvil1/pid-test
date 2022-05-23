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
 * <p>Classe Java per sedelegale complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="sedelegale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comunesedelegale" type="{http://servizi.lavoro.gov.it/UNIPI}Comune"/>
 *         &lt;element name="capsedelegale" type="{http://servizi.lavoro.gov.it/UNIPI}Cap"/>
 *         &lt;element name="indirizzosedelegale" type="{http://servizi.lavoro.gov.it/UNIPI}Stringa100"/>
 *         &lt;group ref="{http://servizi.lavoro.gov.it/UNIPI}Recapiti"/>
 *         &lt;element name="PECemail" type="{http://servizi.lavoro.gov.it/UNIPI}EMail"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sedelegale", propOrder = {
    "comunesedelegale",
    "capsedelegale",
    "indirizzosedelegale",
    "telefono",
    "fax",
    "email",
    "peCemail"
})
public class Sedelegale {

    @XmlElement(required = true)
    protected String comunesedelegale;
    @XmlElement(required = true)
    protected String capsedelegale;
    @XmlElement(required = true)
    protected String indirizzosedelegale;
    protected String telefono;
    protected String fax;
    protected String email;
    @XmlElement(name = "PECemail", required = true)
    protected String peCemail;

    /**
     * Recupera il valore della proprietà comunesedelegale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComunesedelegale() {
        return comunesedelegale;
    }

    /**
     * Imposta il valore della proprietà comunesedelegale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComunesedelegale(String value) {
        this.comunesedelegale = value;
    }

    /**
     * Recupera il valore della proprietà capsedelegale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapsedelegale() {
        return capsedelegale;
    }

    /**
     * Imposta il valore della proprietà capsedelegale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapsedelegale(String value) {
        this.capsedelegale = value;
    }

    /**
     * Recupera il valore della proprietà indirizzosedelegale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirizzosedelegale() {
        return indirizzosedelegale;
    }

    /**
     * Imposta il valore della proprietà indirizzosedelegale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirizzosedelegale(String value) {
        this.indirizzosedelegale = value;
    }

    /**
     * Recupera il valore della proprietà telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Imposta il valore della proprietà telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Recupera il valore della proprietà fax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Imposta il valore della proprietà fax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Recupera il valore della proprietà email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Imposta il valore della proprietà email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Recupera il valore della proprietà peCemail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPECemail() {
        return peCemail;
    }

    /**
     * Imposta il valore della proprietà peCemail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPECemail(String value) {
        this.peCemail = value;
    }

}
