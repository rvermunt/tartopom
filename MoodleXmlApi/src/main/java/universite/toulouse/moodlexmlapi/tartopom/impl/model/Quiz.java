package universite.toulouse.moodlexmlapi.tartopom.impl.model;


import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import universite.toulouse.moodlexmlapi.core.data.Question;

/**
 * Classe Quiz, composée d'une liste de question
 * @author rvermunt
 */
@XmlRootElement(name="quiz")
public class Quiz implements universite.toulouse.moodlexmlapi.core.data.Quiz{

    private List<Question> questionList;

    /**
     * @return questionList
     */
    @XmlElement(name="question")
    public List<Question> getQuestionList(){
        return this.questionList;
    }

}
