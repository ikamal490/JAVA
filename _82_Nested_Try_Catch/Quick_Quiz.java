package _82_Nested_Try_Catch;
import java.util.Scanner;
/*
    Quiz: WAP that allows you to keep accessing an array until a valid
            index is given by the user.
 */
public class Quick_Quiz {
    public static void main(String[] args) {
        int[] marks = {23,32,53,67,78,56};
        boolean flag = true;
        while(flag){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of index");
            int index = sc.nextInt();
            try{
                System.out.println("It is Default ");
                // Nested try-catch
                try{
                    System.out.println(marks[index]);
                    flag = false;
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry! This index does not exist ");
                    System.out.println("Exception in level 2");
                }
            }
            catch(Exception e){
                System.out.println("Exception in level 1");
            }
            System.out.println("Thank For Using this Index ");
        }
    }
}
