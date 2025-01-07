package Day3.Inheritance2;
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Meow");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.sound();

        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
    }
}
