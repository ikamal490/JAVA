package MyPractice_code;

import java.util.Scanner;

/*
Swapping Two Numbers Without Using a Temporary Variable:
 Write a program that swaps two integers using arithmetic operators
 (without using a temporary variable). For example, swapping a = 5 and b = 10 should result in a = 10 and b = 5.
 */
public class _063_Medium_type_ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = sc.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
