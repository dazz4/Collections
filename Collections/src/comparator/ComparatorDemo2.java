package comparator;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class CustomCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        int n1 = o1.indexOf(" ");
        int n2 = o2.indexOf(" ");

        return o2.substring(n2).compareTo(o1.substring(n1));

    }
}

public class ComparatorDemo2 {

    public static void main(String[] args) {

        TreeMap<String, Integer> ts = new TreeMap<>(new CustomCompare()); // create the comparator inside the TreeMap constructors, no need for reference variable
        ts.put("Darek 3", 140);
        ts.put("Jarek 1", 100);
        ts.put("Krzysiek 4", 150);
        ts.put("Ilona 2", 120);

        Set<Map.Entry<String, Integer>> set = ts.entrySet(); // Remember to use Map.Entry as a type parameter!!!!

        for (Map.Entry<String, Integer> a : set) {
            System.out.println(a.getKey() + " " + a.getValue());
        }

    }

}
