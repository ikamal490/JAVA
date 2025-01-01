package _29_Questions_on_Array;
/*
    Problem : WAP to find the maximum element in an array
 */
public class Question06 {
    public static void main(String[] args) {
        int[] value = {23,4,82,92,32};
        int max =0;
        for(int i=0; i<value.length; i++){
            if(value[i]>max){
                max=value[i];
            }
        }
            System.out.println("The value of the maximum element in this array is : " +max);
    }
}
