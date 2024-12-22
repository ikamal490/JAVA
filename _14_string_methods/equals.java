package _14_string_methods;

public class equals {
    public static void main(String[] args) {
        String name = "Shefali";
        System.out.println(name.equals("kamal")); // false
        System.out.println(name.equals("Shefali")); // true
        System.out.println(name.equals("shefali")); //false --> s is lowerCase
        System.out.println(name.equalsIgnoreCase("SheFALi")); // true , it will ignore the upper and lower case
    }
}
