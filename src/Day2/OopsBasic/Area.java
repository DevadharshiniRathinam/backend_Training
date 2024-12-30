package Day2.OopsBasic;

public class Area {
    void area(int r)
    {
        System.out.println("Area of circle "+r+" is "+(3.14*r*r));
    }
    void area(int l,int b)
    {
        System.out.println("Area of rectangle "+l+ " and "+ b+" is "+(l*b));
    }
    void area(double h,double w)
    {
        System.out.println("Area of triangle "+h+" and "+w+" is "+(h*w));
    }
    public static void main(String[] args) {
        Area a = new Area();
        a.area(1,2);
        a.area(6);
        a.area(2.3,5.6);
    }
}
