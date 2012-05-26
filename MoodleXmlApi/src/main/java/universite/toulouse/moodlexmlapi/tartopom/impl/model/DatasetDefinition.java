package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * Conteneur Xml de type dataset_definition
 * @author vermu0041
 */
public class DatasetDefinition {

    private EnclosedText status;
    private EnclosedText name;
    private String type;
    private EnclosedText distribution;
    private EnclosedText minimum;
    private EnclosedText maximum;
    private EnclosedText decimals;
    private int itemCount;
    private DatasetItems datasetItems;
    private int nbItems;

    /**
     * @return status
     */
    @XmlElement(name="status")
    public EnclosedText getStatus() {
        return status;
    }

    /**
     * @param status EnclosedText
     */
    public void setStatus(EnclosedText status) {
        this.status = status;
    }

    /**
     * @return name
     */
    @XmlElement(name="name")
    public EnclosedText getName() {
        return name;
    }

    /**
     * @param name EnclosedText
     */
    public void setName(EnclosedText name) {
        this.name = name;
    }

    /**
     * @return type
     */
    @XmlElement(name="type")
    public String getType() {
        return type;
    }

    /**
     * @param type String
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return distribution
     */
    @XmlElement(name="distribution")
    public EnclosedText getDistribution() {
        return distribution;
    }

    /**
     * @param distribution EnclosedText
     */
    public void setDistribution(EnclosedText distribution) {
        this.distribution = distribution;
    }

    /**
     * @return minimum
     */
    @XmlElement(name="minimum")
    public EnclosedText getMinimum() {
        return minimum;
    }

    /**
     * @param minimum EnclosedText
     */
    public void setMinimum(EnclosedText minimum) {
        this.minimum = minimum;
    }

    /**
     * @return maximum
     */
    @XmlElement(name="maximum")
    public EnclosedText getMaximum() {
        return maximum;
    }

    /**
     * @param maximum EnclosedText
     */
    public void setMaximum(EnclosedText maximum) {
        this.maximum = maximum;
    }

    /**
     * @return decimals
     */
    @XmlElement(name="decimals")
    public EnclosedText getDecimals() {
        return decimals;
    }

    /**
     * @param decimals EnclosedText
     */
    public void setDecimals(EnclosedText decimals) {
        this.decimals = decimals;
    }

    /**
     * @return itemCount
     */
    @XmlElement(name="itemcount")
    public int getItemCount() {
        return itemCount;
    }

    /**
     * @param itemCount int
     */
    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * @return datasetItems
     */
    @XmlElement(name="dataset_items")
    public DatasetItems getDatasetItems() {
        return datasetItems;
    }

    /**
     * @param datasetItems DatasetItems
     */
    public void setDatasetItems(DatasetItems datasetItems) {
        this.datasetItems = datasetItems;
    }

    /**
     * @return nbItems
     */
    @XmlElement(name="number_of_items")
    public int getNbItems() {
        return nbItems;
    }

    /**
     * @param nbItems int
     */
    public void setNbItems(int nbItems) {
        this.nbItems = nbItems;
    }
}
