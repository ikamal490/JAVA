package MyPractice_code;

import java.util.Scanner;

/*
Grading System
    Write a Java program to calculate the grade of a student based
    on their score using a series of if-else if statements.
    The grading system is as follows:

    90 and above: Grade A
    80 to 89: Grade B
    70 to 79: Grade C
    60 to 69: Grade D
    Below 60: Grade F
 */
public class _014_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***** Grade Mark-sheet *****");
        System.out.println("Enter you Score : ");
        int score = sc.nextInt();
        if(score>=90){
            System.out.println("Grade A");
        }
        else if(score>=80 && score<90){
            System.out.println("Grade B");
        } else if (score>=70 && score < 80) {
            System.out.println("Grade C");
        }
        else if (score>=60 && score < 70) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Grade F");
        }
    }
}
