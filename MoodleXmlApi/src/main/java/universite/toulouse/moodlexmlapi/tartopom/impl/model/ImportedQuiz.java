package universite.toulouse.moodlexmlapi.tartopom.impl.model;

import java.util.List;

import universite.toulouse.moodlexmlapi.core.data.Question;

/**
 * Quiz importé.
 *
 * @author natsu
 *
 */
public class ImportedQuiz extends Quiz implements
        universite.toulouse.moodlexmlapi.core.data.ImportedQuiz {

    List<Question> extractedQuestionList;
    List<Question> nonExtractedQuestionList;
    List<Question> processedQuestionList;

    /**
     * Constructeur vide
     */
    public ImportedQuiz() {
        super();
    }

    /**
     * Renvoie le nombre de questions extraites.
     *
     * @return le nombre de questions extraites
     */
    @Override
    public int getExtractedQuestionCount() {
        return extractedQuestionList.size();
    }

    /**
     * Renvoie les questions extraites.
     *
     * @return extractedQuestionList
     */
    @Override
    public List<Question> getExtractedQuestionList() {
        return extractedQuestionList;
    }

    /**
     * Renvoie le nombre de questions non extraites.
     *
     * @return le nombre de questions non extraites.
     */
    @Override
    public int getNonExtractedQuestionCount() {
        return nonExtractedQuestionList.size();
    }

    /**
     * Renvoie les questions non extraites.
     *
     * @return nonExtractedQuestionList
     */
    @Override
    public List<Question> getNonExtractedQuestionList() {
        return nonExtractedQuestionList;
    }

    /**
     * Renvoie le nombre de questions traitées.
     *
     * @return le nombre de questions traitées.
     */
    @Override
    public int getProcessedQuestionCount() {
        return processedQuestionList.size();
    }

    /**
     * Renvoie les questions traitées.
     *
     * @return processedQuestionList
     */
    @Override
    public List<Question> getProcessedQuestionList() {
        return processedQuestionList;
    }

    /**
     * Assigne les questions extraites.
     *
     * @param extractedQuestionList the extractedQuestionList to set
     */
    public void setExtractedQuestionList(List<Question> extractedQuestionList) {
        this.extractedQuestionList = extractedQuestionList;
    }

    /**
     * Assigne les questions non extraites.
     *
     * @param nonExtractedQuestionList the nonExtractedQuestionList to set
     */
    public void setNonExtractedQuestionList(
            List<Question> nonExtractedQuestionList) {
        this.nonExtractedQuestionList = nonExtractedQuestionList;
    }

    /**
     * Assigne les questions traitées.
     *
     * @param processedQuestionList the processedQuestionList to set
     */
    public void setProcessedQuestionList(List<Question> processedQuestionList) {
        this.processedQuestionList = processedQuestionList;
    }

}
