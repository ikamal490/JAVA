package _19_Questions_on_Conditionals;
import java.util.Scanner;
/*

    Problem : Write a program to find out whether a student is pass or fail
                it  requires total 40% and at least 33% in each subject to pass.
                Assume 3 subjects and take marks as an input from the user .
     */
public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("** Marksheet **");
        System.out.println("Enter Maths Marks :");
        float m1 = sc.nextInt();
        System.out.println("Enter Science Marks :");
        float m2 = sc.nextFloat();
        System.out.println("Enter Hindi Marks :");
        float m3 = sc.nextFloat();
        float total = (m1+m2+m3)/3.0f;
        System.out.println("Total Percentage :" +total);
        if(total>=40.0f && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations, You are passed !! ");
        }
        else{
            System.out.println("Oops!! You are Fail ");
        }
    }
}
