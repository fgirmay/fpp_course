package problem5;

import org.junit.Test;
import problem3.BinarySearch;

import static org.junit.Assert.*;

/**
 * Created by fissehaye on 6/3/18.
 */
public class BinarySearchTest {
    @Test
    public void binarySearch() throws Exception {
        BinarySearch bs = new BinarySearch();
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value1 = 10;
        int value2 = 20;
        int expectedObjectIndex1 = 9;
        int expectedObjectIndex2 = -1;
        int actualObjectIndex1 = bs.binarySearch(list, value1);
        int actualObjectIndex2 = bs.binarySearch(list, value2);

        assertEquals(expectedObjectIndex1, actualObjectIndex1);
        assertEquals(expectedObjectIndex2, actualObjectIndex2);
    }

}