package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

import universite.toulouse.moodlexmlapi.core.data.QuestionType;

/**
 * Question de type 'category'
 *
 * @author natsu
 *
 */
@XmlDiscriminatorValue("category")
public class QuestionCategory extends QuestionBase {

    @XmlElement(name = "category")
    private EnclosedText category;

    /**
     * Constructeur vide.
     */
    public QuestionCategory() {
        super();
        super.setQuestionType(QuestionType.category);
    }

    /**
     * Renvoie la catégorie.
     *
     * @return the category
     */
    @XmlTransient
    public String getCategory() {
        return category.getText();
    }

    /**
     * Assigne la catégorie.
     *
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = new EnclosedText(category);
    }
}
