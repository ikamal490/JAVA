package _35_Questions_on_Methods;
/*
    Problem 1 : Write a recursive function to calculate the sum of
                first n natural numbers.
 */

public class Question03 {
    // sum(n) = 1+2+3....n
    // sum(n) = 1+2+3....n-1 + n
    // sum(n) = sum(n-1) + n
    static int sumRec(int n){
        // Base condition -- it terminate the code at n=1(means, agar eska use nhi karenge toh minus me chala jayega result )
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }
    /*
        It work like --
        sum(4) = 4 + sumRec(4-1)
        sum(4) = 4 + 3 + sumRec(3-1)
        sum(4) = 4 + 3 + 2 + sum(2-1)
        sum(4) = 4 + 3 + 2 + 1  = 10
     */
    public static void main(String[]args){
        int z = sumRec(4);
        System.out.println(z);
    }
}
