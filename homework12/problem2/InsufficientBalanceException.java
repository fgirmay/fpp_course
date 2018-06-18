package problem2;

/**
 * Created by fissehaye on 6/18/18.
 */
public class InsufficientBalanceException extends Exception {

    private String message;

    public InsufficientBalanceException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
