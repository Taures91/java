package Strings;
/*
У цьому завданні ти навчишся порівнювати рядки.
Реалізуй метод compareStrings(), який приймає рядки firstString
і secondString та повертає true, якщо вони однакові, або false, якщо ні.
Зверни увагу: якщо обидва рядки мають значення null, вони також вважаються однаковими.
 */
public class CompareStrings {
    public static void main(String[] args) {
        System.out.println(compareStrings("good", "good"));
    }
    public static boolean compareStrings(String firstString, String secondString) {
        if ((firstString == null) && (secondString == null)) {
            return true;
        }
        return (firstString != null) && (firstString.equals(secondString));
    }
}
