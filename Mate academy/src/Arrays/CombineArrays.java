package Arrays;

import java.util.Arrays;

/*
У цьому завданні ти навчишся зʼєднувати масиви.
Дано метод getCombinedArray(), який приймає два масиви чисел. Тобі потрібно повернути новий масив,
у якому будуть знаходитися всі елементи з обох масивів.
Наприклад:
getCombinedArray(new int[] {1, 2}, new int[] {3, 4}); // [1, 2, 3, 4]
getCombinedArray(new int[] {56}, new int[] {-32}); // [56, -32]
getCombinedArray(new int[] {}, new int[] {}); // []
getCombinedArray(new int[] {}, new int[] {20, 10}); // [20, 10]
 */
public class CombineArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getCombinedArray(new int[] {1, 2}, new int[] {3, 4})));
    }
    public static int[] getCombinedArray(int[] firstArray, int[] secondArray) {
        int[] array = new int [firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++){
            array[i] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++){
            array[i + firstArray.length] = secondArray[i];
        }
        return array;
    }
}
