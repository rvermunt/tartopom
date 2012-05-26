package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import javax.xml.bind.annotation.XmlElement;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

import universite.toulouse.moodlexmlapi.core.data.QuestionType;

@XmlDiscriminatorValue("Calulated")
public class QuestionCalculated extends QuestionBase {


    private boolean shuffle;

    private DatasetDefinitions datasetDefinitions;

    public QuestionCalculated(){
        super();
        super.setQuestionType(QuestionType.calculated);
    }

    @XmlElement(name="shuffleanswers")
    public boolean isShuffle() {
        return shuffle;
    }

    public void setShuffle(boolean shuffle) {
        this.shuffle = shuffle;
    }

    @XmlElement(name="dataset_definitions")
    public DatasetDefinitions getDatasetDefinitions() {
        return datasetDefinitions;
    }

    public void setDatasetDefinitions(DatasetDefinitions datasetDefinitions) {
        this.datasetDefinitions = datasetDefinitions;
    }

}
