package Practise_set_;
/*
    Use a while loop to calculate the sum of the first 5 natural numbers.

    Natural numbers : 1,2,3,4,5
 */
public class _029_ {
    public static void main(String[] args) {
        int i=1;
        int sum = 0;
        while(i<=5){
            sum = sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
