package Strings;
/*
А тепер ти знайдеш відсоток входження символу в рядок.
Ми вдосконалили нашу програму для збору статистики з вебінарів Богдана.
Після збору статистики вона відправляє дані на сервер у вигляді рядку 111001010111011,
де 1 - це студент, що зрозумів тему, а 0 - відповідно, ні.
Але було б корисно зрозуміти, який відсоток студентів засвоїли матеріал, тобто, наскільки вебінар був ефективний.
Твоє задання: реалізуй метод getSuccessRate(), який приймає рядок statistic та повертає
відсоток студентів, які зрозуміли матеріал, у вигляді змінної типу double.
 */
public class GetSuccessRate {
    public static void main(String[] args) {
        System.out.println(getSuccessRate("011010101"));
    }
    public static double getSuccessRate(String statistic) {
        if (statistic == ""){
            return 0.0;
        }
        double counter = 0.0;
        char[] chars = statistic.toCharArray();
        for (int s : chars){
            if (s == '1'){
                counter += 1.0;
            }
        }
        return counter/statistic.length();
    }
}
