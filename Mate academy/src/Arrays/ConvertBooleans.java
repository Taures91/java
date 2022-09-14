package Arrays;

import java.util.Arrays;

/*
Ми створили масив булевих значень values та передали його в метод getStringArray().
       У цьому завданні тобі потрібно реалізувати цей метод так, щоби він повертав новий масив
       типу String, у якому булеві значення true замінені на "Yes", а false - на "No".
        Наприклад:
        getStringArray(new boolean[] {true, false}); // ["Yes", "No"]
        getStringArray(new boolean[] {false}); // ["No"]
        getStringArray(new boolean[] {}); // []
 */
public class ConvertBooleans {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getStringArray(new boolean[] {true, true, false, true})));
    }
    public static String[] getStringArray(boolean[] values) {
        String[] array = new String [values.length];
        for (int i = 0; i < values.length; i++) {
            if (values[i]){
                array[i] = "Yes";
            } else array[i] = "No";

        } return array;
    }
}
