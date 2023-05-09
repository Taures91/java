import java.util.*;

public class lists {
    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    list.set(1, 4);
    list.add(8);
    int index = 4;
        int integer = list.get(index);
        Collections.shuffle(list);

        System.out.println(list);
        System.out.println(integer);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(10);
        list1.add(6);
        list1.add(8);
        list1.add(5);

        int i = 5;
        System.out.println(list1);
        System.out.println(list1.contains(i));
    }
}
