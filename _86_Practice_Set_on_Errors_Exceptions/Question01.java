package _86_Practice_Set_on_Errors_Exceptions;

/*
 Question: WAP to demonstrate syntax, logical and runtime errors.
 */
public class Question01 {
    public static void main(String[] args) {
        // Syntax Error:
       // int a = 45  // semicolon not found

        // Logical Error:
        // Use for print natural numbers
        for(int i=0; i<23; i++){
            System.out.println(i*2); // Not print natural numbers
        }

        // Runtime Error:
        System.out.println(5/0);
    }
}
