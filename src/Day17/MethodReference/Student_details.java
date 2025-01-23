import java.util.ArrayList;
import java.util.List;

public class Student_details {
    private String name;
    private int mark;
    Student_details(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
    public void displayStudentDetails() {
        System.out.println("Name: " + name + ",  Mark: " + mark);

    }

}
class Main7
{
    public static void main(String args[])
    {
        List<Student_details> list = new ArrayList<Student_details>();
        list.add(new Student_details("James", 82));
        list.add(new Student_details("Bob", 90));
        list.add(new Student_details("John", 80));
        list.forEach(Student_details::displayStudentDetails);
    }
}
