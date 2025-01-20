package MyPractice_code;

import java.util.Scanner;

/*
    Simple Age Check
    Write a program that takes a person's age as input and
    displays whether they are a child (age < 13),
    a teenager (13–19), or an adult (20+).
 */
public class _013_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        if (age <= 0) {
            System.out.println("Invalid age. Age cannot be negative.");
        }
        else if(age<13){
            System.out.println("You are a child");
        }
//        else if (age>=13 && age<=19) {  ---> chote se question ko difficult bana diya 😂
        else if (age<=19) {
        System.out.println("Teenager");
        }
        else  {
            System.out.println("Adult");
        }
    }
}
