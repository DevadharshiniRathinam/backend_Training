package Day2.Constructors;

public class Student
{
    int age;
    String name;
    public Student(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args)
    {
        Student s=new Student(19,"Ram");
        s.display();
    }
}
