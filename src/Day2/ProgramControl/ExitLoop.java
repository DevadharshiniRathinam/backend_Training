package Day2.ProgramControl;

import java.util.Scanner;

public class ExitLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []n=new int[5];
        for(int i=0;i<n.length;i++){
            n[i]=s.nextInt();
            if(n[i]==0){
                break;
            }
            System.out.println(n[i]);
        }
    }
}
