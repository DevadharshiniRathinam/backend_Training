package Day3.interface1;

interface Animal {
    void eat();
    void sleep();
}
class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating.");
    }
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
}
class Cat implements Animal {
    public void eat() {
        System.out.println("Cat is eating.");
    }
    public void sleep() {
        System.out.println("Cat is sleeping.");
    }
}
public class Interface1 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();
        Animal cat = new Cat();
        cat.eat();
        cat.sleep();
    }
}

