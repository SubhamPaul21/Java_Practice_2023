import java.util.LinkedHashSet;
import java.util.Set;

public class linked_hash_set {
    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        // Adding elements in linked hash set
        linkedHashSet.add(1);
        linkedHashSet.add(3);
        linkedHashSet.add(5);
        linkedHashSet.add(7);
        linkedHashSet.add(10);
        linkedHashSet.add(55);

        //print the formed linked hash set
        System.out.println(linkedHashSet);

        // Contains similar methods like hash set
        // CONTAINS()
        // REMOVE()
        // SIZE()

    }
}
