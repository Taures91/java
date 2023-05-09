package lesson19.tasks;

import java.util.ArrayList;
import java.util.List;

/*
1. Написать метод, который принимает целочисленный список и возвращает целочисленный
список только с нечетными значениями
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 6, 8, 9, 13, 20);
        List newList = removeEven(numbers);
        System.out.println(newList);
    }

    private static List removeEven(List<Integer> list){
        List<Integer> result = new ArrayList<>();
        for (Integer o : list) {
            if (o % 2 != 0){
                result.add(o);
            }
        }
        return result;
    }
}
