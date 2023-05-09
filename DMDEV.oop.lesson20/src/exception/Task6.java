package exception;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Random;

/**
 * 6. ������� ����� ��������� ������� ������������� ���� �� 3� ����� ����������.
 * ������� ���� ����� � ����� try-catch, ������������� ����� �� 3�.
 */
public class Task6 {
    private static final Map<Integer, Throwable> EXCEPTIONS = Map.of(
            0, new RuntimeException("runtime"),
            1, new FileNotFoundException("file not found"),
            2, new IndexOutOfBoundsException("index exception")
    );

    public static void main(String[] args) {
        Random random = new Random();
        try {
            unsafe(random.nextInt(3));
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void unsafe(int randomValue) throws Throwable {
        Throwable exception = EXCEPTIONS.getOrDefault(randomValue, new DmdevException("not found"));
        throw exception;
    }
}
