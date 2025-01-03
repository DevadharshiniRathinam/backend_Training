package Day5.Accessmodifier1;
import Day5.AccessModifier.*;
public class TestAccess extends Person{
    public void display() {
        System.out.println("name:"+name);
        System.out.println("Age:"+age);
    }
    public static void main(String[] args) {
        TestAccess t=new TestAccess();
        t.display();

    }

}
