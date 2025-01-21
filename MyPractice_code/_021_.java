package MyPractice_code;
import java.util.Scanner;

/*
Multiplication table
     Write a program to print multiplication table of given number n.
                Take input from the user.
     */
public class _021_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table number you want to print : ");
        int table = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.format("%d X %d = %d \n",table, i, table*i);
        }
    }
}
