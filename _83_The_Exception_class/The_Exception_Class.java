package _83_The_Exception_class;
import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        //return super.toString();  --> By default
        return "I am toString()";
    }
    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
public class The_Exception_Class {
    public static void main(String[] args) {
        boolean flag = true;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value");
            int a = sc.nextInt();
            if (a < 100) {
                try {
//                throw new MyException();  // Uncomment this line and run
                    throw new ArithmeticException("It is an ArithmeticException Kamal");
                } catch (Exception e) {
                    System.out.println(e.getMessage()); // Output: It is an ArithmeticException Kamal
                    System.out.println(e.toString()); // Output: java.lang.ArithmeticException: It is an ArithmeticException Kamal
                    System.out.println(e); // Output: java.lang.ArithmeticException: It is an ArithmeticException Kamal
                    e.printStackTrace(); // Output: java.lang.ArithmeticException: It is an ArithmeticException Kamal
//                                              at _83_The_Exception_class.The_Exception_Class.main(The_Exception_Class.java:23)
                }
                System.out.println("Yes, It is not an error !");
        }
    }
}
/*
Output: of commented line 23
    Enter the value
    12
    I am getMessage()
    I am toString()
    I am toString()
    Yes, It is not an error !
    I am toString()
        at _83_The_Exception_class.The_Exception_Class.main(The_Exception_Class.java:22)
 */
