package _29_Questions_on_Array;
/*
    Problem : WAP to find the minimum element in an array
 */
public class Question07 {
    public static void main(String[] args) {
        int[] value = {34,535,62,18, 323,642,124};
        int min = value[0];  // -2147483648 it's  value
        for(int i=1; i<value.length; i++){
            if (min>value[i]) {  // Check if the current value is smaller
                min = value[i];
            }
        }
        System.out.println(min);
    }
}

