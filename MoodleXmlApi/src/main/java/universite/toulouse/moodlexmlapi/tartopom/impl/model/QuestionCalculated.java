package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import javax.xml.bind.annotation.XmlElement;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

import universite.toulouse.moodlexmlapi.core.data.QuestionType;

/**
 * Conteneur Xml de Question de type calculated
 * @author vermu0041
 */
@XmlDiscriminatorValue("Calulated")
public class QuestionCalculated extends QuestionBase {


    private boolean shuffle;
    private Answer answer;
    private Units units;

    private DatasetDefinitions datasetDefinitions;

    /**
     * Constructeur vide de QuestionCalculated
     */
    public QuestionCalculated(){
        super();
        super.setQuestionType(QuestionType.calculated);
    }

    /**
     * @return shuffle
     */
    @XmlElement(name="shuffleanswers")
    public boolean isShuffle() {
        return shuffle;
    }

    /**
     * @param shuffle boolean
     */
    public void setShuffle(boolean shuffle) {
        this.shuffle = shuffle;
    }

    /**
     * @return datasetDefinitions
     */
    @XmlElement(name="dataset_definitions")
    public DatasetDefinitions getDatasetDefinitions() {
        return datasetDefinitions;
    }

    /**
     * @param datasetDefinitions DatasetDefinitions
     */
    public void setDatasetDefinitions(DatasetDefinitions datasetDefinitions) {
        this.datasetDefinitions = datasetDefinitions;
    }

    /**
     * @return answer
     */
    @XmlElement(name="answer")
    public Answer getAnswer() {
        return answer;
    }

    /**
     * @param answer Answer
     */
    public void setAnswer(Answer answer) {
        this.answer = answer;
    }


    /**
     * @return units
     */
    @XmlElement(name="units")
    public Units getUnits() {
        return units;
    }

    /**
     * @param units Units
     */
    public void setUnits(Units units) {
        this.units = units;
    }

}
