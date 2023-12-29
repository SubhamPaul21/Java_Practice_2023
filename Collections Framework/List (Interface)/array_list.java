import java.util.ArrayList;
import java.util.List;

public class array_list {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        // Add elements in array list
        arrayList.add(1);
        arrayList.add(0);
        arrayList.add(50);
        arrayList.add(2);
        arrayList.add(30);
        arrayList.add(1);
        // print the array list
        System.out.println(arrayList);

        // Add at starting index
        arrayList.addFirst(20);
        // Add at last index
        arrayList.addLast(100);

        System.out.println(arrayList);
        
        arrayList.remove(Integer.valueOf(30));
        arrayList.removeFirst();
        arrayList.removeLast();

        System.out.println(arrayList);
    }
}