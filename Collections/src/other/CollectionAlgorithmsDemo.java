package other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionAlgorithmsDemo {

    public static void main(String[] args) {

        List<String> al;
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ONE");
        arrayList.add("TWO");
        arrayList.add("THREE");
        arrayList.add("FOUR");
        arrayList.add("FIVE");
        arrayList.add("SIX");
        arrayList.add("SEVEN");

        Collections.addAll(arrayList, "EIGHT");
        al = Collections.checkedList(arrayList, String.class);
        System.out.println(Collections.max(arrayList, (obj1, obj2) -> obj1.compareTo(obj2)));

    }

}
