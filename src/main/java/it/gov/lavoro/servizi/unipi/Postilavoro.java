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
 * <p>Classe Java per postilavoro complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="postilavoro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qualificaprof" type="{http://servizi.lavoro.gov.it/UNIPI}QualificaProfessionale"/>
 *         &lt;element name="mansione">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://servizi.lavoro.gov.it/UNIPI}Stringa">
 *               &lt;maxLength value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nposti" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="categoriasogg" type="{http://servizi.lavoro.gov.it/UNIPI}categoriasoggetto"/>
 *         &lt;element name="comuneass" type="{http://servizi.lavoro.gov.it/UNIPI}Comune"/>
 *         &lt;element name="capacitacontroindicazioni">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://servizi.lavoro.gov.it/UNIPI}Stringa">
 *               &lt;maxLength value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="barrierearchitettoniche" type="{http://servizi.lavoro.gov.it/UNIPI}S-N"/>
 *         &lt;element name="turninotturni" type="{http://servizi.lavoro.gov.it/UNIPI}S-N"/>
 *         &lt;element name="mezzipubblici" type="{http://servizi.lavoro.gov.it/UNIPI}S-N"/>
 *         &lt;element name="categoriaass" type="{http://servizi.lavoro.gov.it/UNIPI}categoriaassunzione" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postilavoro", propOrder = {
    "qualificaprof",
    "mansione",
    "nposti",
    "categoriasogg",
    "comuneass",
    "capacitacontroindicazioni",
    "barrierearchitettoniche",
    "turninotturni",
    "mezzipubblici",
    "categoriaass"
})
public class Postilavoro {

    @XmlElement(required = true)
    protected String qualificaprof;
    @XmlElement(required = true)
    protected String mansione;
    @XmlElement(required = true)
    protected String nposti;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Categoriasoggetto categoriasogg;
    @XmlElement(required = true)
    protected String comuneass;
    @XmlElement(required = true)
    protected String capacitacontroindicazioni;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SN barrierearchitettoniche;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SN turninotturni;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SN mezzipubblici;
    @XmlSchemaType(name = "string")
    protected Categoriaassunzione categoriaass;

    /**
     * Recupera il valore della proprietà qualificaprof.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificaprof() {
        return qualificaprof;
    }

    /**
     * Imposta il valore della proprietà qualificaprof.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificaprof(String value) {
        this.qualificaprof = value;
    }

    /**
     * Recupera il valore della proprietà mansione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMansione() {
        return mansione;
    }

    /**
     * Imposta il valore della proprietà mansione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMansione(String value) {
        this.mansione = value;
    }

    /**
     * Recupera il valore della proprietà nposti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNposti() {
        return nposti;
    }

    /**
     * Imposta il valore della proprietà nposti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNposti(String value) {
        this.nposti = value;
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
     * Recupera il valore della proprietà comuneass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComuneass() {
        return comuneass;
    }

    /**
     * Imposta il valore della proprietà comuneass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComuneass(String value) {
        this.comuneass = value;
    }

    /**
     * Recupera il valore della proprietà capacitacontroindicazioni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapacitacontroindicazioni() {
        return capacitacontroindicazioni;
    }

    /**
     * Imposta il valore della proprietà capacitacontroindicazioni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapacitacontroindicazioni(String value) {
        this.capacitacontroindicazioni = value;
    }

    /**
     * Recupera il valore della proprietà barrierearchitettoniche.
     * 
     * @return
     *     possible object is
     *     {@link SN }
     *     
     */
    public SN getBarrierearchitettoniche() {
        return barrierearchitettoniche;
    }

    /**
     * Imposta il valore della proprietà barrierearchitettoniche.
     * 
     * @param value
     *     allowed object is
     *     {@link SN }
     *     
     */
    public void setBarrierearchitettoniche(SN value) {
        this.barrierearchitettoniche = value;
    }

    /**
     * Recupera il valore della proprietà turninotturni.
     * 
     * @return
     *     possible object is
     *     {@link SN }
     *     
     */
    public SN getTurninotturni() {
        return turninotturni;
    }

    /**
     * Imposta il valore della proprietà turninotturni.
     * 
     * @param value
     *     allowed object is
     *     {@link SN }
     *     
     */
    public void setTurninotturni(SN value) {
        this.turninotturni = value;
    }

    /**
     * Recupera il valore della proprietà mezzipubblici.
     * 
     * @return
     *     possible object is
     *     {@link SN }
     *     
     */
    public SN getMezzipubblici() {
        return mezzipubblici;
    }

    /**
     * Imposta il valore della proprietà mezzipubblici.
     * 
     * @param value
     *     allowed object is
     *     {@link SN }
     *     
     */
    public void setMezzipubblici(SN value) {
        this.mezzipubblici = value;
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
