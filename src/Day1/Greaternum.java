package Day1;

import java.util.Scanner;

public class Greaternum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n1 = s.nextInt();
        if(n<n1)
        {
            System.out.println("n1 is greater than n");
        }
        else {
            System.out.println("n is greater than n1");
        }
    }
}
