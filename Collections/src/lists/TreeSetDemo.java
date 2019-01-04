package lists;
import java.util.NavigableSet;
import java.util.TreeSet;

// TreeSet Class - extends AbstractSet and implements NavigableSet interface
// Objects are sorted in ascending order

// Constructors
// TreeSet()
// TreeSet(Collection<? extends E> c)
// TreeSet(Comparator<? super E> comp) - creates an empty tree set that will be sorted according to the comparator comp
// TreeSet(SortedSet<E> ss)

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

        ts.add("B");
        ts.add("D");
        ts.add("E");
        ts.add("F");
        ts.add("A");
        ts.add("C");
        ts.add("J");

        System.out.println(ts); // Sorted in ascending order!

        System.out.println(ts.subSet("C", "F")); // returns a sorted subset from C inclusive to F exclusive
        System.out.println(ts.headSet("C")); // shows elements strictly less than "C"
        System.out.println(ts.higher("C")); // least element that is greater than "C;
        System.out.println(ts.tailSet("C")); // greater than or equal to "C"


    }

}
