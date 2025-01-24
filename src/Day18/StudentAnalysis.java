package Day18;

import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    String department;
    List<Integer> marks;
    double averageMarks;
    char grade;

    public Student(String name, String department, List<Integer> marks) {
        this.name = name;
        this.department = department;
        this.marks = marks;
        this.averageMarks = calculateAverage();
        this.grade = assignGrade();
    }

    private double calculateAverage() {
        return marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    private char assignGrade() {
        if (averageMarks >= 90) return 'A';
        else if (averageMarks >= 75) return 'B';
        else if (averageMarks >= 50) return 'C';
        else return 'D';
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Dept: " + department + ", Avg: " + averageMarks + ", Grade: " + grade;
    }
}

public class StudentAnalysis {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("John", "Computer Science", Arrays.asList(85, 90, 80, 70, 75)),
                new Student("Alice", "Mathematics", Arrays.asList(88, 92, 84, 89, 90)),
                new Student("Bob", "Physics", Arrays.asList(45, 50, 40, 30, 35)),
                new Student("Eve", "Computer Science", Arrays.asList(95, 90, 94, 91, 88)),
                new Student("Charlie", "Mathematics", Arrays.asList(72, 65, 68, 70, 74)),
                new Student("David", "Physics", Arrays.asList(55, 60, 58, 62, 57)),
                new Student("Grace", "Mathematics", Arrays.asList(45, 48, 42, 38, 40))
        );

        System.out.println("Top 3 Students:");
        students.stream()
                .sorted(Comparator.comparingDouble(s -> -s.averageMarks))
                .limit(3)
                .forEach(System.out::println);

        System.out.println("\nGrades of All Students:");
        students.forEach(System.out::println);

        System.out.println("\nAverage Marks for Each Department:");
        students.stream()
                .collect(Collectors.groupingBy(s -> s.department, Collectors.averagingDouble(s -> s.averageMarks)))
                .forEach((dept, avgMarks) ->
                        System.out.println(dept + ": " + avgMarks)
                );

        System.out.println("\nTop Student in Each Department:");
        students.stream()
                .collect(Collectors.groupingBy(s -> s.department))
                .forEach((dept, deptStudents) -> {
                    Student topStudent = deptStudents.stream()
                            .max(Comparator.comparingDouble(s -> s.averageMarks))
                            .orElse(null);
                    System.out.println(dept + ": " + topStudent);
                });

        System.out.println("\nCount of Failed Students in Each Department:");
        students.stream()
                .collect(Collectors.groupingBy(s -> s.department, Collectors.filtering(s -> s.averageMarks < 50, Collectors.counting())))
                .forEach((dept, failCount) ->
                        System.out.println(dept + ": " + failCount)
                );
    }
}

