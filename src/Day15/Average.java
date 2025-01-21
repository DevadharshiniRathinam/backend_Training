package Day15;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
}
public class Average {
    public static double calculateAverageGpa(List<Student> students) {
        return students.stream()
                .mapToDouble(student -> student.getGpa())
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 3.8),
                new Student("Bob", 3.6),
                new Student("Charlie", 3.9),
                new Student("Diana", 3.7)
        );

        double averageGpa = calculateAverageGpa(students);
        System.out.println("Average GPA: " + averageGpa);
    }
}



