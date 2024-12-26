package _35_Questions_on_Methods;
 /*
       problem 2 : Write a program using recursion to print the following pattern:
                  *****
                  ****
                  ***
                  **
                  *
 */
public class Question07 {

    static void Rev_pattern(int n){
        Rev_pattern(n-1);
            for(int i=1; i<=n; i++){
                System.out.print("*");
            }
            System.out.println();
    }
    public static void main(String[]args){
        Rev_pattern(5);
    }
}
