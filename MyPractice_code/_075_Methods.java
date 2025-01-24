package MyPractice_code;
/*
Write a method to calculate the factorial of a number using recursion.
    Create a method public static int factorial(int n)
     that uses recursion to calculate the factorial of the given number.

      5! = 5*4*3*2*1
 */
public class _075_Methods {
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
