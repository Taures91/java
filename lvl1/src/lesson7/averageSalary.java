package lesson7;

public class averageSalary {
    public static void main(String[] args) {
        System.out.println(getAverageSalary(new double[] {1000.00, 500.00}));
        System.out.println(getAverageSalary(new double[0]));
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
