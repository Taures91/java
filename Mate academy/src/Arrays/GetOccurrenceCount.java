package Arrays;
/*
У цьому завданні ти навчишся підраховувати кількість входжень елементу в масив.
Реалізуй метод getOccurrenceCount() так, щоби він повертав кількість разів, яку targetColor зустрічається в масиві colors.
Наприклад:
getOccurrenceCount(new String[] {"blue", "blue", "blue"}, "blue"); // 3
getOccurrenceCount(new String[] {"blue", "green", "red"}, "red"); // 1
getOccurrenceCount(new String[] {"blue", "green", "red"}, "white"); // 0
getOccurrenceCount(new String[] {"blue", "green", "red"}, null); // 0
getOccurrenceCount(new String[0], "blue"); // 0

 */
public class GetOccurrenceCount {
    public static void main(String[] args) {
        System.out.println(getOccurrenceCount(new String[] {"blue", "red", "black", "white", "blue", "blue" }, "blue"));
    }
    public static int getOccurrenceCount(String[] colors, String targetColor) {
        int count = 0;
        for (String i : colors){
            if (i.equals(targetColor)) {
                count++;
            }
        } return count;
    }
}
