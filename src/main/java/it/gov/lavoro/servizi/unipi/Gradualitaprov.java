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
 * <p>Classe Java per gradualitaprov complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="gradualitaprov">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nassunzioni" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gradualitaprov", propOrder = {
    "nassunzioni"
})
public class Gradualitaprov {

    @XmlElement(required = true)
    protected String nassunzioni;

    /**
     * Recupera il valore della proprietà nassunzioni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNassunzioni() {
        return nassunzioni;
    }

    /**
     * Imposta il valore della proprietà nassunzioni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNassunzioni(String value) {
        this.nassunzioni = value;
    }

}
