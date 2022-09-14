package Strings;
/*
У методі combineStrings() з'єднай вхідні рядки one і two. В результаті поверни новий рядок.
 */
public class CombineStrings {
    public static void main(String[] args) {
        System.out.println(combineStrings("guru", "mugu"));
    }
    public static String combineStrings(String one, String two) {
        StringBuilder combine = new StringBuilder();
        combine.append(one)
                .append(two);
        String string = combine.toString();
        return string;
    }
}
