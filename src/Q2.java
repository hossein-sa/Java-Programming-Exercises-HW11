import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Q2 {
    public static Set<Character> firstTreeSet = new TreeSet<>();
    public static Set<Character> secondTreeSet = new TreeSet<>();

    public static void showQ2() {
        firstTreeSet.clear();
        secondTreeSet.clear();
        while (firstTreeSet.size() < 10 || secondTreeSet.size() < 10){
            if (firstTreeSet.size() < 10 ){
                firstTreeSet.add(getRandChar());
            }
            if (secondTreeSet.size() < 10){
                secondTreeSet.add(getRandChar());
            }
        }

        System.out.println("First TreeSet: " + firstTreeSet);
        System.out.println("Second TreeSet: " + secondTreeSet);

        Set<Character> unionTreeSet = new TreeSet<>(firstTreeSet);
        Set<Character> intersectionTreeSet = new TreeSet<>(firstTreeSet);


        unionTreeSet.addAll(secondTreeSet);
        System.out.println("Union is: " + unionTreeSet);

        intersectionTreeSet.retainAll(secondTreeSet);
        System.out.println("Intersection is: " + intersectionTreeSet);

    }

    static char getRandChar() {

        // chose a Character random from this String
        String alphabet = "abcdefghijklmnopqrstuvxyz";
        Random r = new Random();
        return alphabet.charAt(r.nextInt(alphabet.length()));
    }

}
