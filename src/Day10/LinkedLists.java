package Day10;
/*LinkedList:
Create a program that allows the user to manage a task list using a LinkedList. Implement the following features:
Add a task to the end of the list.
Remove a task from the list by its name.
Display all tasks in the list in the order they were added.
Input Example:
Add tasks: "Finish homework", "Go for a run", "Prepare dinner".
Remove task: "Go for a run".
Output Example:
Task List:
1. Finish homework
2. Prepare dinner
*/
import java.util.LinkedList;

import java.util.Scanner;

public class LinkedLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList <String>list = new LinkedList<>();
        String input="";
        while( true){
            input = sc.nextLine();
            if(input.equals("end")){
                break;
            }
            else {
                list.add(input);
            }
        }
        System.out.println("Enter element to be removed:");
        String element = sc.nextLine();
        list.remove(element);
        System.out.println("list value: "+list);


    }
}
