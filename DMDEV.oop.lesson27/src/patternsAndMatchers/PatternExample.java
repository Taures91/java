package patternsAndMatchers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String phoneNumber = "+38067 593-36-90";
        String regex = "\\+380 ?\\d{2} \\d{3}-\\d{2}-\\d{2}";

        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(phoneNumber);

        System.out.println(matcher.matches());

        System.out.println(Pattern.matches(regex, phoneNumber));

        System.out.println(phoneNumber.matches(regex));
    }
}
