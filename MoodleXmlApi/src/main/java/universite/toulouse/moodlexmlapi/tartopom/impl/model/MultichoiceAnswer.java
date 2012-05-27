package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

import universite.toulouse.moodlexmlapi.core.data.QuestionTextFormat;

/**
 * Réponse pour une question de type 'multichoice'.
 *
 * @author natsu
 *
 */
public class MultichoiceAnswer {

    private int fraction;
    @XmlAttribute(name = "format")
    private String format;
    private EnclosedText feedback;

    /**
     * Constructeur vide.
     */
    public MultichoiceAnswer() {
    }

    /**
     * Constructeur d'une réponse pour question de type 'multichoice'.
     *
     * @param fraction entre 0 et 100, les points attribués
     * @param format le format
     * @param feedback le feedback
     */
    public MultichoiceAnswer(int fraction, QuestionTextFormat format,
            EnclosedText feedback) {
        this.fraction = fraction;
        this.format = format.name();
        this.feedback = feedback;
    }

    /**
     * Renvoie le feedback.
     *
     * @return the feedback
     */
    @XmlElement(name = "feedback")
    public EnclosedText getFeedback() {
        return feedback;
    }

    /**
     * Renvoie le format.
     *
     * @return the format
     */
    @XmlTransient
    public QuestionTextFormat getFormat() {
        return QuestionTextFormat.valueOf(format);
    }

    /**
     * Renvoie le pourcentage du score attribué.
     *
     * @return the fraction
     */
    @XmlAttribute(name = "fraction")
    public int getFraction() {
        return fraction;
    }

    /**
     * Assigne lee feedback.
     *
     * @param feedback the feedback to set
     */
    public void setFeedback(EnclosedText feedback) {
        this.feedback = feedback;
    }

    /**
     * Assigne le format.
     *
     * @param format the format to set
     */
    public void setFormat(QuestionTextFormat format) {
        this.format = format.name();
    }

    /**
     * Assigne le pourcentage du score attribué, entre 0 et 100.
     *
     * @param fraction the fraction to set
     */
    public void setFraction(int fraction) {
        this.fraction = fraction;
    }
}
