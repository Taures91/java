import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> strings = List.of("11", "22", "33", "44", "55", "88", "66", "99");

        IntSummaryStatistics intSummaryStatistics = strings.stream()
                .map(string -> string + string)
                .map(Integer::valueOf)
                .filter(value -> value % 2 == 0)
                .sorted()
                .skip(1)
                .limit(3)
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);

        List<String> collect = Stream.of("11", "22", "33", "44", "88")
                .peek(System.out::println)
                .collect(Collectors.toList());


        IntStream.of(11, 22, 33, 44, 55, 66);

        IntStream.range(0, 10)
                .forEach(System.out::println);

        IntStream.iterate(0, value -> value + 3)
                .skip(10)
                .limit(20)
                .forEach(System.out::println);



//        for (String string : strings) {
//            String value = string + string;
//            Integer intValue = Integer.valueOf(value);
//            if (intValue % 2 == 0){
//                System.out.println(intValue);
//            }
//        }
    }
}
