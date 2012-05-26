package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * Conteneur Xml de type dataset_item
 * @author rvermunt
 */
public class DatasetItem {

    private int number;
    private double value;


    /**
     * @return number
     */
    @XmlElement(name="number")
    public int getNumber() {
        return number;
    }

    /**
     * @return value
     */
    @XmlElement(name="value")
    public double getValue() {
        return value;
    }

    /**
     * @param number int
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @param value double
     */
    public void setValue(double value) {
        this.value = value;
    }


}
