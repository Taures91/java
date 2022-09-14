package lesson6;

public class WhileExample {
    public static void main(String[] args) {
      int value1 = 0;
      do {
          System.out.println(value1);
          value1 ++;
      } while (value1 < 10);

    }

    private static void WhileExample() {
        int value = 10;
        while (value > 0) {
            System.out.println(value);
            value --;

        }
    }
}
