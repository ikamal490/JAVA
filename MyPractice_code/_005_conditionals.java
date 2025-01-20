package MyPractice_code;

import java.util.Scanner;
/*
Positive or Negative
    Write a program to check whether a number entered by the user
     is positive, negative, or zero.

HINT:
If the number is greater than zero, it is positive.
If the number is less than zero, it is negative.
If the number equals zero, it is zero.
 */
public class _005_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(num==0){
            System.out.println("The number equals zero");
        }
        else if (num<0) {
            System.out.println("Negative number");
        }
        else{
            System.out.println("Positive number");
        }
    }
}
