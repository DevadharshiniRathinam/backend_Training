package Day1;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b=(a%2==0)?"even":"odd";
        System.out.println(b);
    }
}
