package lesson4;

public class test {
    public static void main(String[] args) {



        }
    public static int[] getSpeedStatistic(int[] results) {
        int min = results[0];
        int max = results[0];
        int[] array = {min, max};
        for (int i = 0; i < results.length; i++){
            if (results.length <= 0 ) {
                min = 0;
                max = 0;
            } else if (results[i] > max) {
                max = results[i];
            } else if (results[i] < min) {
                min = results[i];
            }
        }
        return array;
    }
}
