public class IncorrectInputTypeException extends Exception {
    public IncorrectInputTypeException() {
        super();
    }

    public IncorrectInputTypeException(String message) {
        super(message);
    }

    public IncorrectInputTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectInputTypeException(Throwable cause) {
        super(cause);
    }

    protected IncorrectInputTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
