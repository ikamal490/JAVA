package _99_Gregorian_Calendar;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

// Gregorian_Calendar is a non-abstract class
public class Gregorian_Calendar_Explain {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); //creates an instance of the Calendar class, which is used to work with dates and times.
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND)); // Print the seconds
        System.out.println(c.get(Calendar.HOUR));
        // Hour prints the normal hours as a clock, and HOUR_OF_DAY prints the hours in the railway time format
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+ ":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND)); // Print the Railways time format

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2028));
        System.out.println(TimeZone.getAvailableIDs()[0]); // Africa/Abidjan
        System.out.println(TimeZone.getAvailableIDs()[1]); // Africa/Accra
        System.out.println(TimeZone.getAvailableIDs()[2]); // Africa/Addis_Ababa
        System.out.println(TimeZone.getDefault());
    }
}
/*
Output:
    Fri Jan 31 14:26:18 IST 2025
    31
    18
    2
    14:26:18
    true
    Africa/Abidjan
    Africa/Accra
    Africa/Addis_Ababa
    sun.util.calendar.ZoneInfo[id="Asia/Kolkata",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null]

    Process finished with exit code 0

 */
