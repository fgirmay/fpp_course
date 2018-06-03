package problem5;

import org.junit.Test;
import problem4.PalindromeChecker;

import static org.junit.Assert.*;

/**
 * Created by fissehaye on 6/3/18.
 */
public class PalindromeCheckerTest {
    @Test
    public void isPalindrome() throws Exception {
        PalindromeChecker pc = new PalindromeChecker();
        String input1 = "Step on no pets";
        String input2 = "Step for no pets";
        boolean expectedResult1 = true;
        boolean expectedResult2 = false;
        boolean actualResult1 = pc.isPalindrome(input1);
        boolean actualResult2 = pc.isPalindrome(input2);

        assertEquals(expectedResult1, actualResult1);
        assertEquals(expectedResult2, actualResult2);
    }

}