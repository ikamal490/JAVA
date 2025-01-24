package MyPractice_code;
/*
 Write a function to print nth term of fibonacci series using recursion.
        fibonacci -- 0,1,1,2,3,5,8..

 */
public class _074_Methods {
    public static int fib(int n){
        if(n==1 || n==2){
            return n-1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
