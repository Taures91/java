package startlessons.lesson5;
//Написать функцию, которая принимает 2 целочисленных параметра и возвращает нaибольший из них
public class FunctionsTask1 {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 10;
        int result = getMax(num1, num2);
        System.out.println(result);
    }
    public static int getMax(int firstValue, int secondValue){
        if (firstValue > secondValue) {
            return firstValue;
        }
        else {
            return secondValue;
        }
    }
}
