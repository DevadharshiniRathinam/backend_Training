package Day5;

public class Object {

        public String toString()
        {
            return"String return";
        }
    public static void main(String[] args) {
            Object o = new Object();
            System.out.println(o.toString());
            System.out.println(o.getClass());
    }
}
