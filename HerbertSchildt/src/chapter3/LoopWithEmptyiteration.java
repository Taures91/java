package chapter3;

public class LoopWithEmptyiteration {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10;){
            System.out.println("Проход №" + i);
            i++;
        }

        System.out.println();
        
        i = 0;
        for (; i < 10; ){
            System.out.println("Проход №" + i);
            i++;
        }
    }
}
