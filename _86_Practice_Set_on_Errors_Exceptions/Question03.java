package _86_Practice_Set_on_Errors_Exceptions;
import java.util.Scanner;
/*
    Problem: WAP that allow you to keep accessing an array until a valid index is
            given. If max retries exceed 5 print "Error".
 */
public class Question03 {
    public static void main(String[] args) {
        int[] marks = {23, 32, 53};
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Enter the value of the index");
        int i = 0;
        while (flag && i < 5) {
            try {
                int index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid index");
                i++;
            }
            if(i>=5) {
                System.out.println("Error!");
            }
        }
    }
}
