import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final List<String> mainMenu = Arrays.asList("Question 1", "Question 2", "Question 3", "Question 4", "Exit");

    public static void print(List<String> menu) {
        int i = 1;
        System.out.println("--------------------------");
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
                case 1 -> Q1.showQ1();
                case 2 -> System.out.println("");
                case 3 -> System.out.println("");
                case 4 -> System.out.println("");
                case 5 -> System.exit(1);
                default -> System.out.println("Invalid Input");
            }
        }
    }
}
