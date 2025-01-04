package Day6.Strings;

import java.util.Scanner;

public class StringClass1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        int comparisonResult = str1.compareTo(str2);
        if (comparisonResult < 0) {
            System.out.println("The first string comes before the second string lexicographically.");
        } else if (comparisonResult > 0) {
            System.out.println("The first string comes after the second string lexicographically.");
        } else {
            System.out.println("The two strings are lexicographically equal.");
        }

        if (str1.equals(str2)) {
            System.out.println("The two strings are exactly equal (case-sensitive).");
        } else {
            System.out.println("The two strings are not exactly equal (case-sensitive).");
        }

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("The two strings are equal (case-insensitive).");
        } else {
            System.out.println("The two strings are not equal (case-insensitive).");
        }

        String concatenatedString = str1 + str2;
        System.out.println("The concatenated string is: " + concatenatedString);

    }
}
