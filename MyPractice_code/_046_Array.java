package MyPractice_code;
/*
    Problem: WAP to find the minimum element in an array
 */
public class _046_Array {
    public static void main(String[] args) {
        int[] value = {45,89,76,90,23,67};
        int min = value[0];
        for(int i=0; i<value.length; i++){
            if(min>value[i]){
                min=value[i];
            }
        }
        System.out.println("The minimum number in this array is : "+min);
    }
}
