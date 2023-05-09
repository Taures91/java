package lesson19.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> list1 = new ArrayList<>(list);



        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            Integer next = iterator.next();
            System.out.println(next);
        }

        for (Iterator<Integer> iterator = list1.iterator(); iterator.hasNext(); ) {
            Integer next = iterator.next();
            if (next == 3 || next ==4){
                iterator.remove();
            }
        }

        System.out.println(list1);

        list1.forEach(System.out::println);



        //for each - Только для чтения
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }
    }
}
