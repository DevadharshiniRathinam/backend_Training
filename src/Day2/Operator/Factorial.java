package Day2.Operator;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n<0)
        {
            System.out.println(" negative number doesnot have factorial");
        }
        else {
            int factor = 1;
            for (int i = 1; i <= n; i++) {
                factor = factor * i;

            }
            System.out.println(factor);
        }

    }
}
