import java.util.function.BinaryOperator;
 public class MaxValue
 {
    public MaxValue()
    {
        BinaryOperator<Integer> value=(val1,val2)->(Math.max(val1,val2));
        System.out.println(value.apply(23,67));
    }
    public static void main(String [] arg)
    {
        new MaxValue();
    }
 }