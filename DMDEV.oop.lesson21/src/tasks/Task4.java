package tasks;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 4. ��� ������ ����� �����, ������� ������,
 * �������������� ����� ������������
 * ��������� ������������� ���� �����.
 * ������: ������ {5, 2, 4, 2, 1}
 * �������������� ������: "52421"
 */
public class Task4 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 2, 4, 2, 1);

        String result = integers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(",", "Prefix: ", " end"));

        System.out.println(result);

    }
}
