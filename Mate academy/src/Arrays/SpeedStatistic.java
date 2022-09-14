package Arrays;

import java.util.Arrays;

/*
Навчимося знаходити найбільше та найменше значення масиву, а потім повернемо їх у новому масиві.
Твоє завдання: реалізуй метод getSpeedStatistic(), який приймає масив швидкостей results і повертає масив зі статистикою, у якому:
перший елемент - найменша швидкість;
другий елемент - найбільша швидкість.
Зверни увагу:
якщо вхідний масив порожній, поверни масив зі статистикою {0, 0};
якщо вхідний масив складається лише з одного елемента, вважай його одночасно найменшою та найбільшою швидкістю.
 */
public class SpeedStatistic {
    public static void main(String[] args) {
        getSpeedStatistic(new int[] {33, 43, 54, 66, 789});
        System.out.println(Arrays.toString(getSpeedStatistic(new int[] {33, 43, 54, 66, 789})));
    }
    public static int[] getSpeedStatistic(int[] results) {
        if (results.length == 0) {
            return new int[] {0,0};
        }
        int min = results[0];
        int max = results[0];
        for (int i = 0; i < results.length; i++){

            if (results[i] > max) {
                max = results[i];
            }
            if (results[i] < min) {
                min = results[i];
            }
        }
        return new int[] {min,max};
    }
}
