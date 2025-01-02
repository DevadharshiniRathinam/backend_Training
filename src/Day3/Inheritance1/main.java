package Day3.Inheritance1;

class vehicle
{
    public void start()
    {
        System.out.println("start the vehicle");
    }
}
class car extends vehicle
{
    public void start()
    {
        System.out.println("start the car");
    }
}
public class main {
    public static void main(String[] args) {
        vehicle obj = new vehicle();
        obj.start();
        car obj2 = new car();
        obj2.start();
    }
}
