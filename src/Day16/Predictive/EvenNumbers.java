package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

public class EvenNumbers {
    public void Even(List<Integer> l, IntPredicate predicate) {
        for(int n:l)
        {
            if(predicate.test(n))
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(45);
        l.add(22);
        l.add(35);
        l.add(60);
        IntPredicate predicate = (x)-> x % 2 == 0;
        EvenNumbers e = new EvenNumbers();
        e.Even(l, predicate);

    }

}
