package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import javax.xml.bind.annotation.XmlElement;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

import universite.toulouse.moodlexmlapi.core.data.QuestionText;
import universite.toulouse.moodlexmlapi.core.data.QuestionType;

/**
 * Conteneur Xml d'une question de type numerical
 * @author vermu0041
 */
@XmlDiscriminatorValue(value = "numerical")
public class QuestionNumerical extends QuestionBase {

    private boolean shuffle;
    private Answer answer;
    private Units units;

    /**
     * Constructeur vide de QuestionNumerical
     */
    public QuestionNumerical() {
        super();
        this.setQuestionType(QuestionType.numerical);
    }

    /**
     * Constructeur.
     *
     * @param defaultGrade defaultGrade
     * @param genFeedBack general feedback
     * @param imageBase64 imageBase64
     * @param imageURL imageURL
     * @param name name
     * @param penalty penalty
     * @param questionText question text
     * @param hidden hidden
     * @param shuffle shuffle
     * @param answer answer
     * @param units units
     */
    public QuestionNumerical(Float defaultGrade, EnclosedText genFeedBack,
            String imageBase64, String imageURL, EnclosedText name,
            Float penalty, QuestionText questionText, boolean hidden,
            boolean shuffle, Answer answer, Units units) {

        super(defaultGrade, genFeedBack, imageBase64, imageURL, name, penalty,
                questionText, QuestionType.numerical, hidden);
        this.setShuffle(shuffle);
        this.setAnswer(answer);
        this.setUnits(units);
    }

    /**
     * @return answer
     */
    @XmlElement(name = "answer")
    public Answer getAnswer() {
        return answer;
    }

    /**
     * @return units
     */
    @XmlElement(name = "units")
    public Units getUnits() {
        return units;
    }

    /**
     * @return shuffle
     */
    @XmlElement(name = "shuffleanswers")
    public boolean isShuffle() {
        return shuffle;
    }

    /**
     * @param answer Answer
     */
    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    /**
     * @param shuffle boolean
     */
    public void setShuffle(boolean shuffle) {
        this.shuffle = shuffle;
    }

    /**
     * @param units Units
     */
    public void setUnits(Units units) {
        this.units = units;
    }
}
