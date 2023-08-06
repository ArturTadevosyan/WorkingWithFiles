package service;

import model.Student;

import java.io.IOException;

public class StudentService {

    public static Student[] convert(String[] studentsString) {
        if (studentsString.length != 0) {
            Student[] students = new Student[studentsString.length];
            for (int i = 0; i < studentsString.length; i++) {
                students[i] = getStudent(studentsString[i]);
            }
            return students;
        } else {
            System.out.println("Not Correct String Array ( array is empty ) , return null ");
            return null;
        }
    }

    public static Student eldestStudent(Student[] students) {
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

    public static Student maxByMark(Student[] students) {
        if (students.length != 0) {
            Student max = students[0];
            for (int i = 1; i < students.length; i++) {
                if (students[i].getMark() > max.getMark()) {
                    max = students[i];
                }
            }
            return max;
        } else {
            System.out.println("Not Correct Student Array (array is empty) , return null ");
            return null;
        }
    }

    public static void createStudentFileByName(String url, String[] studentInfo) throws IOException {
        for (String info : studentInfo) {
            String studentName = getStudent(info).getName();
            String newUrl = url + studentName;
            FileService.createFile(newUrl, info);
        }
    }

    public static Student getStudent(String studentInfo) {
        String[] strings = studentInfo.split(",");
        String name = strings[0];
        int year = Integer.parseInt(strings[1]);
        double mark = Double.parseDouble(strings[2]);
        return new Student(name, year, mark);
    }

}
