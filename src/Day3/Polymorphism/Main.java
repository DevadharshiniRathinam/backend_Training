package Day3.Polymorphism;
class Employee {
    void calculateSalary() {
        System.out.println("Calculating salary for employee");
    }
}
class Manager extends Employee {
    void calculateSalary() {
        System.out.println("Manager's Salary: $80,000 per year");
    }
}
class Developer extends Employee {
    void calculateSalary() {
        System.out.println("Developer's Salary: $70,000 per year");
    }
}
public class Main {
    public static void main(String[] args) {

        Employee e= new Manager();
        e.calculateSalary();
        e= new Developer();
        e.calculateSalary();
    }
}

