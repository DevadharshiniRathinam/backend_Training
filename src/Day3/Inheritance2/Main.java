package Day3.Inheritance2;

class Shape {
    public void Area() {
        System.out.println("Area of Shape");
    }
}

class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void Area() {
        System.out.println("Area of Rectangle: " + (width * height));
    }
}

class Square extends Shape {
    int side;

    public Square(int side) {
        this.side = side;
    }
    public void Area() {
        System.out.println("Area of Square: " + (side * side));
    }
}

public class Main{
    public static void main(String[] args) {
        Shape s = new Shape();
        s.Area();

        Rectangle r = new Rectangle(12, 4);
        r.Area();

        Square s1 = new Square(5);
        s1.Area();
    }
}
