//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.03.07 alle 03:27:17 PM CET 
//


package it.gov.lavoro.servizi.unipi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per personale complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="personale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nlavoratori" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="disabili" type="{http://servizi.lavoro.gov.it/UNIPI}lavoratoritempopienoparttime"/>
 *         &lt;element name="centralinisti" type="{http://servizi.lavoro.gov.it/UNIPI}lavoratoritempopienoparttime"/>
 *         &lt;element name="massofisioterapisti" type="{http://servizi.lavoro.gov.it/UNIPI}lavoratoritempopienoparttime"/>
 *         &lt;element name="telelavoro" type="{http://servizi.lavoro.gov.it/UNIPI}lavoratoritempopienoparttime"/>
 *         &lt;element name="categorieescluse" type="{http://servizi.lavoro.gov.it/UNIPI}categorieescluse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dettaglioparttime" type="{http://servizi.lavoro.gov.it/UNIPI}dettaglioparttime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dettagliointermittenti" type="{http://servizi.lavoro.gov.it/UNIPI}dettagliointermittenti" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="categorieprotette" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="dicuiinforzaal17012000" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personale", propOrder = {
    "nlavoratori",
    "disabili",
    "centralinisti",
    "massofisioterapisti",
    "telelavoro",
    "categorieescluse",
    "dettaglioparttime",
    "dettagliointermittenti",
    "categorieprotette",
    "dicuiinforzaal17012000"
})
public class Personale {

    @XmlElement(required = true)
    protected String nlavoratori;
    @XmlElement(required = true)
    protected Lavoratoritempopienoparttime disabili;
    @XmlElement(required = true)
    protected Lavoratoritempopienoparttime centralinisti;
    @XmlElement(required = true)
    protected Lavoratoritempopienoparttime massofisioterapisti;
    @XmlElement(required = true)
    protected Lavoratoritempopienoparttime telelavoro;
    protected List<Categorieescluse> categorieescluse;
    protected List<Dettaglioparttime> dettaglioparttime;
    protected List<Dettagliointermittenti> dettagliointermittenti;
    @XmlElement(required = true)
    protected String categorieprotette;
    protected String dicuiinforzaal17012000;

    /**
     * Recupera il valore della proprietà nlavoratori.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNlavoratori() {
        return nlavoratori;
    }

    /**
     * Imposta il valore della proprietà nlavoratori.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNlavoratori(String value) {
        this.nlavoratori = value;
    }

    /**
     * Recupera il valore della proprietà disabili.
     * 
     * @return
     *     possible object is
     *     {@link Lavoratoritempopienoparttime }
     *     
     */
    public Lavoratoritempopienoparttime getDisabili() {
        return disabili;
    }

    /**
     * Imposta il valore della proprietà disabili.
     * 
     * @param value
     *     allowed object is
     *     {@link Lavoratoritempopienoparttime }
     *     
     */
    public void setDisabili(Lavoratoritempopienoparttime value) {
        this.disabili = value;
    }

    /**
     * Recupera il valore della proprietà centralinisti.
     * 
     * @return
     *     possible object is
     *     {@link Lavoratoritempopienoparttime }
     *     
     */
    public Lavoratoritempopienoparttime getCentralinisti() {
        return centralinisti;
    }

    /**
     * Imposta il valore della proprietà centralinisti.
     * 
     * @param value
     *     allowed object is
     *     {@link Lavoratoritempopienoparttime }
     *     
     */
    public void setCentralinisti(Lavoratoritempopienoparttime value) {
        this.centralinisti = value;
    }

    /**
     * Recupera il valore della proprietà massofisioterapisti.
     * 
     * @return
     *     possible object is
     *     {@link Lavoratoritempopienoparttime }
     *     
     */
    public Lavoratoritempopienoparttime getMassofisioterapisti() {
        return massofisioterapisti;
    }

    /**
     * Imposta il valore della proprietà massofisioterapisti.
     * 
     * @param value
     *     allowed object is
     *     {@link Lavoratoritempopienoparttime }
     *     
     */
    public void setMassofisioterapisti(Lavoratoritempopienoparttime value) {
        this.massofisioterapisti = value;
    }

    /**
     * Recupera il valore della proprietà telelavoro.
     * 
     * @return
     *     possible object is
     *     {@link Lavoratoritempopienoparttime }
     *     
     */
    public Lavoratoritempopienoparttime getTelelavoro() {
        return telelavoro;
    }

    /**
     * Imposta il valore della proprietà telelavoro.
     * 
     * @param value
     *     allowed object is
     *     {@link Lavoratoritempopienoparttime }
     *     
     */
    public void setTelelavoro(Lavoratoritempopienoparttime value) {
        this.telelavoro = value;
    }

    /**
     * Gets the value of the categorieescluse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categorieescluse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategorieescluse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Categorieescluse }
     * 
     * 
     */
    public List<Categorieescluse> getCategorieescluse() {
        if (categorieescluse == null) {
            categorieescluse = new ArrayList<Categorieescluse>();
        }
        return this.categorieescluse;
    }

    /**
     * Gets the value of the dettaglioparttime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dettaglioparttime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDettaglioparttime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dettaglioparttime }
     * 
     * 
     */
    public List<Dettaglioparttime> getDettaglioparttime() {
        if (dettaglioparttime == null) {
            dettaglioparttime = new ArrayList<Dettaglioparttime>();
        }
        return this.dettaglioparttime;
    }

    /**
     * Gets the value of the dettagliointermittenti property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dettagliointermittenti property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDettagliointermittenti().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dettagliointermittenti }
     * 
     * 
     */
    public List<Dettagliointermittenti> getDettagliointermittenti() {
        if (dettagliointermittenti == null) {
            dettagliointermittenti = new ArrayList<Dettagliointermittenti>();
        }
        return this.dettagliointermittenti;
    }

    /**
     * Recupera il valore della proprietà categorieprotette.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategorieprotette() {
        return categorieprotette;
    }

    /**
     * Imposta il valore della proprietà categorieprotette.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategorieprotette(String value) {
        this.categorieprotette = value;
    }

    /**
     * Recupera il valore della proprietà dicuiinforzaal17012000.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicuiinforzaal17012000() {
        return dicuiinforzaal17012000;
    }

    /**
     * Imposta il valore della proprietà dicuiinforzaal17012000.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicuiinforzaal17012000(String value) {
        this.dicuiinforzaal17012000 = value;
    }

}
