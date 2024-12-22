package Self_Practise;
import java.util.Scanner;

public class check_data_type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        boolean a1 = sc.hasNextInt();
        boolean a2 = sc.hasNextFloat();
        System.out.println(a1);
        System.out.println(a2);

    }


}
