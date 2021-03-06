package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

import universite.toulouse.moodlexmlapi.core.data.QuestionTextFormat;

/**
 * Recuperation du texte encapsulé
 *
 * @author etu1
 *
 */
public class EnclosedText {

    @XmlAttribute(name = "format")
    private String format;
    private String text;

    /**
     * Constructeur vide
     */
    public EnclosedText() {
    }

    /**
     * Constructed d'une balise contenant un texte et eventuellement un format
     *
     * @param format le format
     * @param text le texte
     */
    public EnclosedText(QuestionTextFormat format, String text) {
        this.setFormat(format);
        this.text = text;
    }

    /**
     * Instancie un nouveau EnclosedText
     *
     * @param text
     *            String
     */
    public EnclosedText(String text) {
        this.text = text;
    }

    /**
     * Renvoie le format du texte.
     *
     * @return le format du texte
     */
    @XmlTransient
    public QuestionTextFormat getFormat() {
        return QuestionTextFormat.valueOf(this.format);
    }

    /**
     * @return text
     */
    @XmlElement(name = "text")
    public String getText() {
        return text;
    }

    /**
     * Assigne le format. Facultatif.
     *
     * @param format le format
     */
    public void setFormat(QuestionTextFormat format) {
        this.format = format.name();
    }

    /**
     * @param text
     *            String
     */
    public void setText(String text) {
        this.text = text;
    }

}
