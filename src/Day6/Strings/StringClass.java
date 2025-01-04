package Day6.Strings;
public class StringClass {
    public static void main(String[] args) {
        String ss1="java programing";
        String s2[]=ss1.split(" ");
        System.out.println("Number of words: "+s2.length);
        String  s3=new StringBuilder(ss1).reverse().toString();
        System.out.println("Reversed string: "+s3);
        String s4=ss1.replaceAll("[aeiouAeiou]","*");
        System.out.println("Replaced string: "+s4);




    }
}
