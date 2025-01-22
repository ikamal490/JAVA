package MyPractice_code;

import java.util.Scanner;

/*
    Write a program to check if a number is a prime number using a for loop.
 */
public class _033_Loops_Medium_type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num < 2) {
            isPrime = false; // Numbers less than 2 are not prime
        } else {
            for (int i = 2; i <= num / 2; i++) { // Or use Math.sqrt(num)
                if (num % i == 0) {
                    isPrime = false; // Found a divisor
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
        }


