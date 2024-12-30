package Day2.Operator;

import java.util.Scanner;

public class SawpNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println("Before sawpping:"+n1 +" "+ n2);
        n1=(n1^n2);
        n2=(n1^n2);
        n1=(n1^n2);
        System.out.println("After sawpping:"+n1 +" "+ n2);


    }
}
