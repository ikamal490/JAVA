package _18_Switch_Case;
import java.util.Scanner;
public class Switch {

// Use of switch case is used to make a choice between number of alternative
   public static void main(String[]args){

       int age  ;
       System.out.println("Enter you age :");
       Scanner sc = new Scanner(System.in);
       age = sc.nextInt();

   switch(age){
       case 18:
           System.out.println("You are now Adult");
           break;
       case 23:
           System.out.println("Now you can join the Job");
           break;
       case 60:
           System.out.println("Now you can take a retirement ");
           break;
       default:
           System.out.println("Enjoy Your life !");

       }

   }


}
