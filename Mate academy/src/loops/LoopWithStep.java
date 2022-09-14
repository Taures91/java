package loops;

public class LoopWithStep {
    public static void main(String[] args) {
        System.out.println(getSum(10, 2));
    }
    public static int getSum(int n, int step) {
        int result = 0;
        int i;

        for (i = 0; i <= n ; i = i + step) {
            result += i;
        }

        return result;
    }
}
