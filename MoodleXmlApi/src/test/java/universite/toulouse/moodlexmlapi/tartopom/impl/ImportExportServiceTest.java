package universite.toulouse.moodlexmlapi.tartopom.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import universite.toulouse.moodlexmlapi.core.InvalidQuizFormatException;
import universite.toulouse.moodlexmlapi.core.InvalidStreamSizeException;
import universite.toulouse.moodlexmlapi.core.data.ImportedQuiz;
import universite.toulouse.moodlexmlapi.core.data.Question;
import universite.toulouse.moodlexmlapi.core.data.QuestionText;
import universite.toulouse.moodlexmlapi.core.data.QuestionTextFormat;
import universite.toulouse.moodlexmlapi.tartopom.impl.model.Answer;
import universite.toulouse.moodlexmlapi.tartopom.impl.model.AnswerNumbering;
import universite.toulouse.moodlexmlapi.tartopom.impl.model.DatasetDefinitions;
import universite.toulouse.moodlexmlapi.tartopom.impl.model.EnclosedText;
import universite.toulouse.moodlexmlapi.tartopom.impl.model.MultichoiceAnswer;
import universite.toulouse.moodlexmlapi.tartopom.impl.model.QuestionCalculated;
import universite.toulouse.moodlexmlapi.tartopom.impl.model.QuestionCategory;
import universite.toulouse.moodlexmlapi.tartopom.impl.model.QuestionCloze;
import universite.toulouse.moodlexmlapi.tartopom.impl.model.QuestionDescription;
import universite.toulouse.moodlexmlapi.tartopom.impl.model.QuestionEssay;
import universite.toulouse.moodlexmlapi.tartopom.impl.model.QuestionMatching;
import universite.toulouse.moodlexmlapi.tartopom.impl.model.QuestionMultichoice;
import universite.toulouse.moodlexmlapi.tartopom.impl.model.QuestionNumerical;
import universite.toulouse.moodlexmlapi.tartopom.impl.model.QuestionShortAnswer;
import universite.toulouse.moodlexmlapi.tartopom.impl.model.QuestionTrueFalse;
import universite.toulouse.moodlexmlapi.tartopom.impl.model.Quiz;
import universite.toulouse.moodlexmlapi.tartopom.impl.model.SubQuestion;
import universite.toulouse.moodlexmlapi.tartopom.impl.model.Units;

/**
 * Tests de la classe ImportExportService.
 *
 * @author natsu
 *
 */
public class ImportExportServiceTest {

    ImportExportService service;

    /**
     * Méthode exécutée avant les tests
     */
    @Before
    public void setUp() throws Exception {
        service = new ImportExportService();
    }

    @Test
    public void testImportExport() {
        // création du quiz
        Quiz quiz = new Quiz();
        List<Question> questions = new ArrayList<Question>();

        QuestionCategory qs1 = new QuestionCategory("categorie");
        QuestionCalculated qs2 = new QuestionCalculated(1f, new EnclosedText(
                "General feedback"), null, null,
                new EnclosedText("Question 1"), 0.2f,
                new QuestionText("Répondez à la question",
                        QuestionTextFormat.plain_text), false, 0, new Answer(),
                new Units(), new DatasetDefinitions());
        QuestionCloze qs3 = new QuestionCloze(1f, null, null, null,
                new EnclosedText("Question 2"), 0.2f,
                new QuestionText("The capital of Franc"
                        + "e is {1:SHORTANSWER:%100%Paris#Congratulations!~%50"
                        + "%Marseille#No, that is the second largest city in F"
                        + "rance (afterParis).~*#Wrong answer. The capital of "
                        + "France is Paris, of course.}.",
                        QuestionTextFormat.plain_text), false);
        QuestionDescription qs4 = new QuestionDescription(1f, null, null, null,
                new EnclosedText("Question 3"), null, null, false);
        QuestionEssay qs5 = new QuestionEssay(1f, null, null, null,
                new EnclosedText("Question 4"), null, null, false, "editor",
                15, 0, null);
        QuestionMatching qs6 = new QuestionMatching(1f, null, null, null,
                new EnclosedText("Question 5"), 0.2f, null, false, 0, null,
                null, null, false, new ArrayList<SubQuestion>(), null);
        QuestionMultichoice qs7 = new QuestionMultichoice(1f, null, null, null,
                new EnclosedText("Question 6"), 0.4f, null, true, false, false,
                AnswerNumbering._123, null, null, null, false,
                new ArrayList<MultichoiceAnswer>(), null);
        QuestionNumerical qs8 = new QuestionNumerical(1f, null, null, null,
                new EnclosedText("Question 7"), 0.3f, null, false, false,
                new Answer(), new Units());
        QuestionShortAnswer qs9 = new QuestionShortAnswer(1f, null, null, null,
                new EnclosedText("Question 8"), 0f, null, false, 1, 0,
                new ArrayList<Answer>());
        QuestionTrueFalse qs10 = new QuestionTrueFalse(1f, null, null, null,
                null, null, null, false, 0, new ArrayList<Answer>());

        questions.add(qs1);
        questions.add(qs2);
        questions.add(qs3);
        questions.add(qs4);
        questions.add(qs5);
        questions.add(qs6);
        questions.add(qs7);
        questions.add(qs8);
        questions.add(qs9);
        questions.add(qs10);
        quiz.setQuestionList(questions);

        // export
        ByteArrayOutputStream out = (ByteArrayOutputStream) service
                .exportQuiz(quiz);

        // import
        try {
            ByteArrayInputStream in = new ByteArrayInputStream(
                    out.toByteArray());
            ImportedQuiz imported = service.importQuiz(in);

            Assert.assertEquals(questions.size(),
                    imported.getExtractedQuestionCount());
            Assert.assertEquals(questions.size(), imported.getQuestionList()
                    .size());

            boolean testCat = false;
            boolean testMatch = false;
            for (Question q : imported.getQuestionList()) {
                if (q.getClass() == QuestionCategory.class) {
                    testCat = true;
                }
                if (q.getClass() == QuestionMatching.class) {
                    testMatch = true;
                }
            }
            Assert.assertTrue(testCat);
            Assert.assertTrue(testMatch);
        }
        catch (InvalidQuizFormatException e) {
            e.printStackTrace();
        }
        catch (InvalidStreamSizeException e) {
            e.printStackTrace();
        }

    }
}
