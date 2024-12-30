package Day2.ProgramControl;

import java.util.Scanner;

public class LeafYear {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int year=s.nextInt();
        if(year%4==0 && year%400==0 || year%100!=0)
        {
            System.out.println(year+" it is a Leap year");
        }
        else {
            System.out.println(year+" it is not a Leap year");
        }
    }
}
