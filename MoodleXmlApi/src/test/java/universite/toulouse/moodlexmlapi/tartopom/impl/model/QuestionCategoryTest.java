package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests unitaires de la classe MultichoiceTest
 */
public class QuestionCategoryTest {

    QuestionCategory question;

    /**
     * Méthode exécutée avant les tests
     */
    @Before
    public void setUp() throws Exception {
        question = new QuestionCategory();
    }

    @Test
    public void testCategory() {
        question.setCategory("categorie");

        Assert.assertEquals("categorie", question.getCategory());
    }
}
