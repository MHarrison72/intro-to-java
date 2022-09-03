package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadDataFromFile {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/main/resources/test.csv");

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String> lines = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            lines.add(line);
        }

        Path path = Paths.get("src/main/resources/test.csv");
        List<String> lines1 = Files.readAllLines(path, StandardCharsets.UTF_8);
        System.out.println(lines1);
    }
}