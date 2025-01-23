package MyPractice_code;
/*
Write a method to check if a number is even or odd.
    Create a method public static boolean isEven(int number) that
    returns true if the number is even, otherwise false.
 */
public class _070_Methods {
    public static boolean isEven(int number){
        return number%2==0;
    }
    public static void main(String[] args) {
        System.out.println(isEven(7));
    }
}
