package MyPractice_code;
import java.util.Scanner;
/*
Grade Check:
    Write a program that takes a student's marks as input and
     displays if they passed (marks >= 40) or failed.
 */
public class _007_ {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your marks in Physics : ");
        int physics = sc.nextInt();
        System.out.println("Enter your marks in Chemistry : ");
        int chemistry = sc.nextInt();

        System.out.println("Enter your marks in Mathematics : ");
        int math= sc.nextInt();

        System.out.println("Enter your marks in science : ");
        int science = sc.nextInt();

        System.out.println("Enter your marks in Hindi: ");
        int hindi = sc.nextInt();

        int totalMarks = physics + chemistry + math + science + hindi;
        System.out.println("Your total marks is : " +totalMarks);
        double avg = totalMarks / 5.0;

        if(avg >= 40){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
    }
}
