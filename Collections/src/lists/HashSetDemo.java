package lists;
import java.util.HashSet;

// HasSet Class extends AbstractSet and implements the Set interface

// Constructors
// HashSet()
// HashSet(Collection<? extends E> c)
// HashSet(int capacity) - default capacity is 16
// HashSet(int capacity, float fill Ratio)

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>(); // create an instance of HashSet

        hs.add("One");
        hs.add("Two");
        hs.add("Three");
        hs.add("Four");
        hs.add("Five");

        System.out.println(hs); // objects are not listed in the order they have been added

        HashSet<String> hs2 = new HashSet<>(hs); // using another constructor
        System.out.println(hs2);

    }
}
