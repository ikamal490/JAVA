package MyPractice_code;
import java.util.Scanner;
/*
    Simple Calculator (If-Else):
    Write a program that performs addition, subtraction, multiplication,
     or division based on the user's choice (use if-else statements).
 */
public class _010_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an operation you want to perform: + , - , * , / ");
        char operator = sc.next().charAt(0);
        System.out.println("Enter the value 1 : ");
        float num1 = sc.nextInt();
        System.out.println("Enter the value 2 : ");
        float num2 = sc.nextInt();
        if (operator == '+'){
            System.out.println("The Sum is : "+(num1+num2));
        }
        else if (operator == '-'){
            System.out.println("The Subtraction is : "+(num1-num2));
        }
        else if (operator == '*'){
            System.out.println("The Multiplication is : "+(num1*num2));
        }
        else if (operator == '/'){
            System.out.println("The Division is : "+(num1/num2));
        }
        else{
            System.out.println("Invalid operator");
        }
    }
}
