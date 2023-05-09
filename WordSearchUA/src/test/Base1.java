package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Base1 {
    public static void main(String[] args) throws FileNotFoundException {

    }

    public static String[] SearchWordsFromBase(int numberOfWords, int minimalLengthOfWord, int maximalLengthOfWord) throws FileNotFoundException {
        File file = new File("D:\\Nextcloud\\Документы\\java\\WordSearchUA\\archive\\baseUA.txt");
        String[] words = new String[numberOfWords];
        int addedWords = 0;
        int baseValue = 225800;
        int spaceIndex = 0;
        Random random = new Random();
        for (int i = 0; addedWords < numberOfWords; i++) {
            int randomNumber = random.nextInt(baseValue);
            Scanner scanner = new Scanner(file);
            for (int j = 0; j < baseValue; j++) {
                String s = scanner.nextLine();
                if (j == randomNumber) {
                    spaceIndex = s.indexOf(" ");
                }
                if (j == randomNumber && (s.contains("n1") || s.contains("n2")) && !s.contains("-") && !s.contains("'") && spaceIndex <= maximalLengthOfWord && spaceIndex >= minimalLengthOfWord) {

                    Scanner scannerSearch = new Scanner(file);

                    for (int k = 0; k <= randomNumber; k++) {
                        String word = scannerSearch.nextLine();
                        if (k == randomNumber) {
                            words[addedWords] = word.substring(0, spaceIndex);
                            addedWords++;
                        }

                    }
                    scannerSearch.close();
                    break;
                }

            }
        }
        return words;

    }

    public static String[] PickWordsFromFilteredBase(String[] filteredBase, int numberOfWords) {
        int baseValue = filteredBase.length;
        String[] pickedWords = new String[numberOfWords];
        Random random = new Random();
        for (int i = 0; i < numberOfWords; i++) {
            pickedWords[i] = filteredBase[random.nextInt(baseValue)];
        }
        return pickedWords;
    }

    public static String[] filteringNounsFromBase(int minimalLengthOfWord, int maximalLengthOfWord) throws FileNotFoundException {
        File file = new File("D:\\Nextcloud\\Документы\\java\\WordSearchUA\\archive\\baseUA.txt");
        int counter = 0;
        String[] words = new String[41690];
        int baseValue = 225500;
        Scanner scanner = new Scanner(file);
        for (int i = 0; i < baseValue; i++) {
            String s = scanner.nextLine();
            if (s != null) {
                int spaceIndex = s.indexOf(" ");
                if ((s.contains("n1") || s.contains("n2")) && !s.contains("-") && !s.contains("'") && spaceIndex <= maximalLengthOfWord && spaceIndex >= minimalLengthOfWord) {
                    words[counter] = s.substring(0, spaceIndex);
                    counter++;
                }
            }

        }
 //      System.out.println(counter);
//        System.out.println(Arrays.toString(words));
        return words;
    }
}
