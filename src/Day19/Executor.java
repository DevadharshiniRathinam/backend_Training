package Day19;

import java.util.concurrent.ExecutorService;

public class Executor {
    public static void main(String[] args) {
        ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 10; i++) {
            int taskNumber = i;
            executorService.submit(() -> {
                System.out.println("Task " + taskNumber + " is being executed by " 
                        + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            });
        }

    }
}
