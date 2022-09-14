package Arrays;

import java.util.Arrays;

/*
У цьому завданні ти навчишся ітерувати масив.
Реалізуй метод getDoublePower(), що приймає масив цілих чисел powers
та повертає масив, у якому кожне значення елементу помножене на 2.
 */
public class Double {
    public static void main(String[] args) {
        int [] powers = {2, 3, 6, 7, 15};
        System.out.println(Arrays.toString(powers));
    }
    public static int[] getDoublePower(int[] powers) {
        for (int i = 0; i < powers.length; i++){
            powers[i] *=2;
        }
        return powers;
    }
}
