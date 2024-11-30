package Operators08;

public class Operators {
    public static void main(String[] args) {
        double a = 7.4;
//        int b = 10 % a ; // % is a Modulo Operator it gives the remainder value
        double p = 8.5 % a ;
        int k = 5 % 3;
        System.out.println(k);
        System.out.println(p);

        int c = 7;
        c += 3;  // += is c me 3 add kar doo !!
        System.out.println(c);
//        System.out.println(64==43);  // == , >= , <= are the comparison operators
//        System.out.println(64>78 && 43>23); // && --> agar koii ek bhi statement galat hue toh false return kar dega
        System.out.println(64>78 || 43>23); // || --> agar koii ek bhi statement true hue toh true return kar dega

    }
}
