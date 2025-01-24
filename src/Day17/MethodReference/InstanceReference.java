
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InstanceMethod {
    InstanceMethod() {
               List<String> str = new ArrayList<>(List.of("Apple", "Banana", "grape", "apple", "Pineapple", "banana"));

        Collections.sort(str,String::compareToIgnoreCase);
      
        for (String str1 : str) {
            System.out.println(str1);
        }
    }

    public static void main(String[] args) {
        new InstanceMethod();
    }
}
