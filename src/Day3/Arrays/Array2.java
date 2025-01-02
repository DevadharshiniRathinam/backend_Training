package Day3.Arrays;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int v=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++) {
                arr[i][j]=sc.nextInt();
                v+=arr[i][j];
            }
        }
        System.out.println(v);
    }
}
