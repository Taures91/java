package chapter3;

import java.io.IOException;

public class Break2 {
    public static void main(String[] args) throws IOException {
        char ch;
        for ( ; ; ) {
            System.out.println("Введите букву: ");
            ch = (char) System.in.read();
            if (ch == 'q') break;
        }
        System.out.println("Вы ввели букву q");
    }
}
