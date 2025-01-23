package MyPractice_code;
/*
Write a method to calculate the square of a number.

Create a method public static int square(int number) that takes an integer as input and returns its square.
Test it with a sample input.
 */
public class _069_Methods {
    public static int square(int number){
        return number*number;
    }
    public static void main(String[] args) {
        System.out.println( square(34));
    }
}
