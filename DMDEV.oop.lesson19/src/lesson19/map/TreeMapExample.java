package lesson19.map;

import lesson19.person.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(29, "Petr", "Petrov");
        Person sveta = new Person(3, "Sveta", "Svetikova");
        Person sveta2 = new Person(30, "Sveta2", "Svetikova2");
        Person sveta3 = new Person(45, "Sveta3", "Svetikova3");
        Person oleg = new Person(4, "Oleg4", "Olegov");

        Map<Integer, Person> map = new TreeMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.putIfAbsent(sveta.getId(), sveta);
        map.putIfAbsent(sveta2.getId(), sveta2);
        map.putIfAbsent(sveta3.getId(), sveta3);
        map.put(oleg.getId(), oleg);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
