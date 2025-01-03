package Genericss;
public class GenericArray {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element+ " ");
        }
        System.out.println( );
    }

    public static void main(String[] args) {
        String[] string = {"Hello", "World", "Generics"};
        Integer[] intvalue = {1, 2, 3, 4, 5};
        Double[] doublevalue = {1.1, 2.2, 3.3, 4.4};
        printArray(string);
        printArray(intvalue);
        printArray(doublevalue);
    }
}

