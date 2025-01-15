package _81_Handling_Specific_Exceptions;
import java.util.Scanner;
public class Handling_Specific_Exceptions {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 78;
        marks[1] = 85;
        marks[2] = 91;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int index = sc.nextInt();
        System.out.println("Enter the number you want to divide the number with ");
        int number = sc.nextInt();
        try{
            System.out.println("The value at array index entered is :" +marks[index]);
            System.out.println("The value of array-value/number is :" +marks[index]/number);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticExceptionoccured !");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException occured !");
        }
        catch(Exception e){
            System.out.println("Some exception occured !");
            System.out.println(e);
            }
        }
    }
