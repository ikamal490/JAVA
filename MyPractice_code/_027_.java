package MyPractice_code;

import java.util.Scanner;

/*
Sum of first n even numbers:
     Problem 2: Write a program to sum first n even numbers using for loop

Hint: Even number start with 0,2,4,6,8....
    */
public class _027_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of even numbers you want to sum : ");
        int num = sc.nextInt();
        int sum =0;
        for(int i=0; i<=num; i++){
            sum = sum+i;
        }
        System.out.println("The sum of the first " + num + " even numbers is: " + sum);
    }
}


