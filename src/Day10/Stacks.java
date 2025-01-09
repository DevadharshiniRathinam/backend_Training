package Day10;

import java.util.Scanner;
import java.util.Stack;

/*
Problem Statement for Stack: Undo Functionality
Create a program that uses a Stack to implement an Undo feature for a text editor. The program should:
Allow the user to perform actions like typing words (e.g., "Hello", "World").
Store each action in the stack.
Undo the last action by popping it from the stack.
Input Example:
Actions: "Type Hello", "Type World", "Undo", "Type Java".
Output Example:
Current Text: Hello Java

 */
public class Stacks {
        public static void main(String[] args) {
            Stack<String> textStack = new Stack<>();
            String[] actions = {"Type Hello", "Type World", "Undo", "Type Java"};

            for (String action : actions) {
                if (action.startsWith("Type")) {
                    String word = action.substring(5);
                    textStack.push(word);
                } else if (action.equals("Undo")) {
                    if (!textStack.isEmpty()) {
                        textStack.pop();
                    }
                }
            }

            System.out.println("Current Text: " + String.join(" ", textStack));
        }
    }


