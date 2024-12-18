package _34_Recursion;

public class recursion {
    // factorial(n) = (n)*(n-1)*(n-2)...1
    // factorial(5) = 5*4*3*2*1  = 120
    // factorial(0) = 1
    // factorial(n) = n* factorial(n-1)  // formula

    /*
    Har function ke apne alag alag variables hote hai ...
    we use p variable in factorial function as well as in main function
    It does not give an error
     */

    static int factorial (int n ){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return n*factorial(n-1 );
        }
    }
    public static void main(String[] args) {
        int x = 5;
        System.out.println("The value of factorial x is : " +factorial(x));

    }
}
