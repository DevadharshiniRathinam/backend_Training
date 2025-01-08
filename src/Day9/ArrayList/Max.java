package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Max{

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(22);
        list.add(8);
        list.add(42);
        list.add(17);

        int maxElement = Collections.max(list);

        System.out.println("Maximum Element: " + maxElement);
    }
}

