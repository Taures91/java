package startlessons.lesson7;

public class CenturyFromYear {
    public static void main(String[] args) {
        System.out.println(getCentury(1));
    }
    public static int getCentury(int year) {
        int century;
        return century = ((year - 1) / 100) + 1;

    }
}
