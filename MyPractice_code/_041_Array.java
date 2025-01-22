package MyPractice_code;
/*
    Problem: Create an array of 5 floats and calculate their sum.
 */
public class _041_Array {
    public static void main(String[] args) {
        float[] arr = {23.23F, 28.23F,98.23F,46.23F,76.32F};
        float sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        System.out.println("Total sum of the array is :" +sum);

    }
}
