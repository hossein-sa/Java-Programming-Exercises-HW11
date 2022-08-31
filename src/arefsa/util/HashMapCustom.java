package arefsa.util;

import java.util.ArrayList;
import java.util.List;

public class HashMapCustom<K, V> {
    List<K> key = new ArrayList<>();
    List<V> value = new ArrayList<>();


    public void put(K key, V value) {
        if (!contain(key)){
            this.key.add(key);
            this.value.add(value);
        }
    }

    public boolean contain(K key) {
        return this.key.contains(key);
    }

    public boolean isEmpty() {
        return key.isEmpty();
    }

    public void printAll() {
        System.out.println("------------------");

        for (int i = 0; i < key.size(); i++) {
            System.out.println("Key: " + key.get(i) + " - Value: " + value.get(i));
        }
        System.out.println("------------------");
    }

    public void replace(K key, V value) {
        if (contain(key))
            this.value.set(this.key.indexOf(key), value);
    }
}