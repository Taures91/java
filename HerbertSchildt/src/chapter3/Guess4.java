package chapter3;

import java.io.IOException;

public class Guess4 {
    public static void main(String[] args) throws IOException {
        char ch, ignore, answer = 'k';
        do {
            System.out.println("Зaдyмaнa буква из диапазона A- Z.");
            System.out.print("Пoпытaйтecь ее угадать: ");

            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println("Правильно!");
            else {
                System.out.print("Неверно. Нужная буква находится ");
                if (ch < answer) System.out.println("ближе к концу алфавита.");
                else System.out.println("ближе к началу алфавита.");
                System.out.println("Повторите попытку");
            }
        } while (answer != ch);
    }
}
