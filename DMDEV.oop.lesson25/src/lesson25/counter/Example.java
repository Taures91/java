package lesson25.counter;

import java.util.ArrayList;
import java.util.List;

public class Example {
    private List<Integer> list;

    public Example(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> getList() {
        return new ArrayList<>(list); //возвращает новый неизменяемый(immutable) список
    }
}
