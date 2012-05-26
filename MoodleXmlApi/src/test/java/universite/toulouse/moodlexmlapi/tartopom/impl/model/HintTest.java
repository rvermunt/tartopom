package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import universite.toulouse.moodlexmlapi.core.data.QuestionTextFormat;

/**
 * Tests unitaires de la classe Hint
 */
public class HintTest {

    Hint hint;

    /**
     * Méthode exécutée avant les tests
     */
    @Before
    public void setUp() throws Exception {
        hint = new Hint();
    }

    @Test
    public void testClearWrong() {
        hint.setClearWrong(true);

        Assert.assertTrue(hint.isClearWrong());
    }

    @Test
    public void testFormat() {
        hint.setFormat(QuestionTextFormat.markdown);

        Assert.assertEquals(QuestionTextFormat.markdown, hint.getFormat());
    }

    @Test
    public void testShowNumCorrect() {
        hint.setShowNumCorrect(false);

        Assert.assertFalse(hint.isShowNumCorrect());
    }

    @Test
    public void testText() {
        String text = "Texte";
        hint.setText(text);

        Assert.assertEquals(text, hint.getText());
    }
}
