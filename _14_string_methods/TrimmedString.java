package _14_string_methods;

public class TrimmedString {
    public static void main(String[] args) {
        String name = "       How are you shefali     ";// It works only on single string either if you have single tap gap in each character
       // String name = "       Kamal      "; // It proper work that
        System.out.println(name);
        String trimmedString = name.trim();
        System.out.println(trimmedString);
        System.out.println();
    }
}
