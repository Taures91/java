package lesson6;

/*
В 1626м году индейцы продали Манхеттен за 24 доллара. Написать программу, которая высчитает сумму, получившуюся бы в
текущем году, если бы индейцы положили в банк эти деньги под 5% годовых.
 */
public class task3 {
    public static void main(String[] args) {
        int price = 24;
        double sum = deposit(price);
        System.out.println(sum);

    }

    public static double deposit(int price) {
        double result = price;
        for (int year = 1626 + 1; year <= 2020; year++) {
            result *= 1.05;
            System.out.println(year + " - " + result);
        }
        return result;
    }
}
