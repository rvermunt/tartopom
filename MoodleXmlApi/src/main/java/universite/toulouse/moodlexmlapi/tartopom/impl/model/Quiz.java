package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import universite.toulouse.moodlexmlapi.core.data.Question;

/**
 * Classe Quiz, composée d'une liste de question
 * @author rvermunt
 */
@XmlRootElement(name = "quiz")
public class Quiz implements universite.toulouse.moodlexmlapi.core.data.Quiz {

    @XmlElement(name = "question")
    private List<QuestionBase> questionList;

    /**
     * @return questionList
     */
    @Override
    @XmlTransient
    public List<Question> getQuestionList() {

        List<Question> questions = new ArrayList<Question>();
        for (Question q : questionList) {
            questions.add(q);
        }

        return questions;
    }

    /**
     * Assigne les questions.
     *
     * @param questions les questions
     */
    public void setQuestionList(List<Question> questions) {

        questionList = new ArrayList<QuestionBase>();
        for (Question q : questions) {
            questionList.add((QuestionBase) q);
        }
    }

}
