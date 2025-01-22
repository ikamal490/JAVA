package MyPractice_code;
/*
    problem: WAP to find whether an array is sorted or not.
 */
public class _047_Array {
    public static void main(String[] args) {
//        int[] arr = {93, 64, 123, 12, 34, 23};
        int[] arr = {3,4,5,6,7};
        boolean isSorted = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }

    }
}
