package WordSearch.src.test.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Base {
    public static void main(String[] args) throws FileNotFoundException {




    }
    public static String[] SearchWordsFromBase(int numberOfWords, int minimalLengthOfWord, int maximalLengthOfWord) throws FileNotFoundException {
        File file = new File("D:\\Nextcloud\\Документы\\java\\WordSearch\\src\\test\\1engmix.txt");
        String[] words = new String[numberOfWords];
        int addedWords = 0;
        int baseValue = 80000;
        Random random = new Random();
        for (int i = 0; addedWords < numberOfWords; i++){
            int randomNumber = random.nextInt(baseValue);
            Scanner scanner = new Scanner(file);
            for (int j = 0; j < baseValue; j++) {
                String s = scanner.nextLine();
                if ((s.length() >= minimalLengthOfWord && s.length() <= maximalLengthOfWord) && j == randomNumber) {
                    Scanner scanner2 = new Scanner(file);
                    for (int k = 0; k <= randomNumber + 1; k++) {
                        scanner2.nextLine();
                        if (k == randomNumber - 1){
                            words[addedWords] = scanner2.nextLine();
                            addedWords++;

                        }
                    }
                    scanner.close();
                    break;
                }

            }
        }return words;
    }
}
