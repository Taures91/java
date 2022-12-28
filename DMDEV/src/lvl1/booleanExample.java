package startlessons;

import java.sql.SQLOutput;
import java.util.Scanner;

public class booleanExample {
        public static void main(String[] args) {
            System.out.println("Введите первое число: ");
            Scanner scan1 = new Scanner(System.in);
            int num1 = scan1.nextInt();
            System.out.println("Вы ввели число " + num1);

            System.out.println("Введите второе число: ");
            Scanner scan2 = new Scanner(System.in);
            int num2 = scan2.nextInt();
            System.out.println("Вы ввели число " + num2);

            System.out.println("Введите третье число: ");
            Scanner scan3 = new Scanner(System.in);
            int num3 = scan3.nextInt();
            System.out.println("Вы ввели число " + num3);

            int sum = num1 + num2 + num3;
            System.out.println("Сумма введенных чисел равна: " + sum);

            int product = num1 * num2 * num3;
            System.out.println("Произведение введенных чисел равно: " + product);

            System.out.println("Введите пятое число: ");
            Scanner scan5 = new Scanner(System.in);
            int num5 = scan5.nextInt();
            System.out.println("Вы ввели число: " + num5);

    }
}
