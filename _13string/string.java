package _13string;
import java.util.Scanner;
/*
       -->  A String is a sequence of characters
       --> A string is a class but can be used like a data type
 */
public class string {
    public static void main(String[] args) {
        //String name = new String("Kamal");  -- It is boring

        // Normal Way
        String name = "Kamal";  // java give Special Support  to String we can also write this type
        System.out.print("What is your name :");
        System.out.println(name);
        /*
         If you want output like that use above code :
         What is your name : Kamal
         */
        String name1 = "Kamal";
        System.out.println("What is your name :");
        System.out.println(name1);
         /*
         If you want output like that use above code :
         What is your name :
         Kamal
         */

        // Input Type
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter you NAAM :");
        String NAAM = sc.nextLine();
        System.out.println(NAAM);

        // Concept for print full name i.e kamal singh dhakad
        System.out.println("Enter the Full name :");
        String line = sc.nextLine();
        System.out.println(line);

        // Concept for print only name i.e kamal
        System.out.println("Enter only name :");
        String single_line = sc.next();  // Use for print only one word of the String
        System.out.println(single_line);
    }
}
