package lesson19;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Vova");
        list.add("Dima");
        list.add("Di");
        list.add("Olya");
        list.add("Tanya");
        list.add(3, "14");
        list.set(3,"ggg");

        System.out.println(list);
        System.out.println(list.get(2));
    }
}
