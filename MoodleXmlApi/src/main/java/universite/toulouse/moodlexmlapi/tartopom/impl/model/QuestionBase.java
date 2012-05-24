package model;

import java.util.List;

import universite.toulouse.moodlexmlapi.core.data.QuestionError;
import universite.toulouse.moodlexmlapi.core.data.QuestionText;
import universite.toulouse.moodlexmlapi.core.data.QuestionType;

@XmlDescriminatorNode("@type")
public abstract class Question implements
		universite.toulouse.moodlexmlapi.core.data.Question {

	private Float defaultGrade;
	private List<QuestionError> errors;
	private String generalFeedBack;
	private String imageBase64;
	private String imageURL;
	private String name;
	private Float penalty;
	private String questionText;
	private String questionType;
	private boolean hidden;
	
	@XmlElement(name="defaultgrade")
	public Float getDefaultGrade() {
		return this.defaultGrade
	}

	
	public List<QuestionError> getErrors() {
		return this.errors;
	}

	@XmlElement(name="generalfeedback")
	public String getGeneralFeedBack() {
		// TODO Auto-generated method stub
		return null;
	}

	@XmlElement(name="image_base64")
	public String getImageBase64() {
		// TODO Auto-generated method stub
		return null;
	}

	@XmlElement(name="image")
	public String getImageUrl() {
		return this.imageURL;
	}

	
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@XmlElement(name="penalty")
	public Float getPenalty() {
		return this.penalty;
	}

	public QuestionText getQuestionText() {
		// TODO Auto-generated method stub
		return null;
	}

	@XmlAttribute(name="type")
	public QuestionType getQuestionType() {
		return this.
	}

	public Boolean isHidden() {
		// TODO Auto-generated method stub
		return null;
	}

}
