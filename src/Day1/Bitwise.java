package Day1;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1=n<<2;
        int n2=n>>2;

        System.out.println("left shift:"+n1);
        System.out.println("Right shift:"+n2);
        System.out.println("Xor operation:"+(n1^n2));
    }
}
