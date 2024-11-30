package string13;
import java.util.Scanner;
/*
       -->  A String is a sequence of characters
       --> A string is a class but can be used like a data type

 */
public class string {
    public static void main(String[] args) {

    //    String name = new String("Kamal");
    //    String name = "Kamal";  // java give Special Support  to String we can also write this type
    //    System.out.print("What is your name : ");
    //    System.out.print(name);

        int a = 7;
        float b = 3.3443f;
    //    System.out.printf("The value of a is %d and the value of b is %f ", a, b);
    //    System.out.format("The value of a is %d and the value of b is %f ", a, b);   // This is same like a printf

            Scanner sc = new Scanner(System.in);
     //       String st = sc.next();  // Use for print only one word of the String
     //       System.out.println(st);
            String st = sc.nextLine();   // Use for print whole sentence
            System.out.println(st);


    }
}
