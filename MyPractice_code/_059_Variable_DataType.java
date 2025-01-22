package MyPractice_code;

import java.util.Scanner;

/*
Sum of Digits
        Write a program to take an integer as input and calculate the sum of its digits.

        Example Output:
        Enter a number: 123
        Sum of digits: 6
 */
public class _059_Variable_DataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int sum=0;
        while(number>0){
            int digit = number%10; // for getting last digit of number
            sum = sum+digit;
            number = number/10; // for removing the last digit of number
        }
        System.out.println("Sum of digits: "+sum);
    }
}
