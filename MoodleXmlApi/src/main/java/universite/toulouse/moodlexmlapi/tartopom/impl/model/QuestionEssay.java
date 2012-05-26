package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import javax.xml.bind.annotation.XmlElement;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

import universite.toulouse.moodlexmlapi.core.data.QuestionType;

/**
 * Question de type 'essay'.
 *
 * @author natsu
 */
@XmlDiscriminatorValue("essay")
public class QuestionEssay extends QuestionBase {

    private String responseFormat;
    private int responseFieldLines;
    private int attachments;
    private GraderInfo graderInfo;

    /**
     * Constructeur par défaut (responseformat = editor, responsefieldlines =
     * 15, attachments = 0, graderinfo = graderinfo par défaut)
     */
    public QuestionEssay() {
        super();
        this.responseFormat = "editor";
        this.responseFieldLines = 15;
        this.attachments = 0;
        this.graderInfo = new GraderInfo();
        super.setQuestionType(QuestionType.essay);
    }

    /**
     * Renvoie le nombre d'attachments
     *
     * @return le nombre d'attachments
     */
    @XmlElement(name = "attachments")
    public int getAttachments() {
        return attachments;
    }

    /**
     * Renvoie le contenu de graderinfo
     *
     * @return le contenu de graderinfo
     */
    @XmlElement(name = "graderinfo")
    public GraderInfo getGraderInfo() {
        return graderInfo;
    }

    /**
     * Renvoie le nombre de lignes du champ de réponse
     *
     * @return le nombre de lignes du champ de réponse
     */
    @XmlElement(name = "responsefieldlines")
    public int getResponseFieldLines() {
        return responseFieldLines;
    }

    /**
     * Renvoie le format de la réponse
     *
     * @return le format de la réponse
     */
    @XmlElement(name = "responseformat")
    public String getResponseFormat() {
        return responseFormat;
    }

    /**
     * Assigne le nombre d'attachements
     *
     * @param attachments le nombre d'attachements
     */
    public void setAttachments(int attachments) {
        this.attachments = attachments;
    }

    /**
     * Assigne le graderinfo
     *
     * @param graderInfo le graderinfo
     */
    public void setGraderInfo(GraderInfo graderInfo) {
        this.graderInfo = graderInfo;
    }

    /**
     * Assigne le nombre de lignes du champ de réponse
     *
     * @param responseFieldLines le nombre de champs de réponses
     */
    public void setResponseFieldLines(int responseFieldLines) {
        this.responseFieldLines = responseFieldLines;
    }

    /**
     * Assigne le format de la réponse
     *
     * @param responseFormat le format de la réponse parmi : editor,
     *                       editorfilepicker, plain, monospaced
     */
    public void setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
    }
}
