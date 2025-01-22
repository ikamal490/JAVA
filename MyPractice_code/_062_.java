package MyPractice_code;

import java.util.Scanner;

/*
    Even or Odd Number Check:
     Write a program that uses the modulus operator to check if a given number is even or odd.
 */
public class _062_ {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num1 = sc.nextInt();
        if(num1%2==0){
            System.out.println("It is an even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
