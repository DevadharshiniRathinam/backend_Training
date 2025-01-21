package Day15;

import java.util.*;
import java.util.stream.Collectors;
class Students{
    private String name;
    private String department;
    private double gpa;

    public Students(String name, String department, double gpa) {
        this.name = name;
        this.department = department;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public double getGpa() {
        return gpa;
    }
    @Override
    public String toString() {
        return "Student{name='" + name + "', department='" + department + "', gpa=" + gpa + "}";
    }
}
public class TopScore {
    public static void findTopScorerInEachDepartment(List<Student> students) {
        Map<String, Optional<Student>> topScorers = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Student::getGpa))
                ));
        topScorers.forEach((department, topScorer) -> {
            System.out.println("Department: " + department);
            topScorer.ifPresentOrElse(
                    student -> System.out.println("Top Scorer: " + student),
                    () -> System.out.println("No students in this department")
            );
        });
    }
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Priya", "CSE", 8.1),
                new Student("Ram", "IT", 9.34),
                new Student("Ravi", "CSBS", 7.6)
        );
        findTopScorerInEachDepartment(students);
    }
}

