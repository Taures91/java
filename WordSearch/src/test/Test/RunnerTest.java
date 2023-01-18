package WordSearch.src.test.Test;

import org.w3c.dom.css.CSSStyleDeclaration;

import java.io.FileNotFoundException;
import java.util.*;

public class RunnerTest {
    public static void main(String[] args) throws FileNotFoundException {
        int horizontalNum = 14; //���������� ���� �� �����������
        int verticalNum = 14; //���������� ���� �� ���������
        int numberOfWords = 8;
        int numberOfDirections = chooseLevel();
        char[][] clueArray = new char[horizontalNum][verticalNum]; //�������� ������� ��������
        fillArrayWithZero(clueArray, horizontalNum, verticalNum);   //���������� ������� ������

        String[] formattedWords = inputWordsFormatting(Base.SearchWordsFromBase(10,3,8)); // �������� ������� ���� � ����������������� ����

        for (int i = 0; i <= numberOfWords - 1; i++) {              //���� ���������� ���������� ���� � ���������
            keyWordAddToArrayWithRandomDirection(clueArray, formattedWords[i], horizontalNum, verticalNum, numberOfDirections);
        }
        printCrossword(clueArray); // ����� ������� � �������
        System.out.println();
        char[][] charArray = fillArrayWithRandomChars(clueArray, horizontalNum, verticalNum); //���������� ������ ����� ���������
        printCrossword(charArray); // ����� ���������� � �������
        System.out.println();
        keyWordsPrint(formattedWords);




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

    public static String[] inputWordsFormatting(String[] wordsFromBase) {
        for (int i = 0; i < wordsFromBase.length; i++) {
            wordsFromBase[i] = wordsFromBase[i].toUpperCase();//��������� ��������� ����� � ������� �������
        }
//        System.out.println(Arrays.toString(wordsFromBase)); //������� � ������� ����� ��� ��������
        return wordsFromBase;
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

    public static char[][] fillArrayWithZero(char charArray[][], int horizontalNum, int verticalNum) {

        for (int i = 0; i < horizontalNum; i++) {
            for (int j = 0; j < verticalNum; j++) {
                char letter = '0';
                charArray[i][j] = letter;
            }
        }
        return charArray;
    }

    public static void printCrossword(char charArray[][]) { //����� ���������� � ������� � ���� �������
        for (char[] chars : charArray) {
            for (char ar : chars) {
                System.out.print(ar + " ");
            }
            System.out.println();
        }
    }

    public static char[][] keyWordAddToArrayWithRandomDirection(char charArray[][], String keyWord, int horizontalNum, int verticalNum, int numberOfDirections) {
        char[] word = keyWord.toCharArray(); //�������� ����� �� ������ ����
        Random random = new Random();
        int horIndex = 0;
        int verIndex = 0;
        for (int i = 0; i < 50; i++) {      //��������� ���� �� ������ ���������� ����� ������ �����
            horIndex = random.nextInt(horizontalNum); //������ ������ ����� �� �����������
            verIndex = random.nextInt(verticalNum); //������ ������ ����� �� ���������


            if (charArray[verIndex][horIndex] != word[0] && charArray[verIndex][horIndex] != '0') { //���� ����� �� ���������� � ������ ��� �������, ��� ����� ��� ������ ����� ������, �� ��������� ���� ������
                continue;
            }
            boolean error = false;
            Random random2 = new Random();
            int randomDirection = random2.nextInt(numberOfDirections); //������� ��������� �����������
            if (randomDirection == 0) {                                 //���� ����������� 0, �� ����� ����� �� ��������� ����
                for (int j = 0; j < (keyWord.length()); j++) {          //�������� ������ - ���� �� ������� ������ �� ����������� �����
                    if (verIndex + keyWord.length() > verticalNum || (charArray[verIndex + j][horIndex] != '0' && charArray[verIndex + j][horIndex] != word[j])) {
                        error = true;                                   //���� ������ ������, �� ������
                    }
                }
                if (error) continue;                                    //���� ������ �� ����� ������ ��������� �����
                for (int j = 0; j < (keyWord.length()); j++) {             //���� ��� ������, �� ������� �����
                    charArray[verIndex + j][horIndex] = word[j];
                }
                break;

            } else if (randomDirection == 1) {                          //���� ����������� 1, �� ����� ����� �� ����������� ������
                for (int k = 0; k < (keyWord.length()); k++) {
                    if (horIndex + keyWord.length() > horizontalNum || (charArray[verIndex][horIndex + k] != '0' && charArray[verIndex][horIndex + k] != word[k])) {
                        error = true;
                    }
                }
                if (error) continue;
                for (int k = 0; k < (keyWord.length()); k++) {
                    charArray[verIndex][horIndex + k] = word[k];
                }
                break;
            } else if (randomDirection == 2) {                          //���� ����������� 2, �� ����� ����� �� ��������� �����
                for (int k = 0; k < (keyWord.length()); k++) {
                    if (verIndex - keyWord.length() < 0 || (charArray[verIndex - k][horIndex] != '0' && charArray[verIndex - k][horIndex] != word[k])) {
                        error = true;
                    }
                }
                if (error) continue;
                for (int k = 0; k < (keyWord.length()); k++) {
                    charArray[verIndex - k][horIndex] = word[k];
                }
                break;
            } else if (randomDirection == 3) {                          //���� ����������� 3, �� ����� ����� �� ����������� �����
                for (int k = 0; k < (keyWord.length()); k++) {
                    if (horIndex - keyWord.length() < 0 || (charArray[verIndex][horIndex - k] != '0' && charArray[verIndex][horIndex - k] != word[k])) {
                        error = true;
                    }
                }
                if (error) continue;
                for (int k = 0; k < (keyWord.length()); k++) {
                    charArray[verIndex][horIndex - k] = word[k];
                }
                break;
            } else if (randomDirection == 4) {                          //���� ����������� 4, �� ����� ����� �� ���������
                for (int k = 0; k < (keyWord.length()); k++) {
                    if (verIndex + keyWord.length() > verticalNum || horIndex + keyWord.length() > horizontalNum || (charArray[verIndex + k][horIndex + k] != '0' && charArray[verIndex + k][horIndex + k] != word[k])) {
                        error = true;
                    }
                }
                if (error) continue;
                for (int k = 0; k < (keyWord.length()); k++) {
                    charArray[verIndex + k][horIndex + k] = word[k];
                }
                break;
            } else if (randomDirection == 5) {                          //���� ����������� 5, �� ����� ����� �� ���������
                for (int k = 0; k < (keyWord.length()); k++) {
                    if (verIndex - keyWord.length() < 0 || horIndex - keyWord.length() < 0 || (charArray[verIndex - k][horIndex - k] != '0' && charArray[verIndex - k][horIndex - k] != word[k])) {
                        error = true;
                    }
                }
                if (error) continue;
                for (int k = 0; k < (keyWord.length()); k++) {
                    charArray[verIndex - k][horIndex - k] = word[k];
                }
                break;
            } else if (randomDirection == 6) {                          //���� ����������� 5, �� ����� ����� �� ���������
                for (int k = 0; k < (keyWord.length()); k++) {
                    if (verIndex + keyWord.length() > verticalNum || horIndex - keyWord.length() < 0 || (charArray[verIndex + k][horIndex - k] != '0' && charArray[verIndex + k][horIndex - k] != word[k])) {
                        error = true;
                    }
                }
                if (error) continue;
                for (int k = 0; k < (keyWord.length()); k++) {
                    charArray[verIndex + k][horIndex - k] = word[k];
                }
                break;
            } else if (randomDirection == 7) {                          //���� ����������� 5, �� ����� ����� �� ���������
                for (int k = 0; k < (keyWord.length()); k++) {
                    if (verIndex - keyWord.length() < 0 || horIndex + keyWord.length() > horizontalNum || (charArray[verIndex - k][horIndex + k] != '0' && charArray[verIndex - k][horIndex + k] != word[k])) {
                        error = true;
                    }
                }
                if (error) continue;
                for (int k = 0; k < (keyWord.length()); k++) {
                    charArray[verIndex - k][horIndex + k] = word[k];
                }
                break;
            }
        }
        return charArray;
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
            case 1:
                numberOfDirections = 2;
//                System.out.println("�� ������� ������� 1. Easy");
                break;
            case 2:
                numberOfDirections = 4;
//                System.out.println("�� ������� ������� 2. Medium");
                break;
            case 3:
                numberOfDirections = 8;
//                System.out.println("�� ������� ������� 3. Hard");
                break;
            default:
//                System.out.println("������ ������ �� ����������");
                break;
        }
        return numberOfDirections;
    }

    public static char[][] fillArrayWithRandomChars(char charArray[][], int horizontalNum, int verticalNum) {

        for (int i = 0; i < horizontalNum; i++) {
            for (int j = 0; j < verticalNum; j++) {
                if (charArray[i][j] == '0') {
                    Random random = new Random();
                    charArray[i][j] = (char) (random.nextInt(25) + 65);
                }
            }
        }
        return charArray;
    }

    public static void keyWordsPrint (String[] formattedWords){
        for (String s : formattedWords) {
            System.out.println(s);
        }
    }
}
