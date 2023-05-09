import java.util.stream.Stream;

public class MapReduceExample {

    public static void main(String[] args) {
        Stream.of(
                new Student(17, "Ivan"),
                new Student(27, "Petr"),
                new Student(28, "Psek"),
                new Student(23, "Vova"),
                new Student(24, "DIma"),
                new Student(57, "Gena"),
                new Student(76, "Ira"),
                new Student(77, "Tanya"),
                new Student(54, "Vanya"),
                new Student(32, "Otis"),
                new Student(44, "Leha")
        )
                .sequential()
                .map(Student::getAge)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }
}
