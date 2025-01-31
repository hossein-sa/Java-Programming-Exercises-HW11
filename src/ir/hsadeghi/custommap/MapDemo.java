package ir.hsadeghi.custommap;


/**
 * Demonstrates usage of the custom HashMap implementation.
 */
public class MapDemo {
    /**
     * Shows basic operations on the custom HashMap:
     * - Adding entries
     * - Checking existence
     * - Replacing values
     * - Printing contents
     */
    public static void demonstrateMap() {
        HashMapCustom<Integer, String> map = new HashMapCustom<>();

        // Add initial entries
        map.put(1, "Aref");
        map.put(2, "Ali");
        map.put(3, "Taha");
        map.put(3, "Saber"); // Should overwrite

        // Demonstrate basic operations
        System.out.println("Contains key 3: " + map.containsKey(3));
        System.out.println("Is map empty: " + map.isEmpty());

        System.out.println("\nInitial entries:");
        map.printAll();

        // Demonstrate replacement
        map.replace(3, "Mohsen");
        System.out.println("\nAfter replacement:");
        map.printAll();
    }
}
