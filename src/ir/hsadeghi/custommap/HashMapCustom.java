package ir.hsadeghi.custommap;

import java.util.ArrayList;
import java.util.List;

/**
 * Custom HashMap implementation using separate chaining with List of entries.
 * @param <K> Key type
 * @param <V> Value type
 */
public class HashMapCustom<K, V> {
    private static class Entry<K, V> {
        final K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final List<Entry<K, V>> entries = new ArrayList<>();

    /**
     * Associates the specified value with the specified key.
     * @param key The key to associate with
     * @param value The value to store
     */
    public void put(K key, V value) {
        Entry<K, V> existing = findEntry(key);
        if (existing != null) {
            existing.value = value;
        } else {
            entries.add(new Entry<>(key, value));
        }
    }

    /**
     * Replaces the value for an existing key.
     * @param key The key to replace
     * @param value The new value
     * @throws IllegalArgumentException if key doesn't exist
     */
    public void replace(K key, V value) {
        Entry<K, V> entry = findEntry(key);
        if (entry == null) {
            throw new IllegalArgumentException("Key not found: " + key);
        }
        entry.value = value;
    }

    /**
     * Checks if a key exists in the map.
     * @param key The key to check
     * @return true if key exists, false otherwise
     */
    public boolean containsKey(K key) {
        return findEntry(key) != null;
    }

    /**
     * Checks if the map is empty.
     * @return true if the map contains no entries, false otherwise
     */
    public boolean isEmpty() {
        return entries.isEmpty();
    }

    /**
     * Prints all key-value pairs in the map.
     */
    public void printAll() {
        if (entries.isEmpty()) {
            System.out.println("Map is empty");
            return;
        }

        System.out.println("Map contents:");
        for (Entry<K, V> entry : entries) {
            System.out.println("  " + entry.key + " => " + entry.value);
        }
    }

    private Entry<K, V> findEntry(K key) {
        for (Entry<K, V> entry : entries) {
            if (entry.key.equals(key)) {
                return entry;
            }
        }
        return null;
    }
}