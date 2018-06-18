package problem2;

/**
 * Created by fissehaye on 6/18/18.
 */
public class BalanceBelowThresholdException extends Exception {

    private String message;

    public BalanceBelowThresholdException() {
        message = "The balance is below the minimum threshold of 100 USD";
    }

    public BalanceBelowThresholdException(String message) {
        this.message = message;
    }
}
