package test;

import java.io.IOException;
import java.util.*;

public class PuzzleCreator {
    public static void main(String[] args) throws IOException {
        int horizontalNum = 19; //���������� ���� �� �����������
        int verticalNum = 19; //���������� ���� �� ���������
        int numberOfWords = 15; // ���������� ����
        String dictName = "3-8 letters";

        int numberOfDirections = chooseLevel(); //�������� ����� ���������� ����������� ��� ���� � ����������� �� ������ ���������
        System.out.println("������� ���������� �����������: ");
        Scanner scan = new Scanner(System.in);
        int numberOfCrosswords = scan.nextInt(); //���� ���������� �����������
        for (int n = 0; n < numberOfCrosswords; n++) {
            char[][] cluePuzzle = createAndFillArrayWithSpaces(horizontalNum, verticalNum);   //���������� ������� ���������

            String[] formattedWords = Words.getRandomWordsFromDictionary(dictName, numberOfWords, 3,8); // �������� ������� ���� � ����������������� ����


            for (int i = 0; i <= numberOfWords - 1; i++) {              //���� ���������� ���������� ���� � ���������
                keyWordAddToArray(cluePuzzle, formattedWords[i], horizontalNum, verticalNum, numberOfDirections);
            }
            System.out.println("PUZZLE #" + (n + 1));
            printCrossword(cluePuzzle); // ����� ������� � �������
            System.out.println();
            char[][] puzzle = fillArrayWithRandomChars(cluePuzzle, horizontalNum, verticalNum); //���������� ������ ����� ���������
            printCrossword(puzzle); // ����� ���������� � �������
            System.out.println();
            keyWordsPrint(formattedWords, numberOfWords); // ����� ������ �������� ����
            System.out.println();
        }


    }

    public static String[] inputWordsFormatting(int numberOfWords) {
        System.out.println("������� �������� �����: ");
        Scanner wordsScanner = new Scanner(System.in); //������ �� ���� ����
        String inputWords = wordsScanner.nextLine(); //�������� ������ �� ������ ��������� ����
        inputWords = inputWords.toUpperCase().replaceAll("[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]", ""); //��������� ��������� ����� � ������� ������� � ������� ��� ������ �������
        String[] formattedWords = inputWords.split(" "); // ��������� ��������� ����� �� ��������� �����. ���� ������ ���� � ������������ "������"
        if (formattedWords.length < numberOfWords) {         //���� ������������ ����, ��������� �����
            System.out.println("��������� ���� ������������");
        }
        String[] words = Arrays.copyOf(formattedWords, numberOfWords);  //���� ���� ������� ��� ����, ������ ���������� �� ������� ����������
        System.out.println(Arrays.toString(words)); //������� � ������� ����� ��� ��������


        return formattedWords;
    }


    public static int[] randomStartPoint(int horizontalNum, int verticalNum) { // ����������� ��������� ����� ������ �����
        int[] point = new int[2]; //�������� ������� � ������������ ������ ����� �����
        Random random = new Random();
        int startPointHorizontal = random.nextInt(horizontalNum); //����� ��������� ����� ������ �� �����������
//        System.out.println(startPointHorizontal);
        int startPointVertical = random.nextInt(verticalNum); //����� ��������� ����� ������ �� ���������
//        System.out.println(startPointVertical);
        point[0] = startPointHorizontal;    //�������� ��������� ��������� � ������
        point[1] = startPointVertical;      //�������� ��������� ��������� � ������
        return point;
    }

    public static char[][] createAndFillArrayWithSpaces(int horizontalNum, int verticalNum) {
        char[][] charArray = new char[horizontalNum][verticalNum];
        for (int i = 0; i < horizontalNum; i++) {
            for (int j = 0; j < verticalNum; j++) {
                char letter = ' ';
                charArray[i][j] = letter;
            }
        }
        return charArray;
    }

