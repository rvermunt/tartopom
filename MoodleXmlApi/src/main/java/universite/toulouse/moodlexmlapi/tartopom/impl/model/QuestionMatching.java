package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

/**
 * Question de type 'matching'.
 *
 * @author natsu
 *
 */
@XmlDiscriminatorValue("matching")
public class QuestionMatching extends QuestionBase {

    private int shuffleanswers;
    private EnclosedText correctFeedBack;
    private EnclosedText partiallycorrectFeedBack;
    private EnclosedText incorrectFeedBack;
    // on utilise EnclosedText juste pour avoir un objet vide permettant une
    // balise auto-fermante
    @XmlElement(name = "shownumcorrect")
    private EnclosedText showNumCorrect;
    private List<SubQuestion> questions;
    private List<Hint> hints;

    /**
     * Constructeur par défaut
     */
    public QuestionMatching() {
        super();
    }

    /**
     * Constructeur d'une question de type 'matching'
     *
     * @param shuffleanswers si les réponses doivent être mélangées
     * @param correctFeedBack le feedback en cas de réponse correcte
     * @param partiallycorrectFeedBack le feedback en case de réponse
     *        partiellement correcte
     * @param incorrectFeedBack le feedback en cas de réponse incorrecte
     * @param showNumCorrect si le nombre de bonne réponses doit être affiché
     * @param questions les sous-questions
     * @param hints les indices
     */
    public QuestionMatching(int shuffleanswers, EnclosedText correctFeedBack,
            EnclosedText partiallycorrectFeedBack,
            EnclosedText incorrectFeedBack, EnclosedText showNumCorrect,
            List<SubQuestion> questions, List<Hint> hints) {
        super();
        this.shuffleanswers = shuffleanswers;
        this.correctFeedBack = correctFeedBack;
        this.partiallycorrectFeedBack = partiallycorrectFeedBack;
        this.incorrectFeedBack = incorrectFeedBack;
        this.showNumCorrect = showNumCorrect;
        this.questions = questions;
        this.hints = hints;
    }

    /**
     * Renvoie le feedback en cas de réponse correcte.
     *
     * @return the correctFeedBack
     */
    @XmlElement(name = "correctfeedback")
    public EnclosedText getCorrectFeedBack() {
        return correctFeedBack;
    }

    /**
     * Renvoie les indices.
     *
     * @return the hints
     */
    @XmlElement(name = "hint")
    public List<Hint> getHints() {
        return hints;
    }

    /**
     * Renvoie le feedback en cas de réponse incorrecte.
     *
     * @return the incorrectFeedBack
     */
    @XmlElement(name = "incorrectfeedback")
    public EnclosedText getIncorrectFeedBack() {
        return incorrectFeedBack;
    }

    /**
     * Renvoie le feedback en cas de réponse partiellement correcte.
     *
     * @return the partiallycorrectFeedBack
     */
    @XmlElement(name = "partiallycorrectanswer")
    public EnclosedText getPartiallycorrectFeedBack() {
        return partiallycorrectFeedBack;
    }

    /**
     * Renvoie les questions.
     *
     * @return the questions
     */
    @XmlElement(name = "subquestion")
    public List<SubQuestion> getQuestions() {
        return questions;
    }

    /**
     * Faut-il mélanger les réponses ?
     *
     * @return the shuffleanswers
     */
    @XmlElement(name = "shuffleanswers")
    public int getShuffleanswers() {
        return shuffleanswers;
    }

    /**
     * Est-ce que le nombre de réponses correctes doit être affiché  ?
     *
     * @return the showNumCorrect
     */
    @XmlTransient
    public boolean isShowNumCorrect() {
        return showNumCorrect != null;
    }

    /**
     * Assigne le feedback en cas de réponse correcte.
     *
     * @param correctFeedBack the correctFeedBack to set
     */
    public void setCorrectFeedBack(EnclosedText correctFeedBack) {
        this.correctFeedBack = correctFeedBack;
    }

    /**
     * Assigne les indices.
     *
     * @param hints the hints to set
     */
    public void setHints(List<Hint> hints) {
        this.hints = hints;
    }

    /**
     * Assigne le feedback en cas de réponse incorrecte.
     *
     * @param incorrectFeedBack the incorrectFeedBack to set
     */
    public void setIncorrectFeedBack(EnclosedText incorrectFeedBack) {
        this.incorrectFeedBack = incorrectFeedBack;
    }

    /**
     * Assigne le feedback en cas de réponse partiellement correcte.
     *
     * @param partiallycorrectFeedBack the partiallycorrectFeedBack to set
     */
    public void setPartiallycorrectFeedBack(
            EnclosedText partiallycorrectFeedBack) {
        this.partiallycorrectFeedBack = partiallycorrectFeedBack;
    }

    /**
     * Assigne les questions.
     *
     * @param questions the questions to set
     */
    public void setQuestions(List<SubQuestion> questions) {
        this.questions = questions;
    }

    /**
     * Est-ce que le nombre de réponses correctes doit être affiché  ?
     *
     * @param showNumCorrect vrai ou faux
     */
    public void setShowNumCorrect(boolean showNumCorrect) {
        if (showNumCorrect) {
            this.showNumCorrect = new EnclosedText();
        }
        else {
            this.showNumCorrect = null;
        }
    }

    /**
     * Faut-il mélanger les réponses ?
     *
     * @param shuffleanswers 0 ou 1
     */
    public void setShuffleanswers(int shuffleanswers) {
        this.shuffleanswers = shuffleanswers;
    }
}
