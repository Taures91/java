package startlessons.lesson4;

import java.util.Scanner;

/*
3. ������� ����� �����, �������� ������������� � �������. ��� - ����� ����� � ������. ������� ��� �����, ������� � ����
����� "�����" � ���������� ������.
 */
public class IfElseExapmle3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("������� �����: ");
        int sum = scan.nextInt();

        if (sum % 10 == 1 && sum % 100 != 11) {
            System.out.println(sum + " �����");
        } else if ((sum % 10 == 2 || sum % 10 == 3 || sum % 10 == 4)
                && (sum % 100 != 12 && sum % 100 != 13 && sum % 100 != 14))
        {
            System.out.println(sum + " �����");
        } else{
            System.out.println(sum + " ������");
        }


    }
}
