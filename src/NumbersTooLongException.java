public class NumbersTooLongException extends Exception {
    public NumbersTooLongException() {
        super();
    }

    public NumbersTooLongException(String message) {
        super(message);
    }

    public NumbersTooLongException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumbersTooLongException(Throwable cause) {
        super(cause);
    }

    protected NumbersTooLongException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
