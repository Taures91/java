package lesson4;

public class switchclass {
    public static void main(String[] args) {
        // byte, short, int, char, enum, string

//        int num1 = 15;
//        switch (num1) {
//            case 1 -> System.out.println("num1 == 1");
//            case 2, 3, 4 -> System.out.println("num1 == 2, 3, 4");
//        }
//        default -> System.out.println("Нет такого значения");


        int num2 = 2;
        char charValue = switch (num2) {
            case 1 -> '1';
            case 2 -> '2';
            default -> '0';
        };



//        switch (num1) {
//            case 1:
//                System.out.println("num1 == 1");
//                break;
//            case 2:
//            case 3:
//            case 4:
//                System.out.println("num1 == 2,3,4");
//                break;
//            case 10:
//                System.out.println("num1 == 10");
//                break;
//            case 15:
//                System.out.println("num1 == 15");
//                break;
//            default:
//                System.out.println("Нет такого значения");


    }
}
