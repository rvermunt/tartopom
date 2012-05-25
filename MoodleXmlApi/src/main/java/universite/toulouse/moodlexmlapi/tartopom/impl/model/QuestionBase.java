package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorNode;

import universite.toulouse.moodlexmlapi.core.data.QuestionError;
import universite.toulouse.moodlexmlapi.core.data.QuestionText;
import universite.toulouse.moodlexmlapi.core.data.QuestionType;

/**
 * Classe abstraite representant la base de tous les types de questions
 *
 * @author rvermunt
 *
 */
@XmlDiscriminatorNode("@type")
public class QuestionBase implements
        universite.toulouse.moodlexmlapi.core.data.Question {

    private Float defaultGrade;
    private List<QuestionError> errors;
    private EnclosedText genFeedBack;
    private String imageBase64;
    private String imageURL;
    private EnclosedText name;
    private Float penalty;
    private QuestionTextAdaptated questionText;
    private QuestionType questionType;
    private boolean hidden;

    /**
     * @return defaultGrade
     */
    @Override
    @XmlElement(name = "defaultgrade")
    public Float getDefaultGrade() {
        return this.defaultGrade;
    }

    /**
     * @return errors
     */
    @XmlTransient
    @Override
    public List<QuestionError> getErrors() {
        return this.errors;
    }

    /**
     * @return generalFeedBack
     */
    @Override
    public String getGeneralFeedBack() {
        return this.genFeedBack.getText();
    }

    /**
     * @return generalFeedback
     */
    @XmlElement(name = "generalfeedback")
    public EnclosedText getGenFeedBack() {
        return this.genFeedBack;
    }

    /**
     * @return imageBase64
     */
    @Override
    @XmlElement(name = "image_base64")
    public String getImageBase64() {
        return this.imageBase64;
    }

    /**
     * @return imageURL
     */
    @Override
    @XmlElement(name = "image")
    public String getImageUrl() {
        return this.imageURL;
    }

    /**
     * @return name
     */
    @Override
    @XmlTransient
    public String getName() {
        return this.name.getText();
    }

    /**
     * @return name
     */
    @XmlElement(name = "name")
    public EnclosedText getNameBis() {
        return this.name;
    }

    /**
     * @return penalty
     */
    @Override
    @XmlElement(name = "penalty")
    public Float getPenalty() {
        return this.penalty;
    }

    /**
     * @return questionText
     */
    @Override
    @XmlTransient
    public QuestionText getQuestionText() {
        return new QuestionText(this.questionText.getText(),
                this.questionText.getQuestionTextFormat());
    }

    /**
     * Renvoie le texte de la question
     *
     * @return le texte de la question
     */
    @XmlElement(name = "questiontext")
    public QuestionTextAdaptated getQuestionTextAdaptated() {
        return this.questionText;
    }

    /**
     * @return type
     */
    @Override
    @XmlAttribute(name = "type")
    public QuestionType getQuestionType() {
        return this.questionType;
    }

    /**
     * @return hidden
     */
    @Override
    @XmlElement(name = "hidden")
    public Boolean isHidden() {
        return this.hidden;
    }

    /**
     * @param defaultGrade
     *            Float
     */
    public void setDefaultGrade(Float defaultGrade) {
        this.defaultGrade = defaultGrade;
    }

    /**
     * @param errors
     *            List<QuestionError>
     */
    public void setErrors(List<QuestionError> errors) {
        this.errors = errors;
    }

    /**
     * @param genFeedBack
     *            EnclosedText
     */
    public void setGenFeedBack(EnclosedText genFeedBack) {
        this.genFeedBack = genFeedBack;
    }

    /**
     * @param genFeedBack
     *            String
     */
    public void setGenFeedBack(String genFeedBack) {
        this.genFeedBack = new EnclosedText(genFeedBack);
    }

    /**
     * @param hidden
     *            boolean
     */
    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    /**
     * @param imageBase64
     *            String
     */
    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    /**
     * @param imageURL
     *            String
     */
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    /**
     * @param name
     *            EnclosedText
     */
    public void setName(EnclosedText name) {
        this.name = name;
    }

    /**
     * @param name
     *            String
     */
    public void setName(String name) {
        this.name = new EnclosedText(name);
    }

    /**
     * @param penalty
     *            Float
     */
    public void setPenalty(Float penalty) {
        this.penalty = penalty;
    }

    /**
     * @param questionText
     *            QuestionText
     */
    public void setQuestionText(QuestionText questionText) {
        this.questionText = new QuestionTextAdaptated(questionText.getText(),
                questionText.getQuestionTextFormat());
    }

    /**
     * @param questionType
     *            QuestionType
     */
    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

}
