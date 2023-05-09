package lesson24.tasks;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 7. ������� ������ Instant. ������� ��� �� �������. ����� �������
 * ������ ZonedDateTime �� ��������� ����������� ������� � ���� ����� "Africa/Cairo".
 */
public class Task7 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Africa/Cairo"));
        System.out.println(zonedDateTime);
    }
}
