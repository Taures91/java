package chapter3;

import java.io.IOException;

public class KbIn {
    public static void main(String[] args) throws IOException {
        char ch;
        System.out.print("������� ������ �������, � ����� Enter");
        ch = (char) System.in.read();

        System.out.println("�� ������ ������� " + ch);
    }
}
