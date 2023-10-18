package Exceptions;

public class userAlreadyExist extends RuntimeException{
    public userAlreadyExist() {
        super();
    }

    public userAlreadyExist(String message) {
        super(message);
    }

    public userAlreadyExist(String message, Throwable cause) {
        super(message, cause);
    }

    public userAlreadyExist(Throwable cause) {
        super(cause);
    }

    protected userAlreadyExist(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
