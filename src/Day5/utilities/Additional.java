package Day5.utilities;

class  Container<T>
{
    public T item;
    public Container(T item)
    {
        this.item = item;
    }
    public void display()
    {
        System.out.println(item);
    }
}

public class Additional {
    public enum Priority
    {
        LOW, MEDIUM, HIGH
    }
    Container <Integer> cc= new Container<Integer>(12);


}
