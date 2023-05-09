package patternsAndMatchers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindExample {

    public static void main(String[] args) {

        String phoneNumber = "asdafg sdggsh +380 (56) 593-23-56 asdafg sdggsh +380 (57) 593-77-90 " +
                "asdafg sdggsh +380 (25) 593-44-90 asdafg sdggsh +380 (37) 593-35-90 sd";
        String regex = "(?:\\+380) ?\\((?<code>\\d{2})\\) \\d{3}-\\d{2}-\\d{2}";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(phoneNumber);
        Matcher matcher1 = pattern.matcher(phoneNumber);
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }
        System.out.println();
        while (matcher1.find()) {
            System.out.println(matcher1.group());
            System.out.println(matcher1.group("code"));
            System.out.println();
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuilder, "XXX");
        }
        matcher.appendTail(stringBuilder);  //отображает конец строки после телефона
        System.out.println(stringBuilder.toString());
    }
}
