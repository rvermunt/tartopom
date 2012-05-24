package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorNode;

import universite.toulouse.moodlexmlapi.core.data.QuestionError;
import universite.toulouse.moodlexmlapi.core.data.QuestionText;
import universite.toulouse.moodlexmlapi.core.data.QuestionType;

@XmlDiscriminatorNode("@type")
public abstract class QuestionBase implements
		universite.toulouse.moodlexmlapi.core.data.Question {

	private Float defaultGrade;
	private List<QuestionError> errors;
	private String generalFeedBack;
	private String imageBase64;
	private String imageURL;
	private String name;
	private Float penalty;
	private QuestionText questionText;
	private QuestionType questionType;
	private boolean hidden;
	
	@XmlElement(name="defaultgrade")
	public Float getDefaultGrade() {
		return this.defaultGrade;
	}

	
	public List<QuestionError> getErrors() {
		return this.errors;
	}

	@XmlElement(name="generalfeedback")
	public String getGeneralFeedBack() {
		return this.generalFeedBack;
	}

	@XmlElement(name="image_base64")
	public String getImageBase64() {
		return this.imageBase64;
	}

	@XmlElement(name="image")
	public String getImageUrl() {
		return this.imageURL;
	}

	
	public String getName() {
		return this.name;
	}

	@XmlElement(name="penalty")
	public Float getPenalty() {
		return this.penalty;
	}

	public QuestionText getQuestionText() {
		return this.questionText;
	}

	@XmlAttribute(name="type")
	public QuestionType getQuestionType() {
		return this.questionType;
	}

	public Boolean isHidden() {
		return this.hidden;
	}

}
