package loops;

public class GetDrinks {
    public static void main(String[] args) {
        System.out.println(getDrinks(4));
    }
    public static int getDrinks(int guestNumber) {
        int numberOfDrinks = 0;
        for (int i = 0; i <= guestNumber; i++){
            numberOfDrinks +=i;
        }
        return numberOfDrinks;
    }
}
