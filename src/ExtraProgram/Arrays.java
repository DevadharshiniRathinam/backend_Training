package ExtraProgram;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int n1=sc.nextInt();
        int sum=0;
        for(int i = 0; i < n1; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[j]+arr[i]==n1) {
                    System.out.print("index:"+i+"and"+j);
                    break;
                }
            }
        }

    }
}
