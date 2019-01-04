import java.util.SortedMap;
import java.util.TreeMap;

public class Demo {

    public static void main(String[] args) {

        TreeMap<Integer, String> tree = new TreeMap<>();

        tree.put(1, "New Game");
        tree.put(2, "Save Game");
        tree.put(3, "Load Game");
        tree.put(4, "Settings");
        tree.put(5, "Quit");
        tree.put(10, "Test1");
        tree.put(15, "Test2");

        SortedMap<Integer, String> sorted;
        sorted = tree.tailMap(3);
        System.out.println(sorted.hashCode());
    }
}


