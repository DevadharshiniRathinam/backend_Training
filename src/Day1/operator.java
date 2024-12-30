package Day1;

import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        System.out.println("Addition:"+(n1+n2));
        System.out.println("Subraction:"+(n1-n2));
        System.out.println("Multiplication:"+(n1*n2));
        System.out.println("Division:"+(n1/n2));
        System.out.println("Modulous:"+(n1%n2));
        System.out.println("Decriment and incriment:"+(n1--)+" and "+ (n2++));
    }
}
