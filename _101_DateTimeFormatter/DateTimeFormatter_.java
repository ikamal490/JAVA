package _101_DateTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_ {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy --- E"); // This is the format
        //DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE; // ISO_LOCAL_DATE it is a default
        //String myDate = dt.format(df2); // Output: 2025-01-19
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_TIME;
        String myDate2 = dt.format(df2);
        System.out.println(myDate2);
        String myDate = dt.format(df);
        System.out.println(myDate);
    }
}
/*
Output:
    2025-01-19T13:31:23.471389
    13:31:23.471389
    19/01/2025 --- Sun
 */
