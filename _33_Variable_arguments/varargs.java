package _33_Variable_arguments;

public class varargs {
    /*
        --> We give more than one argument to the function .
     */

    static int sum (int a ,int b){
        return a+b;
        }
        static int sum(int a,int b, int c){
            return a+b+c;
    }
    static int sum(int a , int b ,int c , int d){
        return a + b  + c + d;
    }
//    static int sum(int a , int b , int c ,int d){
//        return a + b + c + d;
//    }

    public static void main(String[]args){
        System.out.println("Welcome to varargs Tutorial");
        System.out.println("The sum of 9 and 11 is :" +sum(9,11));
        System.out.println("The sum of 9 , 15 and 11 is :" +sum(9,15,11));
        System.out.println("The sum of 10 ,15, 20 and 25 is :" +sum(10,15,20,25));
    }
}
