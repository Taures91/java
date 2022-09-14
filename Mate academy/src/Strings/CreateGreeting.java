package Strings;
/*
У цьому завданні ми додали до вхідного рядка input привітання "Hello, "
і хотіли повернути новий рядок. Але код не спрацював.
Виправ код так, щоби метод createGreeting() виконував свою функцію.
 */
public class CreateGreeting {
    public static void main(String[] args) {
        System.out.println(createGreeting("Vova"));
    }
    public static String createGreeting(String input) {
        StringBuilder builder = new StringBuilder("Hello, ");
        builder.append(input);
        String builder1 = builder.toString();
        return builder1;
    }
}
