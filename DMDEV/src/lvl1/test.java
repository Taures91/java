package startlessons;

public class test {
    public static void main(String[] args) {
        String test = "hello, ";
        System.out.println(test.length());
        char [] array = test.toCharArray();
        System.out.println(array);
        System.out.println(array[2]);
        System.out.println(test.isEmpty());
        System.out.println(test.concat("Vova"));

    }
}
