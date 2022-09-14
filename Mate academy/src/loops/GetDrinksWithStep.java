package loops;

public class GetDrinksWithStep {
    public static void main(String[] args) {
        System.out.println(getDrinksWithStep(10, 2));
    }
    public static int getDrinksWithStep(int guestNumber, int step) {
        int sum = 0;
        for (int i = 1; i <= guestNumber; i += step){
            sum +=i;
        }
        return sum;

    }
}
