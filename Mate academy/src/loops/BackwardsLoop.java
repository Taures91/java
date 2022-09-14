package loops;

public class BackwardsLoop {
    public static void main(String[] args) {
        System.out.println(getSum(15));
    }
    public static int getSum(int n) {
        int result = 0;

        for (int i = n; i >=0 ; i--) {
            result += i;
        }

        return result;
    }
}
