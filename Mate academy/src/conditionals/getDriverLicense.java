package conditionals;

public class getDriverLicense {
    public static void main(String[] args) {
        System.out.println(getDriverLicense(18));
    }
    public static String getDriverLicense(int age) {

        if (age >= 16){
            return "You can get a license";
        } else return "You can't get a license";

    }
}
