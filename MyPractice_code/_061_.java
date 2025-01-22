package MyPractice_code;
/*
Post-increment and Pre-increment:
 Write a Java program to demonstrate the difference between post-increment and
 pre-increment operators. Print the values before and after the increment.
 */
public class _061_ {
    public static void main(String[] args) {
        // Post increment
        int a = 5;
        System.out.println("Value before post-increment: " + a);
        System.out.println("Value after post increment: " + a++);

        // Pre increment
        int b = 5;
        System.out.println("Value before pre-increment: " + b);
        System.out.println("Value after pre increment: " + ++b);

    }
}
