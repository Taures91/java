package chapter3;

public class Break4 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i < 4; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni равно " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;
                        System.out.println("Эта строка не будет выведена");
                    } System.out.println("После блока Three");
                }System.out.println("После блока Two");
            }System.out.println("После блока One");
        } System.out.println("После цикла For");
    }
}
