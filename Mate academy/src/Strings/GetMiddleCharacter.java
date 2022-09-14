package Strings;
/*
У цьому завданні реалізуй метод getMiddleString(), що приймає рядок і повертає центральний символ у вигляді рядку.
Зверни увагу: якщо довжина рядка парна, поверни два центральних символи.
Наприклад:
getMiddleString("hello"); // "l"
getMiddleString("1234"); // "23"
getMiddleString("(())"); // "()"
getMiddleString("Bob"); // "o"
getMiddleString(""); // ""
 */
public class GetMiddleCharacter {
    public static void main(String[] args) {
        System.out.println(getMiddleString("hello"));
    }
    public static String getMiddleString(String originalString) {
        if (originalString == ""){
            return "";
        }
        int index1 = originalString.length() / 2;
        if (originalString.length() % 2 == 0){
            return originalString.substring(index1 - 1, index1 + 1);
        } else return originalString.substring(index1, index1 + 1);
    }
}
