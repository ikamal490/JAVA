package MyPractice_code;
/*
    Problem: WAP to find the maximum element in an array
 */
public class _045_Array {
    public static void main(String[] args) {
        int[] value = {45,89,76,90,23,67};
        int max= value[0];
        for(int i=0; i<value.length; i++){
            if(max<value[i]){
                max=value[i];
            }
        }
        System.out.println("The maximum number in this array is : "+max);
    }
}
