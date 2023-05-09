package lesson24.tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 2. Создать объект LocalDate, представляющий собой сегодняшнюю
 * дату. Преобразовать дату в строку вида "05.05.2017". Вывести эту строку на
 * консоль.
 */
public class Task2 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String format = now.format(formatter);
        System.out.println(format);

//        DateTimeFormatter isoDate = DateTimeFormatter.ISO_DATE;
//
//        String format1 = now.format(isoDate);
//        System.out.println(format1);
    }
}
