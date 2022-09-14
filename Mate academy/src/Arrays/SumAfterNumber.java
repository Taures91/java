package Arrays;
/*
ано масив чисел values і значення startValue. У цьому завданні знайди та поверни суму всіх чисел,
які знаходяться в масиві після значення startValue.
Зверни увагу:
результуюча сума не повинна містити значення startValue;
якщо масив не містить startValue - поверни 0;
якщо масив містить лише одне значення, яке дорівнює startValue - поверни 0.
Наприклад:
getSum(new int[] {1, 2, 3}, 1); // 2 + 3 = 5
getSum(new int[] {10, 2, 50, 3, 4, 0}, 50); // 3 + 4 + 0 = 7
getSum(new int[] {10, 2, 50, 3, 4, 0}, -100); // 0 (бо в масиві немає значення -100)
getSum(new int[] {10}, 10); // 0

 */
public class SumAfterNumber {
    public static void main(String[] args) {
        System.out.println(getSum(new int[] {10, 2, 50, 3, 4, 0}, 50));
    }
    public static int getSum(int[] values, int startValue) {
        int sum = 0;
        int index = 0;
        int check = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == startValue) {
                index = i;
                break;
            }
        }
        for (int i :
                values) {
            if (i != startValue) {
                check++;
            }
        }
        if (check == values.length) {
            return 0;
        }
        for (int i = index + 1; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}
