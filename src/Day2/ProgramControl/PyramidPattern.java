package Day2.ProgramControl;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n1=n;
        for(int i=0;i<n;i++)
        {
            for(int j=n1;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
            n1--;
        }
    }
}
