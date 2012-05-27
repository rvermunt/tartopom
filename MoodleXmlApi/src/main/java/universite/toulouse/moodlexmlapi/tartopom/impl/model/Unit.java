package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * Conteneur Xml de type unit
 * @author vermu0041
 */
public class Unit {

    private String multiplier;
    private String unitName;

    /**
     * @return multiplier
     */
    @XmlElement(name="multiplier")
    public String getMultiplier() {
        return multiplier;
    }

    /**
     * @return unitName
     */
    @XmlElement(name="unit_name")
    public String getUnitName() {
        return unitName;
    }

    /**
     * @param multiplier String
     */
    public void setMultiplier(String multiplier) {
        this.multiplier = multiplier;
    }

    /**
     * @param unitName String
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }



}
