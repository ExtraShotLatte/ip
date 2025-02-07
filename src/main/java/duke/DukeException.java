package duke;

/**
 * Duke's own exception which can be customized
 */
public class DukeException extends Exception {

    /**
     * Constructor for the DukeException class.
     *
     * @param errorMessage The String representation of the error message.
     */
    public DukeException(String errorMessage) {
        super("Whoops! " + errorMessage);
    }
}
