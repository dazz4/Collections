package other;

import java.util.*;

public class ArraysClassDemo {

    public static void main(String[] args) {

        int[] myInt = {12, 2, 4, 55, 49, 77, 123};
        display(myInt);
        Arrays.sort(myInt); // sort array ascending
        display(myInt);
        Arrays.fill(myInt, 0, 3, 10); // replaces values with range index from 0 - 3 with 10
        display(myInt);


    }

    static void display(int[] array) {
        for (int i : array) {
            System.out.print( i + " ");
        }
        System.out.println();
    }
}
