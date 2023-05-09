package lesson22;

import java.util.ArrayList;
import java.util.Random;

public class Col {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        Random random = new Random();
        for (int i = 0; i <= 50; i++){
        int n = random.nextInt(list.size());
            int r = list.get(n);
            System.out.print(r);
        }
    }
}
