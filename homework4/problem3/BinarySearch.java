package problem3;

/**
 * Created by fissehaye on 6/2/18.
 */
public class BinarySearch {

    private int valueIndex;
    private int[] list;
    private int value;
    private boolean isValueFound;

    public static void main(String[] args) {

        BinarySearch bs = new BinarySearch();
        bs.list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        bs.value = 10;
        bs.valueIndex = bs.binarySearch(bs.list, bs.value);

        System.out.println(bs.valueIndex);
    }

    /*
        The method makes binary search of a given int value from an array of integers
     */
    public int binarySearch(int[] list, int value) {

        this.list = list;
        this.value = value;

        int leftIndex = 0;
        int rightIndex = list.length;

        int middleIndex = (leftIndex + rightIndex) / 2;
        valueIndex = binarySearch(leftIndex, middleIndex, rightIndex);

        return valueIndex;
    }

    public int binarySearch(int leftIndex, int middleIndex, int rightIndex) {

        isValueFound = this.list[middleIndex] == this.value;
        if (isValueFound) {
            valueIndex = middleIndex;
            return  valueIndex;
        } else if ((middleIndex >= rightIndex && !isValueFound) || (middleIndex <= leftIndex && !isValueFound)) {
            return -1;
        } else {
            if(this.value > list[middleIndex]) {
                leftIndex = middleIndex;
                middleIndex = (leftIndex + rightIndex) / 2;
            } else {
                rightIndex = middleIndex;
                middleIndex = (leftIndex + rightIndex)/2;
            }
            return binarySearch(leftIndex, middleIndex, rightIndex);
        }
    }
}
