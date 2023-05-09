package lvl2.lesson10;
/*
2. Написать функцию, принимающу 2 параметра: строку и слово - и
возвращающую true, если строка начинается и заканчивается этим словом.
 */
public class Task2 {
    public static void main(String[] args) {
        String value = "123 wfjhdnfkjnv jijdsghf goijdfg 123";
        String word = "123";
        System.out.println(isStartAndEnd(value, word));
    }

    private static boolean isStartAndEnd(String target, String word){
        return target.startsWith(word) && target.endsWith(word);
    }
}
