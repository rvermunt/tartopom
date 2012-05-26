package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests unitaires de la classe QuestionEssay
 */
public class QuestionEssayTest {

    QuestionEssay question;

    /**
     * Méthode exécutée avant les tests
     */
    @Before
    public void setUp() throws Exception {
        question = new QuestionEssay();
    }

    @Test
    public void testAttachments() {
        int attachments = 3;

        question.setAttachments(attachments);

        Assert.assertEquals(attachments, question.getAttachments());
    }

    @Test
    public void testGraderInfo() {
        EnclosedText graderInfo = new EnclosedText();

        question.setGraderInfo(graderInfo);

        Assert.assertEquals(graderInfo, question.getGraderInfo());
    }

    @Test
    public void testResponseFieldLines() {
        int lines = 30;

        question.setResponseFieldLines(lines);

        Assert.assertEquals(lines, question.getResponseFieldLines());
    }

    @Test
    public void testResponseFormat() {
        String format = "editorfilepicker";

        question.setResponseFormat(format);

        Assert.assertEquals(format, question.getResponseFormat());
    }
}
