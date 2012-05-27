package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;

/**
 * Conteneur Xml de type dataset_items
 * @author vermu0041
 */
public class DatasetItems {

    @XmlElements({
        @XmlElement(name="dataset_item")
    })
    private ArrayList<DatasetItem> datasetItem;

    /**
     * @return datasetItem
     */
    public ArrayList<DatasetItem> getDatasetItem() {
        return datasetItem;
    }

    /**
     * @param datasetItem ArryList<DatasetItem>
     */
    public void setDatasetItem(ArrayList<DatasetItem> datasetItem) {
        this.datasetItem = datasetItem;
    }
}
