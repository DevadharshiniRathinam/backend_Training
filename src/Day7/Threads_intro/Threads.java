package Day7.Threads_intro;
class Thread1 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 1: Number = " + i);
                Thread.sleep(500);
            }
        }
        catch(Exception e) {}
    }
}
class Thread2 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 2: Square = " + (i * i));
                Thread.sleep(700);
            }
        }
        catch(Exception e) {}
        }
}
public class Threads {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();
        Thread2 thread2 = new Thread2();
        thread2.start();
    }
}
