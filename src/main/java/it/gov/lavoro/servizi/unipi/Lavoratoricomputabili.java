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
 * <p>Classe Java per lavoratoricomputabili complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="lavoratoricomputabili">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lavoratore" type="{http://servizi.lavoro.gov.it/UNIPI}lavoratore"/>
 *         &lt;element name="rapportolavoro" type="{http://servizi.lavoro.gov.it/UNIPI}rapportolavoro"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lavoratoricomputabili", propOrder = {
    "lavoratore",
    "rapportolavoro"
})
public class Lavoratoricomputabili {

    @XmlElement(required = true)
    protected Lavoratore lavoratore;
    @XmlElement(required = true)
    protected Rapportolavoro rapportolavoro;

    /**
     * Recupera il valore della proprietà lavoratore.
     * 
     * @return
     *     possible object is
     *     {@link Lavoratore }
     *     
     */
    public Lavoratore getLavoratore() {
        return lavoratore;
    }

    /**
     * Imposta il valore della proprietà lavoratore.
     * 
     * @param value
     *     allowed object is
     *     {@link Lavoratore }
     *     
     */
    public void setLavoratore(Lavoratore value) {
        this.lavoratore = value;
    }

    /**
     * Recupera il valore della proprietà rapportolavoro.
     * 
     * @return
     *     possible object is
     *     {@link Rapportolavoro }
     *     
     */
    public Rapportolavoro getRapportolavoro() {
        return rapportolavoro;
    }

    /**
     * Imposta il valore della proprietà rapportolavoro.
     * 
     * @param value
     *     allowed object is
     *     {@link Rapportolavoro }
     *     
     */
    public void setRapportolavoro(Rapportolavoro value) {
        this.rapportolavoro = value;
    }

}
