package startlessons.lesson4;

public class EsliInache {
    public static void main(String[] args) {
        int value = 10;
//        boolean test = value < 0;
        if (value > 0) {
            System.out.println("Число является положительным");
        } else if (value < 0) {
            System.out.println("Число является отрицательным");
        } else {
            System.out.println("Число равно нулю");
        }
        if (value >= 0) {
            System.out.println("Число является положительным или равно нулю");
        } else {
            System.out.println("Число является отрицательным");
        }

    }


}
