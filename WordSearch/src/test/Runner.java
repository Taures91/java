package WordSearch.src.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        int horizontalNum = 10; //���������� ���� �� �����������
        int verticalNum = 10; //���������� ���� �� ���������
        char charArray[][] = new char[horizontalNum][verticalNum]; //�������� ������� ��������
        String [] formattedWords = inputWordsFormatting(); // �������� ������� ���� � ����������������� ����

        
        charArray = keyWordAddToArrayWithRandomDirection(charArray, formattedWords[0], horizontalNum, verticalNum); //�������� � ������ ������� �����
//        charArray = keyWordAddToArrayWithRandomDirection(charArray, formattedWords[1], horizontalNum, verticalNum); //�������� � ������ ������� �����
//        charArray = keyWordAddToArrayWithRandomDirection(charArray, formattedWords[2], horizontalNum, verticalNum); //�������� � ������ ������� �����
//        charArray = keyWordAddToArrayWithRandomDirection(charArray, formattedWords[3], horizontalNum, verticalNum); //�������� � ������ ������� �����


        printCrossword(charArray); // ����� ���������� � �������


    }

    public static String[] inputWordsFormatting(){
        System.out.println("������� �������� �����: ");
        Scanner wordsScanner = new Scanner(System.in); //������ �� ���� ����
        String inputWords = wordsScanner.nextLine(); //�������� ������ �� ������ ��������� ����
        inputWords = inputWords.toUpperCase().replaceAll("[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]", ""); //��������� ��������� ����� � ������� ������� � ������� ��� ������ �������
        String[] formattedWords = inputWords.split(" "); // ��������� ��������� ����� �� ��������� �����. ���� ������ ���� � ������������ "������"
        System.out.println(Arrays.toString(formattedWords)); //������� � ������� ����� ��� �������� 
        return formattedWords;
    }
    public static int[] randomStartPoint (int horizontalNum, int verticalNum){ // ����������� ��������� ����� ������ �����
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

    public static char[][] keyWordAddToArray(char charArray[][], String keyWord, int startPoint[]){
        char[] word = keyWord.toCharArray();
        int horIndex = startPoint[0];
        int verIndex = startPoint[1];
        charArray[verIndex][horIndex] = word[0];
        for (int i = 0; i < (keyWord.length()-1); i++){
            charArray[verIndex+1+i][horIndex] = word[1+i];
        }
        return charArray;
    }
    public static void printCrossword(char charArray[][]){ //����� ���������� � ������� � ���� �������
        for (char[] chars : charArray) {
            for (char ar : chars) {
                System.out.print(ar + " ");
            }
            System.out.println();
        }
    }

    public static char[][] keyWordAddToArrayWithRandomDirection(char charArray[][], String keyWord, int horizontalNum, int verticalNum){
        char[] word = keyWord.toCharArray(); //�������� ����� �� ������ ����
        Random random = new Random();
        int horIndex = 0;
        int verIndex = 0;
        for (int i = 0; i < 20; i++) {      //��������� ���� �� ������ ���������� ����� ������ �����
            horIndex = random.nextInt(horizontalNum); //������ ������ ����� �� �����������
            verIndex = random.nextInt(verticalNum); //������ ������ ����� �� ���������
            if (horIndex + keyWord.length() > horizontalNum || verIndex + keyWord.length() > verticalNum) { //���� ����� �� ���������� � ������, �� ��������� ���� ������
                continue;
            }
            charArray[verIndex][horIndex] = word[0]; //���� ����� ����������, �� �������� ������ ����� ��������� �����
            break; //� �� ���������� ���� ������
        }

        Random random2 = new Random(); // �������� �������
        int randomDirection = random2.nextInt(2); // ������ 0 ��� 1
        if (randomDirection == 0){                          //���� 0, �� ����� ������ �� ���������
            for (int i = 0; i < (keyWord.length()-1); i++){
                charArray[verIndex+1+i][horIndex] = word[1+i];
            }
        } else {                                            //���� 1, �� �� �����������
            for (int i = 0; i < (keyWord.length()-1); i++){
                charArray[verIndex][horIndex+1+i] = word[1+i];
            }
        }
        return charArray;
    }
}
