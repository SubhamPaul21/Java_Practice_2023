import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class linked_hash_map {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // adding elements in linkedHashMap
        linkedHashMap.put("Roll No", 2);
        linkedHashMap.putIfAbsent("Class", 5);

        System.out.println(linkedHashMap);

        // remove elements
        // System.out.println(linkedHashMap.remove("Roll No"));

        // get all the entry set of the linkedHashMap
        Set<Entry<String, Integer>> entry = linkedHashMap.entrySet();

        // get all the keys of the hasmap as a set
        Set<String> keys = linkedHashMap.keySet();
        System.out.println(keys);

        // get all the values of the hasmap as a set
        Collection<Integer> values = linkedHashMap.values();
        System.out.println(values);
    }
}
