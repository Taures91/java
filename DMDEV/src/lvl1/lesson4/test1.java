package DMDEV.src.lvl1.lesson4;

/*
 * 1. ��� ���������� ����� ������. ������� �� ������� ���� ����, � ������� ��������� ���� �����.
 */
public class test1 {
    public static void main(String[] args) {
        int month = 15;
        if (month == 12 || month == 1 || month ==2) {
            System.out.println("����");
        } else if (month == 3 || month == 4 || month == 5){
            System.out.println("�����");
        } else if (month == 6 || month == 7 || month == 8){
            System.out.println("����");
        } else if (month == 9 || month == 10 || month == 11){
            System.out.println("�����");
        } else System.out.println("������ ������ �� ����������");

        int num = 34563;
        if (num % 10 == 3) {
            System.out.println("��������� ����� ����� ����� 3");
        } else System.out.println("��������� ����� ����� �� ����� 3");

        System.out.println(num % 10 == 3 ? "��������� ����� ����� ����� 3": "��������� ����� ����� �� ����� 3");

    }



}
