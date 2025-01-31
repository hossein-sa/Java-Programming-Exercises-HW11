package ir.hsadeghi.permutation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Generates and validates permutations of a given string.
 * Provides functionality to check if a specific permutation exists in the generated set.
 */
public class PermutationGenerator {
    private static final Set<String> permutations = new HashSet<>();

    /**
     * Generates all permutations of a user-input string and validates against a user-provided permutation.
     */
    public static void generateAndValidate(Scanner scanner) {
        // Get input string and generate permutations
        System.out.print("Enter word to permute: ");
        String input = scanner.nextLine().trim();

        permutations.clear();
        if (!input.isEmpty()) {
            generatePermutations(input.toCharArray(), 0);
        }

        System.out.println("Generated permutations (" + permutations.size() + "):");
        System.out.println(permutations);

        // Validate user's permutation attempt
        System.out.print("Enter permutation to verify (press Enter to skip): ");
        String check = scanner.nextLine().trim();

        if (check.isEmpty()) {
            System.out.println("Validation skipped.");
        } else {
            validatePermutation(check);
        }
    }

    /**
     * Recursively generates all permutations of a character array.
     * @param chars The character array to permute
     * @param currentIndex The starting index for permutation generation
     */
    private static void generatePermutations(char[] chars, int currentIndex) {
        if (currentIndex == chars.length - 1) {
            permutations.add(new String(chars));
            return;
        }

        for (int i = currentIndex; i < chars.length; i++) {
            swap(chars, currentIndex, i);
            generatePermutations(chars, currentIndex + 1);
            swap(chars, currentIndex, i); // backtrack
        }
    }

    /**
     * Validates if a given string exists in the generated permutations.
     * @param candidate The permutation candidate to check
     */
    private static void validatePermutation(String candidate) {
        if (permutations.contains(candidate)) {
            System.out.println("Validation PASSED: Permutation exists");
        } else {
            System.out.println("Validation FAILED: Permutation not found");
        }
    }

    /**
     * Swaps two characters in a character array.
     * @param arr The character array
     * @param i First index position
     * @param j Second index position
     */
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}