package _96_Date_and_Time;
// Base year is 1970
// Returns the number of milliseconds since January 1, 1970
public class Date_and_Time {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis() + " Milliseconds");
        System.out.println(System.currentTimeMillis()/1000/60 + " Minutes ");
        System.out.println(System.currentTimeMillis()/1000/3600 + " Hours ");
        System.out.println(System.currentTimeMillis()/1000/3600/24 + " days");
        System.out.println(System.currentTimeMillis()/1000/3600/24/7 + " Week");
        System.out.println(System.currentTimeMillis()/1000/3600/24/365 +" Years ");
    }
}
/*
Today Date is: 18 January 2025, time- 11:43 AM
Output:
    1738312216084 Milliseconds
    28971870 Minutes
    482864 Hours
    20119 days
    2874 Week
    55 Years
 */
