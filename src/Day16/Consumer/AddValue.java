package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Student3 {
    String name;
    int grade;

    public Student3(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void display() {
        System.out.println(name + ": " + grade);
    }
}

public class AddValue {

    public void modifyGrades(List<Student3> students, Consumer<Student3> consumer) {
        for (Student3 student : students) {
            consumer.accept(student);
        }
    }

    public static void main(String[] args) {
        List<Student3> students = new ArrayList<>();
        students.add(new Student3("John", 70));
        students.add(new Student3("Alice", 60));

        Consumer<Student3> Grade = student -> student.setGrade(student.getGrade() + 10);

        AddValue modifyGrades = new AddValue();
        modifyGrades.modifyGrades(students,Grade);

        for (Student3 student : students) {
            student.display();
        }
    }
}

