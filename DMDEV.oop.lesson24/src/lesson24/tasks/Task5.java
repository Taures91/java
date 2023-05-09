package lesson24.tasks;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 5. —оздать объект LocalDate, представл€ющий собой сегодн€шнюю
 * дату. —оздать объект LocalDate, представл€ющий собой дату
 * 07.07.2018. »спользу€ созданные объекты, найти количество дней между
 * этими двум€ датами.
 */
public class Task5 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate date = LocalDate.of(2018, 7, 7);
        Period between = Period.between(date, now);
        System.out.println(between.getYears() + " years");
        System.out.println(between.getMonths() + " months");
        System.out.println(between.getDays() + " days");

        long days = ChronoUnit.DAYS.between(date, now);
        System.out.println(days + " days");

    }
}
