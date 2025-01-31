package _98_Calendar_Class;
// Calendar is an abstract class.
import java.util.Calendar;

public class Calendar_Class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType()); // Output: gregory
        System.out.println(c.getTimeZone()); // sun.util.calendar.ZoneInfo[id="Asia/Kolkata",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null]
        System.out.println();

        Calendar c1 = Calendar.getInstance();
        System.out.println(c1.getCalendarType()); // Output: gregory
        System.out.println(c1.getTimeZone().getID()); // Asia/Kolkata
        System.out.println(c.getTime()); // Fri Jan 31 14:14:46 IST 2025
        System.out.println(c.getWeekYear()); // print the year
    }
}
/*
Output:
    gregory
    sun.util.calendar.ZoneInfo[id="Asia/Kolkata",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null]

    gregory
    Asia/Kolkata
    Fri Jan 31 14:14:46 IST 2025
    2025
 */