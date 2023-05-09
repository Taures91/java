package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Words {

    public static String[] getRandomWords(String dictName, int numberOfWords) throws IOException {
        Path path = Path.of("resources", dictName);
        String[] words = new String[numberOfWords];
        int addedWords = 0;
        int baseValue = 33333;
        Random random = new Random();
        for (int i = 0; addedWords < numberOfWords; i++) {
            int randomNumber = random.nextInt(baseValue);
            Scanner scanner = new Scanner(path);
            for (int j = 0; j < baseValue; j++) {
                String s = scanner.nextLine();
                if (j == randomNumber) {
                    Scanner scanner2 = new Scanner(path);
                    for (int k = 0; k <= randomNumber + 1; k++) {
                        scanner2.nextLine();
                        if (k == randomNumber - 1) {
                            words[addedWords] = scanner2.nextLine().toUpperCase();
                            addedWords++;

                        }
                    }
                    scanner.close();
                    break;
                }

            }
        }
        return words;
    }

    public static String[] getRandomWordsFromDictionary(String dictName, int numberOfWords, int minLength, int maxLength) throws IOException {
        String fileType = ".txt";
        Path path = Path.of("resources", dictName + fileType);
        String[] words = new String[numberOfWords];
        try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8)) {
            List<String> dict = stream.filter(word -> word.length() >= minLength && word.length() <= maxLength).toList();
            Random random = new Random();

            for (int n = 0; n <= numberOfWords - 1; n++){
            int randomIndex = random.nextInt(dict.size());
                words[n] = dict.get(randomIndex).toUpperCase();
            }

        }
        return words;

    }


}




