import model.Student;
import service.FileService;
import service.StudentService;

import java.io.IOException;

public class Test {
    private static final String URL = "Lesson.txt";

    public static void main(String[] args) throws IOException {
        String[] fileReadInfo = FileService.read(URL);
        Student[] students = StudentService.convert(fileReadInfo);

        StudentService.createStudentFileByName("", fileReadInfo);

        if (students != null) {
            Student eldestStudent = StudentService.eldestStudent(students);
            Student studentByMaxMark = StudentService.maxByMark(students);
            if (eldestStudent != null) {
                FileService.write(URL, "\nMax Age = " + eldestStudent.toString());
            }

            if (studentByMaxMark != null) {
                FileService.write(URL, "\nMax Mark = " + studentByMaxMark.toString());
            }
        } else {
            System.out.println("Read file is empty");
        }


    }

}
