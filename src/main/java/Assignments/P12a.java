package Assignments;
import java.util.LinkedList;

/* Using Separate Chaining */

public class P12a {
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();
        hashTable.put("Perry the Platypus", 15);
        hashTable.put("Ferb", 20);
        hashTable.put("Phineas", 19);
        System.out.println("Size of hash table: " + hashTable.size());
        System.out.println("Age of Ferb: " + hashTable.get("Ferb"));
        System.out.println("Age of Phineas: " + hashTable.get("Phineas"));
        hashTable.remove("Phineas");
        System.out.println("Removed Phineas. Size of hash table: " + hashTable.size());
        System.out.println("Age of Phineas: " + hashTable.get("Phineas"));
    }
}

class HashEntry<K, V> {
    K key;
    V value;

    HashEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

class HashTable<K, V> {
    private final LinkedList<HashEntry<K, V>>[] table;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    public HashTable() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public HashTable(int capacity) {
        table = new LinkedList[capacity];
        size = 0;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    public void put(K key, V value) {
        int index = hash(key);

        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        for (HashEntry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        table[index].add(new HashEntry<>(key, value));
        size++;
    }

    public V get(K key) {
        int index = hash(key);
        if (table[index] == null) {
            return null;
        }
        for (HashEntry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public boolean remove(K key) {
        int index = hash(key);
        if (table[index] == null) {
            return false;
        }
        LinkedList<HashEntry<K, V>> bucket = table[index];
        for (HashEntry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                bucket.remove(entry);
                size--;
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }
}

