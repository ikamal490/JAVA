package _14_string_methods;

public class substring {
    public static void main(String[] args) {
        String name = "\"Shefali chopra\"";
        System.out.print("Original name "+name+"\n");
        // .substring will print the remaining words of the string , it starts with what number you  entered
        System.out.println(name.substring(0));
        System.out.println(name.substring(1));
        System.out.println(name.substring(13));
        System.out.println(name.substring(6));
        // When we type two numbers it doesn't type the last number word
        System.out.println(name.substring(3,6));  // i.e. it types the words between 3,4,5
    }
}
