package chapter3;

import java.io.IOException;

//���� ����� ����������� �� ��� ���, ���������������� �� ������ �
public class LoopWithChar {
    public static void main(String[] args) throws IOException {
        int i;

        System.out.println("���� ����� ������������, ���� �� ������� s");

        for (i = 1; (char) System.in.read() !='s'; i++) {
            System.out.println("���� ����� ������������, ���� �� ������� s");
            System.out.println("���������� �������: " + i);
        }
    }

}
