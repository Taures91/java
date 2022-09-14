package lesson6;
/*
Написать программу, определяющую, является ли введеное целое число простым, т.е. делится ли без остатка на 1 и на само себя.
 */
public class task4 {
    public static void main(String[] args) {
    int num = 11;
    boolean result = isSimple(num);
        System.out.println(result);
    }

    public static boolean isSimple(int num) {
        boolean result = true;
        for (int i = 2; i < num; i++) {
        if (num % i == 0) {
            result = false;
            break;
            }
        }
        return result;
    }

}
