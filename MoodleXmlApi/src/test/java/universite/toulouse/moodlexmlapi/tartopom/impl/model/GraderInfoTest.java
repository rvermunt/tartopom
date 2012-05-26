package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests unitaires de la classe GraderInfo
 */
public class GraderInfoTest {

    GraderInfo info;

    /**
     * Méthode exécutée avant les tests
     */
    @Before
    public void setUp() throws Exception {
        info = new GraderInfo();
    }

    @Test
    public void testFormat() {
        String format = "text";

        info.setFormat(format);

        Assert.assertEquals(format, info.getFormat());
    }

    @Test
    public void testText() {
        String text = "texte";

        info.setText(text);

        Assert.assertEquals(text, info.getText());
    }
}
