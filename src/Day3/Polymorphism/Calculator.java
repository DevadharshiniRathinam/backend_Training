package Day3.Polymorphism;

public class Calculator {
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public void add(double a,double b)
    {
        System.out.println(a+b);
    }
    public void add(int a,int b,int c)
    {
        System.out.println(a+b+c);

    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(1,2);
        calc.add(2.4,3.5);
        calc.add(3,4);
    }
}
