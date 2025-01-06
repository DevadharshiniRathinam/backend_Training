package Day7.Reflection;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
public class Persons {
    public static void main(String[] args) {
        try
        {
            Class c=Class.forName("Day7.Reflection.Person");
            Constructor con[]=c.getDeclaredConstructors();
            for(int i=0;i<con.length;i++)
            {
                System.out.println(con[i].getName());
            }
            Person p=(Person)con[0].newInstance("nikitha",22);
            System.out.println(p);
            Field f[]=c.getDeclaredFields();
            for(int i=0;i<f.length;i++)
            {
                System.out.println(f[i].getName());
            }
            Method m[]=c.getDeclaredMethods();
            for(int i=0;i<m.length;i++)
            {
                System.out.println(m[i].getName());

            }
        }
        catch (Exception e)
        {
        }
    }
}
