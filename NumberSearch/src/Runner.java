package test;


import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        int horizontalNum = 19; //количество цифр по горизонтали
        int verticalNum = 19; //количество цифр по вертикали
        int amountOfKeyNumbers = 20; // количество чисел
        int numberOfDirections = chooseLevel(); //выполнят выбор количества направлений для слов в зависимости от уровня сложности
        System.out.println("Введите количество кроссвордов: ");
        Scanner scan = new Scanner(System.in);
        int amountOfCrosswords = scan.nextInt(); //ввод количества кроссвордов
        for(int n = 0; n < amountOfCrosswords; n++) {
            int[][] clueArray = new int[horizontalNum][verticalNum]; //создание массива символов
            fillArrayWithSpaces(clueArray, horizontalNum, verticalNum);   //заполнение массива пробелами
            int [] keyNumbers = generateKeyNumbers(amountOfKeyNumbers,4,10); // создание массива ключевых чисел (количество чисел, минимальная длина чисел, количество чисел в группе)



            for (int i = 0; i <= amountOfKeyNumbers - 1; i++) {              //цикл выполнения добавления слов в кроссворд
                keyNumberAddToArrayWithRandomDirection(clueArray, keyNumbers[i], horizontalNum, verticalNum, numberOfDirections);
            }
            System.out.println("PUZZLE #" + (n + 1));
            printCrossword(clueArray); // вывод отгадки в консоль
            System.out.println();
            int[][] intArray = fillArrayWithRandomNumbers(clueArray, horizontalNum, verticalNum); //заполнение пустых ячеек латиницей
            printCrossword(intArray); // вывод кроссворда в консоль
            System.out.println();
            keyNumbersPrint(keyNumbers, amountOfKeyNumbers); // вывод списка ключевых слов
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

    public static String[] inputWordsFormatting(String[] wordsFromBase) {
        for (int i = 0; i < wordsFromBase.length; i++) {
            wordsFromBase[i] = wordsFromBase[i].toUpperCase();//перевести введенные слова в верхний регистр
        }
//        System.out.println(Arrays.toString(wordsFromBase)); //вывести в консоль слова для проверки
        return wordsFromBase;
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

    public static void fillArrayWithSpaces(int[][] charArray, int horizontalNum, int verticalNum) {

        for (int i = 0; i < horizontalNum; i++) {
            for (int j = 0; j < verticalNum; j++) {
                charArray[i][j] = 0;
            }
        }
    }

    public static void printCrossword(int[][] charArray) { //вывод кроссворда в консоль в виде матрицы
        for (int[] i : charArray) {
            for (int ar : i) {
                System.out.print(ar + " ");
            }
            System.out.println();
        }
    }

    public static int [] generateKeyNumbers (int numberOfKeyNumbers, int minLengthOfKeyNumbers, int numbersInCategory){
//        numberOfKeyNumbers = 25;  // общее количество ключевых номеров в кроссворде
//        minLengthOfKeyNumbers = 5;  //минимальная длина ключевого слова
//        numbersInCategory = 7;      // количество ключевых номеров одинаковой длины
        int[] keyNumbers = new int[numberOfKeyNumbers]; //массив ключевых слов
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
                if ((i + (numbersInCategory * f) == numberOfKeyNumbers)){  //если уже набрано общее количество номеров, то остановить цикл
                    break;
                }
                keyNumbers[i + (numbersInCategory * f)] = result;
            }
        }

        return keyNumbers;
    }

    public static void keyNumberAddToArrayWithRandomDirection(int [][] clueArray, int keyNumber, int horizontalNum, int verticalNum, int numberOfDirections) {
        int numberOfDigits = (int) Math.ceil(Math.log10(keyNumber));
        int [] digits = new int[numberOfDigits]; // массив цифр создать
        for (int i = numberOfDigits; i >=1 ; i--){
            digits[i-1] = keyNumber % 10;
            keyNumber /= 10;
        }


        Random random = new Random();
        int horIndex = 0;
        int verIndex = 0;
        for (int i = 0; i < 50; i++) {      //выполнить цикл по поиску допустимой точки начала слова
            horIndex = random.nextInt(horizontalNum); //индекс начала слова по горизонтали
            verIndex = random.nextInt(verticalNum); //индекс начала слова по вертикали


            if (clueArray[verIndex][horIndex] != digits[0] && clueArray[verIndex][horIndex] != 0) { //если слово не поместится в строке или столбце, или место для первой буквы занято, то запустить цикл заново
                continue;
            }
            boolean error = false;
            Random random2 = new Random();
            int randomDirection = random2.nextInt(numberOfDirections); //создать рандомное напарвление
            if (randomDirection == 0) {                                 //если направление 0, то слово будет по вертикали вниз
                for (int j = 0; j < numberOfDigits; j++) {          //проверка циклом - есть ли занятые ячейки по направлению слова
                    if (verIndex + numberOfDigits > verticalNum || (clueArray[verIndex + j][horIndex] != 0 && clueArray[verIndex + j][horIndex] != digits[j])) {
                        error = true;                                   //если ячейки заняты, то ошибка
                        break;
                    }
                }
                if (error) continue;                                    //если ошибка то поиск другой начальной точки
                for (int j = 0; j < numberOfDigits; j++) {             //если нет ошибки, то вписать слово
                    clueArray[verIndex + j][horIndex] = digits[j];
                }
                break;

            } else if (randomDirection == 1) {                          //если направление 1, то слово будет по горизонтали вправо
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
            } else if (randomDirection == 2) {                          //если направление 2, то слово будет по вертикали вверх
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
            } else if (randomDirection == 3) {                          //если направление 3, то слово будет по горизонтали влево
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
            } else if (randomDirection == 4) {                          //если направление 4, то слово будет по диагонали
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
            } else if (randomDirection == 5) {                          //если направление 5, то слово будет по диагонали
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
            } else if (randomDirection == 6) {                          //если направление 5, то слово будет по диагонали
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
            } else if (randomDirection == 7) {                          //если направление 5, то слово будет по диагонали
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
