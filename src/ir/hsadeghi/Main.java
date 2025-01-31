package ir.hsadeghi;

import ir.hsadeghi.custommap.MapDemo;
import ir.hsadeghi.listprocessor.ListCleanup;
import ir.hsadeghi.permutation.PermutationGenerator;
import ir.hsadeghi.setops.SetOperationsDemo;

import java.util.Scanner;

/**
 * Main application entry point with interactive menu system.
 */
public class Main {
    private static final String[] MENU_ITEMS = {
            "String Permutations",
            "Set Operations Demo",
            "List Processing",
            "Custom Map Demo",
            "Exit"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int choice = getValidChoice(scanner);

            switch (choice) {
                case 1 -> PermutationGenerator.generateAndValidate(scanner);
                case 2 -> SetOperationsDemo.demonstrateOperations();
                case 3 -> ListCleanup.demonstrateCleanup();
                case 4 -> MapDemo.demonstrateMap();
                case 5 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid selection!");
            }

            // Wait for user to press Enter before continuing
            System.out.println("\nPress Enter to continue...");
            scanner.nextLine(); // Consume the newline
        }
    }

    private static void printMenu() {
        System.out.println("\n==== Main Menu ====");
        for (int i = 0; i < MENU_ITEMS.length; i++) {
            System.out.printf("%2d. %s%n", i + 1, MENU_ITEMS[i]);
        }
    }

    private static int getValidChoice(Scanner scanner) {
        while (true) {
            System.out.print("Enter your choice (1-5): ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= 5) {
                    return choice;
                }
                System.out.println("Please enter a number between 1 and 5");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Numbers only!");
            }
        }
    }
}