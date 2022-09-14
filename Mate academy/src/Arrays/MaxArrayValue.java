package Arrays;
/*
Ми створили метод getMaxNumber() та передали в нього масив чисел numbers.
Твоє завдання: реалізуй цей метод, щоби він повертав найбільший елемент масиву.
 */
public class MaxArrayValue {
    public static void main(String[] args) {
        System.out.println(getMaxNumber(new int[] {1, 4, 6, 15, 55}));
    }
    public static int getMaxNumber(int[] numbers) {
        int maxNum = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
        }
        return maxNum;
    }
}
