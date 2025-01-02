package Day3.Arrays;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max=0;
        int min=10000;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>max) {
                max = arr[i];
            }
            if(arr[i]<min) {
                min = arr[i];
            }
        }
      System.out.println("maximum:"+max);
        System.out.println("minimum:"+min);
    }
}
