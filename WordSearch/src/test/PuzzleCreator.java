package test;

import java.io.IOException;
import java.util.*;

public class PuzzleCreator {
    public static void main(String[] args) throws IOException {
        int horizontalNum = 19; //количество букв по горизонтали
        int verticalNum = 19; //количество букв по вертикали
        int numberOfWords = 15; // количество слов
        String dictName = "3-8 letters";

        int numberOfDirections = chooseLevel(); //выполнят выбор количества направлений для слов в зависимости от уровня сложности
        System.out.println("Введите количество кроссвордов: ");
        Scanner scan = new Scanner(System.in);
        int numberOfCrosswords = scan.nextInt(); //ввод количества кроссвордов
        for (int n = 0; n < numberOfCrosswords; n++) {
            char[][] cluePuzzle = createAndFillArrayWithSpaces(horizontalNum, verticalNum);   //заполнение массива пробелами

            String[] formattedWords = Words.getRandomWordsFromDictionary(dictName, numberOfWords, 3,8); // создание массива слов в отформатированном виде


            for (int i = 0; i <= numberOfWords - 1; i++) {              //цикл выполнения добавления слов в кроссворд
                keyWordAddToArray(cluePuzzle, formattedWords[i], horizontalNum, verticalNum, numberOfDirections);
            }
            System.out.println("PUZZLE #" + (n + 1));
            printCrossword(cluePuzzle); // вывод отгадки в консоль
            System.out.println();
            char[][] puzzle = fillArrayWithRandomChars(cluePuzzle, horizontalNum, verticalNum); //заполнение пустых ячеек латиницей
            printCrossword(puzzle); // вывод кроссворда в консоль
            System.out.println();
            keyWordsPrint(formattedWords, numberOfWords); // вывод списка ключевых слов
            System.out.println();
        }


    }

    public static String[] inputWordsFormatting(int numberOfWords) {
        System.out.println("Введите ключевые слова: ");
        Scanner wordsScanner = new Scanner(System.in); //сканер на ввод слов
        String inputWords = wordsScanner.nextLine(); //создание строки на основе введенных слов
        inputWords = inputWords.toUpperCase().replaceAll("[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]", ""); //перевести введенные слова в верхний регистр и удалить все лишние символы
        String[] formattedWords = inputWords.split(" "); // разделить введенные слова на отдельные слова. Ввод должен быть с разделителем "пробел"
        if (formattedWords.length < numberOfWords) {         //если недостаточно слов, выводится текст
            System.out.println("Введенных слов недостаточно");
        }
        String[] words = Arrays.copyOf(formattedWords, numberOfWords);  //если слов большем чем надо, массив обрезается до нужного количества
        System.out.println(Arrays.toString(words)); //вывести в консоль слова для проверки


        return formattedWords;
    }


    public static int[] randomStartPoint(int horizontalNum, int verticalNum) { // определение рандомной точки начала слова
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

    public static void printCrossword(char[][] charArray) { //вывод кроссворда в консоль в виде матрицы
        for (char[] chars : charArray) {
            for (char ar : chars) {
                System.out.print(ar + " ");
            }
            System.out.println();
        }
    }

    public static void keyWordAddToArray(char[][] charArray, String keyWord, int horizontalNum, int verticalNum, int numberOfDirections) {
        char[] word = keyWord.toCharArray(); //поделить слово на массив букв
        Random random = new Random();
        int horIndex = 0;
        int verIndex = 0;
        while (true) {      //выполнить цикл по поиску допустимой точки начала слова
            horIndex = random.nextInt(horizontalNum); //индекс начала слова по горизонтали
            verIndex = random.nextInt(verticalNum); //индекс начала слова по вертикали


            if (charArray[verIndex][horIndex] != word[0] && charArray[verIndex][horIndex] != ' ') { //если слово не поместится в строке или столбце, или место для первой буквы занято, то запустить цикл заново
                continue;
            }
            boolean error = false;
            Random random2 = new Random();
            int randomDirection = random2.nextInt(numberOfDirections); //создать рандомное направление

            switch (randomDirection) {
                case 0 -> {
                    for (int j = 0; j < (keyWord.length()); j++) {          //проверка циклом - есть ли занятые ячейки по направлению слова
                        if (verIndex + keyWord.length() > verticalNum || (charArray[verIndex + j][horIndex] != ' ' && charArray[verIndex + j][horIndex] != word[j])) {
                            error = true;                                   //если ячейки заняты, то ошибка
                            break;
                        }
                    }
                    if (error)
                        continue;                                    //если ошибка то поиск другой начальной точки
                    for (int j = 0; j < (keyWord.length()); j++) {             //если нет ошибки, то вписать слово
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

            /** старый вариант кода с if-else:

             if (randomDirection == 0) {                                 //если направление 0, то слово будет по вертикали вниз
             for (int j = 0; j < (keyWord.length()); j++) {          //проверка циклом - есть ли занятые ячейки по направлению слова
             if (verIndex + keyWord.length() > verticalNum || (charArray[verIndex + j][horIndex] != ' ' && charArray[verIndex + j][horIndex] != word[j])) {
             error = true;                                   //если ячейки заняты, то ошибка
             break;
             }
             }
             if (error) continue;                                    //если ошибка то поиск другой начальной точки
             for (int j = 0; j < (keyWord.length()); j++) {             //если нет ошибки, то вписать слово
             charArray[verIndex + j][horIndex] = word[j];
             }
             break;

             } else if (randomDirection == 1) {                          //если направление 1, то слово будет по горизонтали вправо
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
             } else if (randomDirection == 2) {                          //если направление 2, то слово будет по вертикали вверх
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
             } else if (randomDirection == 3) {                          //если направление 3, то слово будет по горизонтали влево
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
             } else if (randomDirection == 4) {                          //если направление 4, то слово будет по диагонали
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
             } else if (randomDirection == 5) {                          //если направление 5, то слово будет по диагонали
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
             } else if (randomDirection == 6) {                          //если направление 5, то слово будет по диагонали
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
             } else if (randomDirection == 7) {                          //если направление 5, то слово будет по диагонали
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
        System.out.println("Выберите уровень сложности: ");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        int level = scan.nextInt();
        int numberOfDirections = 0;
        switch (level) {
            case 1 -> numberOfDirections = 2;

//                System.out.println("Вы выбрали уровень 1. Easy");
            case 2 -> numberOfDirections = 4;

//                System.out.println("Вы выбрали уровень 2. Medium");
            case 3 -> numberOfDirections = 8;

//                System.out.println("Вы выбрали уровень 3. Hard");
            default -> {
            }
//                System.out.println("Такого уровня не существует");
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
