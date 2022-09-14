package Strings;
/*
Є вхідний рядок input. З'єднай елементи під індексами 1 та 3 в новий рядок, а потім поверни його.
 */
public class CreateNewString {
    public static void main(String[] args) {
        System.out.println(createNewString("Baraburu"));
    }
    public static String createNewString(String input) {
        char first = input.charAt(1);
        char second = input.charAt(3);
        StringBuilder result = new StringBuilder();
        result.append(first)
                .append(second);
        String result1 = result.toString();
        return result1;
    }
}
