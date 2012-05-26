package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import universite.toulouse.moodlexmlapi.core.data.QuestionTextFormat;

/**
 * Tests unitaires de la classe EnclosedText
 */
public class SubQuestionTest {

    SubQuestion question;

    /**
     * Méthode exécutée avant les tests
     */
    @Before
    public void setUp() throws Exception {
        question = new SubQuestion();
    }

    @Test
    public void testAnswer() {
        EnclosedText answer = new EnclosedText("answer");
        question.setAnswer(answer);

        Assert.assertEquals(answer, question.getAnswer());
    }

    @Test
    public void testFormat() {
        question.setFormat(QuestionTextFormat.markdown);

        Assert.assertEquals(QuestionTextFormat.markdown, question.getFormat());
    }

    @Test
    public void testText() {
        String text = "Texte";
        question.setText(text);

        Assert.assertEquals(text, question.getText());
    }
}
