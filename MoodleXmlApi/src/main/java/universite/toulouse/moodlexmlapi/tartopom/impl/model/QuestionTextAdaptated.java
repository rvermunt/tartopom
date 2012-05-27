package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

import universite.toulouse.moodlexmlapi.core.data.QuestionTextFormat;

/**
 * Classe QuestionText adaptée avec un constructeur vide
 *
 * @author natsu
 *
 */
public class QuestionTextAdaptated {

    private String text;
    @XmlAttribute(name = "format")
    private String questionTextFormat;

    /**
     * Constructeur vide
     */
    public QuestionTextAdaptated() {
    }

    /**
     * Construct a question text
     *
     * @param text
     *            the text
     * @param questionTextFormat
     *            the text format
     */
    public QuestionTextAdaptated(String text,
            QuestionTextFormat questionTextFormat) {
        this.text = text;
        this.setQuestionTextFormat(questionTextFormat);
    }

    /**
     * @return the questionTextFormat
     */
    @XmlTransient
    public QuestionTextFormat getQuestionTextFormat() {
        return QuestionTextFormat.valueOf(questionTextFormat);
    }

    /**
     * @return the text
     */
    @XmlElement(name = "text")
    public String getText() {
        return text;
    }

    /**
     * @param questionTextFormat the questionTextFormat to set
     */
    public void setQuestionTextFormat(QuestionTextFormat questionTextFormat) {
        this.questionTextFormat = questionTextFormat.name();
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }
}
