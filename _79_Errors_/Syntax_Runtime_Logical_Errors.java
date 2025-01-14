package _79_Errors_;
import java.util.Scanner;

public class Syntax_Runtime_Logical_Errors {
    public static void main(String[] args) {
        // SYNTAX ERROR DEMO
        // int a = 9 // Error: no semicolon!
        // p = 23; // Error: p not declared !

        // Logical errors or Bug
        // write a to print all the prime numbers between 1 and 10
        System.out.println(2);
        for(int i=1; i<5; i++) {
            System.out.println(2*i+1); // odd number method
        }

        // RUNTIME ERROR
        System.out.println("Enter the value");
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+1000/k);
        // When the value of k is 0, it throws an error
    }
}
