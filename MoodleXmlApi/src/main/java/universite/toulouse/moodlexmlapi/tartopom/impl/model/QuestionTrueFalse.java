package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

import universite.toulouse.moodlexmlapi.core.data.QuestionType;

/**
 * Conteneur Xml de Question de type truefalse
 * @author vermu0041
 */
@XmlDiscriminatorValue("truefalse")
public class QuestionTrueFalse extends QuestionBase {

    private int shuffle;
    private List<Answer> answers;

    /**
     * Constructeur vide
     */
    public QuestionTrueFalse(){
        super();
        this.setQuestionType(QuestionType.truefalse);
    }

    /**
     * @return shuffle
     */
    @XmlElement(name="shuffleanswers")
    public int getShuffle() {
        return shuffle;
    }

    /**
     * @return answers
     */
    @XmlElement(name="answer")
    public List<Answer> getAnswers() {
        return answers;
    }

    /**
     * @param shuffle int
     */
    public void setShuffle(int shuffle) {
        this.shuffle = shuffle;
    }

    /**
     * @param answers List<Answer>
     */
    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }


}
