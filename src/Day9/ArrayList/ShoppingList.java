package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        shoppingList.add("Butter");

        System.out.print("Enter an item to remove: ");
        String itemToRemove = scanner.nextLine();
        shoppingList.remove(itemToRemove);

        System.out.println("Shopping List: " + shoppingList);

        scanner.close();
    }
}

