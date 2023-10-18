package Exceptions;

public class loginFailed extends RuntimeException{
    public loginFailed() {
        super();
    }

    public loginFailed(String message) {
        super(message);
    }

    public loginFailed(String message, Throwable cause) {
        super(message, cause);
    }

    public loginFailed(Throwable cause) {
        super(cause);
    }

    protected loginFailed(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
