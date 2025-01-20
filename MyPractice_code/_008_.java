package MyPractice_code;

import java.util.Scanner;

/*
    Maximum of Two Numbers
    Write a program to find the greater of two numbers entered by the user.
 */
public class _008_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Number ");
        int num1 = sc.nextInt();
        System.out.println("Enter a Second Number ");
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println("The greater number is : " + num1);
        }
        else if (num1 == num2) {
            System.out.println("Numbers are Equals");
        }
        else{
            System.out.println("The greater number is : " + num2);
        }
    }
}
