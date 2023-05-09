import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;


public class dateTimeDemo {

    public static void main(String[] args) {
//        ZonedDateTime now1 = ZonedDateTime.now();
//        System.out.println(now1);
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2);
        LocalDateTime plus = now2.plus(2L, ChronoUnit.DAYS);
        System.out.println(plus);

        
        LocalDateTime plus1 = now2.plus(Period.ofDays(3));
        System.out.println(plus1);


        LocalDateTime with = now2.with(TemporalAdjusters.firstDayOfMonth());

        System.out.println(with);


    }
}
