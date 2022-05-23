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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per compensazioni complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="compensazioni">
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
 *         &lt;element name="categoriacomp" type="{http://servizi.lavoro.gov.it/UNIPI}categoriacompensazione"/>
 *         &lt;element name="numero" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="categoriasogg" type="{http://servizi.lavoro.gov.it/UNIPI}categoriasoggetto"/>
 *         &lt;element name="codicefiscaleaziendagruppo" type="{http://servizi.lavoro.gov.it/UNIPI}CodiceFiscale" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compensazioni", propOrder = {
    "provincia",
    "categoriacomp",
    "numero",
    "categoriasogg",
    "codicefiscaleaziendagruppo"
})
public class Compensazioni {

    @XmlElement(required = true)
    protected String provincia;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Categoriacompensazione categoriacomp;
    @XmlElement(required = true)
    protected String numero;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Categoriasoggetto categoriasogg;
    protected String codicefiscaleaziendagruppo;

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
     * Recupera il valore della proprietà categoriacomp.
     * 
     * @return
     *     possible object is
     *     {@link Categoriacompensazione }
     *     
     */
    public Categoriacompensazione getCategoriacomp() {
        return categoriacomp;
    }

    /**
     * Imposta il valore della proprietà categoriacomp.
     * 
     * @param value
     *     allowed object is
     *     {@link Categoriacompensazione }
     *     
     */
    public void setCategoriacomp(Categoriacompensazione value) {
        this.categoriacomp = value;
    }

    /**
     * Recupera il valore della proprietà numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Imposta il valore della proprietà numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Recupera il valore della proprietà categoriasogg.
     * 
     * @return
     *     possible object is
     *     {@link Categoriasoggetto }
     *     
     */
    public Categoriasoggetto getCategoriasogg() {
        return categoriasogg;
    }

    /**
     * Imposta il valore della proprietà categoriasogg.
     * 
     * @param value
     *     allowed object is
     *     {@link Categoriasoggetto }
     *     
     */
    public void setCategoriasogg(Categoriasoggetto value) {
        this.categoriasogg = value;
    }

    /**
     * Recupera il valore della proprietà codicefiscaleaziendagruppo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodicefiscaleaziendagruppo() {
        return codicefiscaleaziendagruppo;
    }

    /**
     * Imposta il valore della proprietà codicefiscaleaziendagruppo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodicefiscaleaziendagruppo(String value) {
        this.codicefiscaleaziendagruppo = value;
    }

}
