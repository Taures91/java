package lvl2.lesson10;
/*

4. посчитать количество всех тчоек, запятых и восклицательных знаков в строке.
 */
public class Task4 {
    public static void main(String[] args) {
        String value = "asdf.,sdghf!,..dghfjgh.";
        System.out.println(count(value));
    }

    public static int count(String value){
        String result = value.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return value.length() - result.length();
    }
}
