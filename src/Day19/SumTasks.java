package Day19;

import java.util.concurrent.RecursiveTask;
public class SumTasks extends RecursiveTask<Long> {
    public static final int THRESHOLD = 20000;
    int start;
    int end;
    public SumTasks(int start, int end) {
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
            SumTasks left = new SumTasks(start, midValue);
            SumTasks right = new SumTasks(midValue + 1, end);
            left.fork();
            right.fork();
            return left.join() + right.join();
        }
    }
    public static void main(String[] args) {
        SumTasks task = new SumTasks(0,100000);
        task.fork();
        System.out.println(task.join());

    }

}
