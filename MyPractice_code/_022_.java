package MyPractice_code;

import java.util.Scanner;

/*
Table in Reverse form:
    Write a program to print multiplication table of 10 in reverse order.
        */
public class _022_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table number you want to print : ");
        int table = sc.nextInt();
        for(int i=10; i>0; i--){
            System.out.format("%d x %d = %d \n",table,i,table*i);
        }
    }
}

