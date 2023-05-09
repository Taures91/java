package lesson24;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("1." + now);

        Instant instant = now.toInstant();
        System.out.println("2." + instant);

        long toEpochMilli1 = now.toInstant().toEpochMilli();
        System.out.println("3." + toEpochMilli1);

        ZonedDateTime plus = now.plus(1L, ChronoUnit.DAYS);
        System.out.println("4." + plus);

        ZonedDateTime zonedDateTime = now.truncatedTo(ChronoUnit.DAYS);
        System.out.println("5." + zonedDateTime);

        LocalDateTime localDateTime = LocalDateTime.now(ZoneOffset.UTC);
        System.out.println("6." + localDateTime);

        LocalTime now1 = LocalTime.now();
        System.out.println("7." + now1);
    }
}
