import java.util.Random;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        int horizontalNum = 15; //количество цифр по горизонтали
        int verticalNum = 15; //количество цифр по вертикали
        System.out.println("¬ведите количество кроссвордов: ");
        Scanner scan = new Scanner(System.in);
        int numberOfCrosswords = scan.nextInt(); //ввод количества кроссвордов

        for (int i = 0; i < numberOfCrosswords; i ++ ){
            char[][] emptyArray = new char[horizontalNum][verticalNum]; //создание массива символов
            char[][] filledArray = fillArrayWithRandomNumbers(emptyArray, horizontalNum, verticalNum);   //заполнение массива числами
            char[][] filledArrayWithBlackPoints = EnterBlackPoints(filledArray);
            System.out.println("PUZZLE #" + (i + 1));
            printPuzzle(filledArrayWithBlackPoints);
            System.out.println();
            String[] numbers = GetNumbersFromArray(filledArrayWithBlackPoints, horizontalNum, verticalNum);
//            System.out.println(Arrays.toString(numbers));
            printNumbers(numbers, horizontalNum, verticalNum);
        }
    }


    public static char[][] fillArrayWithRandomNumbers(char[][] emptyArray, int horizontalNum, int verticalNum) {

        for (int i = 0; i < horizontalNum; i++) {
            for (int j = 0; j < verticalNum; j++) {
                if (emptyArray[i][j] == 0) {
                    Random random = new Random();
                    emptyArray[i][j] = (char) (random.nextInt(10) + 48);
                }
            }
        }
        return emptyArray;
    }

    public static void printPuzzle(char[][] Array) { //вывод кроссворда в консоль в виде матрицы
        for (char[] i : Array) {
            for (char ar : i) {
                System.out.print(ar + " ");
            }
            System.out.println();
        }
    }

    public static char[][] EnterBlackPoints (char [][] Array){
        char point = ' ';
        Array[0][5] = point;
        Array[0][10] = point;
        Array[1][5] = point;
        Array[1][10] = point;
        Array[2][10] = point;
        Array[3][3] = point;
        Array[3][7] = point;
        Array[4][4] = point;
        Array[4][8] = point;
        Array[4][13] = point;
        Array[4][14] = point;
        Array[5][0] = point;
        Array[5][1] = point;
        Array[5][2] = point;
        Array[5][5] = point;
        Array[6][6] = point;
        Array[7][7] = point;
        Array[8][8] = point;
        Array[8][12] = point;
        Array[8][13] = point;
        Array[8][14] = point;
        Array[9][9] = point;
        Array[10][0] = point;
        Array[10][1] = point;
        Array[10][6] = point;
        Array[10][10] = point;
        Array[11][7] = point;
        Array[11][11] = point;
        Array[12][4] = point;
        Array[13][4] = point;
        Array[13][9] = point;
        Array[14][4] = point;
        Array[14][9] = point;
        return Array;
    }

    public static String [] GetNumbersFromArray(char[][] filledArrayWithBlackPoints, int horizontalNum, int verticalNum){
        int amountOfKeyNumbers = 76;
        String [] keyNumbers = new String[horizontalNum+verticalNum];
        char[] digits = new char[horizontalNum];
        for (int i = 0; i < verticalNum; i++){
            for (int j = 0; j < horizontalNum; j++){

                    digits [j] = filledArrayWithBlackPoints[i][j];

                    
            }
            StringBuilder sb1 = new StringBuilder(String.valueOf(digits));
//            keyNumbers[i] = Arrays.toString(String.valueOf(sb1).split(" "));
            keyNumbers[i] = sb1.toString();
        }
        for (int i = 0; i < horizontalNum; i++){
            for (int j = 0; j < verticalNum; j++){

                digits [j] = filledArrayWithBlackPoints[j][i];

            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(digits));
//            keyNumbers[i + horizontalNum] = Arrays.toString(String.valueOf(sb2).split(" "));
            keyNumbers[i + horizontalNum] = sb2.toString();

        }


        return keyNumbers;
    }

    public static void printNumbers (String[] numbers, int horizontalNum, int verticalNum){
        int counter = 0;
        for (int i = 0; i < numbers.length; i ++ ){
                    String[] num1 = numbers[i].split(" ");
                    counter = num1.length;
            for (int j = 0; j < counter; j++) {
                String[] num = numbers[i].split(" ");
                System.out.println(num[j]);
            }

        }

}
}
