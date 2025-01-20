package MyPractice_code;
import java.util.Scanner;
/*
   problem: Write a Java program to find whether a year entered by the user is a leap year
            or not?

HINT:
    A year is a leap year if:
    It is divisible by 4 and not divisible by 100, or
    It is divisible by 400.

If the year is divisible by 100, it must also be divisible by 400 to be a leap year
(e.g., the year 2000 was a leap year, but 1900 was not).
        */
public class _003_Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println("Leap year ");
        }
        else{
            System.out.println("Non-Leap year ");
        }
    }
}
/*
Explanation in my language:
    (year % 100 != 0 || year % 400 == 0) esko hame true banana hai esliye hamne esme OR
    operator use kara hai.
    Agar hum esme AND operator use karte toh ye false return karta or year % 4 == 0 ye true return karta jo ki end result false aata
    overall conclusion:
    year % 4 == 0 -- If we entered a leap year it return 'true'
    year % 100 != 0 || year % 400 == 0 --> If we entered a leap year it return 'true'
    then, true && true --> true, then it return "Leap year"
 */
