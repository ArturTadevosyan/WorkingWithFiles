package model;

public class Student {
    private String name;
    private int year;
    private double mark;

    public Student(String name, int year, double mark) {
        this.name = name;
        this.year = year;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return name + " " + year + " " + mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
