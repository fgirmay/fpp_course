package problem3;

/**
 * Created by fissehaye on 6/2/18.
 */
public class BinarySearch {

    private int objectIndex;
    private int[] list;
    private int value;
    private boolean isObjectFound;

    public static void main(String[] args) {

        BinarySearch bs = new BinarySearch();
        bs.list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        bs.value = 10;
        bs.objectIndex = bs.binarySearch(bs.list, bs.value);

        System.out.println(bs.objectIndex);
    }

    public int binarySearch(int[] objects, int object) {

        this.list = objects;
        this.value = object;

        int leftIndex = 0;
        int rightIndex = objects.length;

        int middleIndex = (leftIndex + rightIndex) / 2;
        objectIndex = binarySearch(leftIndex, middleIndex, rightIndex);

        return objectIndex;
    }

    public int binarySearch(int leftIndex, int middleIndex, int rightIndex) {

        isObjectFound = this.list[middleIndex] == this.value;
        if (isObjectFound) {
            objectIndex = middleIndex;
            return  objectIndex;
        } else if ((middleIndex >= rightIndex && !isObjectFound) || (middleIndex <= leftIndex && !isObjectFound)) {
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
