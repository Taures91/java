package loops;

public class getSumOfFirstTenNumbers {
    public static void main(String[] args) {

        System.out.println(getSumOfFirstTenNumbers());
    }
    public static int getSumOfFirstTenNumbers() {
        int result = 0;
        int i;

        for (i = 0; i < 10; i++) {
            result += i;
        }

        return result;
    }
}
