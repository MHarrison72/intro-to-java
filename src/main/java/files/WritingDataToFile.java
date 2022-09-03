package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/*
    https://howtodoinjava.com/java/io/how-to-create-a-new-file-in-java/
    https://www.baeldung.com/java-write-to-file
 */
public class WritingDataToFile {

    public static void main(String[] args) throws IOException {

        Path directory = Paths.get("out/writeFile/");

        Files.createDirectory(directory);

        String str = "Hello World";

        Path writeStringPath = Paths.get(directory + "/writeString.txt");

        Files.createFile(writeStringPath);

        Files.writeString(writeStringPath, str);

        List<String> list = new ArrayList<>();
        list.add("id,age,nickname,favoriteColor");
        list.add("0,12,Billy,red");
        list.add("1,85,Johnny,gold");
        list.add("2,27,Jackie,purple");

        Path writeListPath = Paths.get(directory + "/writeList.csv");

        Files.createFile(writeListPath);

        Files.write(writeListPath, list);

        //clean up the files
        Files.delete(writeStringPath);
        Files.delete(writeListPath);
        Files.delete(directory);
    }
}