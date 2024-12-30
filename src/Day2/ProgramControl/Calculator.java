package Day2.ProgramControl;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        char operation=s.next().charAt(0);
        switch(operation)
        {
            case '+':
                System.out.println("addition: "+(n1+n2));
                break;
            case '-':
                System.out.println("subtraction: "+(n1-n2));
                break;
            case '*':
                System.out.println("multiplication: "+(n1*n2));
                break;
            case '/':
                System.out.println("division: "+(n1/n2));
                break;
        }
    }
}
