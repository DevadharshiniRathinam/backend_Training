package Day7.Reflection;

public class Person {
    private String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void print()
    {
        System.out.println(name);
        System.out.println(age);
    }
    public void display()
    {
        System.out.println("Enter name and age:");
    }
    public static void main(String[] args) {
        Person person = new Person("John", 20);

        person.display();
        person.print();
    }
}
