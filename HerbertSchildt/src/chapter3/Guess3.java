package chapter3;

import java.io.IOException;

public class Guess3 {
    public static void main(String[] args) throws IOException {
        char ch, answer = 'k';
        System.out.println("�a�y�a�a ����� �� ��������� A- Z.");
        System.out.print("�o���a��ec� �� �������: ");
        ch = (char) System.in.read();
        if (ch == answer) System.out.println("���������!");
        else {
            System.out.print("�������. ������ ����� ��������� ");
            if (ch < answer) System.out.println("����� � ����� ��������.");
            else System.out.println("����� � ������ ��������.");
        }
    }
}
