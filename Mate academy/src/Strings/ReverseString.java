package Strings;
/*
Реверсни вхідний рядок input та поверни його з методу reverseString().
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Vladimir"));
    }
    public static String reverseString(String input) {
        StringBuilder builder = new StringBuilder(input);

        builder.reverse();
        String reversedText = builder.toString();

        return reversedText;

    }
}
