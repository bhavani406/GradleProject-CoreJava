package java8;

import java.time.Clock;
import java.time.LocalDate;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeTest {
    public static void main(String[] args) {

        LocalDate localdate1 = LocalDate.now(Clock.systemUTC());
        System.out.println(localdate1);
//        LocalDate localDate =  LocalDate.now(ZoneId.of("Asia/ Tokyo"));
//        System.out.println(localDate);
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime datetime= LocalDateTime.now();
        System.out.println(datetime);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(dtf.format(datetime));

        ZonedDateTime ind = ZonedDateTime.now();
        System.out.println(ind);

        System.out.println(ZoneId.getAvailableZoneIds());

    }
}
