package Day5.Varargs;

public class varargs{
    public static int sum(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println( + sum());
        System.out.println("Sum (1, 2): " + sum(1, 2));
        System.out.println("Sum (1, 2, 3, 4, 5): " + sum(1, 2, 3, 4, 5));
        System.out.println("Sum (100): " + sum(100));
    }
}