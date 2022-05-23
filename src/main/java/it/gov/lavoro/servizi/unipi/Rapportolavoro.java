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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per rapportolavoro complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="rapportolavoro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datainizio" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="tipologiacontr" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://servizi.lavoro.gov.it/UNIPI}Stringa">
 *               &lt;pattern value="[A-Z]{1}(\.[0-9]{2}){2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="datafine" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="qualifica" type="{http://servizi.lavoro.gov.it/UNIPI}QualificaProfessionale"/>
 *         &lt;element name="tipoassunzione">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="orariosettimanale">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{2}:\d{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="orariosettimanaleparttime">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{2}:\d{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="categoriasogg" type="{http://servizi.lavoro.gov.it/UNIPI}categoriasoggetto"/>
 *         &lt;element name="categoriaass" type="{http://servizi.lavoro.gov.it/UNIPI}categoriaassunzione"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rapportolavoro", propOrder = {
    "datainizio",
    "tipologiacontr",
    "datafine",
    "qualifica",
    "tipoassunzione",
    "orariosettimanale",
    "orariosettimanaleparttime",
    "categoriasogg",
    "categoriaass"
})
public class Rapportolavoro {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datainizio;
    protected String tipologiacontr;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datafine;
    @XmlElement(required = true)
    protected String qualifica;
    @XmlElement(required = true)
    protected String tipoassunzione;
    @XmlElement(required = true)
    protected String orariosettimanale;
    @XmlElement(required = true)
    protected String orariosettimanaleparttime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Categoriasoggetto categoriasogg;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Categoriaassunzione categoriaass;

    /**
     * Recupera il valore della proprietà datainizio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatainizio() {
        return datainizio;
    }

    /**
     * Imposta il valore della proprietà datainizio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatainizio(XMLGregorianCalendar value) {
        this.datainizio = value;
    }

    /**
     * Recupera il valore della proprietà tipologiacontr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipologiacontr() {
        return tipologiacontr;
    }

    /**
     * Imposta il valore della proprietà tipologiacontr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipologiacontr(String value) {
        this.tipologiacontr = value;
    }

    /**
     * Recupera il valore della proprietà datafine.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatafine() {
        return datafine;
    }

    /**
     * Imposta il valore della proprietà datafine.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatafine(XMLGregorianCalendar value) {
        this.datafine = value;
    }

    /**
     * Recupera il valore della proprietà qualifica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifica() {
        return qualifica;
    }

    /**
     * Imposta il valore della proprietà qualifica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifica(String value) {
        this.qualifica = value;
    }

    /**
     * Recupera il valore della proprietà tipoassunzione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoassunzione() {
        return tipoassunzione;
    }

    /**
     * Imposta il valore della proprietà tipoassunzione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoassunzione(String value) {
        this.tipoassunzione = value;
    }

    /**
     * Recupera il valore della proprietà orariosettimanale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrariosettimanale() {
        return orariosettimanale;
    }

    /**
     * Imposta il valore della proprietà orariosettimanale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrariosettimanale(String value) {
        this.orariosettimanale = value;
    }

    /**
     * Recupera il valore della proprietà orariosettimanaleparttime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrariosettimanaleparttime() {
        return orariosettimanaleparttime;
    }

    /**
     * Imposta il valore della proprietà orariosettimanaleparttime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrariosettimanaleparttime(String value) {
        this.orariosettimanaleparttime = value;
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
     * Recupera il valore della proprietà categoriaass.
     * 
     * @return
     *     possible object is
     *     {@link Categoriaassunzione }
     *     
     */
    public Categoriaassunzione getCategoriaass() {
        return categoriaass;
    }

    /**
     * Imposta il valore della proprietà categoriaass.
     * 
     * @param value
     *     allowed object is
     *     {@link Categoriaassunzione }
     *     
     */
    public void setCategoriaass(Categoriaassunzione value) {
        this.categoriaass = value;
    }

}
