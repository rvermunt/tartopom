package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * Recuperation du texte encapsulé
 * @author etu1
 *
 */
public class EnclosedText {

    private String text;

    /**
     * @return text
     */
    @XmlElement(name="text")
    public String getText() {
        return text;
    }

    /**
     * @param text String
     */
    public void setText(String text) {
        this.text = text;
    }


}
