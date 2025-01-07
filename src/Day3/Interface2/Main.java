package Day3.Interface2;

interface Vehicle {
    void start();
}
interface FourWheeler extends Vehicle {
    void fourWheelerFeature();
}
interface TwoWheeler extends Vehicle {
    void twoWheelerFeature();
}
class Car implements FourWheeler {
    public void start() {
        System.out.println("Car start");
    }
    public void fourWheelerFeature() {
        System.out.println("Car has four wheel");
    }
}
class Bike implements TwoWheeler {
    public void start() {
        System.out.println("Bike is start");
    }
    public void twoWheelerFeature() {
        System.out.println("Bike has two wheel");
    }
}
public class Main {
    public static void main(String[] args) {
        FourWheeler car = new Car();
        car.start();
        car.fourWheelerFeature();
        TwoWheeler bike = new Bike();
        bike.start();
        bike.twoWheelerFeature();
    }
}

