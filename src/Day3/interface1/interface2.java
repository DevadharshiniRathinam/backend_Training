package Day3.interface1;

interface Constants {
    double PI = 3.14;
}
class Circle implements Constants {
     int r;
    Circle(int r) {
        this.r = r;
    }
    void calculateArea() {
        double area = PI * r * r;
        System.out.println("Area of Circle: " + area);
    }
}
public class interface2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.calculateArea();
    }
}

