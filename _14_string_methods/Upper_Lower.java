package _14_string_methods;

public class Upper_Lower {
    public static void main(String[] args) {
        String name = "\"KAMAL shefali\"";
        System.out.println(name);
        String lowerCase = name.toLowerCase(); // It convert all the upper case letters into lower case letters
        System.out.println("Before String " +name +" After apply .toLowerCase "+lowerCase);

        String upperCase = name.toUpperCase(); // It convert all the lower case letters into upper case letters
        System.out.println("Before String " +name +" After apply .toUpperCase "+upperCase);

    }
}
