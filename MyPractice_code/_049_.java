package MyPractice_code;
/*
    Reverse an Array
    Write a program to reverse an array in Java.
    Example Input: {1, 2, 3, 4, 5}
    Example Output: {5, 4, 3, 2, 1}
 */
public class _049_ {
    public static void main(String[] args) {
        int[] value = {1, 2, 3, 4, 5};
        for(int i=value.length-1; i>=0; i--){
            System.out.println(value[i]);
        }
    }
}
