package MyPractice_code;
import java.util.Scanner;
/*
Factorial Number
    Writes a program to find the factorial of a given number
             using of a while loop.
        */

public class _024_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int i=1;
        int fac = 1;
        while(i<=num){
            fac = fac*i;
            i++;
        }
        System.out.println("The factorial of " +num+" is : " +fac);
    }
}
