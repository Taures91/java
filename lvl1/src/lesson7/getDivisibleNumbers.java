package lesson7;

import java.util.Arrays;

public class getDivisibleNumbers {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 0, 7, 1, -4};
        int divider = 2;
        System.out.println(Arrays.toString(getDivisibleNumbers(numbers, divider)));

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
