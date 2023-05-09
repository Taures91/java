package tasks;

import javax.security.sasl.SaslClient;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * 1. «адан файл с текстом, найти и вывести в консоль все слова,
 * начинающиес€ с гласной буквы.
 */
public class Task1 {

    private static final String VOWELS = "аеЄиоуыэю€";

    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "test.txt");
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()){
                String word = scanner.next();
                char firstSymbol = word.toLowerCase().charAt(0);
                if (VOWELS.indexOf(firstSymbol) != -1){
                    System.out.println(word);
                }
            }
        }
    }
}
