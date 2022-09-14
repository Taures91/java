package Arrays;
/*
А тепер підрахуємо середнє значення елементів масиву.
Реалізуй метод getAverageSalary() так, щоби він повертав середнє значення елементів масиву salaries.
Наприклад:
getAverageSalary(new double[] {1000.00, 500.00}); // 750.00
getAverageSalary(new double[] {100.00, 200.00, 300.00}); // 200.00
getAverageSalary(new double[0]); // 0.00

 */
public class GetAverageSalary {
    public static void main(String[] args) {
        System.out.println(getAverageSalary(new double[] { 1000.00, 500.00}));
    }
    public static double getAverageSalary(double[] salaries) {
        if (salaries.length == 0){
            return 0.0;
        }
        double sum = 0.0;
        for (double i : salaries){
            sum = sum + i;
        } return sum / salaries.length;
    }
}
