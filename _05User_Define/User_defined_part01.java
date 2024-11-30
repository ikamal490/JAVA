package _05User_Define;

import java.util.Scanner;   // use to import the keyboard value

public class User_defined_part01 {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        float a = sc.nextFloat();
        System.out.println("Enter the number 2:");
        float b = sc.nextFloat();
        float sum = a + b;
        System.out.println("The sum of these number is :");
        System.out.println(sum);

        // Comment out code
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the 1st value:");
//        int k = sc.nextInt();
//        System.out.println("Enter the 2nd value:");
//        int m = sc.nextInt();
//        System.out.println("Enter the 3rd value:");
//        int n = sc.nextInt();
//        int sum = k+m+n;
//        System.out.println("The sum of these above values is :");
//        System.out.println(sum);

    }

}

