package Genericss;
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    void display() {
        System.out.println("Key: " + key);
        System.out.println("Value: " + value);
    }
}
public class Pairs {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Arun", 25);
        Pair<Integer, String> pair2 = new Pair<>(101, "John");
        pair1.display();
        pair2.display();
    }
}
