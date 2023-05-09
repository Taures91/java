package lesson24.tasks;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * 1. —оздать объект LocalDateTime, представл€ющий собой
 * дату 25.06.2020 19:47. »спользу€ этот объект, создать другой объект LocalDateTime,
 * представл€ющий собой дату через 3 мес€ца после сегодн€шней.
 * ¬ывести на консоль содержащиес€ в нем объеты LocalDate and LocalTime.
 */
public class Task1 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2020,6,25,19,47);

        LocalDateTime plus = dateTime.plusMonths(3L);
//        LocalDateTime plus = dateTime.plus(3L, ChronoUnit.MONTHS);
        System.out.println(plus.toLocalDate());
        System.out.println(plus.toLocalTime());
    }
}
