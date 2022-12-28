package startlessons.lesson7;

import java.util.Arrays;

public class countTheMonkeys {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countTheMonkeys(5)));
        System.out.println(Arrays.toString(countTheMonkeys(8)));
        System.out.println(Arrays.toString(countTheMonkeys(0)));
    }
    public static int[] countTheMonkeys(int count) {
        int[] array = new int [count];
//        if (count == 0){
//            return array;
//        }

        int num = 0;
        for (int i = 0; i < count; i++){
            array[i] = i;
            num ++;
        }
        return array;
    }
}
