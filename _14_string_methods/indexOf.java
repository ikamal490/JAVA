package _14_string_methods;

public class indexOf {
    public static void main(String[] args) {
        String name = "Donaldalal Trump";
        System.out.println(name.indexOf("a"));  // first a ki value kis index value se start ho rahi hai
        System.out.println(name.indexOf("T"));  // first T ki value kis index value se start ho rahi hai
        System.out.println(name.indexOf('l'));
        System.out.println();
        System.out.println(name.indexOf("ald"));
        System.out.println(name.indexOf("al",4)); // 4 index ke baad al kis index se start ho rha hia
        System.out.println(name.lastIndexOf('p'));
//        int value = name.length();
//        System.out.println(value);


    }
}
