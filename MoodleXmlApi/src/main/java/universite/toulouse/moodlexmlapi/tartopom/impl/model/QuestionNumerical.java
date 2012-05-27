package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import javax.xml.bind.annotation.XmlElement;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

import universite.toulouse.moodlexmlapi.core.data.QuestionType;

/**
 * Conteneur Xml d'une question de type numerical
 * @author vermu0041
 */
@XmlDiscriminatorValue(value="numerical")
public class QuestionNumerical extends QuestionBase {

    private boolean shuffle;
    private Answer answer;
    private Units units;

    /**
     * Constructeur vide de QuestionNumerical
     */
    public QuestionNumerical(){
        super();
        this.setQuestionType(QuestionType.numerical);
    }

    /**
     * @return shuffle
     */
    @XmlElement(name="shuffleanswers")
    public boolean isShuffle() {
        return shuffle;
    }

    /**
     * @return answer
     */
    @XmlElement(name="answer")
    public Answer getAnswer() {
        return answer;
    }

    /**
     * @return units
     */
    @XmlElement(name="units")
    public Units getUnits() {
        return units;
    }

    /**
     * @param shuffle boolean
     */
    public void setShuffle(boolean shuffle) {
        this.shuffle = shuffle;
    }

    /**
     * @param answer Answer
     */
    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    /**
     * @param units Units
     */
    public void setUnits(Units units) {
        this.units = units;
    }
}
