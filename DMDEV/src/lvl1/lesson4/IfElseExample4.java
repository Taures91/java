package startlessons.lesson4;
import java.util.Scanner;

/*
Написать программу, которая считывает год, введенный пользователем, и определяет, является ли этот год високосным. Год
считает високосным, если он делится без остатка на 4. Однако, если год также делится на 100, то это год не високосный. За
исключением годов, которые делятся на 400.
 */
public class IfElseExample4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scan.nextInt();
        if (year % 400 ==0 || (year % 4 == 0 && year % 100 !=0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }


    }
}
