package Day19;

import java.util.concurrent.RecursiveTask;
public class SumTask extends RecursiveTask<Long> {
    public static final int THRESHOLD = 20000;
    int start;
    int end;
    public SumTask(int start, int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    protected Long compute()
    {
        long sum = 0;
        if(end - start <= THRESHOLD)
        {
            for(int i = start; i <= end; i++)
                sum += i;
            return sum;
        }
        else
        {
            int midValue = (start + end) / 2;
            SumTask left = new SumTask(start, midValue);
            SumTask right = new SumTask(midValue + 1, end);
            left.fork();
            right.fork();
            return left.join() + right.join();
        }
    }
    public static void main(String[] args) {
        SumTask task = new SumTask(0,100000);
        task.fork();
        System.out.println(task.join());

    }

}
