package Day6.JavaLangObject;

public class Students implements Cloneable {
    int age;
    String name;
    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        try {
            Students s = new Students(20, "Sam");
            s.display();

            Students s2 = (Students)s.clone();
            s2.display();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


    }
}
