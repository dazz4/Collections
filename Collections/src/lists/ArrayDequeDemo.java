package lists;

// ArrayDequeDemo - extends AbstractCollection and implements Deque interface
// No restrictions on the capacity

// Constructors
// ArrayDeque() - starting capacity 16
// ArrayDeque(int size)
// ArrayDeque(Collection <? extends E> c)

import java.util.ArrayDeque;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        ArrayDeque<String> aq = new ArrayDeque<>();

        aq.push("A"); // pushes the element in front of the stack
        aq.push("B"); // if you would use add then element would be added at the end of the queue
        aq.push("D");
        aq.push("E");
        aq.push("F");

        System.out.println("Poping the stack:");

        while (aq.peek() != null) {
            System.out.println(aq.pop() + " ");
        }

        System.out.println();

    }
}
