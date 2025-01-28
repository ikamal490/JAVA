package MyPractice_code;
/*
    Second Largest Element in an Array
    Write a program to find the second largest element in an array.
    Example Input: {12, 35, 1, 10, 34, 1}
    Example Output: Second largest: 34
 */
public class _051_Array_Medium_Type {
    public static void main(String[] args) {
        int[] value = {12, 35, 1, 10, 34, 1};
        int lar = value[0];
        int secLar = value[0];
        for(int i=0; i<value.length; i++){
            if(lar<value[i]){
                lar=value[i];
            }
        }
            System.out.println(lar);
        for(int j=0; j<value.length; j++){
            if(secLar<value[j] && value[j]!=lar){
                secLar=value[j];
            }
        }
        System.out.println("Second largest value is " + secLar);
    }
}
