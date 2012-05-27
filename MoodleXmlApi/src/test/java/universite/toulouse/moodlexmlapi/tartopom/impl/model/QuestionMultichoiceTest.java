package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import universite.toulouse.moodlexmlapi.core.data.QuestionTextFormat;

/**
 * Tests unitaires de la classe QuestionMultichoice
 */
public class QuestionMultichoiceTest {

    QuestionMultichoice question;

    /**
     * Méthode exécutée avant les tests
     */
    @Before
    public void setUp() throws Exception {
        question = new QuestionMultichoice();
    }

    @Test
    public void testAnswerNumbering() {
        question.setAnswerNumbering(AnswerNumbering._ABCD);
        Assert.assertEquals(AnswerNumbering._ABCD,
                question.getAnswerNumbering());
    }

    @Test
    public void testAnswers() {
        List<MultichoiceAnswer> subs = new ArrayList<MultichoiceAnswer>();
        subs.add(new MultichoiceAnswer(50, QuestionTextFormat.plain_text,
                new EnclosedText("feedback"), "réponse a"));
        subs.add(new MultichoiceAnswer(30, QuestionTextFormat.plain_text, null,
                "réponse B"));
        question.setAnswers(subs);

        Assert.assertEquals(subs, question.getAnswers());
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
    public void testShowNumCorrect() {
        question.setShowNumCorrect(true);
        Assert.assertTrue(question.isShowNumCorrect());

        question.setShowNumCorrect(false);
        Assert.assertFalse(question.isShowNumCorrect());
    }

    @Test
    public void testShuffleAnswers() {
        question.setShuffleAnswers(true);
        Assert.assertTrue(question.isShuffleAnswers());
    }

    @Test
    public void testSingle() {
        question.setSingle(true);
        Assert.assertTrue(question.isSingle());
    }
}
