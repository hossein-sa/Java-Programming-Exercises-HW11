import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final List<String> mainMenu = Arrays.asList("Question 1: ", "Question 2: ", "Question 3: ");

    public static void print(List<String> menu) {
        int i = 1;
        for (String s : menu) {
            System.out.println((i++) + " ) " + s);
        }
    }


    public static void main(String[] args) {
        while (true) {
            print(mainMenu);
            System.out.print("Enter your Choose: ");
            int input = new Scanner(System.in).nextInt();
            switch (input) {
                case 1 -> System.out.println("");
                case 2 -> System.out.println("");
                case 3 -> System.out.println("");
                case 4 -> System.out.println("");
                case 5 -> System.out.println("");
                case 6 -> System.out.println("");
                case 7 -> System.exit(1);
                default -> System.out.println("Invalid Input");
            }
        }
    }
}
