package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import universite.toulouse.moodlexmlapi.core.data.QuestionTextFormat;

/**
 * Tests unitaires de la classe QuestionMatching
 */
public class QuestionMatchingTest {

    QuestionMatching question;

    /**
     * Méthode exécutée avant les tests
     */
    @Before
    public void setUp() throws Exception {
        question = new QuestionMatching();
    }

    @Test
    public void testCorrectFeedBack() {
        EnclosedText feedback = new EnclosedText("Correct feedback");
        question.setCorrectFeedBack(feedback);

        Assert.assertEquals(feedback, question.getCorrectFeedBack());
    }

    @Test
    public void testHints() {
        List<Hint> hints = new ArrayList<Hint>();
        hints.add(new Hint(QuestionTextFormat.plain_text, "hint 1", false, true));
        question.setHints(hints);

        Assert.assertEquals(hints, question.getHints());
    }

    @Test
    public void testIncorrectFeedBack() {
        EnclosedText feedback = new EnclosedText("Incorrect feedback");
        question.setIncorrectFeedBack(feedback);

        Assert.assertEquals(feedback, question.getIncorrectFeedBack());
    }

    @Test
    public void testPartiallyCorrectFeedBack() {
        EnclosedText feedback = new EnclosedText("Partially correct feedback");
        question.setPartiallycorrectFeedBack(feedback);

        Assert.assertEquals(feedback, question.getPartiallycorrectFeedBack());
    }

    @Test
    public void testQuestions() {
        List<SubQuestion> subs = new ArrayList<SubQuestion>();
        subs.add(new SubQuestion(QuestionTextFormat.plain_text, "A",
                new EnclosedText("1")));
        subs.add(new SubQuestion(QuestionTextFormat.plain_text, "B",
                new EnclosedText("2")));
        question.setQuestions(subs);

        Assert.assertEquals(subs, question.getQuestions());
    }

    @Test
    public void testShowNumCorrect() {
        question.setShowNumCorrect(true);
        Assert.assertTrue(question.isShowNumCorrect());

        question.setShowNumCorrect(false);
        Assert.assertFalse(question.isShowNumCorrect());
    }

    @Test
    public void testShuffleAnswers() {
        int shuffleAnswers = 0;
        question.setShuffleanswers(shuffleAnswers);

        Assert.assertEquals(shuffleAnswers, question.getShuffleanswers());
    }
}
