package chapter3;

public class LoopWithFewVariables {
    public static void main(String[] args) {
        int i, j;
        for (i = 0, j = 10; i < j; i++, j--){
            System.out.println("i = " + i + "; j = " + j);
        }
    }
}
