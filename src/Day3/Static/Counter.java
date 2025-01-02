package Day3.Static;

public class Counter {
    public static int counts = 0;
    public Counter() {
        counts++;
    }
    public static int display() {
        return counts;
    }

    public static void main(String[] args) {
        Counter a = new Counter();
        Counter b= new Counter();
        Counter c= new Counter();


        System.out.println("Number of objects created: " + Counter.display());
    }
}
