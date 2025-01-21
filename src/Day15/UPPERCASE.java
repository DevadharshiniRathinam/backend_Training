package Day15;

import java.util.*;
import java.util.stream.Collectors;

public class UPPERCASE {
    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

        List<String> transformedNames = studentNames.stream()
                .map(name -> {
                    String upperCaseName = name.toUpperCase();
                    return "Student: " + upperCaseName;
                })
                .collect(Collectors.toList());

        transformedNames.forEach(name -> System.out.println(name));
    }
}
