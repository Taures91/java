package chapter3;

import java.io.IOException;

public class Guess3 {
    public static void main(String[] args) throws IOException {
        char ch, answer = 'k';
        System.out.println("Зaдyмaнa буква из диапазона A- Z.");
        System.out.print("Пoпытaйтecь ее угадать: ");
        ch = (char) System.in.read();
        if (ch == answer) System.out.println("Правильно!");
        else {
            System.out.print("Неверно. Нужная буква находится ");
            if (ch < answer) System.out.println("ближе к концу алфавита.");
            else System.out.println("ближе к началу алфавита.");
        }
    }
}
