package lesson22;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriterRunner {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("resources", "writer.txt");

        Files.write(path, List.of("Hello M", "JAVAC"));
//        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path)) {
//
//            bufferedWriter.append("Hello World!");
//            bufferedWriter.newLine();
//            bufferedWriter.append("Java");
//            bufferedWriter.newLine();
//        }
    }
}
