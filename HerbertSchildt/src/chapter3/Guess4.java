package chapter3;

import java.io.IOException;

public class Guess4 {
    public static void main(String[] args) throws IOException {
        char ch, ignore, answer = 'k';
        do {
            System.out.println("�a�y�a�a ����� �� ��������� A- Z.");
            System.out.print("�o���a��ec� �� �������: ");

            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println("���������!");
            else {
                System.out.print("�������. ������ ����� ��������� ");
                if (ch < answer) System.out.println("����� � ����� ��������.");
                else System.out.println("����� � ������ ��������.");
                System.out.println("��������� �������");
            }
        } while (answer != ch);
    }
}
