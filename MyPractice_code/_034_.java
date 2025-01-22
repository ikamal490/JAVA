package MyPractice_code;

import java.util.Scanner;

/*
    Create a program that calculates the factorial of a number using a while loop.
 */
public class _034_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int i=1;
        int sum = 1;
        while(i<=num){
            sum = sum*i;
            i++;
        }
        System.out.println("The factorial of "+num+" is "+sum);
    }
}
/*
Output:
    Enter the number :
    5
    The factorial of 5 is 120
 */