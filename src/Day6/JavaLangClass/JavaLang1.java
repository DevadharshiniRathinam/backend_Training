package Day6.JavaLangClass;
public class JavaLang1 {
    public String toString()
    {
        return " toString";
    }
    public static void main(String []arg)
    {
        JavaLang1 obj = new JavaLang1();
        System.out.println(obj.getClass());
        System.out.println(obj.toString());
    }

}
