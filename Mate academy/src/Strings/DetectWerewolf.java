package Strings;
/*
У цьому заданні ти попрацюєш з реверсом та порівнянням рядків.
До нас дійшла інформація, що перевертні можуть бути небезпечними для людей.
Ми ще не знаємо чому, але ігнорувати цю інформацію ніяк не можна. Треба якомога швидше шукати перевертнів.
Пропонуємо для початку перевірити слова та речення. Їх можна вважати перевертнями,
якщо їх можна прочитати однаково зліва направо, та навпаки.
Реалізуй метод isWerewolf(), який покаже, чи є рядок target перевертнем.
Наприклад:
isWerewolf("rotator"); // true ("rotator" -> "rotator")
isWerewolf("racecar"); // true ("racecar" -> "racecar")
isWerewolf("home"); // false ("home" -> "emoh")
isWerewolf("evacaniseebeesinacave"); // true ("evacaniseebeesinacave" -> "evacaniseebeesinacave")
isWerewolf("rOtaTor"); // false ("rOtaTor" -> "roTatOr")
 */
public class DetectWerewolf {
    public static void main(String[] args) {
        System.out.println(isWerewolf("racecar"));
    }
    public static boolean isWerewolf(String target) {
        StringBuilder builder = new StringBuilder(target);
        StringBuilder reverse = builder.reverse();
        String string = reverse.toString();
        boolean isTrue = false;
        if (string.equals(target)){
            isTrue = true;
        }
        return isTrue;
    }
}
