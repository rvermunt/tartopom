package model;


import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import universite.toulouse.moodlexmlapi.core.*;
import universite.toulouse.moodlexmlapi.core.data.*;

@XmlRootElement(name="quiz")
public class Quiz implements universite.toulouse.moodlexmlapi.core.data.Quiz{

	private List<Question> questionList;
	
	@XmlElement(name="question")
	public List<Question> getQuestionList(){
		return this.questionList;
	}
	
}
