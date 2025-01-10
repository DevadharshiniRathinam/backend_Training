package Day11;

public class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public boolean isTypeOf(Class<?> type) {
        return type.isInstance(item);
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello");
        System.out.println("Item: " + stringBox.getItem());
        System.out.println("Is String? " + stringBox.isTypeOf(String.class));

        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(123);
        System.out.println("Item: " + integerBox.getItem());
        System.out.println("Is Integer? " + integerBox.isTypeOf(Integer.class));
    }
}

