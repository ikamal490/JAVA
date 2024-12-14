package Self_Practise;
import java.util.Scanner;
public class user_defined {
    public static void main(String[]args){
        System.out.println("User Defined Bhul jata hu bhaii kya karu ! :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 :");
        int a = sc.nextInt();
        // float a = sc.nextFloat();   --> Use for using a float value
        System.out.println("Enter the number 2 :");
        int b = sc.nextInt();
        System.out.println("The sum of these numbers are :");
        int sum = a+b;
        System.out.println(sum);

        Scanner kd = new Scanner(System.in);
        System.out.println("Enter the string you want to print here !");
        String str = kd.nextLine();
        String strr = kd.next(); // Print only first word of the sentence i.e it print only kamal , it will not print kamal singh
        System.out.println(str);
        System.out.println(strr);


    }
}
