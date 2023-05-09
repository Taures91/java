package test;


import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        int horizontalNum = 19; //���������� ���� �� �����������
        int verticalNum = 19; //���������� ���� �� ���������
        int amountOfKeyNumbers = 20; // ���������� �����
        int numberOfDirections = chooseLevel(); //�������� ����� ���������� ����������� ��� ���� � ����������� �� ������ ���������
        System.out.println("������� ���������� �����������: ");
        Scanner scan = new Scanner(System.in);
        int amountOfCrosswords = scan.nextInt(); //���� ���������� �����������
        for(int n = 0; n < amountOfCrosswords; n++) {
            int[][] clueArray = new int[horizontalNum][verticalNum]; //�������� ������� ��������
            fillArrayWithSpaces(clueArray, horizontalNum, verticalNum);   //���������� ������� ���������
            int [] keyNumbers = generateKeyNumbers(amountOfKeyNumbers,4,10); // �������� ������� �������� ����� (���������� �����, ����������� ����� �����, ���������� ����� � ������)



            for (int i = 0; i <= amountOfKeyNumbers - 1; i++) {              //���� ���������� ���������� ���� � ���������
                keyNumberAddToArrayWithRandomDirection(clueArray, keyNumbers[i], horizontalNum, verticalNum, numberOfDirections);
            }
            System.out.println("PUZZLE #" + (n + 1));
            printCrossword(clueArray); // ����� ������� � �������
            System.out.println();
            int[][] intArray = fillArrayWithRandomNumbers(clueArray, horizontalNum, verticalNum); //���������� ������ ����� ���������
            printCrossword(intArray); // ����� ���������� � �������
            System.out.println();
            keyNumbersPrint(keyNumbers, amountOfKeyNumbers); // ����� ������ �������� ����
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

    public static void fillArrayWithSpaces(int[][] charArray, int horizontalNum, int verticalNum) {

        for (int i = 0; i < horizontalNum; i++) {
            for (int j = 0; j < verticalNum; j++) {
                charArray[i][j] = 0;
            }
        }
    }

    public static void printCrossword(int[][] charArray) { //����� ���������� � ������� � ���� �������
        for (int[] i : charArray) {
            for (int ar : i) {
                System.out.print(ar + " ");
            }
            System.out.println();
        }
    }

    public static int [] generateKeyNumbers (int numberOfKeyNumbers, int minLengthOfKeyNumbers, int numbersInCategory){
//        numberOfKeyNumbers = 25;  // ����� ���������� �������� ������� � ����������
//        minLengthOfKeyNumbers = 5;  //����������� ����� ��������� �����
//        numbersInCategory = 7;      // ���������� �������� ������� ���������� �����
        int[] keyNumbers = new int[numberOfKeyNumbers]; //������ �������� ����
        Random random = new Random();
        for (int f = 0; f <= numberOfKeyNumbers / numbersInCategory; f++){
            for (int i = 0; i < numbersInCategory; i++){
                int length = minLengthOfKeyNumbers + f;
                int [] keyNumber = new int[length];
                int result = 0;
                for (int j = length - 1, n = 0; j >= 0; j--, n++){

                        keyNumber[j] = random.nextInt(9) + 1;
                        result += keyNumber[j] * Math.pow(10, n);
                    

                }
                if ((i + (numbersInCategory * f) == numberOfKeyNumbers)){  //���� ��� ������� ����� ���������� �������, �� ���������� ����
                    break;
                }
                keyNumbers[i + (numbersInCategory * f)] = result;
            }
        }

        return keyNumbers;
    }

    public static void keyNumberAddToArrayWithRandomDirection(int [][] clueArray, int keyNumber, int horizontalNum, int verticalNum, int numberOfDirections) {
        int numberOfDigits = (int) Math.ceil(Math.log10(keyNumber));
        int [] digits = new int[numberOfDigits]; // ������ ���� �������
        for (int i = numberOfDigits; i >=1 ; i--){
            digits[i-1] = keyNumber % 10;
            keyNumber /= 10;
        }


        Random random = new Random();
        int horIndex = 0;
        int verIndex = 0;
        for (int i = 0; i < 50; i++) {      //��������� ���� �� ������ ���������� ����� ������ �����
            horIndex = random.nextInt(horizontalNum); //������ ������ ����� �� �����������
            verIndex = random.nextInt(verticalNum); //������ ������ ����� �� ���������


            if (clueArray[verIndex][horIndex] != digits[0] && clueArray[verIndex][horIndex] != 0) { //���� ����� �� ���������� � ������ ��� �������, ��� ����� ��� ������ ����� ������, �� ��������� ���� ������
                continue;
            }
            boolean error = false;
            Random random2 = new Random();
            int randomDirection = random2.nextInt(numberOfDirections); //������� ��������� �����������
            if (randomDirection == 0) {                                 //���� ����������� 0, �� ����� ����� �� ��������� ����
                for (int j = 0; j < numberOfDigits; j++) {          //�������� ������ - ���� �� ������� ������ �� ����������� �����
                    if (verIndex + numberOfDigits > verticalNum || (clueArray[verIndex + j][horIndex] != 0 && clueArray[verIndex + j][horIndex] != digits[j])) {
                        error = true;                                   //���� ������ ������, �� ������
                        break;
                    }
                }
                if (error) continue;                                    //���� ������ �� ����� ������ ��������� �����
                for (int j = 0; j < numberOfDigits; j++) {             //���� ��� ������, �� ������� �����
                    clueArray[verIndex + j][horIndex] = digits[j];
                }
                break;

            } else if (randomDirection == 1) {                          //���� ����������� 1, �� ����� ����� �� ����������� ������
                for (int k = 0; k < numberOfDigits; k++) {
                    if (horIndex + numberOfDigits > horizontalNum || (clueArray[verIndex][horIndex + k] != 0 && clueArray[verIndex][horIndex + k] != digits[k])) {
                        error = true;
                        break;
                    }
                }
                if (error) continue;
                for (int k = 0; k < numberOfDigits; k++) {
                    clueArray[verIndex][horIndex + k] = digits[k];
                }
                break;
            } else if (randomDirection == 2) {                          //���� ����������� 2, �� ����� ����� �� ��������� �����
                for (int k = 0; k < numberOfDigits; k++) {
                    if (verIndex - numberOfDigits < 0 || (clueArray[verIndex - k][horIndex] != 0 && clueArray[verIndex - k][horIndex] != digits[k])) {
                        error = true;
                        break;
                    }
                }
                if (error) continue;
                for (int k = 0; k < numberOfDigits; k++) {
                    clueArray[verIndex - k][horIndex] = digits[k];
                }
                break;
            } else if (randomDirection == 3) {                          //���� ����������� 3, �� ����� ����� �� ����������� �����
                for (int k = 0; k < numberOfDigits; k++) {
                    if (horIndex - numberOfDigits < 0 || (clueArray[verIndex][horIndex - k] != 0 && clueArray[verIndex][horIndex - k] != digits[k])) {
                        error = true;
                        break;
                    }
                }
                if (error) continue;
                for (int k = 0; k < numberOfDigits; k++) {
                    clueArray[verIndex][horIndex - k] = digits[k];
                }
                break;
            } else if (randomDirection == 4) {                          //���� ����������� 4, �� ����� ����� �� ���������
                for (int k = 0; k < numberOfDigits; k++) {
                    if (verIndex + numberOfDigits > verticalNum || horIndex + numberOfDigits > horizontalNum || (clueArray[verIndex + k][horIndex + k] != 0 && clueArray[verIndex + k][horIndex + k] != digits[k])) {
                        error = true;
                        break;
                    }
                }
                if (error) continue;
                for (int k = 0; k < numberOfDigits; k++) {
                    clueArray[verIndex + k][horIndex + k] = digits[k];
                }
                break;
            } else if (randomDirection == 5) {                          //���� ����������� 5, �� ����� ����� �� ���������
                for (int k = 0; k < numberOfDigits; k++) {
                    if (verIndex - numberOfDigits < 0 || horIndex - numberOfDigits < 0 || (clueArray[verIndex - k][horIndex - k] != 0 && clueArray[verIndex - k][horIndex - k] != digits[k])) {
                        error = true;
                        break;
                    }
                }
                if (error) continue;
                for (int k = 0; k < numberOfDigits; k++) {
                    clueArray[verIndex - k][horIndex - k] = digits[k];
                }
                break;
            } else if (randomDirection == 6) {                          //���� ����������� 5, �� ����� ����� �� ���������
                for (int k = 0; k < numberOfDigits; k++) {
                    if (verIndex + numberOfDigits > verticalNum || horIndex - numberOfDigits < 0 || (clueArray[verIndex + k][horIndex - k] != 0 && clueArray[verIndex + k][horIndex - k] != digits[k])) {
                        error = true;
                        break;
                    }
                }
                if (error) continue;
                for (int k = 0; k < numberOfDigits; k++) {
                    clueArray[verIndex + k][horIndex - k] = digits[k];
                }
                break;
            } else if (randomDirection == 7) {                          //���� ����������� 5, �� ����� ����� �� ���������
                for (int k = 0; k < numberOfDigits; k++) {
                    if (verIndex - numberOfDigits < 0 || horIndex + numberOfDigits > horizontalNum || (clueArray[verIndex - k][horIndex + k] != 0 && clueArray[verIndex - k][horIndex + k] != digits[k])) {
                        error = true;
                        break;
                    }
                }
                if (error) continue;
                for (int k = 0; k < numberOfDigits; k++) {
                    clueArray[verIndex - k][horIndex + k] = digits[k];
                }
                break;
            }
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

    public static int[][] fillArrayWithRandomNumbers(int[][] intArray, int horizontalNum, int verticalNum) {

        for (int i = 0; i < horizontalNum; i++) {
            for (int j = 0; j < verticalNum; j++) {
                if (intArray[i][j] == 0) {
                    Random random = new Random();
                    intArray[i][j] = (int) random.nextInt(10);
                }
            }
        }
        return intArray;
    }

    public static void keyNumbersPrint(int[] keyNumbers, int numberOfKeyNumbers){
        for (int i : keyNumbers) {
            System.out.println(i);
        }
        int differenceNumberOfKeyNumbers = 25 - numberOfKeyNumbers;
        for (int i = 0; i < differenceNumberOfKeyNumbers; i++) {
            System.out.println();
        }

    }
}
