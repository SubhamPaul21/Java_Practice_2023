import java.util.Set;
import java.util.TreeMap;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;

public class tree_map {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();

        // adding elements in treeMap
        treeMap.put(2, "Roll No");
        treeMap.putIfAbsent(5, "Class");

        System.out.println(treeMap);

        // remove elements
        // System.out.println(treeMap.remove("Roll No"));

        // get all the entry set of the treeMap
        Set<Entry<Integer, String>> entry = treeMap.entrySet();

        // get all the keys of the hasmap as a set
        Set<Integer> keys = treeMap.keySet();
        System.out.println(keys);

        // get all the values of the hasmap as a set
        Collection<String> values = treeMap.values();
        System.out.println(values);
    }
}
