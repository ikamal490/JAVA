package _13string;
import java.util.Scanner;

/*
    concept :
    We can't use sc.next above the sc.nextLine below commented code give error
    And uncommented code is in correct format
 */
public class imp_concept {
    public static void main(String[] args) {

        /*

        System.out.println("Enter your name only :"); // we use this above the Scanner class
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);

        System.out.println("Please enter your full name :");
        String full = sc.nextLine();
        System.out.println(full);

         */

        System.out.println("Please enter your full name :");
        Scanner sc = new Scanner(System.in);
        String full = sc.nextLine();
        System.out.println(full);

        System.out.println("Enter your name only :"); // we use this above the Scanner class
        String str = sc.next();
        System.out.println(str);
    }
}
