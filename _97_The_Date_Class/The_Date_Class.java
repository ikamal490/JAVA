package _97_The_Date_Class;
import java.util.Date;

// Returns the number of milliseconds since January 1, 1970
public class The_Date_Class {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE +" Long value digit"); // It the value of 'Long' how much numbers it's stored
        System.out.println(System.currentTimeMillis()); // print the total milliseconds till now from January 1, 1970
        System.out.println();
        System.out.println("Current Date and Time is: ");
        Date d = new Date();
        System.out.println(d); //  Fri Jan 31 14:05:48 IST 2025
        System.out.println(d.getTime()); // Total milliseconds till now from January 1, 1970
        System.out.println("Today Date is: "+d.getDate()); // Deprecated method
        System.out.println("Year is: "+d.getYear()); // Deprecated method // subtracting from 1900
        System.out.println("Month is: "+d.getMonth()); // start from 0 to 11
    }
}
/*
Output:
    9223372036854775807 Long value digit
    1738312548099

    Current Date and Time is:
    Fri Jan 31 14:05:48 IST 2025
    1738312548099
    Today Date is: 31
    Year is: 125
    Month is: 0
 */
