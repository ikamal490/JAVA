package MyPractice_code;

import java.util.Scanner;

/*
    Write a program to reverse a given number using a while loop.
 */
public class _035_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        int num = sc.nextInt();
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;  // Get the last digit
            reverse = reverse * 10 + digit; // Append the digit to the reversed number
            num = num / 10;  // Remove the last digit
        }

        System.out.println("Reversed number: " + reverse);
    }
}
