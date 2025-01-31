package ir.hsadeghi.setops;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Demonstrates set operations (union and intersection) on randomly generated character sets.
 */
public class SetOperationsDemo {
    private static final Random random = new Random();
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    /**
     * Generates and displays two random character sets along with their union and intersection.
     */
    public static void demonstrateOperations() {
        Set<Character> setA = generateUniqueSet(10);
        Set<Character> setB = generateUniqueSet(10);

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);

        Set<Character> union = new TreeSet<>(setA);
        union.addAll(setB);
        System.out.println("\nUnion (A ∪ B): " + union);

        Set<Character> intersection = new TreeSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection (A ∩ B): " + intersection);

        System.out.println("Union size: " + union.size());
        System.out.println("Intersection size: " + intersection.size());
    }

    /**
     * Generates a sorted set of unique random characters.
     * @param size The number of characters to generate
     * @return A sorted set of unique characters
     */
    private static Set<Character> generateUniqueSet(int size) {
        Set<Character> set = new TreeSet<>();
        while (set.size() < size) {
            set.add(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
        }
        return set;
    }
}