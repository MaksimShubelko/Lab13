public class IncorrectOperationException extends Exception {
    public IncorrectOperationException() {
        super();
    }

    public IncorrectOperationException(String message) {
        super(message);
    }

    public IncorrectOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectOperationException(Throwable cause) {
        super(cause);
    }

    protected IncorrectOperationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
