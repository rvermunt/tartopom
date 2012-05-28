package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

import universite.toulouse.moodlexmlapi.core.data.QuestionText;
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
    QuestionShortAnswer() {
        super();
        this.setQuestionType(QuestionType.shortanswer);
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
     * @param usecase usecase
     * @param answers answers
     */
    public QuestionShortAnswer(Float defaultGrade, EnclosedText genFeedBack,
            String imageBase64, String imageURL, EnclosedText name,
            Float penalty, QuestionText questionText, boolean hidden,
            int shuffle, int usecase, List<Answer> answers) {

        super(defaultGrade, genFeedBack, imageBase64, imageURL, name, penalty,
                questionText, QuestionType.shortanswer, hidden);
        this.setShuffle(shuffle);
        this.setUsecase(usecase);
        this.setAnswers(answers);
    }

    /**
     * @return answers
     */
    @XmlElement(name = "answer")
    public List<Answer> getAnswers() {
        return answers;
    }

    /**
     * @return shuffle
     */
    @XmlElement(name = "shuffleanswers")
    public int getShuffle() {
        return shuffle;
    }

    /**
     * @return usecase
     */
    @XmlElement(name = "usecase")
    public int getUsecase() {
        return usecase;
    }

    /**
     * @param answers List<Answer>
     */
    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
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

}
