package lists;
import java.util.Comparator;
import java.util.PriorityQueue;

// PriorityQueue Class extends AbstractQueue and implements Queue interface
// Creates a queue that is prioritized based on the queue's comparator
// If no comparator is used as a argument, Java will used default one which will sort it in the ascending order

// Constructors
// PriorityQueue() - empty queue, starting capacity 11
// PriorityQueue(int capacity)
// PriorityQueue(Copmarator<? super E> comp)
// PriorityQueue(int capacity, Comparator<? super E> comp)
// PriorityQueue(Collection<? extends E> c)
// PriorityQueue(PriorityQueue<? extends E> c)
// PriorityQueue(SortedSet<? extends E> c)

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((obj1, obj2) -> obj2.compareTo(obj1)); // using comparator as lambda, it will show in reverse order

        pq.add(2);
        pq.add(3);
        pq.add(1); // the head of the queue will be the smallest
        pq.add(4);
        pq.add(6);
        pq.add(5);

        System.out.println(pq);

        // You can iterate through the queue but to use it properly you have to use offer(0 and poll()
        System.out.println("Retrive a comparator: " + pq.comparator()); // returns the comparator used to order the elements
        System.out.println("Add an element 7: " + pq.offer(7)); // add element to the queue
        System.out.println("Retrive the head of the queue: " + pq.poll()); // retrieves and removes the head of the queue
        System.out.println("Size: " + pq.size());
        System.out.println("pq = " + pq);
    }

}
