package Arrays;
/*
Реалізуй метод getSum(), який приймає масив цілих чисел numbers. Метод повинен повернути суму
елементів масиву. Однак, не треба додавати до суми число, якщо воно парне (ділиться на 2 без залишку).
 */
public class IgnoreEvenNumbers {
    public static void main(String[] args) {
        System.out.println(getSum(new int[] {2, 3, 4, 5, 6, 7, 8}));
    }
    public static int getSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 != 0){
                sum +=numbers[i];
            }

        }
        return sum;
    }
}
