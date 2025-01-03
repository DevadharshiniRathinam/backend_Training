package Day5.AccessModifier;

public class Employee extends Person {
    public void display() {
        System.out.println("name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Address:"+address);
    }
    public static void main(String[] args) {
        Employee e=new Employee();
        e.display();

    }
}
