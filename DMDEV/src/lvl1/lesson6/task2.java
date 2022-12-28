package startlessons.lesson6;

/*
Имеется число, посчитать сумму чисел данного числа
 */
public class task2 {
    public static void main(String[] args) {
        int value = 12345;
        int result = sum(value);
        int result2 = sum1(value);
        System.out.println(result);
        System.out.println(result2);
    }

    public static int sum(int value) {
        int result = 0;
        int currentvalue = value;
        while (currentvalue != 0) {
            result += currentvalue % 10;
            currentvalue /= 10;
        }
        return result;
    }

    public static int sum1(int value) {
        int result = 0;
        for (int currentValue = value; currentValue != 0; currentValue /= 10) {
            result += currentValue % 10;
        }
        return result;
    }


}
