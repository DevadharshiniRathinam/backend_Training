package Day10;
/*
Set:
Create a program that uses a Set to store a collection of unique names. Implement the following features:
Add names to the set.
Check if a name is already present in the set.
Display all unique names in the set.
Input Example:
Add names: "Alice", "Bob", "Alice", "Eve", "Charlie".
Output Example:
Unique Names: [Alice, Bob, Eve, Charlie]
 */
import java.util.HashSet;
import java.util.Scanner;

public class Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet <String> set=new HashSet<String>();
        String input="";
        while(true)
        {
            input=sc.nextLine();
            if(input.equals("end"))
            {
                break;
            }
            else {
                set.add(input);
            }
        }
        System.out.println("Enter the element to check if it present in the set:");
        String str=sc.nextLine();
        if(set.contains(str))
        {
            System.out.println("The value is present in the set");
        }
        else {
            System.out.println("The value is not present in the set");
        }
        System.out.println("Unique element of set:");
        System.out.println(set);

    }
}
