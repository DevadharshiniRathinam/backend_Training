import java.util.concurrent.CompletableFuture;

public class Completables {
    public static void main(String[] args) {
        CompletableFuture<String> t1 =  CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Deva";
        });

        CompletableFuture<String> t2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            return "dharshini";
        });

               CompletableFuture value=t1.thenCombine(t2,(val1,val2)->
        {
            return val1+val2;
        });

        System.out.println(value.join());



    }
}
