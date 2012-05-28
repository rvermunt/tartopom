package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

import universite.toulouse.moodlexmlapi.core.data.QuestionType;

/**
 * Conteneur Xml de Question de type truefalse
 * @author vermu0041
 */
@XmlDiscriminatorValue("shortanswer")
public class QuestionShortAnswer extends QuestionBase {

    private int shuffle;
    private int usecase;
    private List<Answer> answers;

    /**
     * Constructeur vide
     */
    QuestionShortAnswer(){
        super();
        this.setQuestionType(QuestionType.shortanswer);
    }

    /**
     * @return shuffle
     */
    @XmlElement(name="shuffleanswers")
    public int getShuffle() {
        return shuffle;
    }

    /**
     * @return usecase
     */
    @XmlElement(name="usecase")
    public int getUsecase() {
        return usecase;
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
     * @param usecase int
     */
    public void setUsecase(int usecase) {
        this.usecase = usecase;
    }

    /**
     * @param answers List<Answer>
     */
    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }



}
