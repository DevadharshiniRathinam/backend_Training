package Day13;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
        public static int[] sortArray(int[] array) {
            if (array == null) {
                throw new IllegalArgumentException("Input array cannot be null");
            }
            Arrays.sort(array);
            return array;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();

            }
            System.out.println("Sorted the elements of the array");
            System.out.println(Arrays.toString(sortArray(array)));
        }
    }


