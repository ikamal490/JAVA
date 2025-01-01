package _29_Questions_on_Array;
/*
    problem: WAP to find whether an array is sorted or not.
 */
public class Question08 {
    public static void main(String[] args) {
//        int[] arr = {93, 64, 123, 12, 34, 23};
        int[] arr = {1,2,3,4,5};
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+ 1]) {
                isSorted = false;
            }
        }
        if (isSorted) {
            System.out.println("Array is Sorted");
        } else  {
            System.out.println("Array is not Sorted");
        }
    }
}
