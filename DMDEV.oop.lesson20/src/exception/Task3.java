package exception;
/*
3. ������� ����������� ����-���������� - ��������� ����� Exception. ������� �����, ������������� ��� ����������.
������� ���� ����� � �������� ����������. ������� stack tra�e � �������.
 */
public class Task3 {

    public static void main(String[] args) {
        try {
            unsafe();
        } catch (DmdevException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    public static void unsafe() throws DmdevException {
        throw new DmdevException("Test exception");
    }
}
