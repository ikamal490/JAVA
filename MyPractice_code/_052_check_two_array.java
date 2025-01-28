package MyPractice_code;
/*
Write a Java program to check if two arrays are equal (contain the same elements in the same order).
Input Example:
int[] arr1 = {1, 2, 3, 4};
int[] arr2 = {1, 2, 3, 4};
Output Example:
The arrays are equal.
 */
public class _052_check_two_array {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        boolean areEqual = true;
        if(arr1.length!=arr2.length){
            areEqual = false;
        }
        System.out.println(areEqual);
    }
}
