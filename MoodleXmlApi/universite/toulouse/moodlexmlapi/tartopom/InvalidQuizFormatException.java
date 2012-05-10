package universite.toulouse.moodlexmlapi.tartopom;
/**
 * Class representing an invalid quiz format error
 * @author fsil
 */
public class InvalidQuizFormatException extends Exception {

    /**
     * Construct an invalid quiz exception
     * @param parentException the parent exception
     */
    public InvalidQuizFormatException(final Throwable parentException) {
        super("invalidQuizFormat", parentException);
    }

}
