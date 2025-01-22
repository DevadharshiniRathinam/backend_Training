package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class WordLength {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");

        Function<String, Integer> stringLength = str -> str.length();

        List<Integer> lengths = new ArrayList<>();
        for (String str : strings) {
            lengths.add(stringLength.apply(str));
        }

        System.out.println(lengths);
    }
}
