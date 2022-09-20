package chapter3;

import java.io.IOException;

//Цикл будет выполняться до тех пор, покапользователь не введет П
public class LoopWithChar {
    public static void main(String[] args) throws IOException {
        int i;

        System.out.println("Цикл будет продолжаться, пока не введете s");

        for (i = 1; (char) System.in.read() !='s'; i++) {
            System.out.println("Цикл будет продолжаться, пока не введете s");
            System.out.println("Количество попыток: " + i);
        }
    }

}
