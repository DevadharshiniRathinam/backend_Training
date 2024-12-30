package Day2.Operator;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean Prime(int n) {
        boolean t=true;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                t= false;
                break;
            }
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
       System.out.println(n+" is Prime number:" +Prime(n));

    }
}
