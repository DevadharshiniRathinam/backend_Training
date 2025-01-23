/*
Simple Supplier Write a Java program to use a Supplier that returns the current date and time.
*/
import java.util.*;
import java.time.LocalDateTime;
import java.util.function.Supplier;
class SimpleSupplier
{
    public SimpleSupplier()
{
    Supplier <LocalDateTime> supplier=()->LocalDateTime.now();
         LocalDateTime LocalTime=supplier.get();
         System.out.println(LocalTime);
}
    public static void main(String [] arg)
    {
         SimpleSupplier s=new SimpleSupplier();
    }
}