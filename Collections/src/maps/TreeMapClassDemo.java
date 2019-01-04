package maps;

// TreeMap Class - ensures that the elements are sorted in ascending key order

// Constructors
// TreeMap()
// TreeMap(Comparator<? super K> comp)
// TreeMap(Map<? extends K, ? extends V> m)
// TreeMap(SortedMap<K, ? extends V> sm)

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class TreeMapClassDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> hs = new TreeMap<>();
        hs.put(1, "Dariusz Kaminski");
        hs.put(4, "Katarzyna Kaminska"); // even though element with key 4 is added second, it still will be sorted in ascdending order
        hs.put(2, "Dariusz Zalewski");
        hs.put(3, "Kamil Chrapek");

        // Get a set of entries
        Set<Map.Entry<Integer, String>> set = hs.entrySet() ;

        System.out.println(set);

        // Display the set
        for (Map.Entry<Integer, String> m : set) {

            System.out.println(m.getKey() + " : " + m.getValue());

        }

        hs.put(1, "Dariusz K"); // Change the value
        System.out.println(hs.get(1));

    }
    
}