    public static void printCrossword(char[][] charArray) { //����� ���������� � ������� � ���� �������
        for (char[] chars : charArray) {
            for (char ar : chars) {
                System.out.print(ar + " ");
            }
            System.out.println();
        }
    }

    public static void keyWordAddToArray(char[][] charArray, String keyWord, int horizontalNum, int verticalNum, int numberOfDirections) {
        char[] word = keyWord.toCharArray(); //�������� ����� �� ������ ����
        Random random = new Random();
        int horIndex = 0;
        int verIndex = 0;
        while (true) {      //��������� ���� �� ������ ���������� ����� ������ �����
            horIndex = random.nextInt(horizontalNum); //������ ������ ����� �� �����������
            verIndex = random.nextInt(verticalNum); //������ ������ ����� �� ���������


            if (charArray[verIndex][horIndex] != word[0] && charArray[verIndex][horIndex] != ' ') { //���� ����� �� ���������� � ������ ��� �������, ��� ����� ��� ������ ����� ������, �� ��������� ���� ������
                continue;
            }
            boolean error = false;
            Random random2 = new Random();
            int randomDirection = random2.nextInt(numberOfDirections); //������� ��������� �����������

            switch (randomDirection) {
                case 0 -> {
                    for (int j = 0; j < (keyWord.length()); j++) {          //�������� ������ - ���� �� ������� ������ �� ����������� �����
                        if (verIndex + keyWord.length() > verticalNum || (charArray[verIndex + j][horIndex] != ' ' && charArray[verIndex + j][horIndex] != word[j])) {
                            error = true;                                   //���� ������ ������, �� ������
                            break;
                        }
                    }
                    if (error)
                        continue;                                    //���� ������ �� ����� ������ ��������� �����
                    for (int j = 0; j < (keyWord.length()); j++) {             //���� ��� ������, �� ������� �����
                        charArray[verIndex + j][horIndex] = word[j];
                    }
                }
                case 1 -> {
                    for (int k = 0; k < (keyWord.length()); k++) {
                        if (horIndex + keyWord.length() > horizontalNum || (charArray[verIndex][horIndex + k] != ' ' && charArray[verIndex][horIndex + k] != word[k])) {
                            error = true;
                            break;
                        }
                    }
                    if (error) continue;
                    for (int k = 0; k < (keyWord.length()); k++) {
                        charArray[verIndex][horIndex + k] = word[k];
                    }
                }
                case 2 -> {
                    for (int k = 0; k < (keyWord.length()); k++) {
                        if (verIndex - keyWord.length() < 0 || (charArray[verIndex - k][horIndex] != ' ' && charArray[verIndex - k][horIndex] != word[k])) {
                            error = true;
                            break;
                        }
                    }
                    if (error) continue;
                    for (int k = 0; k < (keyWord.length()); k++) {
                        charArray[verIndex - k][horIndex] = word[k];
                    }
                }
                case 3 -> {
                    for (int k = 0; k < (keyWord.length()); k++) {
                        if (horIndex - keyWord.length() < 0 || (charArray[verIndex][horIndex - k] != ' ' && charArray[verIndex][horIndex - k] != word[k])) {
                            error = true;
                            break;
                        }
                    }
                    if (error) continue;
                    for (int k = 0; k < (keyWord.length()); k++) {
                        charArray[verIndex][horIndex - k] = word[k];
                    }
                }
                case 4 -> {
                    for (int k = 0; k < (keyWord.length()); k++) {
                        if (verIndex + keyWord.length() > verticalNum || horIndex + keyWord.length() > horizontalNum || (charArray[verIndex + k][horIndex + k] != ' ' && charArray[verIndex + k][horIndex + k] != word[k])) {
                            error = true;
                            break;
                        }
                    }
                    if (error) continue;
                    for (int k = 0; k < (keyWord.length()); k++) {
                        charArray[verIndex + k][horIndex + k] = word[k];
                    }
                }
                case 5 -> {
                    for (int k = 0; k < (keyWord.length()); k++) {
                        if (verIndex - keyWord.length() < 0 || horIndex - keyWord.length() < 0 || (charArray[verIndex - k][horIndex - k] != ' ' && charArray[verIndex - k][horIndex - k] != word[k])) {
                            error = true;
                            break;
                        }
                    }
                    if (error) continue;
                    for (int k = 0; k < (keyWord.length()); k++) {
                        charArray[verIndex - k][horIndex - k] = word[k];
                    }
                }
                case 6 -> {
                    for (int k = 0; k < (keyWord.length()); k++) {
                        if (verIndex + keyWord.length() > verticalNum || horIndex - keyWord.length() < 0 || (charArray[verIndex + k][horIndex - k] != ' ' && charArray[verIndex + k][horIndex - k] != word[k])) {
                            error = true;
                            break;
                        }
                    }
                    if (error) continue;
                    for (int k = 0; k < (keyWord.length()); k++) {
                        charArray[verIndex + k][horIndex - k] = word[k];
                    }
                }
                case 7 -> {
                    for (int k = 0; k < (keyWord.length()); k++) {
                        if (verIndex - keyWord.length() < 0 || horIndex + keyWord.length() > horizontalNum || (charArray[verIndex - k][horIndex + k] != ' ' && charArray[verIndex - k][horIndex + k] != word[k])) {
                            error = true;
                            break;
                        }
                    }
                    if (error) continue;
                    for (int k = 0; k < (keyWord.length()); k++) {
                        charArray[verIndex - k][horIndex + k] = word[k];
                    }
                }
            }
            break;

            /** ������ ������� ���� � if-else:

             if (randomDirection == 0) {                                 //���� ����������� 0, �� ����� ����� �� ��������� ����
             for (int j = 0; j < (keyWord.length()); j++) {          //�������� ������ - ���� �� ������� ������ �� ����������� �����
             if (verIndex + keyWord.length() > verticalNum || (charArray[verIndex + j][horIndex] != ' ' && charArray[verIndex + j][horIndex] != word[j])) {
             error = true;                                   //���� ������ ������, �� ������
             break;
             }
             }
             if (error) continue;                                    //���� ������ �� ����� ������ ��������� �����
             for (int j = 0; j < (keyWord.length()); j++) {             //���� ��� ������, �� ������� �����
             charArray[verIndex + j][horIndex] = word[j];
             }
             break;

             } else if (randomDirection == 1) {                          //���� ����������� 1, �� ����� ����� �� ����������� ������
             for (int k = 0; k < (keyWord.length()); k++) {
             if (horIndex + keyWord.length() > horizontalNum || (charArray[verIndex][horIndex + k] != ' ' && charArray[verIndex][horIndex + k] != word[k])) {
             error = true;
             break;
             }
             }
             if (error) continue;
             for (int k = 0; k < (keyWord.length()); k++) {
             charArray[verIndex][horIndex + k] = word[k];
             }
             break;
             } else if (randomDirection == 2) {                          //���� ����������� 2, �� ����� ����� �� ��������� �����
             for (int k = 0; k < (keyWord.length()); k++) {
             if (verIndex - keyWord.length() < 0 || (charArray[verIndex - k][horIndex] != ' ' && charArray[verIndex - k][horIndex] != word[k])) {
             error = true;
             break;
             }
             }
             if (error) continue;
             for (int k = 0; k < (keyWord.length()); k++) {
             charArray[verIndex - k][horIndex] = word[k];
             }
             break;
             } else if (randomDirection == 3) {                          //���� ����������� 3, �� ����� ����� �� ����������� �����
             for (int k = 0; k < (keyWord.length()); k++) {
             if (horIndex - keyWord.length() < 0 || (charArray[verIndex][horIndex - k] != ' ' && charArray[verIndex][horIndex - k] != word[k])) {
             error = true;
             break;
             }
             }
             if (error) continue;
             for (int k = 0; k < (keyWord.length()); k++) {
             charArray[verIndex][horIndex - k] = word[k];
             }
             break;
             } else if (randomDirection == 4) {                          //���� ����������� 4, �� ����� ����� �� ���������
             for (int k = 0; k < (keyWord.length()); k++) {
             if (verIndex + keyWord.length() > verticalNum || horIndex + keyWord.length() > horizontalNum || (charArray[verIndex + k][horIndex + k] != ' ' && charArray[verIndex + k][horIndex + k] != word[k])) {
             error = true;
             break;
             }
             }
             if (error) continue;
             for (int k = 0; k < (keyWord.length()); k++) {
             charArray[verIndex + k][horIndex + k] = word[k];
             }
             break;
             } else if (randomDirection == 5) {                          //���� ����������� 5, �� ����� ����� �� ���������
             for (int k = 0; k < (keyWord.length()); k++) {
             if (verIndex - keyWord.length() < 0 || horIndex - keyWord.length() < 0 || (charArray[verIndex - k][horIndex - k] != ' ' && charArray[verIndex - k][horIndex - k] != word[k])) {
             error = true;
             break;
             }
             }
             if (error) continue;
             for (int k = 0; k < (keyWord.length()); k++) {
             charArray[verIndex - k][horIndex - k] = word[k];
             }
             break;
             } else if (randomDirection == 6) {                          //���� ����������� 5, �� ����� ����� �� ���������
             for (int k = 0; k < (keyWord.length()); k++) {
             if (verIndex + keyWord.length() > verticalNum || horIndex - keyWord.length() < 0 || (charArray[verIndex + k][horIndex - k] != ' ' && charArray[verIndex + k][horIndex - k] != word[k])) {
             error = true;
             break;
             }
             }
             if (error) continue;
             for (int k = 0; k < (keyWord.length()); k++) {
             charArray[verIndex + k][horIndex - k] = word[k];
             }
             break;
             } else if (randomDirection == 7) {                          //���� ����������� 5, �� ����� ����� �� ���������
             for (int k = 0; k < (keyWord.length()); k++) {
             if (verIndex - keyWord.length() < 0 || horIndex + keyWord.length() > horizontalNum || (charArray[verIndex - k][horIndex + k] != ' ' && charArray[verIndex - k][horIndex + k] != word[k])) {
             error = true;
             break;
             }
             }
             if (error) continue;
             for (int k = 0; k < (keyWord.length()); k++) {
             charArray[verIndex - k][horIndex + k] = word[k];
             }
             break;
             }
             *
             */

        }
    }

