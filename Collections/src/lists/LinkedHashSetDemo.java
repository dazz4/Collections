package lists;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> hs = new LinkedHashSet<>(); // create an instance of LinkedHashSet

        hs.add("One");
        hs.add("Two");
        hs.add("Three");
        hs.add("Four");
        hs.add("Five");

        System.out.println(hs); // objects are displayed in an order they have been added not as it was with HashSet

        LinkedHashSet<String> hs2 = new LinkedHashSet<>(hs); // using another constructor
        System.out.println(hs2);


    }
    
}


