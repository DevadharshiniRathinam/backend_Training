package Day2.Operator;

import java.util.Scanner;

public class BinaryRepresentation {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count=0;
        String s1=Integer.toBinaryString(n);
        String[] s2=s1.split("");
        for(int i=0;i<s1.length();i++)
        {
            if( s2[i].equals("1")){
                count++;
            }
        }
        System.out.println(count);
    }
}
