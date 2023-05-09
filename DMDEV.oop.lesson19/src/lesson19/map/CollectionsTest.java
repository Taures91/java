package lesson19.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {

    List<Integer> list2 = new ArrayList<>();
    list2.add(2);
    list2.add(35);
    list2.add(14);
    list2.add(5);
        Collections.sort(list2);
   
        System.out.println(list2);
    }

}
