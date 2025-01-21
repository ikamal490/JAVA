package MyPractice_code;
import java.util.Scanner;

/*
Factorial Number
    Writes a program to find the factorial of a given number
             using of a for loop.
        */
public class _023_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int fac = 1;
        for(int i=1; i<=num; i++){
           fac = fac*i;
        }
        System.out.println("The factorial of " +num+" is : " +fac );
    }
}
