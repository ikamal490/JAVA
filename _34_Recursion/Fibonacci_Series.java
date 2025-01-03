package _34_Recursion;
/*
    Fibonacci series means --->
    0,1,1,2,3,5,8,13....
 */
public class Fibonacci_Series {  // Here,we start index with 1
    static int fib(int n){
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fib(n - 1) + fib(n - 2);
//            int result  = fib(n-1) +fib(n-2);
//            return result;   // you can use these lines
        }
    }
    public static void main(String[] args) {
        System.out.println("The value of Fibonacci series of value at is " +fib(1));
    }
}
