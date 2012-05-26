package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

import universite.toulouse.moodlexmlapi.core.data.QuestionTextFormat;

/**
 * Sous-question
 *
 * @author natsu
 *
 */
public class SubQuestion {

    @XmlAttribute(name = "format")
    private String format;
    private String text;
    private EnclosedText answer;

    /**
     * Constructeur vide.
     */
    public SubQuestion() {
    }

    /**
     * Constructeur d'une sous-question.
     *
     * @param format le format
     * @param text le texte
     * @param answer la réponse attendue
     */
    public SubQuestion(QuestionTextFormat format, String text,
            EnclosedText answer) {
        this.setFormat(format);
        this.text = text;
        this.answer = answer;
    }

    /** Renvoie la réponse.
     *
     * @return the answer
     */
    @XmlElement(name = "answer")
    public EnclosedText getAnswer() {
        return answer;
    }

    /**
     * Renvoie le format de la sous-question.
     *
     * @return the format
     */
    @XmlTransient
    public QuestionTextFormat getFormat() {
        return QuestionTextFormat.valueOf(format);
    }

    /**
     * Renvoie le texte de la sous-question.
     *
     * @return the text
     */
    @XmlElement(name = "text")
    public String getText() {
        return text;
    }

    /**
     * Assigne la réponse.
     *
     * @param answer la réponse prévue
     */
    public void setAnswer(EnclosedText answer) {
        this.answer = answer;
    }

    /**
     * Assigne le format.
     *
     * @param format le format
     */
    public void setFormat(QuestionTextFormat format) {
        this.format = format.name();
    }

    /**
     * Assigne le texte.
     *
     * @param text le texte
     */
    public void setText(String text) {
        this.text = text;
    }
}
