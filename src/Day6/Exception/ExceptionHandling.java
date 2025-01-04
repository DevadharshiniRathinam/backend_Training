package Day6.Exception;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            int num1 = s.nextInt();
            int num2 = s.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }
    }
}
