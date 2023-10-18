package Exceptions;

public class physicalActivityNotSet extends RuntimeException{
    public physicalActivityNotSet() {
        super();
    }

    public physicalActivityNotSet(String message) {
        super(message);
    }

    public physicalActivityNotSet(String message, Throwable cause) {
        super(message, cause);
    }

    public physicalActivityNotSet(Throwable cause) {
        super(cause);
    }

    protected physicalActivityNotSet(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
