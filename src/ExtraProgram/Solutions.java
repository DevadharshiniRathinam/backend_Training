package ExtraProgram;
import java.util.*;

interface AdvancedArithmetic{
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

class Solutions {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(myCalculator.divisor_sum(n));
    }
}

