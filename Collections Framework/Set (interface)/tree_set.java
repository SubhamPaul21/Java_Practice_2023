import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class tree_set {
    public static void main(String[] args) {
        // Ascending order
        Set<Integer> treeSet = new TreeSet<>();
        // Descending order
        // Set<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());

        // Adding elements in tree set
        treeSet.add(1);
        treeSet.add(100);
        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(100);
        treeSet.add(50);
        treeSet.add(1);

        // print the tree set
        System.out.println(treeSet);
        
    }
}
