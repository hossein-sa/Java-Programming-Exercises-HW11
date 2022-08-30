import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1 {
    public static Map<Integer, String> permuteMap = new HashMap<>();
    public static int count = 1;

    public static void showQ1Menu() {
        System.out.print("Please enter your word: ");
        String inputWord = new Scanner(System.in).next();
        int lengthWord = inputWord.length();
        permute(inputWord, 0, lengthWord - 1);
        System.out.println(permuteMap.values());

    }

    public static void permute(String str, int l, int r) {
        if (l == r){
            permuteMap.put(count++,str);
        }
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
