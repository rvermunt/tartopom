package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

import universite.toulouse.moodlexmlapi.core.data.QuestionText;
import universite.toulouse.moodlexmlapi.core.data.QuestionType;

/**
 * Question de type 'description'.
 *
 * @author natsu
 *
 */
@XmlDiscriminatorValue("description")
public class QuestionDescription extends QuestionBase {

    /**
     * Constructeur par défaut
     */
    public QuestionDescription() {
        super();
        super.setQuestionType(QuestionType.description);
    }

    /**
     * Constructeur.
     *
     * @param defaultGrade defaultGrade
     * @param genFeedBack general feedback
     * @param imageBase64 imageBase64
     * @param imageURL imageURL
     * @param name name
     * @param penalty penalty
     * @param questionText question text
     * @param hidden hidden
     */
    public QuestionDescription(Float defaultGrade, EnclosedText genFeedBack,
            String imageBase64, String imageURL, EnclosedText name,
            Float penalty, QuestionText questionText, boolean hidden) {

        super(defaultGrade, genFeedBack, imageBase64, imageURL, name, penalty,
                questionText, QuestionType.description, hidden);
    }

}
