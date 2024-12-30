package Day2.thisKeyword;

public class Employee {
    int id;
    String name;
    double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
    public static void main(String[] args)
    {
        Employee emp = new Employee(1, "deva", 50000.0);
        emp.display();
    }
}
