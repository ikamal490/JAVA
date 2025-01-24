package MyPractice_code;
/*
Write a method to calculate the sum of elements in an array.
    Create a method public static int sumArray(int[] arr)
     that takes an array of integers and returns the sum of all elements.
 */
public class _073_Methods {
    public static int sumArray(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        return sum;
    }
    public static int sumValue(int ...arr){ // Using of varargs
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] values = {3,4,5,3};
        System.out.println(sumArray(values));
        System.out.println(sumValue(3,4,5,3)); // varargs concept
    }
}
