package Day3.Abstract;

abstract class Shape {
    abstract void calculateArea();
}
class Circle extends Shape {
    double r;
    Circle(double r) {
        this.r = r;
    }
    void calculateArea() {
        double area = 3.14* r* r;
        System.out.println("Area of Circle: " + area);
    }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
public class Abstract1 {
    public static void main(String[] args) {
        Shape shape;
        shape = new Circle(5);
        shape.calculateArea();
        shape = new Rectangle(4, 6);
        shape.calculateArea();
    }
}

