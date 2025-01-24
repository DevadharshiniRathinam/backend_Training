import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleFunction;
public class StaticMethodReference {
public StaticMethodReference()
{
    List<Integer> l=List.of(34,56,76,14);
    
    for(Integer n:l)
    {
        DoubleFunction<Double> fun=Math::sqrt;
        System.out.println(fun.apply(n));
    }
}
public static void main(String[] arg) {
    new StaticMethodReference(); // Corrected class name here
}

}
