package lists;

// Provides a linked-list data

// Constructors
// LinkedList()
// LinkedList(Collection<? extends E> c)

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1); // add an element to the list (autoboxing)
        ll.add(2); // because LinkedList implements List, call to add(E) append items to the end of the list
        ll.add(3);
        ll.add(1, 2); // add 2 at index of 1

        System.out.println("ll at index 0: " + ll.get(0)); // Returns the element at the specified position in this list
        System.out.println("ll at index 1: " + ll.get(1));
        System.out.println("ll at index 2: " + ll.get(2));
        System.out.println("Contents of ll: " + ll);

        ll.remove(0); // remove an element at index of 0
        System.out.println("Contents of ll after deletion: " + ll);

        ll.removeFirst(); // remove first element from the list
        ll.removeLast(); // remove last element from the list
        System.out.println("Contents of ll after deletion: " + ll);

        ll.set(0, 5); // use set to change the value of the object
        System.out.println("Contents of ll after the change: " + ll);

        ll.peekFirst(); // Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
        System.out.println("Contents of ll after peek: " + ll);


        ll.pollFirst(); // Retrieves and removes the first element of this list, or returns null if this list is empty.
        System.out.println("Contents of ll after poll: " + ll);


    }
}
