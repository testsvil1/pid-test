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
 * <p>Classe Java per datiprovinciali complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="datiprovinciali">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="provincia">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sederiferimento" type="{http://servizi.lavoro.gov.it/UNIPI}sederiferimentominimo"/>
 *         &lt;element name="referente" type="{http://servizi.lavoro.gov.it/UNIPI}referenteminimo"/>
 *         &lt;element name="nposticentralinisti" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://servizi.lavoro.gov.it/UNIPI}Stringa">
 *               &lt;pattern value="[0-9]{1,2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="npostimassofisioterapisti" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://servizi.lavoro.gov.it/UNIPI}Stringa">
 *               &lt;pattern value="[0-9]{1,2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiprovinciali", propOrder = {
    "provincia",
    "sederiferimento",
    "referente",
    "nposticentralinisti",
    "npostimassofisioterapisti"
})
public class Datiprovinciali {

    @XmlElement(required = true)
    protected String provincia;
    @XmlElement(required = true)
    protected Sederiferimentominimo sederiferimento;
    @XmlElement(required = true)
    protected Referenteminimo referente;
    protected String nposticentralinisti;
    protected String npostimassofisioterapisti;

    /**
     * Recupera il valore della proprietà provincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Imposta il valore della proprietà provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Recupera il valore della proprietà sederiferimento.
     * 
     * @return
     *     possible object is
     *     {@link Sederiferimentominimo }
     *     
     */
    public Sederiferimentominimo getSederiferimento() {
        return sederiferimento;
    }

    /**
     * Imposta il valore della proprietà sederiferimento.
     * 
     * @param value
     *     allowed object is
     *     {@link Sederiferimentominimo }
     *     
     */
    public void setSederiferimento(Sederiferimentominimo value) {
        this.sederiferimento = value;
    }

    /**
     * Recupera il valore della proprietà referente.
     * 
     * @return
     *     possible object is
     *     {@link Referenteminimo }
     *     
     */
    public Referenteminimo getReferente() {
        return referente;
    }

    /**
     * Imposta il valore della proprietà referente.
     * 
     * @param value
     *     allowed object is
     *     {@link Referenteminimo }
     *     
     */
    public void setReferente(Referenteminimo value) {
        this.referente = value;
    }

    /**
     * Recupera il valore della proprietà nposticentralinisti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNposticentralinisti() {
        return nposticentralinisti;
    }

    /**
     * Imposta il valore della proprietà nposticentralinisti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNposticentralinisti(String value) {
        this.nposticentralinisti = value;
    }

    /**
     * Recupera il valore della proprietà npostimassofisioterapisti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNpostimassofisioterapisti() {
        return npostimassofisioterapisti;
    }

    /**
     * Imposta il valore della proprietà npostimassofisioterapisti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNpostimassofisioterapisti(String value) {
        this.npostimassofisioterapisti = value;
    }

}
