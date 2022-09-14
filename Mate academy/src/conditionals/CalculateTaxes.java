package conditionals;

public class CalculateTaxes {
    public static void main(String[] args) {
        System.out.println(calculateTaxes(55000.0));
    }
    public static double calculateTaxes(double income) {
        if (income <= 1000){
            return income * 0.02;
        } else if (income <= 10000){
            return income * 0.03;
        } else return income * 0.05;
    }
}
