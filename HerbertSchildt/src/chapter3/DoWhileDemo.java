package chapter3;

import java.io.IOException;

public class DoWhileDemo {
    public static void main(String[] args) throws IOException {
        char ch;
        do {
            System.out.println("������� �������, � ����� Enter");
            ch = (char) System.in.read();
        } while (ch != 'q');
    }
}
