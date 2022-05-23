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
 * <p>Classe Java per quadro3 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="quadro3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="riepilogonazionale" type="{http://servizi.lavoro.gov.it/UNIPI}riepilogonazionale"/>
 *         &lt;element name="elencoriepilogativoprovinciale" type="{http://servizi.lavoro.gov.it/UNIPI}elencoriepilogativo" maxOccurs="unbounded"/>
 *         &lt;element name="note" type="{http://servizi.lavoro.gov.it/UNIPI}note" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quadro3", propOrder = {
    "riepilogonazionale",
    "elencoriepilogativoprovinciale",
    "note"
})
public class Quadro3 {

    @XmlElement(required = true)
    protected Riepilogonazionale riepilogonazionale;
    @XmlElement(required = true)
    protected List<Elencoriepilogativo> elencoriepilogativoprovinciale;
    protected String note;

    /**
     * Recupera il valore della proprietà riepilogonazionale.
     * 
     * @return
     *     possible object is
     *     {@link Riepilogonazionale }
     *     
     */
    public Riepilogonazionale getRiepilogonazionale() {
        return riepilogonazionale;
    }

    /**
     * Imposta il valore della proprietà riepilogonazionale.
     * 
     * @param value
     *     allowed object is
     *     {@link Riepilogonazionale }
     *     
     */
    public void setRiepilogonazionale(Riepilogonazionale value) {
        this.riepilogonazionale = value;
    }

    /**
     * Gets the value of the elencoriepilogativoprovinciale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elencoriepilogativoprovinciale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElencoriepilogativoprovinciale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Elencoriepilogativo }
     * 
     * 
     */
    public List<Elencoriepilogativo> getElencoriepilogativoprovinciale() {
        if (elencoriepilogativoprovinciale == null) {
            elencoriepilogativoprovinciale = new ArrayList<Elencoriepilogativo>();
        }
        return this.elencoriepilogativoprovinciale;
    }

    /**
     * Recupera il valore della proprietà note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Imposta il valore della proprietà note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
