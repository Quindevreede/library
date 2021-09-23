package nl.quin.library.exception;

public class RecordNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    //Deze doe je erbij om text weer te geven bij 404
    public RecordNotFoundException(String message) {
        super(message);
    }

    public RecordNotFoundException() {
        super("Record not found.");
    }
}
