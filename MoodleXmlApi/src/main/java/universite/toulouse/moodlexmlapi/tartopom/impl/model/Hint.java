package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

import universite.toulouse.moodlexmlapi.core.data.QuestionTextFormat;

/**
 * Indice pour une question.
 *
 * @author natsu
 *
 */
public class Hint {

    @XmlAttribute(name = "format")
    private String format;
    private String text;
    // on utilise EnclosedText juste pour avoir un objet vide permettant une
    // balise auto-fermante
    @XmlElement(name = "shownumcorrect")
    private EnclosedText showNumCorrect;
    @XmlElement(name = "clearwrong")
    private EnclosedText clearWrong;

    /**
     * Constructeur vide.
     */
    public Hint() {
    }

    /**
     * Constructeur d'un indice.
     *
     * @param format le format
     * @param text le texte
     * @param showNumCorrect si le nombre de bonne réponses doit être affiché
     * @param clearWrong si les mauvaises réponses doivent être effacées
     */
    public Hint(QuestionTextFormat format, String text, boolean showNumCorrect,
            boolean clearWrong) {
        this.setFormat(format);
        this.text = text;
        this.setShowNumCorrect(showNumCorrect);
        this.setClearWrong(clearWrong);
    }

    /**
     * Renvoie le format de l'indice.
     *
     * @return le format
     */
    @XmlTransient
    public QuestionTextFormat getFormat() {
        return QuestionTextFormat.valueOf(this.format);
    }

    /**
     * Renvoie le texte.
     *
     * @return le texte
     */
    @XmlElement(name = "text")
    public String getText() {
        return text;
    }

    /**
     * Est-ce que les réponses incorrectes doivent être effacées  ?
     *
     * @return the clearWrong
     */
    @XmlTransient
    public boolean isClearWrong() {
        return clearWrong != null;
    }

    /**
     * Est-ce que le nombre de réponses correctes doit être affiché  ?
     *
     * @return the showNumCorrect
     */
    @XmlTransient
    public boolean isShowNumCorrect() {
        return showNumCorrect != null;
    }

    /**
     * Est-ce que les réponses incorrectes doivent être effacées ?
     *
     * @param clearWrong vrai ou faux
     */
    public void setClearWrong(boolean clearWrong) {
        if (clearWrong) {
            this.clearWrong = new EnclosedText();
        }
        else {
            this.clearWrong = null;
        }
    }

    /**
     * Assigne le format
     *
     * @param format le format
     */
    public void setFormat(QuestionTextFormat format) {
        this.format = format.name();
    }

    /**
     * Est-ce que le nombre de réponses correctes doit être affiché  ?
     *
     * @param showNumCorrect vrai ou faux
     */
    public void setShowNumCorrect(boolean showNumCorrect) {
        if (showNumCorrect) {
            this.showNumCorrect = new EnclosedText();
        }
        else {
            this.showNumCorrect = null;
        }
    }

    /**
     * Assigne le texte.
     *
     * @param text le texte
     */
    public void setText(String text) {
        this.text = text;
    }
}
