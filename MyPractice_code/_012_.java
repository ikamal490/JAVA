package MyPractice_code;

import java.util.Scanner;

/*
    Largest of Three Numbers
    Write a program to find the largest number among three numbers entered by the user.
 */
public class _012_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the number 3 : ");
        int num3 = sc.nextInt();
        if(num1>num2 && num2>num3 || num1>num3 && num3>num2) {
            System.out.println("Greater number is : "+num1);
        } else if (num2>num1 && num1>num3 || num2>num3 && num3>num1) {
            System.out.println("Greater number is : "+num2);
        }
        else {
            System.out.println("Greater number is : "+num3);
        }
    }
}
