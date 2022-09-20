package chapter2;

public class PromDemo {
    public static void main(String[] args) {
        byte b;
        double a = 1.8;
        int i;
        b = 120;
        i = b + 15;
        System.out.println("i = " + i);

        i = (int) a;
        System.out.println(i);

        for(i = 0; i < 5; i++){
            System.out.println(i + " / 3: " + i / 3);
            System.out.println(i + " / 3 с дробной частью: " + (double) i / 3);
            System.out.println();
        }
    }
}