    public static int chooseLevel() {
        Scanner scan = new Scanner(System.in);
        System.out.println("�������� ������� ���������: ");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        int level = scan.nextInt();
        int numberOfDirections = 0;
        switch (level) {
            case 1 -> numberOfDirections = 2;

//                System.out.println("�� ������� ������� 1. Easy");
            case 2 -> numberOfDirections = 4;

//                System.out.println("�� ������� ������� 2. Medium");
            case 3 -> numberOfDirections = 8;

//                System.out.println("�� ������� ������� 3. Hard");
            default -> {
            }
//                System.out.println("������ ������ �� ����������");
        }
        return numberOfDirections;
    }

    public static char[][] fillArrayWithRandomChars(char[][] charArray, int horizontalNum, int verticalNum) {

        for (int i = 0; i < horizontalNum; i++) {
            for (int j = 0; j < verticalNum; j++) {
                if (charArray[i][j] == ' ') {
                    Random random = new Random();
                    charArray[i][j] = (char) (random.nextInt(25) + 65);
                }
            }
        }
        return charArray;
    }

    public static void keyWordsPrint(String[] formattedWords, int numberOfWords) {
        for (String s : formattedWords) {
            System.out.println(s);
        }
        int differenceNumberOfWords = 20 - numberOfWords;
        for (int i = 0; i < differenceNumberOfWords; i++) {
            System.out.println();
        }

    }
}
