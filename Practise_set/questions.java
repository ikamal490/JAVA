package Practise_set;

import java.util.Scanner;

public class questions {

    // Question 1: Write a program to sum three numbers in java program

    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        int c = 7;
        int sum = a+b+c;
        System.out.println("The sum of these numbers is: ");
        System.out.println(sum);


        // Question 2 : WAP to calculate CGPA using marks of three subjects (out of 100)

        float subject1 = 78;
        float subject2 = 56;
        float subject3 = 54;
        float percentage = (subject1 + subject2 + subject3)/3;
        float cgpa = percentage/10;
        System.out.println("The CGPA of this year is :");
        System.out.println(cgpa);

        //Question 3 : WAP which asks the user to enter his/her name and greets them with "Hello <name> , have a good day" text.

//        System.out.println("Enter your name:");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println(" Hello " + name + ",have  a good day");

        //Question 4: WAP to convert kilometers to miles

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the km : ");
         double d = sc.nextDouble();
         double km = 0.621371;
        System.out.println(km*d);


        //Question 5: WAP to detect whether a number entered by the user is integer or not.

        System.out.println("Enter the number: ");
        Scanner kd = new Scanner(System.in);
        System.out.println(kd.hasNextInt());

    }

    }


