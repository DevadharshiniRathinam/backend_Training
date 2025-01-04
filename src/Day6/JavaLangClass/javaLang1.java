package Day6.JavaLangClass;
public class javaLang1 {
    public String toString()
    {
        return " toString";
    }
    public static void main(String []arg)
    {
        javaLang1 obj = new javaLang1();
        System.out.println(obj.getClass());
        System.out.println(obj.toString());
    }

}
