package MyPractice_code;

import java.util.Scanner;

/*
    Basic Arithmetic Operations:
     Write a Java program that takes two numbers as input and performs the following arithmetic operations:

    Addition
    Subtraction
    Multiplication
    Division
    Modulo (remainder)

 */
public class _060_Operator_Easy_type_Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Addition: "+(num1+num2));
        System.out.println("Subtraction: "+(num1-num2));
        System.out.println("Multiplication: "+(num1*num2));
        System.out.println("Division: "+(num1/num2));
        System.out.println("Modulo: "+(num1%num2));

    }
}
