package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

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
}
