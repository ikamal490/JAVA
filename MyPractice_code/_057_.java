package MyPractice_code;
/*
    Swap Two Numbers
    Write a program to swap the values of two integer variables using a temporary variable.

    Example Output:
    Before swapping: a = 5, b = 10
    After swapping: a = 10, b = 5
 */
public class _057_ {
    public static void main(String[] args) {
        int a = 54;
        int b = 34;
        System.out.println("The value of a and b before swapping is: "+a +" and " +b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("The value of a and b after swapping is: "+a +" and " +b);
    }
}
/*
Output:
The value of a and b before swapping is: 54 and 34
The value of a and b after swapping is: 34 and 54
 */
