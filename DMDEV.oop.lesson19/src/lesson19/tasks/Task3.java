package lesson19.tasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
3. Написать метод isUnique, который принимает Map<String, String> и возвращает тру, если каждому
ключу соответствует сове уникальное значение.
Например, в данном случа вернется тру:
{Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}
А в данном слуае фолс:
{Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}

 */
public class Task3 {
    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("Marty", "Stepp");
//        map.put("Stuart", "Reges");
//        map.put("Jessica", "Miller");
//        map.put("Amanda", "Camp");
//        map.put("Hal", "Perkins");
        Map<String, String> map = Map.of(
                "Marty", "Stepp",
                "Stuart", "Reges",
                "Jessica", "Miller",
                "Amanda", "Camp",
                "Hal", "Perkins"
        );
        System.out.println(isUnique(map));
    }
    private static boolean isUnique (Map<String, String> map){
        
        return map.size() == new HashSet<>(map.values()).size();
    }
}
