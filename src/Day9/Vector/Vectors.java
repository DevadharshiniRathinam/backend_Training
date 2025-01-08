package Vector;
import java.util.*;

public class Vectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> grades = new Vector<>();
        grades.add(78);
        grades.add(85);
        grades.add(92);
        grades.add(67);
        grades.add(88);
        System.out.println("Grades: " + grades);
System.out.println(grades);
        int highest = Collections.max(grades);
        int lowest = Collections.min(grades);
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        double average = (double) sum / grades.size();

        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Average: " + average);

        System.out.println("Enter index to remove: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < grades.size()) {
            grades.remove(index);
            System.out.println("Updated Grades: " + grades);
        }
    }
}
