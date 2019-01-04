package lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


// Using iterator
// 1. Obtain iterator to the start of the collection by calling the collection's iterator() method
// 2. Set up a loop that makes a call to hasNext(). Have the loop iterate as long as hasNext() returns true
// 3. Withing the loop. obtain each element by calling next()
// listIterator() is used when the collection implements List

public class UsingIterator {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("ONE");
        al.add("TWO");
        al.add("THRE");
        al.add("FOUR");
        al.add("FIVE");

        Iterator<String> itr = al.iterator(); // obtain iterator
        ListIterator<String> listItr = al.listIterator();

        // Display content using iterator
        while (itr.hasNext()) {
            
            System.out.println(itr.next()); // Returns the next element in the list and advances the cursor position.
            
        }
        
        // Modify objects being iterated using ListIterator
        while (listItr.hasNext()) {
            
            String element = listItr.next(); // Returns the next element in the list and advances the cursor position.
            listItr.set(element + " + "); // Replaces the last element returned by next or previous with the specified element.
            
        }
        System.out.println();

        // Display content after modification
        itr = al.iterator(); // you have to set iterator once again to move it to the beginning of the list
        while (itr.hasNext()) {

            System.out.println(itr.next()); // Returns the next element in the list and advances the cursor position.

        }
        System.out.println();

        // Display content backwards
        // listItr = al.listIterator(); don't set it again because there will be no "previous" objects
        while (listItr.hasPrevious()) {

            System.out.println(listItr.previous());

        }




    }
}
