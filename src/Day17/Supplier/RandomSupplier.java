/*
Random Supplier Create a Supplier that generates a random number between 1 and 100 and prints it 5 times.
*/
import java.util.Random;
import java.util.function.Supplier;
class RandomSupplier
{
    public RandomSupplier()
    {
        Random  r=new Random();
        Supplier<Integer> supplier=()->r.nextInt(100)+1;
        for(int i=0;i<5;i++)
        {
           System.out.println(supplier.get());
        }
        
    }
    public static void main(String[]arg)
    {
        new RandomSupplier();
    }
}