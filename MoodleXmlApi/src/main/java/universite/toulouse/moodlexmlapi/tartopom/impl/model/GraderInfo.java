package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Balise 'graderinfo' pour les questions de type 'essay'
 *
 * @author natsu
 *
 */
public class GraderInfo {

    private String format;
    private String text;

    /**
     * Constructeur par défaut (format = "html", text = null)
     */
    public GraderInfo() {
        this.format = "html";
    }

    /**
     * Renvoie le format.
     *
     * @return le format
     */
    @XmlAttribute(name = "format")
    public String getFormat() {
        return format;
    }

    /**
     * Renvoie le texte.
     *
     * @return le texte
     */
    @XmlElement(name = "text")
    public String getText() {
        return text;
    }

    /**
     * Assigne une valeur au format.
     *
     * @param format
     *            le nouveau format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * Assigne une valeur au texte.
     *
     * @param text
     *            le nouveau texte
     */
    public void setText(String text) {
        this.text = text;
    }
}
