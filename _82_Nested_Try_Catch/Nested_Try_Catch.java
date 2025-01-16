package _82_Nested_Try_Catch;
import java.util.Scanner;

public class Nested_Try_Catch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 78;
        marks[1] = 85;
        marks[2] = 91;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int index = sc.nextInt();
        System.out.println("Enter the num value ");
        int num = sc.nextInt();
        try{
            System.out.println("I respect all the respected persons");  // Every time print
            try{  // nested try
                System.out.println(marks[index]);
                System.out.println(marks[index]/num);
            }
            catch(ArrayIndexOutOfBoundsException e){ // It is a level 2 Exception
                System.out.println("Sorry! This index does not exist ");
                System.out.println("Exception in level 2");
            }
        }
        catch(Exception e){
            System.out.println("Exception in level 1");
            System.out.println(e);
        }
    }
}

