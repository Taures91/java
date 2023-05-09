package WordSearch.src.test;

import java.util.Random;

public class ArrayFillingWithRandomLetters {
    public static void main(String[] args) {


        int horizontalNum = 10; //количество букв по горизонтали
        int verticalNum = 10; //количество букв по вертикали
        char charArray[][] = new char[horizontalNum][verticalNum];
        Random random = new Random();
        for (int i = 0; i < horizontalNum; i++) {
            for (int j = 0; j < verticalNum; j++) {
                char letter = (char) (random.nextInt(25) + 65);
                charArray[i][j] = letter;
            }
        }


    }
}
