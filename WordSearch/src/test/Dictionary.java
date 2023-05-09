package test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dictionary {
    public static void main(String[] args) throws IOException {
        createNewDictionaryWithFilter("engmix", 3, 8, "3-8 letters");
    }

    public static void createNewDictionaryWithFilter(String dictName, int minLength, int maxLength, String newDictName) throws IOException {
        String fileType = ".txt";
        Path path = Path.of("resources", dictName + fileType);
        try (Stream<String> words = Files.lines(path, StandardCharsets.UTF_8)) {

            Path newPath = Path.of("resources", newDictName + fileType);
            Stream<String> stream = words.filter(word -> word.length() >= minLength && word.length() <= maxLength);
        Files.write(newPath, stream.collect(Collectors.toList()), StandardCharsets.UTF_8);
        }

    }
}
