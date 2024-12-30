package Day2.ProgramControl;

import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for(int i=1;i<100;i++)
        {
            if(i%5==0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
