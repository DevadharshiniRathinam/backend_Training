package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FirstLetter {
    public void letter(List<String> l, Predicate<String> predicate)
    {
        for(String s : l)
        {
            if(predicate.test(s))
            {
                System.out.println(s);
            }
        }
    }
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Apple");
        l.add("Banana");
        l.add("Avocado");
        l.add("Cherry");
             char first='A';
             Predicate<String> predicate = s -> s.charAt(0) == first;
        FirstLetter f = new FirstLetter();
        f.letter(l, predicate);
    }
}
