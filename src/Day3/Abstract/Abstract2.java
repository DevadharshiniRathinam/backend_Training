package Day3.Abstract;

abstract class Appliance {
    abstract void turnOn();
    void turnOff() {
        System.out.println("Appliance is turned off.");
    }
}
class Fan extends Appliance {
    void turnOn() {
        System.out.println("Fan is turned on.");
    }
}
public class Abstract2 {
    public static void main(String[] args) {
        Appliance appliance = new Fan();
        appliance.turnOn();
        appliance.turnOff();
    }
}

