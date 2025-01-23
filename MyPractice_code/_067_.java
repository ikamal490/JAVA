package MyPractice_code;

import java.util.Scanner;

/*
Check Palindrome
    Write a program to check if a string is a palindrome (reads the same backward as forward).
    Input: "madam"
    Output: true
    Input: "hello"
    Output: false
 */
public class _067_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input 1 : ");
        String str1 = sc.nextLine();
        System.out.println("Enter the input 2 : ");
        String str2 = sc.nextLine();
        StringBuilder obj = new StringBuilder(str1);
        StringBuilder obj1 = new StringBuilder(str2);
        obj.reverse();
        obj1.reverse();
        System.out.println(obj.toString());
        System.out.println(obj1.toString());
        if(str1.equals(obj.toString())){
            System.out.println("Yes, it is palindrome");
        } else{
            System.out.println("False");
        }
        if(str2.equals(obj1.toString())){
            System.out.println("Yes, it is palindrome");
        }
        else{
            System.out.println("False");
        }
    }
}
