package _06_Question;

/*
Question ---->
Write a program to calculate the percentage of a given students in CBSE board exam.
His marks from 5 subjects must be taken as input from the keyboard (marks are out of 100)
 */


import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        System.out.println("Board Marksheet");
//        System.out.println("Percentage of Rohan");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of  Hindi Subject ");
        float a =sc.nextInt();
        System.out.println("Enter the marks of English Subject");
        float b = sc.nextInt();
        System.out.println("Enter the marks of Physics Subject");
        float c = sc.nextInt();
        System.out.println("Enter the marks of Chemistry Subject");
        float d = sc.nextInt();
        System.out.println("Enter the marks of Maths Subject");
         float e = sc.nextInt();
        System.out.println("Your Overall Percentage is :");
        float percentage = (a+b+c+d+e)/5;
        System.out.println(percentage);
    }

}

//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        float total = 500;
//        System.out.println("Enter marks for 5 subjects: ");
//        System.out.println("English: ");
//        float a = sc.nextFloat();
//        System.out.println("Mathematics: ");
//        float b = sc.nextFloat();
//        System.out.println("Physics: ");
//        float c = sc.nextFloat();
//        System.out.println("Chemistry: ");
//        float d = sc.nextFloat();
//        System.out.println("C++: ");
//        float e = sc.nextFloat();
//
//        float sum = a + b + c + d + e;
//        System.out.println("your total marks is: ");
//        System.out.println(sum);
//
//        float percentage = (sum / total) * 100;
//        System.out.println("Marks Percentage is: ");
//        System.out.print(percentage);
//    }
//}
