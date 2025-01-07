package Day7.ObjectAndMethodLocking;
class SharedPrinter {
    synchronized void printString(String str) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + str);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized void printCountdown(int start) {
        for (int i = start; i > 0; i--) {
            System.out.println(Thread.currentThread().getName() + " - Countdown: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static synchronized void staticPrintString(String str) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " [Class Lock] - " + str);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static synchronized void staticPrintCountdown(int start) {
        for (int i = start; i > 0; i--) {
            System.out.println(Thread.currentThread().getName() + " [Class Lock] - Countdown: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class locking{
    public static void main(String[] args) {
        SharedPrinter printer = new SharedPrinter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                printer.printString("Hello");
            }
        }, "Thread 1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                printer.printCountdown(5);
            }
        }, "Thread 2");

        System.out.println("--- Object-Level Locking ---");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                SharedPrinter.staticPrintString("World");
            }
        }, "Thread 3");

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                SharedPrinter.staticPrintCountdown(5);
            }
        }, "Thread 4");

        System.out.println("--- Class-Level Locking ---");
        t3.start();
        t4.start();
    }
}

