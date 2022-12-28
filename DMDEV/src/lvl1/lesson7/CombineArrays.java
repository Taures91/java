package startlessons.lesson7;

import java.util.Arrays;

public class CombineArrays {
    public static void main(String[] args) {
        int[] firstArray = {1, 2};
        int[] secondArray = {3, 4};
        getCombinedArray(firstArray, secondArray);

    }
    public static int[] getCombinedArray(int[] firstArray, int[] secondArray) {
        int[] array = new int [firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++){
            array[i] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++){
            array[i + firstArray.length] = secondArray[i];
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
