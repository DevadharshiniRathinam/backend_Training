package Day10;
import java.util.LinkedList;
import java.util.Queue;
public class Queues {
        public static void main(String[] args) {
            Queue<String> customerQueue = new LinkedList<>();
            String[] actions = {"Add Alice", "Add Bob", "Add Charlie", "Serve 1"};

            for (String action : actions) {
                if (action.startsWith("Add")) {
                    String customer = action.substring(4);
                    customerQueue.add(customer);
                } else if (action.startsWith("Serve")) {
                    if (!customerQueue.isEmpty()) {
                        String servedCustomer = customerQueue.poll();
                        System.out.println("Serving: " + servedCustomer);
                    } else {
                        System.out.println("No customers to serve.");
                    }
                }
            }

            System.out.println("Waiting: " + customerQueue);
        }
    }




