@FunctionalInterface
interface StudentFactory
{
    Student5 create(String name, int marks);
}

class Student5
{
    private String name;
    private int marks;
    Student5(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString()
    {
        return  "name=" + name + ", marks=" + marks ;
    }
}

public class Method_reference_constructor {
public static void main(String[] args) {
    StudentFactory studentFactory = Student5::new;
    Student5 student1 = studentFactory.create("Deva", 95);
    Student5 student2 = studentFactory.create("Priya", 92);
    System.out.println(student1);
    System.out.println(student2);

}

}