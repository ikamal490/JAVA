package MyPractice_code;
/*
Reverse a String
    Write a program to reverse a given string.
    Input: "hello"
    Output: "olleh"
 */
public class _065_String_Easy_type {
    public static void main(String[] args) {
        StringBuilder obj = new StringBuilder("hello");
        obj.reverse();
        System.out.println(obj.toString());
    }
}