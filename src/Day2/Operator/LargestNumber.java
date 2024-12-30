package Day2.Operator;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        n1=n1>n2?n1:n2;
        n1=n1>n3?n1:n3;
        System.out.println("largest of three numbers: "+n1);
    }
}
