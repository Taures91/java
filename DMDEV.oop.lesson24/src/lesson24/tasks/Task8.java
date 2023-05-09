package lesson24.tasks;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * 8. Написать свою реализацию интерфейса TemporalAdjuster, которая бы
 * прибавляла к дате 42 дня
 */
public class Task8 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime localDateTime = now.with(temporal -> temporal.plus(42L, ChronoUnit.DAYS));

        System.out.println(localDateTime);
    }
}
