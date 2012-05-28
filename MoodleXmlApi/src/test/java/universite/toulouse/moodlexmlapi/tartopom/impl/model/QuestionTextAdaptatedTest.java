package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import universite.toulouse.moodlexmlapi.core.data.QuestionTextFormat;

/**
 * Tests unitaires de la classe QuestionTextAdaptated.
 */
public class QuestionTextAdaptatedTest {

    QuestionTextAdaptated qs;

    /**
     * Méthode exécutée avant les tests
     */
    @Before
    public void setUp() throws Exception {
        qs = new QuestionTextAdaptated();
    }

    @Test
    public void testFormat() {
        qs.setQuestionTextFormat(QuestionTextFormat.markdown);

        Assert.assertEquals(QuestionTextFormat.markdown,
                qs.getQuestionTextFormat());
    }

    @Test
    public void testText() {
        String text = "Texte";
        qs.setText(text);

        Assert.assertEquals(text, qs.getText());
    }
}
