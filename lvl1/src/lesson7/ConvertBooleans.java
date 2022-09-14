package lesson7;

import java.util.Arrays;

public class ConvertBooleans {
    public static void main(String[] args) {
        getStringArray(new boolean[] {true, false, true});
    }
    public static String[] getStringArray(boolean[] values) {
        String[] array = new String [values.length];
        for (int i = 0; i < values.length; i++) {
            if (values[i]){
                array[i] = "Yes";
            } else array[i] = "No";

        } System.out.println(Arrays.toString(array));
        return array;

    }
}
