import java.util.HashSet;
import java.util.Set;

public class hash_set {
    public static void main(String[] args) {
        // HASH SET -->
        Set<Integer> hashSet = new HashSet<>();

        // Add elements in hashSet variable
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(2);

        // print the hashset
        System.out.println(hashSet); // no duplicated found
        
        // Check if contains element
        Boolean isPresent = hashSet.contains(2);
        System.out.println(isPresent);

        // Remove element from HashSet
        Boolean isRemoved = hashSet.remove(5);
        System.out.println(isRemoved);

        System.out.println(hashSet);
    }
}