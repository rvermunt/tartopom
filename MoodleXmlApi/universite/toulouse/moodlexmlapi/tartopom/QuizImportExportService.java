package universite.toulouse.moodlexmlapi.tartopom;

import java.io.InputStream;
import java.io.OutputStream;

import universite.toulouse.moodlexmlapi.core.data.ImportedQuiz;
import universite.toulouse.moodlexmlapi.core.data.Quiz;

/**
 * Import export quiz service
 * @author fsil
 */
public interface QuizImportExportService {

    /**
     * Import a quiz from a source formated in Moodle XML format
     * @param is
     *            the input stream containing the quiz in Moodle XML format
     * @return the imported quiz
     * @throws InvalidQuizFormatException  in case of format problem
     * @throws InvalidStreamSizeException in case of size problem
     */
    ImportedQuiz importQuiz(InputStream is) throws InvalidQuizFormatException,
    InvalidStreamSizeException;

    /**
     * Export a quiz in the Moodle XML format
     * @param quiz
     *            the quiz to export
     * @return the output stream containing the quiz in Moodle XML format
     */
    OutputStream exportQuiz(Quiz quiz);

}
