package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;

/**
 * Conteneur Xml de type units
 * @author vermu0041
 */
public class Units {

    private ArrayList<Unit> unit;

    /**
     * @return unit
     */
    @XmlElements({ @XmlElement(name = "unit") })
    public ArrayList<Unit> getUnit() {
        return unit;
    }

    /**
     * @param unit ArrayList<Unit>
     */
    public void setUnit(ArrayList<Unit> unit) {
        this.unit = unit;
    }

}
