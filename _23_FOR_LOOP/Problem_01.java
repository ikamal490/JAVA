package _23_FOR_LOOP;
import java.util.Scanner;
public class Problem_01 {
    public static void main(String[]args){
        /*
            Write a program to print first n natural number in the reverse order ?
         */
        System.out.println("How much you want to print in reverse order :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i>0 ; i--){
            System.out.println(i);
        }

    }
}
