package MyPractice_code;

import java.util.Scanner;

// WAP to convert kilometers to miles
public class _053_Variable_DataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Kilometers : ");
        int km = sc.nextInt();
        System.out.println("Miles in "+km+" km is " +km*0.621371);
    }
}
