package MyPractice_code;
/*
    Find Maximum Element in an Array
    Write a Java program to find the maximum value in a given integer array.
    Example Input: {1, 5, 3, 9, 2}
    Example Output: Maximum value: 9
 */
public class _048_Array_Easy_Type {
    public static void main(String[] args) {
        int[] value = {1, 5, 3, 9, 2};
        int max = value[0];
        for(int i=0; i<=value.length-1; i++){
            if(max<value[i]){
                max=value[i];
            }
        }
        System.out.println("The maximum element in this array is : "+max);
    }
}
