package Day15;

import java.util.*;
import java.util.stream.Collectors;

public class FindingName {

    public static List<String> find(List<String> studentNames, char letter) {
        return studentNames.stream()
                .filter(name -> name.toUpperCase().charAt(0) == Character.toUpperCase(letter))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList("Arun", "Ravi", "Ram");

        char letter = 'R';
        List<String> filteredNames = find(studentNames, letter);

        System.out.println("Students whose names start with " + letter + ":");
        for(String name : filteredNames) {
            System.out.println(name);
        }
    }
}
