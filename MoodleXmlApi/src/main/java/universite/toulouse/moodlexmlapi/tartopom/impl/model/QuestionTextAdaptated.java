package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import universite.toulouse.moodlexmlapi.core.data.QuestionTextFormat;

/**
 * Classe QuestionText adaptée avec un constructeur vide
 *
 * @author natsu
 *
 */
public class QuestionTextAdaptated {

    private String text;
    private QuestionTextFormat questionTextFormat;

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
        this.questionTextFormat = questionTextFormat;
    }

    /**
     * @return the questionTextFormat
     */
    public QuestionTextFormat getQuestionTextFormat() {
        return questionTextFormat;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }
}
