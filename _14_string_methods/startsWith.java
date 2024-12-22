package _14_string_methods;

public class startsWith {
    public static void main(String[] args) {
        String str = "Aman Yadav";
        System.out.println(str.startsWith("man")); // return false
        System.out.println(str.startsWith("Am")); // return true
        System.out.println("Ends with");
        System.out.println(str.endsWith("yadav")); // false
        System.out.println(str.endsWith("Yadav")); // true
        System.out.println(str.endsWith("v"));  // true
    }
}
