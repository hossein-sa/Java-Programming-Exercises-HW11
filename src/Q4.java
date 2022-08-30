import java.util.HashMap;
import java.util.Map;

public class Q4 {
    public static void showQ4() {
        Map<Integer, String> week = new HashMap<>();
        //Add element to map
        week.put(1, "Monday");
        week.put(2, "Tuesday");
        week.put(3, "Wednesday");
        // get a value with key
        System.out.println("Value of index 2: " + week.get(2));
        //Check for empty or not
        System.out.println("Map isEmpty? " + week.isEmpty());
        //print all keys and values in map
        System.out.println("All Values of this map: " + week);
        // Change an element in map
        week.replace(3,"Friday");
        System.out.println("Map was changed by replace() method: " + week);
    }
}
