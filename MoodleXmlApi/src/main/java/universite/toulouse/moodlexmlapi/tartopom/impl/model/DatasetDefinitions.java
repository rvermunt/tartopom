package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;

/**
 * Conteneur Xml de type dataset_definitions
 * @author vermu0041
 */
public class DatasetDefinitions {

    @XmlElements({
        @XmlElement(name="dataset_definition")
    })
    private ArrayList<DatasetDefinition> datasetDefinition;

    /**
     * @return datasetDefinition
     */
    public ArrayList<DatasetDefinition> getDatasetDefinition() {
        return datasetDefinition;
    }

    /**
     * @param datasetDefinition ArrayList<DatasetDefinition>
     */
    public void setDatasetDefinition(
            ArrayList<DatasetDefinition> datasetDefinition) {
        this.datasetDefinition = datasetDefinition;
    }
}
