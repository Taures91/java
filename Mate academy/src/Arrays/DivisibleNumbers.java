package Arrays;

import java.util.Arrays;

/*
Тепер ти створиш новий масив зі значеннями елементів, які націло діляться на вказане число.
Ми оголосили метод getDivisibleNumbers(), який приймає два параметри: масив int[] numbers та дільник int divider.
Твоє завдання: реалізуй метод так, щоби він повертав масив тільки з тими числами, які націло діляться на число divider та є додатними.
Наприклад, з такими вхідними даними:
int[] numbers = {2, 5, 8, 0, 7, 1, -4};
int divider = 2;
Результат буде таким:
int[] result = {2, 8};
// тільки числа 2 і 8 додатні та діляться націло на 2
 */
public class DivisibleNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getDivisibleNumbers(new int[] {2, 5, 8, 0, 7, 1, -4}, 2)));
    }
    public static int[] getDivisibleNumbers(int[] numbers, int divider) {
        int index = 0;
        for (int i : numbers){
            if ((i % divider == 0) && i > 0){
                index++;
            }
        }
        int [] result = new int[index];
        int currentIndex = 0;
        for (int i : numbers) {
            if ((i % divider == 0) && i > 0) {
                result[currentIndex] = i;
                currentIndex++;
            }
        }
        return result;
    }
}
