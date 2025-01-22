package MyPractice_code;
/*
    Sum of Array Elements
    Create a Java program that calculates the sum of all elements in an integer array.
    Example Input: {4, 7, 1, 3}
    Example Output: Sum: 15
 */
public class _050_ {
    public static void main(String[] args) {
        int[] value = {4, 7, 1, 3};
        int sum = 0;
        for(int i=0;i<value.length; i++){
            sum = sum+value[i];
        }
        System.out.println(sum);
    }
}
