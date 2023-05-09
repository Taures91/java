package tasks;

import java.util.Map;

/**
 * 3. ���� Map<String, Integer>. ����� ����� ����
 * ��������, ����� ������ ������� ������ 7
 * ��������.
 */
public class Task3 {

    public static void main(String[] args) {
        Map<String, Integer> string1 = Map.of(
                "string1", 1,
                "string", 2,
                "string3", 3,
                "string4", 4,
                "strin", 5,
                "strng", 6,
                "string2", 4,
                "strn", 2
        );
        int sum = string1.entrySet().stream()
                .filter(entry -> entry.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println(sum);
    }
}
