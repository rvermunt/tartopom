package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuestionCalculatedTest {

    QuestionCalculated question;
    @Before
    public void setUp() throws Exception {
        question=new QuestionCalculated();
    }

    @Test
    public void testShuffle() {
        question.setShuffle(true);
        assertTrue(question.isShuffle());
    }

    @Test
    public void testDatasetDefinitions() {
        DatasetDefinitions datasetDefinitions = new DatasetDefinitions();
        question.setDatasetDefinitions(datasetDefinitions);
        assertEquals(datasetDefinitions, question.getDatasetDefinitions());
    }

    @Test
    public void testAnswer() {
        Answer answer = new Answer();
        question.setAnswer(answer);
        assertEquals(answer, question.getAnswer());
    }

    @Test
    public void testUnits() {
        Units units = new Units();
        question.setUnits(units);
        assertEquals(units,question.getUnits());
    }

}
