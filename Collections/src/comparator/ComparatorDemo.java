package comparator;
import java.util.Comparator;
import java.util.TreeSet;

// interface Comparator<T> - T specifies the type of objects being compared
// It has 2 methods: compare() and equals()
// int compare(T obj1, T obj2) - if 2 objects are equal returns 0, if obj1 is greaten than obj2 returns positive value otherwise negative
// boolean equals(object obj) - tests if obj equals the invoking comparator - returns true if both are Comparator objects and use the same ordering
// reversed(), reversedOrder()
// static method naturalOrder()
// nullsFirst(), nullsLast
// thenComparing()


// Custom comparator
class MyComp implements Comparator<String> {

    @Override
    public int compare(String obj1, String obj2) {
        return obj2.compareTo(obj1);
    }

}

class MyComp2 implements Comparator<String> {

    @Override
    public int compare(String obj1, String obj2) {
        return obj1.compareTo(obj2); // different than MyComp, left in a natural-order so we can use reversed()
    }

}

public class ComparatorDemo {

    public static void main(String[] args) {

        // TreeSet constructor: TreeSet(Comparator<? super E> comp)
        // Make sure that the type parameters are compatible
        TreeSet<String> treeSet = new TreeSet<>(new MyComp()); // we are using a custom comparator MyComp as a argument
        treeSet.add("C");
        treeSet.add("B");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("A");
        treeSet.add("D");

        System.out.println("TreeSet printed out in reversed order: ");
        for (String element : treeSet) {
            System.out.println(element);
        }
        System.out.println();

        // Using reversed()
        MyComp2 mc = new MyComp2();
        TreeSet<String> treeSet2 = new TreeSet<>(mc.reversed()); // we are using reversed() instead
        treeSet2.add("C");
        treeSet2.add("B");
        treeSet2.add("E");
        treeSet2.add("F");
        treeSet2.add("A");
        treeSet2.add("D");

        System.out.println("TreeSet2 printed out in reversed order while using reversed() method: ");
        for (String element : treeSet2) {
            System.out.println(element);
        }
        System.out.println();

        // Creating comparator using lambda:
        // Comparator<String> mc = (obj1, obj2) -> obj1.compareTo(obj2) - then send it to the TreeSet constructor OR
        // use lambda in the constructor itself
        // TreeSet2<String> treeSet2 = new TreeSet2<>((obj1, obj2) -> obj1.compareTo(obj2));

    }

}
