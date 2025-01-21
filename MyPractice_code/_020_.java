package MyPractice_code;

import java.util.Scanner;

/*
Sum of first n even numbers:
     Problem 2: Write a program to sum first n even numbers using while loop

Hint: Even number start with 0,2,4,6,8....
    */
public class _020_ {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of even numbers you want to sum : ");
        int value = sc.nextInt();
        int i=0;
        int sum = 0;
        while(i<value){
           sum = sum+(2*i);
            i++;
        }
        System.out.println("The sum of the first " + value + " even numbers is: " + sum);
    }
}
