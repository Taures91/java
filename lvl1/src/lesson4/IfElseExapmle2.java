package lesson4;

/*
2. Дано целое число. Определить является ли последняя цифра числа цифрой 3.
 */
public class IfElseExapmle2 {
    public static void main(String[] args) {
        int num1 = 453;
        int num2 = num1 % 10;
        System.out.println("Последняя цифра равна: " + num2);
        if (num2 == 3) {
            System.out.println("Является");
        } else {
            System.out.println("Не является");
        }
    }
}
