package exception;
/*
1. �������� ���������� �� ��������� null. �������� ����� � ���� ����������. �������� ��������� ����������
 */
public class Task1 {
    public static void main(String[] args) {
        String value = null;
        try{
        value.length();
        } catch (NullPointerException e){
            System.err.println("catch");
            e.printStackTrace();
        }
    }
}
