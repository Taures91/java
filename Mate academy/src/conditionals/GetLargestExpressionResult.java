package conditionals;

public class GetLargestExpressionResult {
    public static void main(String[] args) {
        System.out.println(getResult(24.1, 26.5));
    }

    public static double getResult(double a, double b) {
        double maxNum = a + b;
        maxNum = (a - b > maxNum) ? a - b : a + b;
        maxNum = (a * b > maxNum) ? a * b : maxNum;
        maxNum = (a / b > maxNum) ? a / b : maxNum;
        return maxNum;
    }
}
