package Day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelStreams {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(12,45,67,85,34,90,58,65,69,83,111,99,91,51,47));
        ParallelStreams ps = new ParallelStreams();
        list.stream().parallel().filter(num -> num>50).map(num -> num*num).limit(10).forEach(num -> System.out.println(num));


    }
}
