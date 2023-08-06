import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test2 {
    public static void main(String[] args) throws IOException {
//        Path path= Paths.get("C:\\Users\\gamer\\Desktop\\Lesson.txt");
        Path path = Paths.get("Lesson1.txt");
        String[] text = Files.readAllLines(path).toArray(new String[0]);

        for (String element : text) {
            System.out.println(element);
        }
    }
}
