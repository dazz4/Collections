package lists;

import java.util.ArrayList;

// ArrayList - Dynamic array that can grow or shrink when needed

// Constructors:
// ArrayList()
// ArrayList(Collection <? extends E> c)
// ArrayList(int capacity)

class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(); // create an ArrayList object
        System.out.println("Initial size of the arrayList: " + arrayList.size()); // print out initial size of the array
        arrayList.add("My name is Darek"); // add a String to the array
        arrayList.add("My name is Jacek"); // add a String to the array
        System.out.println("Size after adding some elements: " + arrayList.size());
        System.out.println(arrayList); // display arrayList
        arrayList.remove(0); // remove an object from the arrayList at index 0
        System.out.println(arrayList); // display array once again

        // You can increase capacity of the array manually if you will know that it will have many elements in the future
        arrayList.ensureCapacity(100); // increasing capacity of the array
        arrayList.trimToSize(); // setting array to be precisely as large as the number of items that is currently holding

        // You can obtain an actual array that contains the contents of the list
        String stringArray[] = new String[arrayList.size()]; // create a normal array with the size of the arrayList
        stringArray = arrayList.toArray(stringArray); // <T> T[] toArray(T array[]) - returns and array of type T

        System.out.println("Changed and item of index 0: " + arrayList.set(0, "My name is Dupa")); // set a new String to object at index 0
        System.out.println("Get an item of index 0: " + arrayList.get(0)); // print out (get) an item at index 0

        String obj = "My name is Dupa"; // create a new object to check if arrayList contains it
        System.out.println(arrayList.contains(obj)); // using contains() method to check if an object is already in the array
        System.out.println(arrayList.indexOf(obj)); // retrieve and index of the first instance of the object

    }
}
