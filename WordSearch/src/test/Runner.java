package WordSearch.src.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        int horizontalNum = 10; //количество букв по горизонтали
        int verticalNum = 10; //количество букв по вертикали
        char charArray[][] = new char[horizontalNum][verticalNum]; //создание массива символов
        String [] formattedWords = inputWordsFormatting(); // создание массива слов в отформатированном виде

        
        charArray = keyWordAddToArrayWithRandomDirection(charArray, formattedWords[0], horizontalNum, verticalNum); //внесение в массив первого слова
//        charArray = keyWordAddToArrayWithRandomDirection(charArray, formattedWords[1], horizontalNum, verticalNum); //внесение в массив первого слова
//        charArray = keyWordAddToArrayWithRandomDirection(charArray, formattedWords[2], horizontalNum, verticalNum); //внесение в массив первого слова
//        charArray = keyWordAddToArrayWithRandomDirection(charArray, formattedWords[3], horizontalNum, verticalNum); //внесение в массив первого слова


        printCrossword(charArray); // вывод кроссворда в консоль


    }

    public static String[] inputWordsFormatting(){
        System.out.println("Введите ключевые слова: ");
        Scanner wordsScanner = new Scanner(System.in); //сканер на ввод слов
        String inputWords = wordsScanner.nextLine(); //создание строки на основе введенных слов
        inputWords = inputWords.toUpperCase().replaceAll("[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]", ""); //перевести введенные слова в верхний регистр и удалить все лишние символы
        String[] formattedWords = inputWords.split(" "); // разделить введенные слова на отдельные слова. Ввод должен быть с разделителем "пробел"
        System.out.println(Arrays.toString(formattedWords)); //вывести в консоль слова для проверки 
        return formattedWords;
    }
    public static int[] randomStartPoint (int horizontalNum, int verticalNum){ // определение рандомной точки начала слова
        int[] point = new int[2]; //создание массива с координатами первой буквы слова
        Random random = new Random();
        int startPointHorizontal = random.nextInt(horizontalNum); //выбор рандомной точки начала по горизонтали
//        System.out.println(startPointHorizontal);
        int startPointVertical = random.nextInt(verticalNum); //выбор рандомной точки начала по вертикали
//        System.out.println(startPointVertical);
        point[0] = startPointHorizontal;    //внесение полученых координат в массив
        point[1] = startPointVertical;      //внесение полученых координат в массив
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
    public static void printCrossword(char charArray[][]){ //вывод кроссворда в консоль в виде матрицы
        for (char[] chars : charArray) {
            for (char ar : chars) {
                System.out.print(ar + " ");
            }
            System.out.println();
        }
    }

    public static char[][] keyWordAddToArrayWithRandomDirection(char charArray[][], String keyWord, int horizontalNum, int verticalNum){
        char[] word = keyWord.toCharArray(); //поделить слово на массив букв
        Random random = new Random();
        int horIndex = 0;
        int verIndex = 0;
        for (int i = 0; i < 20; i++) {      //выполнить цикл по поиску допустимой точки начала слова
            horIndex = random.nextInt(horizontalNum); //индекс начала слова по горизонтали
            verIndex = random.nextInt(verticalNum); //индекс начала слова по вертикали
            if (horIndex + keyWord.length() > horizontalNum || verIndex + keyWord.length() > verticalNum) { //если слово не поместится в строке, то запустить цикл заново
                continue;
            }
            charArray[verIndex][horIndex] = word[0]; //если слово поместится, то вставить первую букву ключевого слова
            break; //и не продолжать цикл дальше
        }

        Random random2 = new Random(); // создание рандома
        int randomDirection = random2.nextInt(2); // рандом 0 или 1
        if (randomDirection == 0){                          //если 0, то слово пойдет по вертикали
            for (int i = 0; i < (keyWord.length()-1); i++){
                charArray[verIndex+1+i][horIndex] = word[1+i];
            }
        } else {                                            //если 1, то по горизонтали
            for (int i = 0; i < (keyWord.length()-1); i++){
                charArray[verIndex][horIndex+1+i] = word[1+i];
            }
        }
        return charArray;
    }
}
