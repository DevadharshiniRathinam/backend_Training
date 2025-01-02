package Day3.interface2;

interface Printer {
    void print();
}
interface Scanner {
    void scan();
}
public class AllInOne implements Printer, Scanner {
    public void print() {
        System.out.println("Printing");
    }
    public void scan() {
        System.out.println("Scanning");
    }
    public static void main(String[] args) {
        AllInOne device = new AllInOne();
        device.print();
        device.scan();
    }
}

