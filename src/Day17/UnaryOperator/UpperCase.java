import java.util.function.UnaryOperator;
 public class UpperCase
 {
    public UpperCase()
    {
        UnaryOperator<String>letter=(value)->value.toUpperCase();
        String value="hello";
        System.out.println(letter.apply(value));
    }
    public static void main(String [] arg)
    {
        new UpperCase();
    }
 }