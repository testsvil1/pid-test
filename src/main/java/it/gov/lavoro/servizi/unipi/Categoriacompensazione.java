//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.03.07 alle 03:27:17 PM CET 
//


package it.gov.lavoro.servizi.unipi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per categoriacompensazione.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="categoriacompensazione">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="R"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "categoriacompensazione")
@XmlEnum
public enum Categoriacompensazione {


    /**
     * Compensazione in eccedenza
     * 
     */
    E,

    /**
     * Compensazione in riduzione
     * 
     */
    R;

    public String value() {
        return name();
    }

    public static Categoriacompensazione fromValue(String v) {
        return valueOf(v);
    }

}
