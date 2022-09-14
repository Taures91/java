package Strings;
/*
В цьому завданні реалізуй метод removeOddChars(), який приймає рядок і видаляє
в ньому всі непарні символи, а потім повертає результат.
Зверни увагу: непарні символи у рядку розташовані на непарних індексах.
Наприклад:
removeOddChars("hello"); // "hlo"
// 'e' та 'l' було видалено,
// бо вони знаходяться на індексах 1 і 3
removeOddChars("1234"); // "13"
removeOddChars("(())"); // "()"
removeOddChars("Bob"); // "Bb"
removeOddChars(""); // ""
 */
public class RemoveOddChars {
    public static void main(String[] args) {
        System.out.println(removeOddChars("Vladimir"));
    }
    public static String removeOddChars(String originalString) {
        char[] chars = originalString.toCharArray();
        String str = new String();
        for (int i = 0; i < chars.length; i++){
            if (i % 2 == 0){
                str = str + chars[i];
            }
        }
        return str;
    }
}
