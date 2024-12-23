package _19_Questions_on_Conditionals;
import java.util.Scanner;
/*
            Problem 6:  Write a program to find out the type of website from the URL
                        .com -> commercial website
                        .org -> organization website
                        .in  -> indian website
         */
public class Question04 {
    public static void main(String[] args) {
        System.out.println("Enter the Website name :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       if(str.endsWith(".com")){
           System.out.println("It is a Commercial Website ");
       }
       else if(str.endsWith(".org")){
            System.out.println("It is an Organization Website");
        }
       else if(str.endsWith(".in")){
           System.out.println("It is an Indian Website");
       }
       else{
           System.out.println("Oops!You have entered wrong website URL");
       }
    }
}
