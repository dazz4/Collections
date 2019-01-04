package maps;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


// LinkedHashMap Class - extends HashMap
// In order in which they were inserted
// You can sort them in an order  in which they were last accessed

// Constructors
// LinkedHashMap()
// LinkedHashMap(Map<? extends K, ? extends V> m)
// LinkedHashMap(int capacity)
// LinkedHashMap(int capacity, float fillRatio)
// LinkedHashMap(int capacity, flat fillRatio, boolean Order) - if order is true it will be sorted as a last access
// default capacity = 16, default ratio = 0.75
// adds one method: removeEldestEntry()

public class LinkedHashMapClassDemo {


    public static void main(String[] args) {

        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        
        // Add elements to the map
        lhm.put(1, "Dariusz Kaminski");
        lhm.put(2, "Dariusz Zalewski");
        lhm.put(3, "Kamil Chrapek");
        lhm.put(4, "Katarzyna Kaminska");

        // Get a set of entries
        Set<Map.Entry<Integer, String>> set = lhm.entrySet();
        System.out.println(set + "\n");

        System.out.println("Access the entry at index 2: " + lhm.get(2)); // access the entry
        System.out.println(set + "\n"); // because order = true, element at index 2 is moved at the end of the map

        for (Map.Entry<Integer, String> m : set) {
            System.out.println(m);
        }

    }

}
