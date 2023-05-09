import java.util.Scanner;

public class ConsoleInputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day, month;
        System.out.println("який сьогодн≥ день? ");
        day = scanner.nextLine();
        System.out.println("який сьогодн≥ м≥с€ць? ");
        month = scanner.nextLine();
        String text = "—ьогодн≥ " + day + ", м≥с€ць - " + month;
        System.out.println(text);
    }
}
