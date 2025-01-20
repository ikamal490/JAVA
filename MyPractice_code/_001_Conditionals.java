package MyPractice_code;
import java.util.Scanner;
/*

Problem: Write a program to find out whether a student is pass or fail
            it requires total 40% and at least 33% in each subject to pass.
            Assume 3 subjects and take marks as an input from the user.
     */
public class _001_Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of your physics subject from 100  :");
        int physics = sc.nextInt();
        System.out.println("Enter marks of your Maths subject from 100 :");
        int maths = sc.nextInt();
        System.out.println("Enter marks of your Cpp subject from 100 :");
        int cpp = sc.nextInt();
        int avg = (physics+maths+cpp)/3;
        System.out.println("Your Total percentage is : "+ avg);
        if(maths< 33){
            System.out.println("Failed ");
        }
        else if (physics < 33) {
            System.out.println("Failed");
        }
        else if (cpp < 33) {
            System.out.println("Failed");
        }
        else if(avg<40){
            System.out.println("Sorry You are failed ! wapas padhai kar bc");
        }
        else {
            System.out.println("Passed, mithai khilao muje ");
        }
    }
}
// me esko logical operators laga kar bhi kar sakta tha lines of code kam hoti.
// Next time logical operators se solve karna es question ko