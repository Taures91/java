import java.util.Optional;
import java.util.stream.Stream;

public class OptionalExample {

    public static void main(String[] args) {
        Optional<Student> maybeStudent = Stream.of(
                        new Student(17, "Ivan"),
                        new Student(27, "Petr"),
                        new Student(28, "Psek"),
                        new Student(23, "Vova"),
                        new Student(24, "DIma"),
                        new Student(57, "Gena"),
                        new Student(76, "Ira"),
                        new Student(77, "Tanya"),
                        new Student(54, "Vanya"),
                        new Student(32, "Otto"),
                        new Student(44, "Leha")
                )
                .sequential()
//                .map(Student::getAge)
//                .flatMap(student -> student.getMarks().stream())
//                .map(mark -> )
                .filter(student -> student.getAge() > 18)
                .reduce((student, student2) -> student.getAge() > student2.getAge() ? student : student2);

//        maybeStudent.ifPresent(System.out::println);

        maybeStudent.map(Student::getAge)
                .flatMap(age -> Optional.of(age*2))
                .ifPresent(System.out::println);
    }
}
