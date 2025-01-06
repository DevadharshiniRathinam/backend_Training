package Day7.Exception_partTow;
import java.util.*;
public class Exception2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            int num1 = s.nextInt();
            int num2 = s.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } catch (Exception e) {
            System.out.println("Error:"+e.getMessage());
        }
    }
}

