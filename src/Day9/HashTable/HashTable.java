package HashTable;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<String, String> contacts = new Hashtable<>();
        contacts.put("John", "9876543210");
        contacts.put(" Alice","912345678");
        contacts.put("Bob"," 8899776655");
        for (String key : contacts.keySet()) {
            System.out.println(key+"="+ contacts.get(key));
        }
        System.out.println("Search for Alice");
        String search = contacts.get("Alice");
        System.out.println(search);
        System.out.println("Remove contact Bob");
        contacts.remove("Bob");
        System.out.println("contacts: "+contacts);



    }
}
