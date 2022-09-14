package Strings;
/*
У цьому завданні ти продовжиш практикуватися з рядками та застосовувати до них різні методи.
У світі є багато речей, які складаються з кількох слів. Ми хочемо створити метод makeAbbr(),
який буде повертати для них абревіатури.
Наприклад:
makeAbbr("national aeronautics space administration");
// "NASA"
makeAbbr("central processing unit");
// "CPU"
makeAbbr("simplified molecular input line entry specification");
// "SMILES"
 */
public class MakeAbbr {
    public static void main(String[] args) {
        System.out.println(makeAbbr("I`m glad to see you"));
    }
    public static String makeAbbr(String fullName) {
        String[] words = fullName.split(" ");
        String abbr = "";
        for (String s : words){
            abbr += s.charAt(0);
        }
        String ABBR = abbr.toUpperCase();
        return ABBR;
    }
}
