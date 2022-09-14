package Arrays;

import java.util.Arrays;

/*
У цьому завданні ти навчишся заповнювати масив елементами.
Реалізуй метод countTheMonkeys() так, щоби він повертав масив типу int, який містить значення від 1 до count.
Зверни увагу: якщо count = 0, поверни порожній масив.
Наприклад:
countTheMonkeys(5); // [1, 2, 3, 4, 5]
countTheMonkeys(8); // [1, 2, 3, 4, 5, 6, 7, 8]
countTheMonkeys(0); // [] (порожній масив)
 */
public class CountTheMonkeys {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countTheMonkeys(6)));
    }
    public static int[] countTheMonkeys(int count) {
        int[] array = new int [count];
        int num = 0;
        for (int i = 0; i < count; i++){
            array[i] = i + 1;
            num ++;
        }
        return array;
    }
}
