package lesson24.tasks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 3. ���� ������ ���� "26-03-1968T09:24". �������� ������ LocalDateTime, ��������������
 * ����� ����, ���������� �� ���� ������.
 */
public class Task3 {
    public static void main(String[] args) {
        String date = "26-03-1968T09:24";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime parse = LocalDateTime.parse(date, formatter);
        System.out.println(parse);
    }
}
