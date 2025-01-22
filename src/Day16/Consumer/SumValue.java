package Day16;

import java.util.function.BiConsumer;
public class SumValue {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> sum = (a, b) -> System.out.println("Sum :" + (a + b));

        sum.accept(3, 5);
    }
}
