package Day5.AutoBoxing;
import java.util.ArrayList;
import java.util.List;

public class AutoBox {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(41);
        list.add(22);
        list.add(73);
        list.add(64);
        int n=0;
        for (Integer i : list) {
            n+=i;
        }
        System.out.println(n);
    }
}
