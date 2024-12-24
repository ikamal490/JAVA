package _25_Questions_on_Loop;
import java.util.Scanner;
//Code doesn't work properly
/*
   problem 5: Write a program to find the factorial of a given number
             using of a for loop.
        */
public class Question05 {
    /*
        How factorial work :
        5! = 5*4*3*2*1
        0! = 1
        n! = (n)*(n-1)*(n-2)...1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();
        int factorial = 1;
        for(int i=1; i<=number; i++){
            factorial *=i;
            System.out.print("The value of factorial "+number+" is : ");

        }
    }
}
