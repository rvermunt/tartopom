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
    
    public QuestionNumerical(){
        super();
        this.setQuestionType(QuestionType.numerical);
    }
    @XmlElement(name="shuffleanswers")
    public boolean isShuffle() {
        return shuffle;
    }
    
    @XmlElement(name="answer")
    public Answer getAnswer() {
        return answer;
    }
    
    @XmlElement(name="units")
    public Units getUnits() {
        return units;
    }
    
    public void setShuffle(boolean shuffle) {
        this.shuffle = shuffle;
    }
    
    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
    
    public void setUnits(Units units) {
        this.units = units;
    }
}
