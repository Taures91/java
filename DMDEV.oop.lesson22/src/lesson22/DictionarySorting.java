package lesson22;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DictionarySorting {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "dict.txt");
        try (Stream<String> words = Files.lines(path)) {
            Path newPath = Path.of("resources", "sorted dict.txt");

            Stream<String> stream = words.filter(text -> text.length() <= 8 && text.length() >= 3);
            Files.write(newPath, stream.collect(Collectors.toList()));

//            int size = sortedList.size();
//            System.out.println("Size of sorted base is: " + size + " words");
//            Random random = new Random();
//            int numberOfWords = 10;
//            for (int i = 0; i < numberOfWords; i++) {
//                int num = random.nextInt(size);
//                System.out.println("Random number is:" + num);
//                System.out.println("Random word from base is: " + sortedList.get(num));
//            }

        }

    }
}
