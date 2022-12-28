package startlessons.lesson5;
// public static - модификаторы
// void - возвращаемый тип, ничего не возвращает. может возвр. int, boolean
// main - название функции
// args - параметр


public class Functions {
    public static void main(String[] args) {
        int year = 2001;
        isLeapYear(year);
    }

//    public static void isLeapYear(int year) {
//        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
//            System.out.println("Год високосный");
//        } else {
//            System.out.println("Год не високосный");
//        }
//    }
    public static boolean isLeapYear(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
//        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
//            return true;
//        } else {
//            return false;
//        }
    }

}
