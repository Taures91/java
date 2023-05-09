package lesson24.tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 2. ������� ������ LocalDate, �������������� ����� �����������
 * ����. ������������� ���� � ������ ���� "05.05.2017". ������� ��� ������ ��
 * �������.
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
