import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Q3 {
    public static void showQ3() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1));
        System.out.println(numbers);
        System.out.println(inappropriateDelete(numbers));
    }

    public static List<Integer> inappropriateDelete(List<Integer> list) {
        List<Integer> resultList = new ArrayList<>();
        if (list != null && !list.isEmpty()) {
            if (list.size() % 2 != 0)
                list.remove(list.size() - 1);
            for (int i = 1; i < list.size(); i += 2) {
                if (list.get(i) >= list.get(i - 1)) {
                    resultList.add(list.get(i - 1));
                    resultList.add(list.get(i));
                }
            }
            return resultList;
        }
        return resultList;
    }
}