package lesson7;

public class SumAfterNumber {
    public static void main(String[] args) {
        System.out.println(getSum(new int[]{3, 3, 3, 4, 5}, 3));
    }

    public static int getSum(int[] values, int startValue) {
        int sum = 0;
        int index = 0;
        int check = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == startValue) {
                index = i;
                break;
            } 
        } 
        for (int i :
                values) {
            if (i != startValue) {
                check++;
            }
        }
        if (check == values.length) {
            return 0;
        }
        for (int i = index + 1; i < values.length; i++) {
            sum += values[i];
        }

        return sum;

    }
}
