package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

import universite.toulouse.moodlexmlapi.core.data.QuestionType;

/**
 * Question de type 'cloze' (embedded answers).
 *
 * Pour ce type de question, le texte de 'questionText' répond à des
 * spécifications précises pour les réponses embarquées.
 * Celles-ci doivent être de la forme décrite dans la documentation de moodle
 * sur cette page :
 * http://docs.moodle.org/22/en/Embedded_Answers_(Cloze)_question_type
 *
 * @author natsu
 *
 */
@XmlDiscriminatorValue("cloze")
public class QuestionCloze extends QuestionBase {

    /**
     * Constructeur par défaut
     */
    public QuestionCloze() {
        super();
        super.setQuestionType(QuestionType.cloze);
    }
}
