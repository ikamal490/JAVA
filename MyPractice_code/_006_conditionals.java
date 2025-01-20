package MyPractice_code;
import java.util.Scanner;
/*
Even or Odd
    Write a program to check whether a number is even or odd.
 */
/*
HINT:
    even -- divisible by 2
    odd -- not divisible by 2
    Eg. 6 divisible by 2 it is an even number
    e.g - 15 is not divisible by 2 so it is an odd number

    even  - 2n  -- 2*5=10
    odd - 2n+1 -- 2*5+1 = 11
 */
public class _006_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Even number ");
        }
        else{
            System.out.println("odd number");
        }

    }
}
