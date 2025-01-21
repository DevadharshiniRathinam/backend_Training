package Day15;

import java.util.*;

class Student {
    private String name;
    private double gpa;

    // Constructor
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', gpa=" + gpa + "}";
    }
}

public class StudentSorting {
    public static void sorting(List<Student> students) {
        students.sort((s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa())); // Lambda for descending order
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("ravi", 6.5));
        students.add(new Student("ram", 6.19));
        students.add(new Student("deva", 8.87));
        sorting(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

