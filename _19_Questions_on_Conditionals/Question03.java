package _19_Questions_on_Conditionals;
import java.util.Scanner;
/*
   problem :Write a Java program to find whether a year entered by the user is a leap year
            or not ??
        */
public class Question03 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year ");
       int year = sc.nextInt();
       if(year%4==0 && year%100==0 || year%400==0){
           System.out.println("Leap Year");
       }
       else{
           System.out.println("Not a leap year");
       }
    }
}
