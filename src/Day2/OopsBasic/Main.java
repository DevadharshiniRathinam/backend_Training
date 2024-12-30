package Day2.OopsBasic;

class Animal {
    public void sound() {
        System.out.println(" Sound of the animal");
    }
}
class Dog extends Animal
{
    public void sound()
    {
        System.out.println("Dog Sound: woof woof");
    }
}
class Cat extends Animal {
    public void sound()
    {
System.out.println(" Cat sound: meow meow");
}
}
public class Main {
    public static void main(String[]  args)
    {

            Animal a=new Animal();
            a.sound();
            Dog a1=new Dog();
            a1.sound();
            Cat a2=new Cat();
            a2.sound();


    }
}
