import java.util.Scanner;

public class ConsoleInputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day, month;
        System.out.println("���� ������� ����? ");
        day = scanner.nextLine();
        System.out.println("���� ������� �����? ");
        month = scanner.nextLine();
        String text = "������� " + day + ", ����� - " + month;
        System.out.println(text);
    }
}
