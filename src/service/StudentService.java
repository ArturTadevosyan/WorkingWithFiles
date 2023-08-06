package service;

import model.Student;

import java.io.IOException;

public class StudentService {

    public static Student[] convert(String[] text) {
        if (text.length != 0) {
            Student[] students = new Student[text.length];
            for (int i = 0; i < text.length; i++) {
                students[i] = new Student(text[i]);
            }
            return students;
        } else {
            System.out.println("Not Correct String Array ( array is empty ) , return null ");
            return null;
        }
    }

    public static Student maxAge(Student[] students) {
        if (students.length != 0) {
            Student max = students[0];
            for (int i = 1; i < students.length; i++) {
                if (students[i].getYear() < max.getYear()) {
                    max = students[i];
                }
            }
            return max;
        } else {
            System.out.println("Not Correct Student Array (array is empty) , return null ");
            return null;
        }
    }

    public static Student maxMArk(Student[] students) {
        Student maxMark = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getMark() > maxMark.getMark()) {
                maxMark = students[i];
            }
        }
        return maxMark;
    }

    public static void createStudentFileByName(String url, String[] text) throws IOException {
        for (String s : text) {
            String studentName = new Student(s).getName();
            String newUrl = url + studentName;
            FileService.createFile(newUrl, s);
        }
    }

}
