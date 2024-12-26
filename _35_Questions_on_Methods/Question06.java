package _35_Questions_on_Methods;
/*
       problem 1 : Write a program using recursion to print the following pattern:
                    *
                    **
                    ***
                    ****
                    *****
 */

public class Question06 {
    static void pattern(int n ){
        if(n>0){
            pattern(n-1);
            for(int i=1; i<=n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*
            It work like ---
            pattern(5)
            pattern(4) + 5 times star and new line
            pattern(3) + 4 times star and new line +5 times star and new line
            pattern(2) + 3 times star and new line + 4 times star and new line +5 times star and new line
            pattern(1) + 2 times star and new line + 3 times star and new line + 4 times star and new line +5 times star and new line
            pattern(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line + 4 times star and new line +5 times star and new line
         */
    }
    public static void main(String[]args){
        pattern(5);
    }
}
