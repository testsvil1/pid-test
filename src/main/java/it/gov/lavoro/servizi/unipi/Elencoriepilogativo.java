//
// Questo file Ŕ stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrÓ persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.03.07 alle 03:27:17 PM CET 
//


package it.gov.lavoro.servizi.unipi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per elencoriepilogativo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="elencoriepilogativo">
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
 *         &lt;element name="numLavBaseComputoArt3" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="numLavBaseComputoArt18" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="categoriacompdisabili" type="{http://servizi.lavoro.gov.it/UNIPI}categoriacompensazione" minOccurs="0"/>
 *         &lt;element name="numerocompdisabili" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico" minOccurs="0"/>
 *         &lt;element name="categoriacompcatprotette" type="{http://servizi.lavoro.gov.it/UNIPI}categoriacompensazione" minOccurs="0"/>
 *         &lt;element name="numerocompcatprotette" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico" minOccurs="0"/>
 *         &lt;element name="disabili" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="catprotette" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="quotariservadisabili" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="quotariservacatprotette" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="esonerati" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="scoperturedisabili" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="scoperturecatprotette" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="sospensioniincorso" type="{http://servizi.lavoro.gov.it/UNIPI}S-N"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elencoriepilogativo", propOrder = {
    "provincia",
    "numLavBaseComputoArt3",
    "numLavBaseComputoArt18",
    "categoriacompdisabili",
    "numerocompdisabili",
    "categoriacompcatprotette",
    "numerocompcatprotette",
    "disabili",
    "catprotette",
    "quotariservadisabili",
    "quotariservacatprotette",
    "esonerati",
    "scoperturedisabili",
    "scoperturecatprotette",
    "sospensioniincorso"
})
public class Elencoriepilogativo {

    @XmlElement(required = true)
    protected String provincia;
    @XmlElement(required = true)
    protected String numLavBaseComputoArt3;
    @XmlElement(required = true)
    protected String numLavBaseComputoArt18;
    @XmlSchemaType(name = "string")
    protected Categoriacompensazione categoriacompdisabili;
    protected String numerocompdisabili;
    @XmlSchemaType(name = "string")
    protected Categoriacompensazione categoriacompcatprotette;
    protected String numerocompcatprotette;
    @XmlElement(required = true)
    protected String disabili;
    @XmlElement(required = true)
    protected String catprotette;
    @XmlElement(required = true)
    protected String quotariservadisabili;
    @XmlElement(required = true)
    protected String quotariservacatprotette;
    @XmlElement(required = true)
    protected String esonerati;
    @XmlElement(required = true)
    protected String scoperturedisabili;
    @XmlElement(required = true)
    protected String scoperturecatprotette;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SN sospensioniincorso;

    /**
     * Recupera il valore della proprietÓ provincia.
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
     * Imposta il valore della proprietÓ provincia.
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
     * Recupera il valore della proprietÓ numLavBaseComputoArt3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumLavBaseComputoArt3() {
        return numLavBaseComputoArt3;
    }

    /**
     * Imposta il valore della proprietÓ numLavBaseComputoArt3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumLavBaseComputoArt3(String value) {
        this.numLavBaseComputoArt3 = value;
    }

    /**
     * Recupera il valore della proprietÓ numLavBaseComputoArt18.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumLavBaseComputoArt18() {
        return numLavBaseComputoArt18;
    }

    /**
     * Imposta il valore della proprietÓ numLavBaseComputoArt18.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumLavBaseComputoArt18(String value) {
        this.numLavBaseComputoArt18 = value;
    }

    /**
     * Recupera il valore della proprietÓ categoriacompdisabili.
     * 
     * @return
     *     possible object is
     *     {@link Categoriacompensazione }
     *     
     */
    public Categoriacompensazione getCategoriacompdisabili() {
        return categoriacompdisabili;
    }

    /**
     * Imposta il valore della proprietÓ categoriacompdisabili.
     * 
     * @param value
     *     allowed object is
     *     {@link Categoriacompensazione }
     *     
     */
    public void setCategoriacompdisabili(Categoriacompensazione value) {
        this.categoriacompdisabili = value;
    }

    /**
     * Recupera il valore della proprietÓ numerocompdisabili.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerocompdisabili() {
        return numerocompdisabili;
    }

    /**
     * Imposta il valore della proprietÓ numerocompdisabili.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerocompdisabili(String value) {
        this.numerocompdisabili = value;
    }

    /**
     * Recupera il valore della proprietÓ categoriacompcatprotette.
     * 
     * @return
     *     possible object is
     *     {@link Categoriacompensazione }
     *     
     */
    public Categoriacompensazione getCategoriacompcatprotette() {
        return categoriacompcatprotette;
    }

    /**
     * Imposta il valore della proprietÓ categoriacompcatprotette.
     * 
     * @param value
     *     allowed object is
     *     {@link Categoriacompensazione }
     *     
     */
    public void setCategoriacompcatprotette(Categoriacompensazione value) {
        this.categoriacompcatprotette = value;
    }

    /**
     * Recupera il valore della proprietÓ numerocompcatprotette.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerocompcatprotette() {
        return numerocompcatprotette;
    }

    /**
     * Imposta il valore della proprietÓ numerocompcatprotette.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerocompcatprotette(String value) {
        this.numerocompcatprotette = value;
    }

    /**
     * Recupera il valore della proprietÓ disabili.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabili() {
        return disabili;
    }

    /**
     * Imposta il valore della proprietÓ disabili.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabili(String value) {
        this.disabili = value;
    }

    /**
     * Recupera il valore della proprietÓ catprotette.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatprotette() {
        return catprotette;
    }

    /**
     * Imposta il valore della proprietÓ catprotette.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatprotette(String value) {
        this.catprotette = value;
    }

    /**
     * Recupera il valore della proprietÓ quotariservadisabili.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotariservadisabili() {
        return quotariservadisabili;
    }

    /**
     * Imposta il valore della proprietÓ quotariservadisabili.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotariservadisabili(String value) {
        this.quotariservadisabili = value;
    }

    /**
     * Recupera il valore della proprietÓ quotariservacatprotette.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotariservacatprotette() {
        return quotariservacatprotette;
    }

    /**
     * Imposta il valore della proprietÓ quotariservacatprotette.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotariservacatprotette(String value) {
        this.quotariservacatprotette = value;
    }

    /**
     * Recupera il valore della proprietÓ esonerati.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsonerati() {
        return esonerati;
    }

    /**
     * Imposta il valore della proprietÓ esonerati.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsonerati(String value) {
        this.esonerati = value;
    }

    /**
     * Recupera il valore della proprietÓ scoperturedisabili.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoperturedisabili() {
        return scoperturedisabili;
    }

    /**
     * Imposta il valore della proprietÓ scoperturedisabili.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoperturedisabili(String value) {
        this.scoperturedisabili = value;
    }

    /**
     * Recupera il valore della proprietÓ scoperturecatprotette.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoperturecatprotette() {
        return scoperturecatprotette;
    }

    /**
     * Imposta il valore della proprietÓ scoperturecatprotette.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoperturecatprotette(String value) {
        this.scoperturecatprotette = value;
    }

    /**
     * Recupera il valore della proprietÓ sospensioniincorso.
     * 
     * @return
     *     possible object is
     *     {@link SN }
     *     
     */
    public SN getSospensioniincorso() {
        return sospensioniincorso;
    }

    /**
     * Imposta il valore della proprietÓ sospensioniincorso.
     * 
     * @param value
     *     allowed object is
     *     {@link SN }
     *     
     */
    public void setSospensioniincorso(SN value) {
        this.sospensioniincorso = value;
    }

}
