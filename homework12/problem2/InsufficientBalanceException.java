package problem2;

/**
 * Created by fissehaye on 6/18/18.
 */
public class InsufficientBalanceException extends Exception {

    private String message;

    public InsufficientBalanceException() {
        message = "There is no sufficient balance to withdraw!";
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }

}
