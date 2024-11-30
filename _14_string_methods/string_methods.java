package _14_string_methods;

public class string_methods {
    public static void main(String[]args){

        String name = "Kamal";
//        System.out.println(name);
        int value = name.length();
        System.out.println(value);

//        String lowerCase = name.toLowerCase();  // It convert all the upper case letters into lower case letters
//        System.out.println(lowerCase);
//
//       String upperCase = name.toUpperCase(); // It convert all the lower case letters into upper case letters
//         System.out.println(upperCase);
//
//         String nonTrimmedString = "     Kamal    ";
//        System.out.println(nonTrimmedString);
//        String Trimmedstring = nonTrimmedString.trim();
//        System.out.println(Trimmedstring);

        System.out.println(name.substring(4));  // Return the back words , Here Kamal -- 0 1 2 3 4  , I have 5 words , If type 2 it return 234 i.e: mal
        System.out.println(name.substring(2,4));  // In which it excluded the 4th value type only fom 2,3 it will not include 4

        System.out.println(name.replace('l', 'n')); // It will replace the l value of "Kamal" with n --> It become Kaman
        System.out.println(name.replace("ama" , "ptr"));

        System.out.println(name.startsWith("amal"));  // It gives false output
        System.out.println(name.startsWith("Kam"));  // It gives true output
        System.out.println();
        System.out.println(name.endsWith("ama"));  // Kamal not ends with ama it end with mal so it is false statement
        System.out.println(name.endsWith("al"));   // It is true statement



    }
}
