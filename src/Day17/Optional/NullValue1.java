import java.util.Optional;
 public class NullValue1
 {
    String val1String;
    public  NullValue1()
    {
        Optional<String> value=Optional.ofNullable(val1);  
        String print=value.orElse("Guest");
        System.out.println(print);
    }   
    public static void main(String [] arg)
    {
        new  NullValue1();
    }
 }