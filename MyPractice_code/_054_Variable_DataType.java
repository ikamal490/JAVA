package MyPractice_code;
// WAP to detect whether a number entered by the user is integer or not.

import java.util.Scanner;

public class _054_Variable_DataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        boolean a1 = sc.hasNextInt();
        System.out.println(a1);
    }
}
