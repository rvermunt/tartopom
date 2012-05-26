package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import universite.toulouse.moodlexmlapi.core.data.QuestionTextFormat;

/**
 * Tests unitaires de la classe EnclosedText
 */
public class EnclosedTextTest {

    EnclosedText enclosed;

    /**
     * Méthode exécutée avant les tests
     */
    @Before
    public void setUp() throws Exception {
        enclosed = new EnclosedText();
    }

    @Test
    public void testFormat() {
        enclosed.setFormat(QuestionTextFormat.markdown);

        Assert.assertEquals(QuestionTextFormat.markdown, enclosed.getFormat());
    }

    @Test
    public void testText() {
        String text = "Texte";
        enclosed.setText(text);

        Assert.assertEquals(text, enclosed.getText());
    }
}
