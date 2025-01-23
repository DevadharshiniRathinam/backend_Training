package Day_17.Method_reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InstanceMethod {
    InstanceMethod() {
               List<String> str = new ArrayList<>(List.of("Apple", "Banana", "grape", "apple", "Pineapple", "banana"));

        Collections.sort(str, (s1, s2) -> s1.compareToIgnoreCase(s2));
      
        for (String str1 : str) {
            System.out.println(str1);
        }
    }

    public static void main(String[] args) {
        new InstanceMethodAlternative();
    }
}
