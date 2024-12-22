package _14_string_methods;

public class replace {
    public static void main(String[] args) {
        String name = "Narendra";
        System.out.println("Original name is: "+name);
        System.out.println("After apply method new String will be :");
        System.out.println(name.replace('a', 'A')); // Replace the word
        System.out.println(name.replace("dra","Modi")); // Replace the string
    }
}
