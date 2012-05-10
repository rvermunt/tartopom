package universite.toulouse.moodlexmlapi.tartopom;
/**
 * Class reprensenting an invalid stream size error
 * @author fsil
 *
 */
public class InvalidStreamSizeException extends Exception {

    private Long maxSize;
    private Long streamSize;

    /**
     * @return the maxSize
     */
    public Long getMaxSize() {
        return maxSize;
    }

    /**
     * @return the streamSize
     */
    public Long getStreamSize() {
        return streamSize;
    }

    /**
     * Constructs an invalid stream size error
     * @param newmaxSize the max size
     * @param newstreamSize the stream size
     */
    public InvalidStreamSizeException(final Long newmaxSize,
            final Long newstreamSize) {
        super("invalidStreamSizeException");
        this.maxSize = newmaxSize;
        this.streamSize = newstreamSize;
    }

}