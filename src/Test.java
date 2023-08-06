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

        if (convert != null) {
            Student studentMaxAge = StudentService.maxAge(convert);
            Student studentMaxMark = StudentService.maxMArk(convert);
            if (studentMaxAge != null) {
                FileService.write(URL, "\nMax Age = " + studentMaxAge.toString());
            }

            if (studentMaxMark != null) {
                FileService.write(URL, "\nMax Mark = " + studentMaxMark.toString());
            }
        } else {
            System.out.println("Read file is empty");
        }


    }

}
