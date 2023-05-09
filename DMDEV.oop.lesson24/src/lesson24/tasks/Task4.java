package lesson24.tasks;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * 4. ������������ LocalDateTime �� ����������� �������, ������������� ���
 * � ������ ���� Instant, ������ ���� ���� "America/Chicago". ������� ����������
 * ��������� �����������.
 */
public class Task4 {
    public static void main(String[] args) {
        String date = "26-03-1968T09:24";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime parse = LocalDateTime.parse(date, formatter);
        System.out.println(parse);
        Instant instant = parse.toInstant(ZoneId.of("America/Chicago").getRules().getOffset(parse));
        System.out.println(instant);
        System.out.println(instant.toEpochMilli());
    }
}
