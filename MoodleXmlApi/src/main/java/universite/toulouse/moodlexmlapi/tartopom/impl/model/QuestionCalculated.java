package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import javax.xml.bind.annotation.XmlElement;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

import universite.toulouse.moodlexmlapi.core.data.QuestionText;
import universite.toulouse.moodlexmlapi.core.data.QuestionType;

/**
 * Conteneur Xml de Question de type calculated
 * @author vermu0041
 */
@XmlDiscriminatorValue("calculated")
public class QuestionCalculated extends QuestionBase {

    private int shuffle;
    private Answer answer;
    private Units units;

    private DatasetDefinitions datasetDefinitions;

    /**
     * Constructeur vide de QuestionCalculated
     */
    public QuestionCalculated() {
        super();
        super.setQuestionType(QuestionType.calculated);
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
     * @param datasetDefinitions
     */
    public QuestionCalculated(Float defaultGrade, EnclosedText genFeedBack,
            String imageBase64, String imageURL, EnclosedText name,
            Float penalty, QuestionText questionText, boolean hidden,
            int shuffle, Answer answer, Units units,
            DatasetDefinitions datasetDefintions) {

        super(defaultGrade, genFeedBack, imageBase64, imageURL, name, penalty,
                questionText, QuestionType.calculated, hidden);
        this.setShuffle(shuffle);
        this.setAnswer(answer);
        this.setUnits(units);
        this.setDatasetDefinitions(datasetDefintions);
    }

    /**
     * @return answer
     */
    @XmlElement(name = "answer")
    public Answer getAnswer() {
        return answer;
    }

    /**
     * @return datasetDefinitions
     */
    @XmlElement(name = "dataset_definitions")
    public DatasetDefinitions getDatasetDefinitions() {
        return datasetDefinitions;
    }

    /**
     * @return shuffle
     */
    @XmlElement(name = "shuffleanswers")
    public int getShuffle() {
        return shuffle;
    }

    /**
     * @return units
     */
    @XmlElement(name = "units")
    public Units getUnits() {
        return units;
    }

    /**
     * @param answer Answer
     */
    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    /**
     * @param datasetDefinitions DatasetDefinitions
     */
    public void setDatasetDefinitions(DatasetDefinitions datasetDefinitions) {
        this.datasetDefinitions = datasetDefinitions;
    }

    /**
     * @param shuffle boolean
     */
    public void setShuffle(int shuffle) {
        this.shuffle = shuffle;
    }

    /**
     * @param units Units
     */
    public void setUnits(Units units) {
        this.units = units;
    }

}
