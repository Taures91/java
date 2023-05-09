package lesson19.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
        //по алфавиту
//        Set<String> set = new TreeSet<>();
        //по порядку добавления
        Set<String> set = new LinkedHashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("kkk");
        set.add("ddd");

        System.out.println(set);
    }
}
