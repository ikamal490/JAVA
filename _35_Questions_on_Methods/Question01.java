package _35_Questions_on_Methods;
/*
        Problem 1: Write a java method to print multiplication table of
                    a number n .
     */

public class Question01 {
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    public static void main(String[]args){
        multiplication(7);


        /*
        Without using of methods , It is simple --
        int a;
        a= 5;
       for(int i=1; i<=10; i++){
           System.out.println(i*5);
       }
       */
    }
}
