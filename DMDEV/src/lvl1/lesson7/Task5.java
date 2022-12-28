package startlessons.lesson7;
/*
Расставить значения в массиве по нарастающей
 */

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {1,567,43,5,78,2344};
        bubbleSort(array);
    }


    public static void bubbleSort(int[] array){
        for (int i = array.length - 1; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]){
                    int t = array[j];
                    array [j] = array[j+1];
                    array [j+1] = t;
                }

            }

        }
        System.out.println(Arrays.toString(array));
    }
}
