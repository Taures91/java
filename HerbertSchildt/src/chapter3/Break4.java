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
                        System.out.println("\ni ����� " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;
                        System.out.println("��� ������ �� ����� ��������");
                    } System.out.println("����� ����� Three");
                }System.out.println("����� ����� Two");
            }System.out.println("����� ����� One");
        } System.out.println("����� ����� For");
    }
}
