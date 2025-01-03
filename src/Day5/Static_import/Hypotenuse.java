package Day5.Static_import;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class Hypotenuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        System.out.println("Area of the Hypotenuse of the right angle triangle:"+(sqrt(pow(n1,2)+pow(n,2))));
    }
}
