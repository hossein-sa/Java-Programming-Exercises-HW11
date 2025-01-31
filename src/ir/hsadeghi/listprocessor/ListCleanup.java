package ir.hsadeghi.listprocessor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Processes lists by removing elements according to specific rules:
 * 1. Remove last element if list size is odd
 * 2. Remove pairs where second element is smaller than the first
 */
public class ListCleanup {
    /**
     * Demonstrates list processing on a predefined example.
     */
    public static void demonstrateCleanup() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1
        ));

        System.out.println("Original list: " + numbers);
        List<Integer> processed = processList(numbers);
        System.out.println("Processed list: " + processed);
    }

    /**
     * Processes the input list according to the defined rules.
     * @param input The list to process
     * @return A new processed list (original list remains unmodified)
     */
    public static List<Integer> processList(List<Integer> input) {
        if (input == null || input.isEmpty()) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>(input);

        // Remove last element if odd number of elements
        if (result.size() % 2 != 0) {
            result.remove(result.size() - 1);
        }

        // Process element pairs
        int i = 0;
        while (i < result.size()) {
            if (i + 1 >= result.size()) break;

            int current = result.get(i);
            int next = result.get(i + 1);

            if (next < current) {
                result.remove(i); // Remove current
                result.remove(i); // Remove next (now at same index)
            } else {
                i += 2;
            }
        }

        return result;
    }
}