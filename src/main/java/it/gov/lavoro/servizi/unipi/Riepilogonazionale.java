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
 * <p>Classe Java per riepilogonazionale complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="riepilogonazionale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numLavBaseComputoArt3" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="numLavBaseComputoArt18" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="quotariservadisabili" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="quotariservacatprotette" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="esoneri" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="disabili" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="catprotette" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="quotaesuberiArt18" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
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
@XmlType(name = "riepilogonazionale", propOrder = {
    "numLavBaseComputoArt3",
    "numLavBaseComputoArt18",
    "quotariservadisabili",
    "quotariservacatprotette",
    "esoneri",
    "disabili",
    "catprotette",
    "quotaesuberiArt18",
    "scoperturedisabili",
    "scoperturecatprotette",
    "sospensioniincorso"
})
public class Riepilogonazionale {

    @XmlElement(required = true)
    protected String numLavBaseComputoArt3;
    @XmlElement(required = true)
    protected String numLavBaseComputoArt18;
    @XmlElement(required = true)
    protected String quotariservadisabili;
    @XmlElement(required = true)
    protected String quotariservacatprotette;
    @XmlElement(required = true)
    protected String esoneri;
    @XmlElement(required = true)
    protected String disabili;
    @XmlElement(required = true)
    protected String catprotette;
    @XmlElement(required = true)
    protected String quotaesuberiArt18;
    @XmlElement(required = true)
    protected String scoperturedisabili;
    @XmlElement(required = true)
    protected String scoperturecatprotette;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SN sospensioniincorso;

    /**
     * Recupera il valore della proprietà numLavBaseComputoArt3.
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
     * Imposta il valore della proprietà numLavBaseComputoArt3.
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
     * Recupera il valore della proprietà numLavBaseComputoArt18.
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
     * Imposta il valore della proprietà numLavBaseComputoArt18.
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
     * Recupera il valore della proprietà quotariservadisabili.
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
     * Imposta il valore della proprietà quotariservadisabili.
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
     * Recupera il valore della proprietà quotariservacatprotette.
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
     * Imposta il valore della proprietà quotariservacatprotette.
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
     * Recupera il valore della proprietà esoneri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsoneri() {
        return esoneri;
    }

    /**
     * Imposta il valore della proprietà esoneri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsoneri(String value) {
        this.esoneri = value;
    }

    /**
     * Recupera il valore della proprietà disabili.
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
     * Imposta il valore della proprietà disabili.
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
     * Recupera il valore della proprietà catprotette.
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
     * Imposta il valore della proprietà catprotette.
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
     * Recupera il valore della proprietà quotaesuberiArt18.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotaesuberiArt18() {
        return quotaesuberiArt18;
    }

    /**
     * Imposta il valore della proprietà quotaesuberiArt18.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotaesuberiArt18(String value) {
        this.quotaesuberiArt18 = value;
    }

    /**
     * Recupera il valore della proprietà scoperturedisabili.
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
     * Imposta il valore della proprietà scoperturedisabili.
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
     * Recupera il valore della proprietà scoperturecatprotette.
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
     * Imposta il valore della proprietà scoperturecatprotette.
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
     * Recupera il valore della proprietà sospensioniincorso.
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
     * Imposta il valore della proprietà sospensioniincorso.
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
