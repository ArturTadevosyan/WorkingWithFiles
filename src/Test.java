import model.Student;
import service.FileService;
import service.StudentService;

import java.io.IOException;

public class Test {
    private static final String URL = "Lesson1.txt";

    public static void main(String[] args) throws IOException {
        String[] read = FileService.read(URL);
        Student[] convert = StudentService.convert(read);

        StudentService.createStudentFileByName("", read);
        Student studentMaxAge = StudentService.maxAge(convert);
        Student studentMaxMark = StudentService.maxMArk(convert);


        FileService.write(URL, "\nmaxAge = " + studentMaxAge.toString());
        FileService.write(URL, "\nmaxMark = " + studentMaxMark.toString());

    }

}
