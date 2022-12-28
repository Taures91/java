package startlessons.lesson3;

public class variablesOperations {
    public static void main(String[] args) {
        int num1 = -10;
        boolean test = num1 < 0;
        System.out.println(test);

        int num2 = -20;
        boolean test1 = num2 < 0;
        System.out.println(!test);

        int num3 = 15;
        boolean test3 = num3 >= 0;
        System.out.println(test3);

        int num4 = -10;
        boolean test4 = num4 != 0;
        System.out.println(test4);

        int num5 = 0;
        boolean test5 = num5 == 0;
        System.out.println(test5);

        System.out.println(test1 && test3);
        System.out.println(test1 || test4 || test5);
    }
}
