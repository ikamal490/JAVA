package _05User_Define;
import java.util.Scanner;
public class s_name {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("When you want to print only one name :"); // If you want to print only name "kamal" it not will not print Kamal singh
        String str = sc.next();
        System.out.println(str);

//        System.out.println("When you want to print whole sentence :");
//        String strr = sc.nextLine();
//        System.out.println(strr);

        // we can't run both in same time  sc.nextLine or sc.next
    }
}
