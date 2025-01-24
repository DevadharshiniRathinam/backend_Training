import java.util.Optional;
 public class NullValue
 {
    public  NullValue()
    {
        String val1="good";
        Optional<String> value=Optional.ofNullable(val1);
        if(value.isPresent())
        {
            System.out.println(val1.toUpperCase());
        }
        else{
            System.out.println( "Empty input");
        }
       
        
    }
    public static void main(String [] arg)
    {
        new  NullValue();
    }
 }