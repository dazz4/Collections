package lists;

// If you won't modify or obtain elements in reverse, you can use for each loop

import java.util.ArrayList;

public class ForEachLoop {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("ONE");
        al.add("TWO");
        al.add("THRE");
        al.add("FOUR");
        al.add("FIVE");

        // display elements using for each loop
        for (String v : al) System.out.println(v); // it's much shorter than using iterate

        
    }
    
}
