package MyPractice_code;

import java.util.Scanner;

/*
 Triangle Type Checker
    Write a Java program to check if three given sides can form a triangle.
    If they do, determine whether it is:

    Equilateral: All sides are equal.
    Isosceles: Any two sides are equal.
    Scalene: All sides are different.
 */
public class _015_Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side 1");
        int side1 = sc.nextInt();
        System.out.println("Enter the side 2");
        int side2 = sc.nextInt();
        System.out.println("Enter the side 3");
        int side3 = sc.nextInt();
        if(side1==side2 && side2==side3){
            System.out.println("Equilateral Triangle ");
        }
        else if(side1==side2 && side2!=side3 || side1==side3 && side3!=side2 || side2==side3 && side3!=side1){
            System.out.println("Isosceles Triangle ");
        }
        else{
            System.out.println("Scalene Triangle");
        }
    }
}
