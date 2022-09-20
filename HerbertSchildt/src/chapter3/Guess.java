package chapter3;

import java.io.IOException;

public class Guess {
    public static void main(String[] args) throws IOException {
        char ch, answer = 'k';
        System.out.println("Зaдyмaнa буква из диапазона A- Z.");
        System.out.print("Пoпытaйтecь ее угадать: ");
        ch = (char) System.in.read();
        if (ch == answer) System.out.println("Правильно!");
    }
}
