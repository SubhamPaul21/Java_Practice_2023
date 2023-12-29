import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * hash_map
 */
public class hash_map {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        // adding elements in hashmap
        hashMap.put("Roll No", 2);
        hashMap.putIfAbsent("Class", 5);

        System.out.println(hashMap);

        // remove elements
        // System.out.println(hashMap.remove("Roll No"));

        // get all the entry set of the hashmap
        Set<Entry<String, Integer>> entry = hashMap.entrySet();

        // get all the keys of the hasmap as a set
        Set<String> keys = hashMap.keySet();
        System.out.println(keys);

        // get all the values of the hasmap as a set
        Collection<Integer> values = hashMap.values();
        System.out.println(values);
    }
}