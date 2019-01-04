package maps;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// HashMap Class extends AbstactMap and implements Map
// Hash table to store elements
// get() and put() remaing constant

// Constructors
// HashMap() - default capacity is 16
// HashMap(Map<? exnteds K, ? extends V> m)
// HashMap(int capacity)
// HashMap(int capacity, float fillRatio)

// HashMap does not guarantee the order of the elements they've been added

class HashMapClassDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> hs = new HashMap<>();
        hs.put(1, "Dariusz Kaminski");
        hs.put(2, "Dariusz Zalewski");
        hs.put(3, "Kamil Chrapek");
        hs.put(4, "Katarzyna Kaminska");

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
