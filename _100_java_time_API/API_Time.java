package _100_java_time_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class API_Time {
    public static void main(String[] args) {
        System.out.print("Today DATE is: ");
        LocalDate d = LocalDate.now();
        System.out.println(d);

        System.out.print("Current Time: ");
        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}
/*
Output:
    Today DATE is: 2025-01-31
    Current Time: 14:32:39.282880
    2025-01-31T14:32:39.282917
 */