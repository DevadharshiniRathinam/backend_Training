package Day19;

import java.util.concurrent.*;

public class FactorialTasks implements Callable<Long> {
    long num;

    public FactorialTasks(long num) {
        this.num = num;
    }

    @Override
    public Long call() throws Exception {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args)  {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Callable<Long> c = new FactorialTasks(5);
        Future<Long> f = executor.submit(c);
        try {
            System.out.println("Factorial value: " + f.get());
        } catch (
                Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}



