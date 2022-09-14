package Strings;

import java.util.Arrays;

/*
У цьому завданні ти згадаєш як створити масив та попрацюєш із методами класу String.
Ми створили метод markStringEnds(), який приймає рядок originalString.
Твоє завдання: реалізуй метод так, щоби він повертав масив типу String з двох елементів:
originalString з першим символом у верхньому регістрі та originalString з останнім символом у верхньому регістрі.
Наприклад
markStringEnds("hello"); // ["Hello", "hellO"]
markStringEnds("example"); // ["Example", "examplE"]
markStringEnds("Bob"); // ["Bob", "BoB"]
markStringEnds("ALICE"); // ["ALICE", "ALICE"]
markStringEnds("wow!"); // ["Wow!", "wow!"]
markStringEnds("o"); // ["O", "O"]

 */
public class MarkStringEnds {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(markStringEnds("example")));
    }
    public static String[] markStringEnds(String originalString) {
        int length = originalString.length();
        String[] array = new String [2];
        array[0] = originalString.substring(0,1).toUpperCase() + originalString.substring(1);
        array[1] = originalString.substring(0, length-1) + originalString.substring(length-1).toUpperCase();
        return array;
    }
}
