package lesson24.tasks;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;

/**
 * 1. Написать свою реализацию интерфейса TemporalAdjuster, которая бы изменяла дату на ближайшее (в днях) 1 января.
 */
public class Task9 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime result = adjustToNearestYear(localDateTime);
        System.out.println(result);

    }

    private static LocalDateTime adjustToNearestYear(LocalDateTime localDateTime) {
        return localDateTime.with(it -> {
            Temporal currentYear = it.with(TemporalAdjusters.firstDayOfYear());
            Temporal nextYear = it.with(TemporalAdjusters.firstDayOfNextYear());
            long betweenCurrentYear = ChronoUnit.DAYS.between(currentYear, it);
            long betweenNextYear = ChronoUnit.DAYS.between(it, nextYear);

            return betweenCurrentYear < betweenNextYear ? currentYear : nextYear;
        });
    }
}
