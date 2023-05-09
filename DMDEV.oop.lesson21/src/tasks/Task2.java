package tasks;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 2. ƒан список строк. Ќайти количество уникальных
 * строк длиной более 8 символов.
 */

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of(
                "string-1",
                "string-2",
                "string-3",
                "string-4",
                "string-10",
                "string-10",
                "string-10",
                "string-12",
                "string-14"
        );
        int size = strings.stream()
                .filter(value -> value.length() > 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println(size);

        long size2 = strings.stream()
                .filter(value -> value.length() > 8)
                .distinct()     //убрать одинаковые строки
                .count();       //отобразить количество элементов в стриме
        System.out.println(size2);
    }
}
