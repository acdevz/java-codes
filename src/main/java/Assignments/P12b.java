package Assignments;

public class P12b {
    public static void main(String[] args) {
        ProbingHashTable<String, Integer> hashTable = new ProbingHashTable<>();
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

class ProbingHashTable<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final double DEFAULT_LOAD_FACTOR = 0.75;

    private HashEntry<K, V>[] table;
    private int size;
    private int capacity;
    private final double loadFactor;

    public enum ProbingStrategy {
        LINEAR,
        QUADRATIC,
        DOUBLE_HASHING
    }

    private final ProbingStrategy strategy;

    public static class HashEntry<K, V> {
        K key;
        V value;
        boolean isDeleted;

        HashEntry(K key, V value) {
            this.key = key;
            this.value = value;
            this.isDeleted = false;
        }
    }

    public ProbingHashTable() {
        this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR, ProbingStrategy.LINEAR);
    }

    public ProbingHashTable(int capacity, double loadFactor, ProbingStrategy strategy) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        this.strategy = strategy;
        this.table = new HashEntry[capacity];
        this.size = 0;
    }

    private int hash(K key) {
        return (key.hashCode() & 0x7FFFFFFF) % capacity;
    }

    private int getNextIndex(int index, int probe) {
        switch (strategy) {
            case QUADRATIC:
                return (index + probe * probe) % capacity;
            case DOUBLE_HASHING:
                int step = 1 + ((table[index].key.hashCode() & 0x7FFFFFFF) % (capacity - 1));
                return (index + probe * step) % capacity;
            case LINEAR:
            default:
                return (index + probe) % capacity;
        }
    }

    private void resize() {
        capacity *= 2;
        HashEntry<K, V>[] newTable = new HashEntry[capacity];
        for (HashEntry<K, V> entry : table) {
            if (entry != null && !entry.isDeleted) { // Re-insert non-deleted entries
                int index = hash(entry.key);
                int probe = 0;
                while (newTable[index] != null) {
                    probe++;
                    index = getNextIndex(index, probe);
                }
                newTable[index] = entry;
            }
        }
        table = newTable;
    }

    public void put(K key, V value) {
        if ((double) size / capacity >= loadFactor) {
            resize();
        }
        int index = hash(key);
        int probe = 0;
        while (table[index] != null && !table[index].isDeleted && !table[index].key.equals(key)) {
            probe++;
            index = getNextIndex(index, probe);
        }
        if (table[index] == null || table[index].isDeleted) {
            size++;
        }
        table[index] = new HashEntry<>(key, value);
    }

    public V get(K key) {
        int index = hash(key);
        int probe = 0;
        while (table[index] != null) {
            if (!table[index].isDeleted && table[index].key.equals(key)) {
                return table[index].value;
            }
            probe++;
            index = getNextIndex(index, probe);
        }
        return null;
    }

    public boolean remove(K key) {
        int index = hash(key);
        int probe = 0;

        while (table[index] != null) {
            if (!table[index].isDeleted && table[index].key.equals(key)) {
                table[index].isDeleted = true;
                size--;
                return true;
            }
            probe++;
            index = getNextIndex(index, probe);
        }
        return false;
    }

    public int size() {
        return size;
    }
}

