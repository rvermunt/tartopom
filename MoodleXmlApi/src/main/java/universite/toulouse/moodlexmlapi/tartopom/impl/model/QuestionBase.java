package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorNode;

import universite.toulouse.moodlexmlapi.core.data.QuestionError;
import universite.toulouse.moodlexmlapi.core.data.QuestionText;
import universite.toulouse.moodlexmlapi.core.data.QuestionType;

/**
 * Classe abstraite representant la base de tous les types de questions
 * @author rvermunt
 *
 */
@XmlDiscriminatorNode("@type")
public abstract class QuestionBase implements
    universite.toulouse.moodlexmlapi.core.data.Question{

    private Float defaultGrade;
    private List<QuestionError> errors;
    private EnclosedText generalFeedBack;
    private String imageBase64;
    private String imageURL;
    private EnclosedText name;
    private Float penalty;
    private QuestionText questionText;
    private QuestionType questionType;
    private boolean hidden;

    /**
     * @return defaultGrade
     */
    @XmlElement(name="defaultgrade")
    public Float getDefaultGrade() {
        return this.defaultGrade;
    }


    /**
     * @return errors
     */
    public List<QuestionError> getErrors() {
        return this.errors;
    }

    /**
     * @return generalFeedBack
     */
    public String getGeneralFeedback(){
        return this.generalFeedBack.getText();
    }

    /**
     * @return generalFeedback
     */
    @XmlElement(name="generalfeedback")
    public EnclosedText getGeneralFeedBackBis() {
        return this.generalFeedBack;
    }

    /**
     * @return imageBase64
     */
    @XmlElement(name="image_base64")
    public String getImageBase64() {
        return this.imageBase64;
    }

    /**
     * @return imageURL
     */
    @XmlElement(name="image")
    public String getImageUrl() {
        return this.imageURL;
    }

    /**
     * @return name
     */
    @XmlElement(name="name")
    public EnclosedText getNameBis() {
        return this.name;
    }

    /**
     * @return name
     */
    public String getName(){
        return this.name.getText();
    }

    /**
     * @return penalty
     */
    @XmlElement(name="penalty")
    public Float getPenalty() {
        return this.penalty;
    }

    /**
     * @return questionText
     */
    @XmlElement(name="questiontext")
    public QuestionText getQuestionText() {
        return this.questionText;
    }

    /**
     * @return type
     */
    @XmlAttribute(name="type")
    public QuestionType getQuestionType() {
        return this.questionType;
    }

    /**
     * @return hidden
     */
    @XmlElement(name="hidden")
    public Boolean isHidden() {
        return this.hidden;
    }

}
