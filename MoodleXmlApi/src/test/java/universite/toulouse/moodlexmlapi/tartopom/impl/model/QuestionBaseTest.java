package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import universite.toulouse.moodlexmlapi.core.data.QuestionText;
import universite.toulouse.moodlexmlapi.core.data.QuestionTextFormat;
import universite.toulouse.moodlexmlapi.core.data.QuestionType;

public class QuestionBaseTest {

    QuestionBase qb;
    QuestionTextAdaptated qt;

    @Before
    public void setUp() throws Exception {
        qt = new QuestionTextAdaptated();
        qb = new QuestionBase(Float.valueOf("5.0"), null, new EnclosedText(
                "feedback"), "base64", "imageUrl", new EnclosedText("name"),
                Float.valueOf("10.0"), qt, QuestionType.calculated, false);
    }

    @Test
    public void testGetDefaultGrade() {
        assertEquals(qb.getDefaultGrade(), Float.valueOf("5.0"));
    }

    @Test
    public void testGetErrors() {
        assertNull(qb.getErrors());
    }

    @Test
    public void testGetGeneralFeedBack() {
        assertEquals(qb.getGeneralFeedBack(), "feedback");
    }

    @Test
    public void testGetGenFeedBack() {
        assertEquals(qb.getGenFeedBack().getText(), "feedback");
    }

    @Test
    public void testGetImageBase64() {
        assertEquals(qb.getImageBase64(), "base64");
    }

    @Test
    public void testGetImageUrl() {
        assertEquals(qb.getImageUrl(), "imageUrl");
    }

    @Test
    public void testGetName() {
        assertEquals(qb.getName(), "name");
    }

    @Test
    public void testGetNameBis() {
        assertEquals(qb.getNameBis().getText(), "name");
    }

    @Test
    public void testGetPenalty() {
        assertEquals(qb.getPenalty(), Float.valueOf("10.0"));
    }

    @Test
    public void testGetQuestionText() {
        assertEquals(qb.getQuestionText(), qt);
    }

    @Test
    public void testGetQuestionType() {
        assertEquals(qb.getQuestionType(), QuestionType.calculated);
    }

    @Test
    public void testIsHidden() {
        assertFalse(qb.isHidden());
    }

    @Test
    public void testSetDefaultGrade() {
        qb.setDefaultGrade(Float.valueOf("18.0"));
        assertEquals(qb.getDefaultGrade(), Float.valueOf("18.0"));
    }

    @Test
    public void testSetErrors() {
        fail("Not yet implemented");
    }

    @Test
    public void testSetGenFeedBackEnclosedText() {
        qb.setGenFeedBack(new EnclosedText("newFeedBack"));
        assertEquals(qb.getGeneralFeedBack(), "newFeedBack");
    }

    @Test
    public void testSetGenFeedBackString() {
        qb.setGenFeedBack("newFeedBack2");
        assertEquals(qb.getGeneralFeedBack(), "newFeedBack2");
    }

    @Test
    public void testSetHidden() {
        qb.setHidden(true);
        assert (qb.isHidden());
    }

    @Test
    public void testSetImageBase64() {
        qb.setImageBase64("plop");
        assertEquals(qb.getImageBase64(), "plop");
    }

    @Test
    public void testSetImageURL() {
        qb.setImageURL("hd");
        assertEquals(qb.getImageUrl(), "hd");
    }

    @Test
    public void testSetNameEnclosedText() {
        qb.setName(new EnclosedText("Jean Claude Dusse"));
        assertEquals(qb.getName(), "Jean Claude Dusse");
    }

    @Test
    public void testSetNameString() {
        qb.setName("bibi");
        assertEquals(qb.getName(), "bibi");
    }

    @Test
    public void testSetPenalty() {
        qb.setPenalty(Float.valueOf("120."));
        assertEquals(qb.getPenalty(), Float.valueOf("120."));
    }

    @Test
    public void testSetQuestionText() {
        QuestionText text = new QuestionText("", QuestionTextFormat.html);
        qb.setQuestionText(text);
        assertEquals(qb.getQuestionText(), text);
    }

    @Test
    public void testSetQuestionType() {
        qb.setQuestionType(QuestionType.matching);
        assertEquals(qb.getQuestionType(), QuestionType.matching);
    }

}
