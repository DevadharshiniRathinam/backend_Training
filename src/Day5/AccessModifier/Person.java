package Day5.AccessModifier;

public class Person {
    public String name="kaviya";
    protected int age=22;
    String address="201, mettur main road";
    private  int salary=20000;

     public void display(){
         System.out.println("Name: "+name);
         System.out.println("Age: "+age);
         System.out.println("Address: "+address);
         System.out.println("Salary: "+salary);
     }
    public static void main(String[] args) {
         Person p = new Person();
        p.display();
    }
}
