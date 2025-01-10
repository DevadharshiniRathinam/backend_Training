package Day11;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
    public class Concurrent {
        public static void main(String[] args) throws InterruptedException {
            ConcurrentMap<String, Integer> votes = new ConcurrentHashMap<>();

            Thread t1 = new Thread(() -> vote(votes, "Alice"));
            Thread t2 = new Thread(() -> vote(votes, "Bob"));
            Thread t3 = new Thread(() -> vote(votes, "Alice"));
            Thread t4 = new Thread(() -> {
                votes.putIfAbsent("Charlie", 0);
                vote(votes, "Charlie");
            });

            t1.start();
            t2.start();
            t3.start();
            t4.start();

            t1.join();
            t2.join();
            t3.join();
            t4.join();

            votes.forEach((candidate, count) -> System.out.println(candidate + ": " + count));
        }

        private static void vote(ConcurrentMap<String, Integer> votes, String candidate) {
            votes.merge(candidate, 1, Integer::sum);
        }
    }


