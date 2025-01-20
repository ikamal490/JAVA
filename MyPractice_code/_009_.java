package MyPractice_code;

import java.util.Scanner;

/*
    Leap Year Check
    Write a program to check whether a given year is a leap year.
 */
public class _009_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = sc.nextInt();
        if(year%4==0 &&(year%100 !=0 || year%400==0)) {
            System.out.println("It's a leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
