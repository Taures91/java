package Strings;

import java.util.Arrays;

/*
А тепер потренуємось використовувати цикл for each для ітерування масиву рядків.
Ми вже купили все необхідне для приготування смачної піци - усі продукти знаходяться
у вхідному масиві ingredients. Але тепер хочемо переконатися, чи в нас достатньо тіста - dough.
Твоє завдання: перевір, скільки пачок тіста ми купили. Поверни true, якщо ми купили 2 або більше
пачки, або false, якщо менше. Зверни увагу: dough - це один з елементів масиву ingredients,
а тобі треба порахувати, скільки таких елементів містить масив.
 */
public class PizzaIngredients {
    public static void main(String[] args) {
        System.out.println(doughIsEnough(new String[] {"dough", "tomatoes", "dough", "cheese", "pasta", "dough" }));
    }
    public static boolean doughIsEnough(String[] ingredients) {
        int doughCount = 0;
        String dough = "dough";
        for (String a : ingredients){
            if (a.equals(dough)){
                doughCount++;
            }
        }
        if (doughCount >=2){
            return true;
        } else return false;
    }
}
