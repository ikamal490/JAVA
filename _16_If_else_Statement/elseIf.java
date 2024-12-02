package _16_If_else_Statement;
import java.util.Scanner;
public class elseIf {
    public static void main(String[]args){

        int age ;
        System.out.println("Enter Your age :");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>53){
            System.out.println("You are experinced person");
        }
        else if (age > 40){
            System.out.println("You are intermediate person");
        }
        else if(age > 30){
            System.out.println("You are a normal person");
        }
        else {
            System.out.println("You are beginner person");
        }
    }
}
