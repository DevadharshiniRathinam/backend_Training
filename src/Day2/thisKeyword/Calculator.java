package Day2.thisKeyword;

public class Calculator {
    void add(int a,int b)
    {
        System.out.println("Addition of two integer value: "+(a+b));
    }
    void add(double a,double b){
        System.out.println("Addition of two double value: "+(a+b));
    }
    void add(int a[])
    { int ad = 0;
        for(int i=0;i<a.length;i++) {
            ad = a[i] + ad;
        }
        System.out.println("Addition of arrays of number: "+ad);
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(1,2);
        c.add(3.4,4.5);
        int a[]={1,3,2,4,5};
        c.add(a);

    }
}
