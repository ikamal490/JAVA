package _35_Questions_on_Methods;

/*
    problem : Write a function to print nth term of fibonacci series using recursion.
 */
// Agar question me nth number diya ho toh n ki value 1 se start hogi , n=1
// Agar question me index number diya ho toh n ki value 0 se start hogi , n=0
public class Question04 {
    // Fibonacci series -- 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, and so on
    static int fib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        /*
        We can also use below code to save our lines --
        if(n==1 || n==2){
            return n-1;
        }
         */

        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static void main(String[] args) {
        int n = 7;
        int result = fib(n);
        System.out.println(result);
    }
}
