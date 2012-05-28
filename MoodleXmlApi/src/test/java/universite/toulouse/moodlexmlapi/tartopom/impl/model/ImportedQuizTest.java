package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import universite.toulouse.moodlexmlapi.core.data.Question;

/**
 * Tests unitaires de la classe ImportedQuiz
 */
public class ImportedQuizTest {

    ImportedQuiz quiz;

    /**
     * Méthode exécutée avant les tests
     */
    @Before
    public void setUp() throws Exception {
        quiz = new ImportedQuiz();
    }

    @Test
    public void testExtractedQuestion() {
        List<Question> list = new ArrayList<Question>();
        quiz.setExtractedQuestionList(list);

        Assert.assertEquals(list, quiz.getExtractedQuestionList());
        Assert.assertEquals(list.size(), quiz.getExtractedQuestionCount());
    }

    @Test
    public void testNonExtractedQuestion() {
        List<Question> list = new ArrayList<Question>();
        quiz.setNonExtractedQuestionList(list);

        Assert.assertEquals(list, quiz.getNonExtractedQuestionList());
        Assert.assertEquals(list.size(), quiz.getNonExtractedQuestionCount());
    }

    @Test
    public void testProcessedQuestion() {
        List<Question> list = new ArrayList<Question>();
        quiz.setProcessedQuestionList(list);

        Assert.assertEquals(list, quiz.getProcessedQuestionList());
        Assert.assertEquals(list.size(), quiz.getProcessedQuestionCount());
    }
}
