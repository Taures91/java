package lesson6;

/*
Написать программу, высчитывающую факториал введенного целого числа
 */
public class task1 {
    public static void main(String[] args) {
        int value = 15;
        int result = factorial(value);
        System.out.println(result);
        int result2 = factorial2(value);
        System.out.println(result2);

    }

    public static int factorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorial2(int value) {
        int result = 1;
        int i = 1;
        while (i <= value) {
            result *= i;
            i++;
        }
        return result;
    }
}
