package Arrays;

import java.util.Arrays;

/*
У цьому завданні ти знайдеш найбільше та найменше значення елементів масиву.
Ми створили масив ages, який містить значення віку твоїх сусідів.
Твоє завдання: реалізуй метод getHighestAndLowestAge() так, щоби він повернув масив типу int, який містить найбільший та найменший вік із масиву ages.
Зверни увагу: першим значенням елементу нового масиву має бути найбільший вік.
Наприклад:
getHighestAndLowestAge(new int[] {10, 40, 36}); // [40, 10]
getHighestAndLowestAge(new int[] {60, 4, 14, 20, 97}); // [97, 4]
getHighestAndLowestAge(new int[] {35}); // [35, 35]
// бо 35 - це одночасно найбільший та найменший вік
 */
public class GetHighestAndLowestAge {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getHighestAndLowestAge(new int[] {3 ,4 ,5, 88, 49})));
    }
    public static int[] getHighestAndLowestAge(int[] ages) {
        int [] maxAndMin = new int [2];
        int max = ages[0];
        int min = ages[0];
        for (int i : ages){
            if (i > max){
                max = i;
            }
        }
        for (int i : ages){
            if (i < min){
                min = i;
            }
        }
        maxAndMin[0] = max;
        maxAndMin[1] = min;
        return maxAndMin;
    }
}
