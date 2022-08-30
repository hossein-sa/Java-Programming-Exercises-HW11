import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Q1 {
    public static Map<Integer, String> permuteMap = new HashMap<>();
    public static int count = 1;

    public static void showQ1() {
        //Clear Sequence of HashMap
        permuteMap.clear();

        System.out.print("Please enter your word: ");
        String inputWord = new Scanner(System.in).next();
        int lengthWord = inputWord.length();
        permute(inputWord, 0, lengthWord - 1);

        //Print All Permutation of inputString
        System.out.println(permuteMap.values());

        //Part b of Question1:
        System.out.println("If you want to check you can input your second choice otherwise just hit enter: ");
        String checkInput = new Scanner(System.in).nextLine();
        if (Objects.equals(checkInput, "")) {
            System.out.println("OK!");
        } else if (permuteMap.containsValue(checkInput)) {
            System.out.println("Pass!");
        } else {
            System.out.println("Fail!");
        }

    }

    public static void permute(String str, int low, int reach) {
        if (low == reach) {
            permuteMap.put(count++, str);
        } else {
            for (int i = low; i <= reach; i++) {
                str = swap(str, low, i);
                permute(str, low + 1, reach);
                str = swap(str, low, i);
            }
        }
    }

    public static String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
